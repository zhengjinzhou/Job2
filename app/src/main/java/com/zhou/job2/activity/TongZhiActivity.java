package com.zhou.job2.activity;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.zhou.job2.R;
import com.zhou.job2.adapter.base.CommonAdapter;
import com.zhou.job2.adapter.base.ViewHolder;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.bean.MovieBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 豆瓣电子书简介
 */
public class TongZhiActivity extends BaseActivity {

    private static final String TAG = "TongZhiActivity";
    @BindView(R.id.recycleView)
    RecyclerView recyclerView;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    public String url = "https://api.douban.com/v2/movie/top250";
    private CommonAdapter adapter;
    private List<MovieBean.SubjectsBean> data;

    @Override
    public int getLayout() {
        return R.layout.activity_find;
    }

    @Override
    public void init() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
            }
        }, 1500);

        initRecycle();
        getInfo();
    }

    private void initRecycle() {
        data = new ArrayList<>();
        //data.add("1");data.add("1");data.add("1");data.add("1");data.add("1");

        adapter = new CommonAdapter<MovieBean.SubjectsBean>(this, R.layout.recycle_find, data) {
            @Override
            public void convert(ViewHolder holder, MovieBean.SubjectsBean baseData, int position) {
                Glide.with(mContext).load(baseData.getImages().getSmall()).into((ImageView) holder.getView(R.id.iv_pic));
                holder.setText(R.id.tv_name, baseData.getTitle());
                holder.setText(R.id.tv_fen, "豆瓣评分：" + baseData.getRating().getAverage());
                holder.setText(R.id.tv_type, "类别：" + baseData.getGenres().toString());
                holder.setText(R.id.tv_des, "上映时间：" + baseData.getYear());
            }
        };
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void getInfo() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.d(TAG, "onFailure: ");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                //Log.d(TAG, "onResponse: " + response.body().string());
                String string = response.body().string();
                getResult(string);
            }
        });
    }

    private void getResult(String data) {
        Gson gson = new Gson();
        MovieBean movieBean = gson.fromJson(data, MovieBean.class);
        final List<MovieBean.SubjectsBean> subjects = movieBean.getSubjects();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.add(subjects);
                adapter.notifyDataSetChanged();
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
}
