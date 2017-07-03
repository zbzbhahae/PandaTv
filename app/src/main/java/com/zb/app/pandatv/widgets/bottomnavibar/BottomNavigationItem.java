package com.zb.app.pandatv.widgets.bottomnavibar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.zb.app.pandatv.R;

/**
 * Created by zhangbo on 17/6/18.
 */

public class BottomNavigationItem extends LinearLayout {


    private RadioButton imageButton;
    private TextView textView;

    private float textSize;
    private int textColor;
    private int textCheckedColor;

    public BottomNavigationItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.widget_bottom_navi_bar_item, this, true);
        imageButton = (RadioButton) findViewById(R.id.bottom_navi_bar_item_image);
        textView = (TextView) findViewById(R.id.bottom_navi_bar_item_text);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.BottomNavigationItem);

        if(ta != null) {
            //设置图片
            int drawableId = ta.getResourceId(R.styleable.BottomNavigationItem_item_drawable, -1);
            if(drawableId != -1) {
                imageButton.setBackgroundResource(drawableId);
            }
            textColor = ta.getColor(R.styleable.BottomNavigationItem_item_text_color, -1);
            if(textColor != -1) {
                textView.setTextColor(textColor);
            }
            textCheckedColor = ta.getColor(R.styleable.BottomNavigationItem_item_text_checked_color, -1);
            textSize = ta.getDimensionPixelSize(R.styleable.BottomNavigationItem_item_text_size, -1);
            if(textSize != -1) {
                textView.setTextSize(textSize);
            }
            String text = ta.getString(R.styleable.BottomNavigationItem_item_text);
            if(null != text) {
                textView.setText(text);
            }
            ta.recycle();
        }
    }

    public void setChecked(boolean check) {
        if(check) {
            imageButton.setChecked(true);
            textView.setTextColor(textCheckedColor);
        } else {
            imageButton.setChecked(false);
            textView.setTextColor(textColor);
        }
    }

    public void setText(String s) {
        if(s != null)
            textView.setText(s);
    }

}
