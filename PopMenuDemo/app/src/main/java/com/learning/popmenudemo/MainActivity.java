package com.learning.popmenudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showPopMenu(v);
            }
        });
    }

    private void showPopMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)this);
        popupMenu.inflate(R.menu.menu);
        popupMenu.show();
        //MenuInflater inflater = popupMenu.getMenuInflater();
        //inflater.inflate(R.menu.menu,popupMenu.getMenu());

    }
     public boolean onMenuItemClick(MenuItem item)
     {
         switch (item.getItemId())
         {
             case R.id.item1:
                 Toast.makeText(MainActivity.this,"You have clicked Bhai Bhai",Toast.LENGTH_LONG).show();
                 break;
             case R.id.item2:
                 Toast.makeText(MainActivity.this,"You have clicked Instagram",Toast.LENGTH_LONG).show();
                 break;
             case R.id.item3:
                 Toast.makeText(MainActivity.this,"You have clicked Jas baat badal diye",Toast.LENGTH_LONG).show();
                 break;
                 return true;
         }
     }
}
