package com.learning.calcydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(editText2.getText().toString());
                int res = val1 + val2;
                Bundle bundle = new Bundle();
                bundle.putString("add",String.valueOf(res));
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtras(bundle);
                startActivity(i);


            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(editText2.getText().toString());
                int res = val1 - val2;
                Bundle b = new Bundle();
                b.putString("subtract",String.valueOf(res));
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(editText2.getText().toString());
                int res = val1 * val2;
                Bundle b1 = new Bundle();
                b1.putString("multiply",String.valueOf(res));
                Intent in = new Intent(MainActivity.this,Main2Activity.class);
                in.putExtras(b1);
                startActivity(in);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(editText2.getText().toString());
                float res = val1/val2;
                Bundle b2 = new Bundle();
                b2.putString("divide",String.valueOf(res));
                Intent i2 = new Intent(MainActivity.this,Main2Activity.class);
                i2.putExtras(b2);
                startActivity(i2);
            }
        });

    }
}
