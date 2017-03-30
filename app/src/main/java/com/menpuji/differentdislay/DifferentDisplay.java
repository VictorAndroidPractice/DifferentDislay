package com.menpuji.differentdislay;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.webkit.WebView;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class DifferentDisplay extends Presentation {
    public DifferentDisplay(Context context, Display display) {
        super(context, display);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diffrent_display);
        initView();
    }

    private void initView() {
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.baidu.com");
    }
}
