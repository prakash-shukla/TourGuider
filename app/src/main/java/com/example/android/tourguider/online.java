package com.example.android.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class online extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        web=(WebView) findViewById(R.id.webview);
        web.loadUrl(getString(R.string.url));
        web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack())
        {
            web.goBack();
            }
            else {super.onBackPressed();}
    }
}
