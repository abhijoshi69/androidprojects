package com.learning.malang2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText noText;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        noText = findViewById(R.id.noText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(noText.getText().toString());
                int res = val1 + val2;
                Bundle bundle = new Bundle();
                bundle.putString("Sum",String.valueOf(res));
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(noText.getText().toString());
                int res = val1 - val2;
                Bundle bundle1 = new Bundle();
                bundle1.putString("Subtract",String.valueOf(res));
                Intent i2 = new Intent(MainActivity.this,Main2Activity.class);
                i2.putExtras(bundle1);
                startActivity(i2);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(noText.getText().toString());
                int res = val1 * val2;
                Bundle bundle2 = new Bundle();
                bundle2.putString("Multiply",String.valueOf(res));
                Intent i3 = new Intent(MainActivity.this,Main2Activity.class);
                i3.putExtras(bundle2);
                startActivity(i3);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(noText.getText().toString());
                int res = val1/val2;
                Bundle bundle3 = new Bundle();
                bundle3.putString("Divide",String.valueOf(res));
                Intent i4 = new Intent(MainActivity.this,Main2Activity.class);
                i4.putExtras(bundle3);
                startActivity(i4);
            }
        });
    }
}
