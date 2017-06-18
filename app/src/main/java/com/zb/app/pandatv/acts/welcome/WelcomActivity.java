package com.zb.app.pandatv.acts.welcome;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Window;

import com.zb.app.pandatv.R;
import com.zb.app.pandatv.acts.BaseActivity;
import com.zb.app.pandatv.acts.MainActivity;

/**
 * Created by CIA on 2017/6/17.
 */

public class WelcomActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getWindow().setFlags(Window.FEATURE_NO_TITLE, Window.FEATURE_NO_TITLE);

        jumpToMain();
    }

    private void jumpToMain() {
        Handler s = new Handler();
        s.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(MainActivity.class);
                finish();
            }
        }, 2000);
    }
}
