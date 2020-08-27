package com.learning.caldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText noText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        noText = findViewById(R.id.noText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }
    public void click(View view)
    {
        int val1 = Integer.parseInt(editText.getText().toString());
        int val2 = Integer.parseInt(noText.getText().toString());
        int res = val1+val2;
        textView.setText(String.valueOf(res));
    }
}
