package com.zb.app.pandatv.acts.fragment.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zb.app.pandatv.R;
import com.zb.app.pandatv.acts.fragment.BaseFragment;
import com.zb.app.pandatv.net.Api;
import com.zb.app.pandatv.net.Beans.GameCategoryBean;
import com.zb.app.pandatv.net.RetrofitUtils;
import com.zb.app.pandatv.utils.L;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by CIA on 2017/6/7.
 */

public class HomeFra extends BaseFragment {

    @BindView(R.id.home_text) TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, layout);

        textView.setText(Math.random() * 100 + "");

        Api.PandaApi pandaApi = RetrofitUtils.getRetrofit().create(Api.PandaApi.class);
        Call<String> call = pandaApi.getCategory("category.gamelist", "3.1.7.3811", Api.platform, Api.channel);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                L.e(response.body());
                textView.setText(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

        pandaApi = RetrofitUtils.getGsonRetrofit().create(Api.PandaApi.class);
        Call<GameCategoryBean> beanCall = pandaApi.getCategoryBean("category.gamelist", "3.1.7.3811", Api.platform, Api.channel);
        beanCall.enqueue(new Callback<GameCategoryBean>() {
            @Override
            public void onResponse(Call<GameCategoryBean> call, Response<GameCategoryBean> response) {
                L.e(response.body().toString());
                GameCategoryBean gb = response.body();
                int i=9;

            }

            @Override
            public void onFailure(Call<GameCategoryBean> call, Throwable t) {

            }
        });
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
