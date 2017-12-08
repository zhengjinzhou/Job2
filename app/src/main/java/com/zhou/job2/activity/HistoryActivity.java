package com.zhou.job2.activity;

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
import butterknife.ButterKnife;

public class HistoryActivity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_history;
    }

    @Override
    public void init() {

    }
}
