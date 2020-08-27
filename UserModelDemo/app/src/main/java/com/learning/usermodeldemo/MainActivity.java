package com.learning.usermodeldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtName,edtPassword,edtEmail;
    Button btnRegister;
    Intent modelIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edt_name);
        edtPassword = findViewById(R.id.edt_password);
        edtEmail = findViewById(R.id.edt_email);
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useModel();
            }
        });
    }

    private void useModel() {
        String nm = edtName.getText().toString();
        String pass = edtPassword.getText().toString();
        String emailid = edtEmail.getText().toString();
        UserModel model = new UserModel(nm,pass,emailid);
        modelIntent = new Intent(this,Main2Activity.class);
        modelIntent.putExtra("userObj",model);
        startActivity(modelIntent);
    }
}
