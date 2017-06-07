package com.zb.app.pandatv.acts.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zb.app.pandatv.R;

/**
 * Created by CIA on 2017/6/7.
 */

public class HomeFra extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home, container, false);



        return layout;
    }

    public static Fragment newInstance(int index) {
        HomeFra bf = new HomeFra();
        Bundle args = new Bundle();
        args.putInt("index", index);
        bf.setArguments(args);
        return bf;
    }

}
