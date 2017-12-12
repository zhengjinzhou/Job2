package com.zhou.job2.activity;

import android.os.Handler;
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

    @Override
    public int getLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void init() {

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
