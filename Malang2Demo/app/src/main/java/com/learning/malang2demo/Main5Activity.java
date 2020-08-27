package com.learning.malang2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main5Activity extends AppCompatActivity {

    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView4 = findViewById(R.id.textView4);
        Intent io = getIntent();
        Bundle b1 = io.getExtras();
        String div = b1.getString("Divide");
        textView4.setText("Division of two numbers is "+div);
    }
}
