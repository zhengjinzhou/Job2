package com.zhou.job2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.zhou.job2.R;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.util.ToastUtil;

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
            finish();
        }
    }

    //单击返回
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
        } else if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();
        }
        return false;
    } //记录用户首次点击返回键的时间
    private long firstTime = 0;

    /**
     * 双击退出函数
     */
    private static Boolean isExit = false;

    private void exitBy2Click() {
        long secondTime = System.currentTimeMillis();
        if (secondTime - firstTime > 2000) {
            ToastUtil.show(getApplicationContext(),"再按一次退出程序");
            firstTime = secondTime;
        } else {
            finish();
        }
    }
}
