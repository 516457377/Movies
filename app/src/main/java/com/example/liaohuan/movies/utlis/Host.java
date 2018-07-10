package com.example.liaohuan.movies.utlis;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Host {
    private static final String host = "http://expand.video.iqiyi.com/api/";

    private static final String key = "71c300df4a7f4e89a43d8e19e5458e6f";

    /**
     * 1.电影、2.电视剧、3.纪录片、4.动漫、5.音乐、6.综艺、7.娱乐、8.游戏、
     * 9.旅游、10.片花、12.教育、13.时尚、15.少儿、16.微电影、17.体育、
     * 20.广告、21.生活、22.搞笑、24.财经、25.资讯、26.汽车、27.原创、28.军事
     * 29.母婴、30科技、31.脱口秀、32健康频道
     */
    // http://expand.video.iqiyi.com/api/search/list.json?type=list&apiKey=71c300df4a7f4e89a43d8e19e5458e6f&keyWord=大圣归来&categoryIds=1
    //http://expand.video.iqiyi.com/api/search/list.json?apiKey=71c300df4a7f4e89a43d8e19e5458e6f&keyWord=娱乐猛回头&categoryIds=6
    public static String getSearchHost(String search){
        String url = "";
        url = host +"search/list.json?type=list&apiKey="+key+"&keyWord="+search;
        return url;
    }
    /**
     *
     * @param categoryIds 1.电影、2.电视剧、3.纪录片、4.动漫、5.音乐、6.综艺、7.娱乐、8.游戏、
     * 9.旅游、10.片花、12.教育、13.时尚、15.少儿、16.微电影、17.体育、
     * 20.广告、21.生活、22.搞笑、24.财经、25.资讯、26.汽车、27.原创、28.军事
     * 29.母婴、30科技、31.脱口秀、32健康频道*/
    public static String getSearchHost(@NonNull String search, int categoryIds){
        String url = "";
        url = host +"search/list.json?type=list&apiKey="+key+"&keyWord="+search+"&categoryIds="+categoryIds;
        return url;
    }

    //http://expand.video.iqiyi.com/api/video/info.json?apiKey=71c300df4a7f4e89a43d8e19e5458e6f&qipuId=523856600
    public static String getInfoHost(String qipuId){
        String url = "";
        url = host+"video/info.json?apiKey="+key+"&qipuId="+qipuId;
        return url;
    }


    /**
     *
     *  OkHttpClient http = new OkHttpClient();
     Request request = new Request.Builder().get().url(url).build();
     Response response = http.newCall(request).execute();
     String json = response.body().string();
     *
     *
     * OkHttpClient http = new OkHttpClient();
     Request request = new Request.Builder().get().url(url).build();
     Call call = http.newCall(request);
     call.enqueue(new Callback() {...}
     *
     *
     * */
}
