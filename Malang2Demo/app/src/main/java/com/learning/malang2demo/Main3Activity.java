package com.learning.malang2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView2 = findViewById(R.id.textView2);
        Intent ip = getIntent();
        Bundle bk = ip.getExtras();
        String sub = bk.getString("Subtract");
        textView2.setText("Subtraction of two numbers is "+sub);
    }
}
