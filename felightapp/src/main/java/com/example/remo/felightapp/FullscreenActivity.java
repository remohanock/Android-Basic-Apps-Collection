package com.example.remo.felightapp;

import com.example.remo.felightapp.util.SystemUiHider;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView wvResult = (WebView) findViewById(R.id.wvResult);
        wvResult.loadUrl("https://www.felight.com");

        setContentView(R.layout.activity_fullscreen);

    }
}
