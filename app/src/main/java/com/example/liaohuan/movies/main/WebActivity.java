package com.example.liaohuan.movies.main;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.example.liaohuan.movies.R;

public class WebActivity extends Activity {
    private WebView webView;
//    private ImageView img_error, img_back;
    private ProgressBar progress;
    private String openUrl = "about:blank";

    /** 视频全屏参数 */
    protected static final FrameLayout.LayoutParams COVER_SCREEN_PARAMS = new FrameLayout.LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    private View customView;
    private FrameLayout fullscreenContainer;
    private CustomViewCallback customViewCallback;
    
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_web);
        ;
        if (null != getIntent())
           openUrl = getIntent().getStringExtra("play_url");
        if (null ==openUrl)
            openUrl = "about:blank";
        webView = (WebView) findViewById(R.id.web_view);
//        img_error = (ImageView) findViewById(R.id.img_error);
//        img_back = (ImageView) findViewById(R.id.img_back);
        progress = (ProgressBar) findViewById(R.id.progress);
        initWebView();
//        webView.canGoBack();
    }

    @Override
    protected void onStop() {
        super.onStop();
        webView.reload();
    }

    public class JSInterface {

        @JavascriptInterface
        public void finish() {
            finish();
        }
    }

    /** 展示网页界面 **/
    public void initWebView() {
//        WebChromeClient wvcc = new WebChromeClient();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        webView.addJavascriptInterface(new JSInterface(), "TEST_WEB");
        webSettings.setUseWideViewPort(true); // 关键点
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setSupportZoom(true); // 支持缩放
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 不加载缓存内容

//        webView.setWebChromeClient(wvcc);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                 if (url.equals(HEAD + HOST + HOST_MAIN)) {
//                     finish();
//                 }
                webView.loadUrl(url);
                return true;
            }
            
//            @Override
//            public void onReceivedHttpError(WebView view, WebResourceRequest request,
//                    WebResourceResponse errorResponse) {
//                
//                super.onReceivedHttpError(view, request, errorResponse);
//             // 这个方法在6.0才出现
//                int statusCode = errorResponse.getStatusCode();
//                if (404 == statusCode || 500 == statusCode) {
//                    view.setVisibility(View.GONE);
////                    view.loadUrl("about:blank");// 避免出现默认的错误界面
//                    showError(false);
////                    view.loadUrl(mErrorUrl);
//                }
//            }
            
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
             // 断网或者网络连接超时
                if (errorCode == ERROR_HOST_LOOKUP || errorCode == ERROR_CONNECT || errorCode == ERROR_TIMEOUT) {
                    view.setVisibility(View.GONE);
//                    view.loadUrl("about:blank"); // 避免出现默认的错误界面
//                    showError(true);
//                    view.loadUrl(mErrorUrl);
                }
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progress.setVisibility(View.GONE);
            }

        });

        webView.setWebChromeClient(new WebChromeClient() {

            /*** 视频播放相关的方法 **/
            @Override
            public View getVideoLoadingProgressView() {
                FrameLayout frameLayout = new FrameLayout(WebActivity.this);
                frameLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
                return frameLayout;
            }

            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                showCustomView(view, callback);
            }

            @Override
            public void onHideCustomView() {
                hideCustomView();
                onBackPressed();
            }

        });

        // 加载Web地址
        webView.loadUrl(openUrl);
    }

    /** 视频播放全屏 **/
    private void showCustomView(View view, CustomViewCallback callback) {
        // if a view already exists then immediately terminate the new one
        if (customView != null) {
            callback.onCustomViewHidden();
            return;
        }

        WebActivity.this.getWindow().getDecorView();

        FrameLayout decor = (FrameLayout) getWindow().getDecorView();
        fullscreenContainer = new FullscreenHolder(WebActivity.this);
        fullscreenContainer.addView(view, COVER_SCREEN_PARAMS);
        decor.addView(fullscreenContainer, COVER_SCREEN_PARAMS);
        customView = view;
        setStatusBarVisibility(false);
        customViewCallback = callback;
    }

    /** 隐藏视频全屏 */
    private void hideCustomView() {
        if (customView == null) {
            return;
        }

        setStatusBarVisibility(true);
        FrameLayout decor = (FrameLayout) getWindow().getDecorView();
        decor.removeView(fullscreenContainer);
        fullscreenContainer = null;
        customView = null;
        customViewCallback.onCustomViewHidden();
        webView.setVisibility(View.VISIBLE);
    }

    /** 全屏容器界面 */
    static class FullscreenHolder extends FrameLayout {

        public FullscreenHolder(Context ctx) {
            super(ctx);
            setBackgroundColor(ctx.getResources().getColor(android.R.color.black));
        }

        @Override
        public boolean onTouchEvent(MotionEvent evt) {
            return true;
        }
    }

    private void setStatusBarVisibility(boolean visible) {
        int flag = visible ? 0 : WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(flag, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        System.out.println("wen_back");
        switch (keyCode) {
        case KeyEvent.KEYCODE_BACK:
            /** 回退键 事件处理 优先级:视频播放全屏-网页回退-关闭页面 */
            if (customView != null) {
                hideCustomView();
            } else if (webView.canGoBack()) {
                webView.goBack();
            } else {
                finish();
            }
            return true;
        default:
            return super.onKeyUp(keyCode, event);
        }
    }
    
    public void onClick(View v){
        finish();
    }
    
//    private void showError(boolean isTimeout){
//        img_back.setVisibility(View.VISIBLE);
//        img_error.setVisibility(View.VISIBLE);
//        if (isTimeout) {
//            img_error.setImageResource(R.drawable.bmw_new_timeout);
//        }else{
//            img_error.setImageResource(R.drawable.bmw_new_404);
//        }
//    }
}
