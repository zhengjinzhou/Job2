package com.zhou.job2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.zhou.job2.R;
import com.zhou.job2.base.BaseActivity;

import butterknife.BindView;

import static android.view.KeyEvent.KEYCODE_BACK;

public class WebActivity extends BaseActivity {

    @BindView(R.id.web) WebView mWebView ;

    @Override
    public int getLayout() {
        return R.layout.activity_web;
    }

    @Override
    public void init() {
        String url_main = getIntent().getStringExtra("url_main");
        if (url_main.length()>2){
            WebSettings webSettings = mWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            mWebView.loadUrl(url_main);
        }else{
            startToActivity(MainActivity.class);
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
