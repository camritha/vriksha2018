package com.example.akashravi.vriksha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Premium extends AppCompatActivity {

    private WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium);
        browser = (WebView) findViewById(R.id.browser);
        browser.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScMojfVDCDCSjuD6PnenjBOm6DYXOTq8-6gUxVrvdlNWXCV8A/viewform?usp=sf_link");
       // https://docs.google.com/forms/d/e/1FAIpQLScMojfVDCDCSjuD6PnenjBOm6DYXOTq8-6gUxVrvdlNWXCV8A/viewform?usp=sf_link
    }
}
