package com.zb.app.pandatv.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by CIA on 2017/7/3.
 */

public class RetrofitUtils {

    public static Retrofit getRetrofit() {
        Retrofit rft = new Retrofit.Builder().baseUrl("http://api.m.panda.tv")
                .addConverterFactory(ScalarsConverterFactory.create()).build();
        return rft;
    }

    public static Retrofit getGsonRetrofit() {
        Retrofit rft = new Retrofit.Builder().baseUrl("http://api.m.panda.tv")
                .addConverterFactory(GsonConverterFactory.create()).build();
        return rft;
    }
}
