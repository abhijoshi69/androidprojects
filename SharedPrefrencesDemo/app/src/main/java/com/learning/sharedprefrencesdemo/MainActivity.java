package com.learning.sharedprefrencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;
    SharedPreferences preferences;
    String nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        preferences = getSharedPreferences("myPref",MODE_PRIVATE);
        nm = preferences.getString("recvdVal","Guest");
        textView.setText("Welcome "+nm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm = editText.getText().toString();
                textView.setText("Welcome "+nm);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("recvdVal",nm);
            }
        });
    }
}
