package com.example.jay.practice3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    private WebSettings webSettings; // 웹을 어디서 볼껀지 설정해주는 툴

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // 자신의 뷰 안에서 인터넷을 실행 시키겠다고 시키는 명령어
        webSettings = webView.getSettings(); // 툴을 이용해서, 설정 값을 받아온다
        webView.loadUrl("https://www.naver.com/"); // 웹 주소 연결
    }
}
