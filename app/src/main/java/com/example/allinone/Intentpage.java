package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Intentpage extends AppCompatActivity {

    TextView settext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentpage);

        settext=findViewById(R.id.textView2);


        settext.setText(getIntent().getStringExtra("intent"));

    }

}