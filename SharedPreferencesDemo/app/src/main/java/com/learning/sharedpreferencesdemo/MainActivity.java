package com.learning.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnSave;
    SharedPreferences prefs;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefs = getSharedPreferences("userRegistered",MODE_PRIVATE);
        String prefVal = prefs.getString("name",null);
        if(prefVal!=null)
        {
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        edtName = findViewById(R.id.edt_name);
        btnSave = findViewById(R.id.edt_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm = edtName.getText().toString();
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("name",nm);
                editor.commit();
                intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
