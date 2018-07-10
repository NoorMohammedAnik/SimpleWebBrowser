package com.aniik.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView=findViewById(R.id.webview);

        String getUrl=getIntent().getExtras().getString("url");


        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);//for enable js in web page
        webView.getSettings().setBuiltInZoomControls(true); //for zoom

        if (getUrl.equals("offline"))
        {

            webView.loadUrl("file:///android_asset/hello.html");
        }
        else {
            webView.loadUrl("http://" + getUrl);

        }
    }
}





