package com.ripplecharts.ripplecharts;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Maurice on 10/20/2014.
 */
public class Client extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url == "http://www.ripplecharts.com/#/") {
            view.loadUrl(url);
            return false;
        }
        return true;
    }
}
