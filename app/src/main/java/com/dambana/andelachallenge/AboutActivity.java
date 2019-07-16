package com.dambana.andelachallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("About ALC!!!");
        setContentView(R.layout.activity_about);

        WebView web = (WebView) findViewById(R.id.webViewAndela);
        web.setWebViewClient(new WebViewClient());
        web.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        //web.loadUrl("https://www.andela.com/alc");
        web.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        web.loadUrl("http://www.andela.com/alc");
    }
}
