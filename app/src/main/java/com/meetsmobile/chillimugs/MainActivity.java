package com.meetsmobile.chillimugs;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // Carrega o layout com o WebView

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient()); // Evita abrir no navegador externo

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Habilita JavaScript, se necessário

        // Substitua pelo endereço da sua versão web responsiva:
        webView.loadUrl("https://meets.rf.gd/?i=1");
    }

    @Override
    public void onBackPressed() {
        // Permite navegar para trás dentro do WebView
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}



