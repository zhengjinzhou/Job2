package com.zhou.job2.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.zhou.job2.R;
import com.zhou.job2.adapter.base.CommonAdapter;
import com.zhou.job2.adapter.base.ViewHolder;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class LotteryActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.recycleView)
    RecyclerView recyclerView;
    @BindView(R.id.refresh)
    SwipeRefreshLayout refreshLayout;
    @BindView(R.id.tv_show)
    TextView tv_show;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    @Override
    public int getLayout() {
        return R.layout.activity_lottery;
    }

    @Override
    public void init() {
        initRefresh();
        initRecycle();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                tv_show.setVisibility(View.VISIBLE);
            }
        }, 2000);
    }

    private void initRefresh() {
        refreshLayout.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ToastUtil.show(getApplicationContext(), "刷新完成");
                        refreshLayout.setRefreshing(false);
                    }
                }, 2000);
            }
        });
    }

    @OnClick({R.id.iv_back})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
        }
    }

    private void initRecycle() {
        List<BaseBean> data = new ArrayList<>();
        data.add(new BaseBean("老快三", "期数", "开奖时间："));
        data.add(new BaseBean("双色球", "期数", "开奖时间："));
        data.add(new BaseBean("七星彩", "期数", "开奖时间："));
        data.add(new BaseBean("快选", "期数", "开奖时间："));
        data.add(new BaseBean("11选5", "期数", "开奖时间："));
        data.add(new BaseBean("大乐透", "期数", "开奖时间："));
        data.add(new BaseBean("足球", "期数", "开奖时间："));
        data.add(new BaseBean("篮球", "期数", "开奖时间："));
        data.add(new BaseBean("竞赛", "期数", "开奖时间："));
        data.add(new BaseBean("猜将", "期数", "开奖时间："));



        CommonAdapter adapter = new CommonAdapter<BaseBean>(this, R.layout.recycle_kaijaing, data) {
            @Override
            public void convert(final ViewHolder holder, final BaseBean s, int position) {
                holder.setOnClickListener(R.id.rl_next, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        holder.setText(R.id.tv_name,s.getIcon());
                        holder.setText(R.id.tv_qishu,"期数：");
                        holder.setText(R.id.tv_time,"开奖时间：");
                    }
                });
            }
        };
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onRefresh() {

    }

    public class BaseBean {
        private String icon;
        private String name;
        private String des;

        public BaseBean(String icon, String name, String des) {
            this.icon = icon;
            this.name = name;
            this.des = des;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }
}
