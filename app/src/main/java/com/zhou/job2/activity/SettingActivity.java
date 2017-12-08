package com.zhou.job2.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.zhou.job2.R;
import com.zhou.job2.base.BaseActivity;
import com.zhou.job2.util.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;

public class SettingActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.pb_grogress)
    ProgressBar pbGrogress;
    @BindView(R.id.tv_fankui)
    TextView tvFankui;
    @BindView(R.id.tv_forget)
    TextView tvForget;

    @Override
    public int getLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void init() {

    }

    @OnClick({R.id.iv_back, R.id.bt_login, R.id.tv_fankui, R.id.tv_forget})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_login:
                if (TextUtils.isEmpty(etUsername.getText().toString())) {
                    ToastUtil.show(getApplicationContext(), "手机号码不能为空");
                    return;
                }
                if (TextUtils.isEmpty(etPassword.getText().toString())) {
                    ToastUtil.show(getApplicationContext(), "密码不能为空");
                    return;
                }
                pbGrogress.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pbGrogress.setVisibility(View.GONE);
                        ToastUtil.show(getApplicationContext(), "对不起，现在系统繁忙，请稍后尝试");
                    }
                }, 2000);
                break;
            case R.id.tv_fankui:
                ToastUtil.show(getApplicationContext(), "您的信息我们已记录，感谢您的反馈");
                break;
            case R.id.tv_forget:
                ToastUtil.show(getApplicationContext(), "对不起，现在系统繁忙，请稍后尝试");
                break;
        }
    }
}
