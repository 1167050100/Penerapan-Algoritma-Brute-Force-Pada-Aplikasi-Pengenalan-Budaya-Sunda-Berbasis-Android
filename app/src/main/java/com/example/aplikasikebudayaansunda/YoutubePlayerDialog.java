package com.example.aplikasikebudayaansunda;

import static android.view.WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;

public class YoutubePlayerDialog extends Dialog {

    private final String url;

    public YoutubePlayerDialog(@NonNull Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_youtube_player);

        getWindow().setBackgroundDrawable(new ColorDrawable(0));

        showingYoutubeVideo();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void showingYoutubeVideo() {
        WebView youtubeWebView = findViewById(R.id.webview_youtube);
        youtubeWebView.setVerticalScrollBarEnabled(false);
        youtubeWebView.setVerticalScrollbarOverlay(false);
        youtubeWebView.setVerticalScrollbarPosition(0);
        youtubeWebView.canScrollVertically(0);
        youtubeWebView.loadUrl(url);

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
}
