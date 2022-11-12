package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class Webview extends AppCompatActivity {
    EditText searchname;
    WebView web;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        searchname=findViewById(R.id.editTextTextPersonName3);
        web=findViewById(R.id.network);

    }

    public void search(View view) {

        string=searchname.getText().toString();
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www."+string+".com");





    }
}