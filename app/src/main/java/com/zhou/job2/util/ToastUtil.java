package com.zhou.job2.util;

import android.content.Context;
import android.widget.Toast;


/**
 * Created by zhou on 2017/12/7.
 */

public class ToastUtil {
    public static void show(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
