package com.learning.contextmenuoption;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.sampledemo,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(MainActivity.this,"You have clicked Tinder",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(MainActivity.this,"You have clicked Tantan",Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(MainActivity.this,"You have clicked Happen",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
