package com.zb.app.pandatv.widgets.bottomnavibar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.zb.app.pandatv.R;

/**
 * Created by zhangbo on 17/6/18.
 */

public class BottomNavigationTab extends LinearLayout {

    public BottomNavigationTab(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.widget_bottom_navi_bar, this, true);

        BottomNavigationItem home = (BottomNavigationItem) findViewById(R.id.navi_bar_item_home);
        home.setChecked(true);
    }



}
