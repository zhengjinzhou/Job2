package com.zhou.job2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.zhou.job2.R;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.bean.KaiJiangBean;

import java.io.IOException;

import butterknife.BindView;

public class HapplyActivity extends BaseActivity {

    private static final String TAG = "HapplyActivity";
    String url = "https://way.jd.com/jisuapi/query3?caipiaoid=13&issueno=2014127&appkey=d3a62ea686a062d5a5ba1b91fda4f1df";
    @BindView(R.id.tv_msg)
    TextView tvMsg;

    @Override
    public int getLayout() {
        return R.layout.activity_happly;
    }

    @Override
    public void init() {
        initNet();
    }

    private void initNet() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.d(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Response response) throws IOException {
                Log.d(TAG, "onResponse: " + response.body().string());
            }
        });
    }
}
