package com.zhou.job2.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zhou.job2.R;

import butterknife.ButterKnife;

/**
 * Created by zhou on 2017/12/7.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public abstract int getLayout();
    public abstract void init();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        init();
    }

    public void startToActivity(Class<?> zall){
        Intent intent = new Intent(this, zall);
        startActivity(intent);
    }
}
