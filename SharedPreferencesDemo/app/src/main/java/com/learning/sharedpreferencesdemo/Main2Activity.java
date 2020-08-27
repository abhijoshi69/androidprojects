package com.learning.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtprefVal;
    SharedPreferences prefs;
    Intent intent;
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        prefs = getSharedPreferences("userRegistered",MODE_PRIVATE);
        final String prefVal = prefs.getString("name",null);
        if(prefVal!=null)
        {
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        btnLogout = findViewById(R.id.btn_Logout);
        txtprefVal = findViewById(R.id.txt_prefVal);
        txtprefVal.setText("welcome "+prefVal);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.clear();
                intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
