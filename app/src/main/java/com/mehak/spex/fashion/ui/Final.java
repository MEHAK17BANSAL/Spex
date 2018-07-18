package com.mehak.spex.fashion.ui;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.mehak.spex.R;

public class Final extends AppCompatActivity {
WebView webView;
ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        webView=findViewById(R.id.webView);
        bar=findViewById(R.id.progressBar2);
       // overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        webView.setWebViewClient(new  myWebclient());
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://newspexart.onlinedemos.xyz");

    }
    public  class  myWebclient extends WebViewClient{
     @Override
        public  void onPageFinished(WebView view,String url) {
         super.onPageFinished(view, url);
         pd.dismiss();
         bar.setVisibility(view.GONE);

     }
        ProgressDialog pd = null;
         @Override
                 public void onPageStarted(WebView view,String url,Bitmap favfcon){
             pd=new ProgressDialog(Final.this);
             pd.setTitle("Please Wait..");
             pd.setMessage("Loading..");
             pd.show();
             super.onPageStarted(view, url, favfcon);

     }
     @Override public  boolean shouldOverrideUrlLoading(WebView view,String url){
         view.loadUrl(url);

         return super.shouldOverrideUrlLoading(view,url);
     }

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode==KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return  true;
        }
        return  super.onKeyDown(keyCode,event);
    }
}
