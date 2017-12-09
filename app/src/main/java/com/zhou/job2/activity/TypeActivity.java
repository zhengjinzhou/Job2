package com.zhou.job2.activity;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.zhou.job2.Constant;
import com.zhou.job2.R;
import com.zhou.job2.adapter.base.CommonAdapter;
import com.zhou.job2.adapter.base.ViewHolder;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.base.TypeBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class TypeActivity extends BaseActivity {

    private static final String TAG = "TypeActivity";
    @BindView(R.id.recycleView)
    RecyclerView recyclerView;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    private CommonAdapter adapter;
    private List<TypeBean.ResultBeanX.ResultBean> data;

    @Override

    public int getLayout() {
        return R.layout.activity_type;

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
        initNet();
    }

    @OnClick({R.id.iv_back})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
        }
    }

    private void initNet() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(Constant.URL_TYPE).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                startToActivity(MainActivity.class);
                finish();
                Log.d(TAG, "onFailure: ");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String string = response.body().string();
                Log.d(TAG, "onResponse: " + string);
                getResult(string);
            }
        });
    }

    private void getResult(String data) {

        if (data != null) {
            Gson gson = new Gson();
            TypeBean typeBean = gson.fromJson(data, TypeBean.class);
            TypeBean.ResultBeanX.ResultBean bean = new TypeBean.ResultBeanX.ResultBean();
            final List<TypeBean.ResultBeanX.ResultBean> result = typeBean.getResult().getResult();
            Log.d(TAG, "getResult: " + result.toString());
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    adapter.add(result);
                    adapter.notifyDataSetChanged();
                }
            });
        }

    }

    private void initRecycle() {
        data = new ArrayList<>();
        adapter = new CommonAdapter<TypeBean.ResultBeanX.ResultBean>(this, R.layout.recycle_type, data) {
            @SuppressLint("ResourceAsColor")
            @Override
            public void convert(ViewHolder holder, TypeBean.ResultBeanX.ResultBean s, int position) {
                if (position % 2 == 0) {
                    holder.getView(R.id.rl).setBackgroundColor(R.color.colorPrimary);
                }
                holder.setText(R.id.tv_type, s.getName());
                holder.setText(R.id.tv_id, s.getCaipiaoid());
            }
        };
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
