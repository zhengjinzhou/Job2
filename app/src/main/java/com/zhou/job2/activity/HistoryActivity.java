package com.zhou.job2.activity;

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
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;

public class HistoryActivity extends BaseActivity {

    private static final String TAG = "HistoryActivity";
    String url = "https://way.jd.com/jisuapi/query3?caipiaoid=11&issueno=2014127&appkey=d3a62ea686a062d5a5ba1b91fda4f1df";
   // private String url_one = "https://way.jd.com/jisuapi/query3?caipiaoid=";
   // private String url_two = "&appkey=d3a62ea686a062d5a5ba1b91fda4f1df";

    @BindView(R.id.tv_all)
    TextView tv_all;
    @BindView(R.id.tv_number)
    TextView tv_number;
    @BindView(R.id.tv_time)
    TextView tv_time;
    @BindView(R.id.tv_noe)
    TextView tv_noe;
    @BindView(R.id.tv_two)
    TextView tv_two;
    @BindView(R.id.tv_three)
    TextView tv_three;
    @BindView(R.id.tv_forth)
    TextView tv_forth;
    @BindView(R.id.tv_five)
    TextView tv_five;
    @BindView(R.id.tv_six)
    TextView tv_six;
    private String format;

    @Override
    public int getLayout() {
        return R.layout.activity_history;
    }

    @Override
    public void init() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        format = dateFormat.format(new Date());
        Log.d(TAG, "init: " + format);
        /*//&issueno=2014127
        String issueno = "&issueno=" + format;
        String id = getIntent().getStringExtra("id");
        String url = url_one + id + issueno + url_two;*/
        getInfo(url);
    }

    private void getInfo(String url) {
        Log.d(TAG, "getInfo----------------------------: " + url);
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.d(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Response response) throws IOException {
                // Log.d(TAG, "onResponse: " + response.body().string());
                //String string = response.body().string();
                getResult(response.body().string());
            }
        });
    }

    private void getResult(String data) {
        Log.d(TAG, "getResult: " + data);
        Gson gson = new Gson();
        final KaiJiangBean jiangBean = gson.fromJson(data, KaiJiangBean.class);
        Log.d(TAG, "getResult: " + jiangBean.getCode());
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                final KaiJiangBean.ResultBeanX.ResultBean result = jiangBean.getResult().getResult();

                tv_all.setText("池奖金额:" + jiangBean.getCode());
                tv_number.setText("中奖号码：" + result.getNumber());
                tv_time.setText("开奖时间：" + format);
                tv_noe.setText("一等奖：人数" + result.getPrize().get(0).getNum() + "金额" + result.getPrize().get(0).getSinglebonus() + "--------" + result.getPrize().get(0).getRequire());
                tv_two.setText("二等奖：人数" + result.getPrize().get(1).getNum() + "金额" + result.getPrize().get(1).getSinglebonus() + "--------" + result.getPrize().get(1).getRequire());
                tv_three.setText("三等奖：人数" + result.getPrize().get(2).getNum() + "金额" + result.getPrize().get(2).getSinglebonus() + "--------" + result.getPrize().get(2).getRequire());
                tv_forth.setText("四等奖：人数" + result.getPrize().get(3).getNum() + "金额" + result.getPrize().get(3).getSinglebonus() + "--------" + result.getPrize().get(3).getRequire());
                tv_five.setText("五等奖：人数" + result.getPrize().get(4).getNum() + "金额" + result.getPrize().get(4).getSinglebonus() + "--------" + result.getPrize().get(4).getRequire());
                tv_six.setText("六等奖：人数" + result.getPrize().get(5).getNum() + "金额" + result.getPrize().get(5).getSinglebonus() + "--------" + result.getPrize().get(5).getRequire());

            }
        });
    }
}
