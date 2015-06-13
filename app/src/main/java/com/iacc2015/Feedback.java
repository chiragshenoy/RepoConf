package com.iacc2015;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


/**
 * Created by Chirag Shenoy on 10-Jun-15.
 */
public class Feedback extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedbac);

        WebView wv = (WebView) findViewById(R.id.webView);
        wv.loadUrl("https://docs.google.com/forms/d/1oM_UmcDyxNLqwXjWRngHepxWj-GlHEJmxPz6osFL-zg/viewform?c=0&w=1");
    }
}
