package com.learning.usermodeldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView txtUserObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent receivedIntent = getIntent();
        txtUserObj = findViewById(R.id.txt_Userobj);
        UserModel receivedModel = (UserModel) receivedIntent.getSerializableExtra("userObj");
        //Toast.makeText(this,receivedModel.toString(),Toast.LENGTH_LONG).show();
        txtUserObj.setText("Name: "+receivedModel.getName()+"\nEmail: "+receivedModel.getEmailid());
    }
}
