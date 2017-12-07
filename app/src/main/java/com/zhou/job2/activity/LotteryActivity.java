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

    @BindView(R.id.recycleView) RecyclerView recyclerView;

    @Override
    public int getLayout() {
        return R.layout.activity_lottery;
    }

    @Override
    public void init() {
        initRecycle();
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
