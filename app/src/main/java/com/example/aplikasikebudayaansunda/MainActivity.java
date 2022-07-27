package com.example.aplikasikebudayaansunda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder alertDialogBuilder;
    Button mSejarah_sunda, mKuiz, mAbout, mKeluar, mGlosarium; //variabel baru bertipe Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variabel menampilkan Toast saat mau keluar aplikasi
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mSejarah_sunda  = (Button) findViewById(R.id.sejarah_sunda);
        mKuiz           = (Button) findViewById(R.id.kuiz);
        mAbout          = (Button) findViewById(R.id.about);
        mKeluar         = (Button) findViewById(R.id.keluar);
        mGlosarium      = (Button) findViewById(R.id.glosarium);

        // Pindah activity dari menu utama ke Sejarah kebudayaan
        mSejarah_sunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihaGanda
                Intent i = new Intent(MainActivity.this, sejarah_kebudayaan.class);
                startActivity(i); //jalankan Intent
            }
        });

        // Pindah activity dari menu utama ke Kuiz
        mKuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Kuiz.class);
                startActivity(i);
            }
        });

        // Pindah activity dari menu utama ke About
        mAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
            }
        });

        // Pindah activity dari menu utama ke Luar
        mKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        // Pindah activity dari menu utama ke Glosarium
        mGlosarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Glosarium_budaya.class);
                startActivity(i);
            }
        });

    }

    //    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Toast.makeText(MainActivity.this, "Tekan Tombol Home Untuk Keluar", Toast.LENGTH_SHORT).show();
//        alertDialogBuilder.setTitle("Tutup Aplikasi");
//        alertDialogBuilder
//                .setMessage("Apakah anda yakin ingin menutup aplikasi?")
//                .setCancelable(false)
//                .setPositiveButton("Ya",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int id) {
//                                finish();
//
//                            }
//                        })
//                .setNegativeButton("Tidak",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int id) {
//        TIDAK
//                                dialog.cancel();
//                                Toast.makeText(MainActivity.this,"Selamat datang kembali ;)", Toast.LENGTH_SHORT).show();
//
//                            }
//                        }).create().show();}
//
//    }
}
