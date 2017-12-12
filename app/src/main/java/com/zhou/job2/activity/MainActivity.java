package com.zhou.job2.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zhou.job2.R;
import com.zhou.job2.adapter.base.CommonAdapter;
import com.zhou.job2.adapter.base.ViewHolder;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.recycleView)
    RecyclerView recyclerView;
    @BindView(R.id.refresh)
    SwipeRefreshLayout refreshLayout;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        //refreshLayout.setRefreshing(false);
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

        initRecycle();
    }

    @OnClick({R.id.iv_tongzhi, R.id.tv_kaijiang, R.id.tv_qiandao, R.id.tv_find, R.id.tv_setting})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_setting:
                startToActivity(TongZhiActivity.class);
                break;
            //跟info调换了跳转
            case R.id.tv_find:
                startToActivity(InformActivity.class);
                break;
            case R.id.tv_qiandao:
                startToActivity(TypeActivity.class);
                break;
            //头部，与info调换了
            case R.id.iv_tongzhi:
                startToActivity(TongZhiActivity.class);
                break;
            //开奖
            case R.id.tv_kaijiang:
                startToActivity(LotteryActivity.class);
                break;
        }
    }

    private void initRecycle() {
        List<BaseData> data = new ArrayList<>();
        data.add(new BaseData(R.drawable.caipiao, "彩票", "普通彩票","11"));
        data.add(new BaseData(R.drawable.d3, "3D彩票", "像3D一样的彩票","12"));
        data.add(new BaseData(R.drawable.daletou, "大乐透", "开心不止那么大","13"));
        data.add(new BaseData(R.drawable.gws, "猜奖", "猜中你有奖","14"));
        data.add(new BaseData(R.drawable.jingcai, "竞赛", "看足球，赢大奖","15"));
        data.add(new BaseData(R.drawable.kuai3, "快3", "你懂的","16"));
        data.add(new BaseData(R.drawable.kuai8, "快乐8", "让你发发发","17"));
        data.add(new BaseData(R.drawable.lanqiu2, "篮球", "看热血篮球也有奖","18"));
        data.add(new BaseData(R.drawable.ll, "11选5", "精彩不停止","19"));
        data.add(new BaseData(R.drawable.qixingcai, "七星彩", "大家都喜欢玩的","20"));
        data.add(new BaseData(R.drawable.shuangseqiu, "双色球", "好玩你解析","21"));
        data.add(new BaseData(R.drawable.pailie3_5, "开心乐", "开开心心买彩票","22"));
        data.add(new BaseData(R.drawable.pai, "扑克", "经典之作","23"));
        data.add(new BaseData(R.drawable.fucai3d, "足球竞赛", "来司机快上车","24"));
        data.add(new BaseData(R.drawable.chai, "拆虹包", "RMB等你来","25"));

        CommonAdapter adapter = new CommonAdapter<BaseData>(this, R.layout.recycle, data) {
            @Override
            public void convert(ViewHolder holder, final BaseData baseData, int position) {
                Glide.with(mContext).load(baseData.icon).into((ImageView) holder.getView(R.id.iv_type));
                holder.setText(R.id.tv_type, baseData.getName());
                holder.setText(R.id.tv_des, baseData.getMsg());
                holder.setOnClickListener(R.id.rl_next, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //startToActivity(HistoryActivity.class);
                        Intent intent = new Intent(getApplicationContext(),HistoryActivity.class);
                        intent.putExtra("id","11");
                        startActivity(intent);
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

    @Override
    public void onRefresh() {

    }

    public class BaseData {
        private int icon;
        private String name;
        private String msg;
        private String num;

        public BaseData() {

        }

        public BaseData(int icon, String name, String msg,String num) {
            this.num = num;
            this.icon = icon;
            this.name = name;
            this.msg = msg;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public int getIcon() {
            return icon;
        }

        public void setIcon(int icon) {
            this.icon = icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
