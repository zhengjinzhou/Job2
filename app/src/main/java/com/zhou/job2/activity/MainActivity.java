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
import com.zhou.job2.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.recycleView) RecyclerView recyclerView;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        initRecycle();
    }

    @OnClick({R.id.iv_tongzhi,R.id.tv_kaijiang,R.id.tv_qiandao,R.id.tv_find,R.id.tv_setting})
    void onClick(View view){
        switch (view.getId()){
            case R.id.tv_setting:
                startToActivity(SettingActivity.class);
                break;
            case R.id.tv_find:
                startToActivity(FindActivity.class);
                break;
            case R.id.tv_qiandao:
                ToastUtil.show(getApplicationContext(),"签到");
                break;
            case R.id.iv_tongzhi:
                startToActivity(InformActivity.class);
                break;
            case R.id.tv_kaijiang:
                startToActivity(LotteryActivity.class);
                break;
        }
    }
    private void initRecycle() {
        List<String> data = new ArrayList<>();
        for (int i=0;i<20;i++){
            data.add(""+i);
        }
        CommonAdapter adapter = new CommonAdapter<String>(this, R.layout.recycle, data) {
            @Override
            public void convert(ViewHolder holder, String s, int position) {
                holder.setOnClickListener(R.id.rl_next, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startToActivity(HapplyActivity.class);
                    }
                });
            }
        };
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
