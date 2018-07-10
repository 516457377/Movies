package com.example.liaohuan.movies.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.liaohuan.movies.R;
import com.example.liaohuan.movies.bean.InfoBean;
import com.example.liaohuan.movies.bean.SearchBean;
import com.example.liaohuan.movies.okhttp.CallBackUtil;
import com.example.liaohuan.movies.okhttp.OkhttpUtil;
import com.example.liaohuan.movies.utlis.GsonFactory;
import com.example.liaohuan.movies.utlis.Host;
import com.example.liaohuan.movies.utlis.LogUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private Button btn_enter;
    private EditText edi_input;
    private TextView tv_response;
    public static final String CODE_SUCCESS = "A00000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        btn_enter = (Button) findViewById(R.id.btn_enter);
        edi_input = findViewById(R.id.edit_input);
        tv_response = findViewById(R.id.tv_response);
        LogUtils.i("here");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_enter:
                tv_response.setText("searching...");
                String input = edi_input.getText().toString();
                if (!TextUtils.isEmpty(input)){
                   String url = Host.getSearchHost(input,1);
                   System.out.println("url:"+url);
                    OkhttpUtil.okHttpPost(url, new CallBackUtil() {
                        @Override
                        public Object onParseResponse(Call call, Response response) {

                            try {
                                return response.body().string();
                            } catch (IOException e) {
                                e.printStackTrace();
                                return null;
                            }
                        }

                        @Override
                        public void onFailure(Call call, Exception e) {
                            tv_response.setText("fail");
                        }

                        @Override
                        public void onResponse(Object response) {
//                            GsonFactory.getInstanceByJson()
                            String json = (String) response;
                            if (json != null){
                                SearchBean searchBean = (SearchBean) GsonFactory.getInstanceByJson(json, SearchBean.class);
                                if (searchBean!=null && searchBean.getCode().equals(CODE_SUCCESS)){
                                    tv_response.setText(searchBean.getTotal()+"");
                                    getBestLongTime(searchBean);
                                }else{
                                    tv_response.setText("null");
                                }
                            }

                        }
                    });
                }
                break;
            default:

                break;
        }
    }

    private void getTypePriority(SearchBean searchBean){
        int sid = searchBean.getData().get(0).getTvQipuIds().get(0);
        getInfo(sid+"");
    }

    //timeLength
    private void getBestLongTime(SearchBean searchBean){
        List<SearchBean.Data> list = searchBean.getData();
        int timeLength = 0,index = 0;
        for (int i = 0 ; i < list.size() ; i++){
            SearchBean.Data data = searchBean.getData().get(i);
            if (searchBean.getData().get(i).getAlbumStatus() ==0){
                continue;
            }
            if (timeLength < data.getTimeLength()){
                timeLength = data.getTimeLength();
                index = i;
            }
        }
        int sid;
        if (searchBean.getData().get(index).getAlbumStatus() ==0){
            sid = searchBean.getData().get(index).getQipuId();
        }else
            sid = searchBean.getData().get(index).getTvQipuIds().get(0);
        getInfo(sid+"");
    }

    private void getInfo(String qipuId){
        String url = Host.getInfoHost(qipuId);
        System.out.println("qiURL:"+url);
        OkhttpUtil.okHttpPost(url, new CallBackUtil() {
           @Override
           public Object onParseResponse(Call call, Response response) {
               try {
                   return response.body().string();
               } catch (IOException e) {
                   e.printStackTrace();
                   return null;
               }
           }

           @Override
           public void onFailure(Call call, Exception e) {

           }

           @Override
           public void onResponse(Object response) {
                String json = (String) response;
                if (null != json){
                    InfoBean infoBean = (InfoBean) GsonFactory.getInstanceByJson(json,InfoBean.class);
                    if (infoBean != null && infoBean.getCode().equals(CODE_SUCCESS)){
                        String playul = infoBean.getData().getCommonSwf();
                        System.out.println("play:"+playul);
                        Intent intent= new Intent(MainActivity.this, WebActivity.class);
                        startActivity(new Intent(MainActivity.this, WebActivity.class).putExtra("play_url",playul));
                    }
                }
           }
       });
    }

}
