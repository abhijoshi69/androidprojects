package com.learning.malang2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView3 = findViewById(R.id.textView3);
        Intent it = getIntent();
        Bundle bundle = it.getExtras();
        String mul = bundle.getString("Multiply");
        textView3.setText("Multipication of two numbers is "+mul);

    }
}
