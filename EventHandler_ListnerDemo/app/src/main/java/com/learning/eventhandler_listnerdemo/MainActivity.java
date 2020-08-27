package com.learning.eventhandler_listnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnevthandler;
    Button btnevtlistner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnevthandler = findViewById(R.id.button);
        btnevtlistner = findViewById(R.id.button2);
        btnevtlistner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this,"EventListnerInvoked",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
    public void greet(View view)
    {
        Toast toast = Toast.makeText(this,"EventHandled",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        //Toast.makeText(this,"EventHandled",Toast.LENGTH_LONG).show();
    }
}
