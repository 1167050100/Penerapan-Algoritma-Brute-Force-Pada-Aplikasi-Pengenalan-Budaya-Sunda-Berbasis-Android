package com.example.aplikasikebudayaansunda;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import android.speech.tts.TextToSpeech;
import android.view.animation.AlphaAnimation;

import java.util.Locale;

import me.biubiubiu.justifytext.library.JustifyTextView;


@SuppressWarnings("deprecation")
public class Detail  extends Activity{
    ImageView Im, dengar;
    TextView tv_nama, tv_kategori, textView, tv_size, id, namaIm;
    JustifyTextView tv_deskripsi;
    Button button_play;
    WebView youtubeWebView;
    Gallery gallery;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[3];
    int msg_im;

    TextToSpeech toSpeech;
    final int REQ_CODE = 1;
    AlphaAnimation click = new AlphaAnimation(1, 0.3F);

    @SuppressLint("CutPasteId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent iIdentifikasi = getIntent();
        msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_kategori = iIdentifikasi.getStringExtra("dataKategori");
        String msg_deskripsi = iIdentifikasi.getStringExtra("dataDeskripsi");
        String msg_link = iIdentifikasi.getStringExtra("dataLink");

        Im = (ImageView) findViewById(R.id.iv_detail);
        tv_nama = (TextView) findViewById(R.id.tvNama);
        tv_kategori = (TextView) findViewById(R.id.tvKategori);
        tv_deskripsi = (JustifyTextView) findViewById(R.id.tvDeskripsi);
        button_play = (Button) findViewById(R.id.button_play);


        Im.setImageResource(msg_im);
        tv_nama.setText(msg_nama);
        tv_kategori.setText(msg_kategori);
        tv_deskripsi.setText(msg_deskripsi);

        textView = findViewById(R.id.tvDeskripsi);
        dengar = findViewById(R.id.dengar);

        // menampilkan view youtube player.
        showingYoutubeVideo();

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                button_play.setVisibility(View.GONE);
//                youtubeWebView.setVisibility(View.VISIBLE);
//                youtubeWebView.loadUrl(getIntent().getStringExtra("dataLink"));

                new YoutubePlayerDialog(Detail.this, getIntent().getStringExtra("dataLink")).show();
            }
        });

        /* Memanggil Text to Speech dan menentukan bahasa yang di inginkan */
        toSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    toSpeech.setLanguage(new Locale("in"));
                }
            }
        });

        /* Metode klik dari icon speaker, dan menentukan kata-kata yang akan di ucapkan */
        dengar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(click);
                String speak = textView.getText().toString();
                toSpeech.speak(speak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void showingYoutubeVideo() {
        youtubeWebView = findViewById(R.id.webview_youtube);

        youtubeWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebSettings webSettings = youtubeWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
    }

    /* Metode publik saat Text To Speech berhenti berbicara */
    public void onPause() {
        if (toSpeech != null) {
            toSpeech.stop();
            toSpeech.shutdown();
        }
        super.onPause();
    }
}