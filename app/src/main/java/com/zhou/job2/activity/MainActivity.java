package com.zhou.job2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
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

    @BindView(R.id.recycleView)
    RecyclerView recyclerView;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        initRecycle();
    }

    @OnClick({R.id.iv_tongzhi, R.id.tv_kaijiang, R.id.tv_qiandao, R.id.tv_find, R.id.tv_setting})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_setting:
                startToActivity(SettingActivity.class);
                break;
                //跟info调换了跳转
            case R.id.tv_find:
                startToActivity(InformActivity.class);
                break;
            case R.id.tv_qiandao:
                ToastUtil.show(getApplicationContext(), "签到");
                break;
                //头部，与info调换了
            case R.id.iv_tongzhi:
                startToActivity(FindActivity.class);
                break;
            //开奖
            case R.id.tv_kaijiang:
                startToActivity(LotteryActivity.class);
                break;
        }
    }

    private void initRecycle() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add("" + i);
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

    //单击返回
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
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
            ToastUtil.show(getApplicationContext(), "再按一次退出程序");
            firstTime = secondTime;
        } else {
            finish();
        }
    }
}
