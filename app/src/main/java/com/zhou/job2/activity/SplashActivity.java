package com.zhou.job2.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.zhou.job2.Constant;
import com.zhou.job2.R;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.bean.JobBean;

import java.io.IOException;

public class SplashActivity extends BaseActivity {

    private static final String TAG = "SplashActivity";

    @Override
    public int getLayout() {
        return R.layout.activity_splash;
    }

    @Override
    public void init() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initNet();
            }
        }, 800);
    }


    private void initNet() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(Constant.URL_MAIN).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                startToActivity(MainActivity.class);
                finish();
                Log.d(TAG, "onFailure: ");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String string = response.body().string();
                Log.d(TAG, "onResponse: " + string);
                Gson gson = new Gson();
                JobBean jobBean = gson.fromJson(string, JobBean.class);
                if (jobBean.getRt_code().equals("200") && jobBean.getData().getShow_url().equals("1")) {
                    Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                    intent.putExtra("url_main", jobBean.getData().getUrl());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
