package com.zhou.job2.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class InformActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.recycleView)
    RecyclerView recyclerView;
    @BindView(R.id.refresh)
    SwipeRefreshLayout refreshLayout;

    @Override
    public int getLayout() {
        return R.layout.activity_inform;
    }

    @Override
    public void init() {
        initNet();
        initRefresh();
        initRecycle();
    }

    private void initNet() {

    }

    @OnClick({R.id.iv_back})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
        }
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

    private void initRecycle() {
        List<BaseBean> data = new ArrayList<>();
        data.add(new BaseBean(R.drawable.dice6, "摇钱树", "摇一摇，生活多滋味"));
        data.add(new BaseBean(R.drawable.dis_bifen, "足球人生", "滚动的金币"));
        data.add(new BaseBean(R.drawable.dis_bifen_lq, "合众欢", "大家好才是真的好"));
        data.add(new BaseBean(R.drawable.dis_buy_together, "彩礼", "会送彩礼的哦"));
        data.add(new BaseBean(R.drawable.dis_give_lottery, "大喇叭", "震一震，摇一摇"));
        data.add(new BaseBean(R.drawable.dis_lot_newes, "8", "发发发发发"));
        data.add(new BaseBean(R.drawable.dis_lucky_number, "理财神器", "买涨买跌都能挣"));
        data.add(new BaseBean(R.drawable.ecitic, "圈子", "彩民社区"));
        data.add(new BaseBean(R.drawable.k3_dice_cup_close, "幸运星期五", "多拿一千金"));
        data.add(new BaseBean(R.drawable.njcb, "海妖征战", "vip专场"));
        data.add(new BaseBean(R.drawable.weixin_pengyouquan, "理财神器", "买涨买跌都能挣"));
        data.add(new BaseBean(R.drawable.emoji_1f42d, "生肖下凡", "不一样的生肖"));
        data.add(new BaseBean(R.drawable.emoji_1f4af, "夹娃娃", "苹果免费赢"));
        data.add(new BaseBean(R.drawable.emoji_1f4b0, "看钱眼开", "看钱眼开"));
        data.add(new BaseBean(R.drawable.emoji_1f44d, "顶呱呱", "新人专享"));
        data.add(new BaseBean(R.drawable.emoji_1f48d, "回投资", "不懂我教你"));
        data.add(new BaseBean(R.drawable.emoji_3297, "天天扑鱼", "好玩更好挣"));


        CommonAdapter adapter = new CommonAdapter<BaseBean>(this, R.layout.recycle, data) {
            @Override
            public void convert(ViewHolder holder, BaseBean baseData, int position) {
                Glide.with(mContext).load(baseData.getIcon()).into((ImageView) holder.getView(R.id.iv_type));
                holder.setText(R.id.tv_type, baseData.getName());
                holder.setText(R.id.tv_des, baseData.getDes());
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
        private int icon;
        private String name;
        private String des;

        public BaseBean(int icon, String name, String des) {
            this.icon = icon;
            this.name = name;
            this.des = des;
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

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }
}
