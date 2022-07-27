package com.example.aplikasikebudayaansunda;

import android.content.ActivityNotFoundException;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.speech.RecognizerIntent;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.Locale;

public class Glosarium_budaya extends Activity {
    private final int REQ_CODE = 100;
    EditText editText;

    protected ListView lv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;
    EditText et_db;


    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glosarium_budaya);

        db = (new Database(this)).getWritableDatabase();
        lv = (ListView) findViewById(R.id.lv);
        et_db =(EditText) findViewById(R.id.et);

        // Implementasi TextWatcher
        et_db.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                search_db(null);
            }
        });

        try{
            cursor = db.rawQuery("SELECT * FROM budaya ORDER BY nama ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.isi_lv, cursor, new String[] {"nama", "kategori", "img"}, new int[] {R.id.tv_nama, R.id.tv_kategori, R.id.imV});
            lv.setAdapter(adapter);
            lv.setTextFilterEnabled(true);
            lv.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView parent, View v, int position, long id) {
                    detail(position);
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }

        // Implementasi Speech To Text
        editText = findViewById(R.id.et);
        ImageView speak = findViewById(R.id.btnSpeech);
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "id-ID");
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Katakan Sesuatu");
                try {
                    startActivityForResult(intent, REQ_CODE);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Maaf HP Kamu Engga Support ;(",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    // Lanjutan Speech To Text
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    editText.setText(result.get(0));
                }
                break;
            }
        }
    }

    @SuppressWarnings("deprecation")
    // Method Pencarian & Pemanggilan algoritma Brute Force
    public void search_db(View v){
        String edit_db = et_db.getText().toString().toLowerCase();

        cursor = db.rawQuery("SELECT * FROM budaya ORDER BY nama ASC", null);

        if (!edit_db.equals("")) {
            try {

                long startTime = System.currentTimeMillis();
                MatrixCursor cur = new MatrixCursor(new String[] {"_id", "nama", "kategori", "deskripsi", "img", "link"});

                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    String nama = cursor.getString(1);
                    //memanggil method bruteforce
                    if (BruteForce.check(nama.toLowerCase(), edit_db) < 0) continue;

                    cur.addRow(new Object[]{
                            cursor.getPosition(),
                            nama,
                            cursor.getString(2),
                            cursor.getString(3),
                            cursor.getString(4),
                            cursor.getString(5)
                    });
                }

                adapter = new SimpleCursorAdapter(this, R.layout.isi_lv, cur, new String[] {"_id", "nama", "kategori", "img"}, new int[] {R.id.tv_id, R.id.tv_nama, R.id.tv_kategori, R.id.imV});

                String text = String.format(Locale.US, "Tidak ditemukan data dengan kata kunci \"%s\"", edit_db);
                if (adapter.getCount() > 0) {
                    lv.setAdapter(adapter);
                    text = String.format(Locale.US, "Hasil Pencarian & Waktu Algoritma Brute Force :%d ms", System.currentTimeMillis() - startTime);
                }
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

            }catch(Exception e){
                e.printStackTrace();
            }
        } else {
            try {
                adapter = new SimpleCursorAdapter(this, R.layout.isi_lv, cursor, new String[] {"nama", "kategori", "img"}, new int[] {R.id.tv_nama, R.id.tv_kategori, R.id.imV});
                lv.setAdapter(adapter);
                lv.setTextFilterEnabled(true);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Method Detail Kebudayaan
    public void detail(int position){
        int im = 0;
        String nama = "";
        String kategori = "";
        String deskripsi = "";
        String link = "";

        Cursor cur = ((SimpleCursorAdapter) adapter).getCursor();

        if (cur.moveToFirst()) {
            cur.moveToPosition(position);
            nama = cur.getString(cur.getColumnIndex("nama"));
            kategori = cur.getString(cur.getColumnIndex("kategori"));
            deskripsi = cur.getString(cur.getColumnIndex("deskripsi"));
            link = cur.getString(cur.getColumnIndex("link"));
            im = cur.getInt(cur.getColumnIndex("img"));
        }

        Intent iIntent = new Intent(this, Detail.class);
        iIntent.putExtra("dataIM", im);
        iIntent.putExtra("dataNama", nama);
        iIntent.putExtra("dataKategori", kategori);
        iIntent.putExtra("dataDeskripsi", deskripsi);
        iIntent.putExtra("dataLink", link);

        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);
    }

}
