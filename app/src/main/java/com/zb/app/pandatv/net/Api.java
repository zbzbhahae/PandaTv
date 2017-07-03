package com.zb.app.pandatv.net;

import com.zb.app.pandatv.net.Beans.GameCategoryBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by CIA on 2017/6/7.
 */

public class Api {

    //使用平台
    public static String platform = "android";
    //分发渠道
    public static String channel = "guanwang";



    public interface PandaApi {
        @GET("index.php")
        public Call<String> getCategory(@Query("method") String method, @Query("__version") String version,
                                @Query("__plat") String platform, @Query("__channel") String channel);
        @GET("index.php")
        public Call<GameCategoryBean> getCategoryBean(@Query("method") String method, @Query("__version") String version,
                                                  @Query("__plat") String platform, @Query("__channel") String channel);
    }
}
