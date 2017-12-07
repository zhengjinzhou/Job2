package com.zhou.job2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.zhou.job2.R;
import com.zhou.job2.adapter.base.CommonAdapter;
import com.zhou.job2.adapter.base.ViewHolder;
import com.zhou.job2.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class LotteryActivity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_lottery;
    }

    @Override
    public void init() {

    }


}
