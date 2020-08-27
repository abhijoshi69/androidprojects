package com.learning.calcydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent i3 = getIntent();
        Bundle b4 = i3.getExtras();


        String sub1 = b4.getString("subtract");
        textView.setText("The answer after subtracting two number is "+sub1);

        String mul = b4.getString("multiply");
        textView.setText("The answer after multipying two number is "+mul);

        String div = b4.getString("divide");
        textView.setText("The answer after dividing two number is "+div);

        if(b4.get("add")==true)
        {
            String add1 = b4.getString("add");
            textView.setText("The answer after adding two number is "+add1);
        }
    }
}
