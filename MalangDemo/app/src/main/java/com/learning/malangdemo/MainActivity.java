package com.learning.malangdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText noText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        noText = findViewById(R.id.noText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sampledemo,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                int val1 = Integer.parseInt(editText.getText().toString());
                int val2 = Integer.parseInt(noText.getText().toString());
                int res = val1 + val2;
                Bundle b = new Bundle();
                b.putString("sum",String.valueOf(res));
                Intent i = new Intent(MainActivity.this,)

        }
        return super.onOptionsItemSelected(item);
    }
}
