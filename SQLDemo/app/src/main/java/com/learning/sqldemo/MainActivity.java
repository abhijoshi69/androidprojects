package com.learning.sqldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    DatabaseHelper myDb;
    EditText edtId,edtName,edtSurname,edtMarks;
    Button btnSave,btnUpdate,btnDelete,btnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtId = findViewById(R.id.edt_Id);
        edtName = findViewById(R.id.edt_Name);
        edtSurname = findViewById(R.id.edt_Surname);
        edtMarks = findViewById(R.id.edt_Marks);

        btnSave = findViewById(R.id.btn_Save);
        btnView = findViewById(R.id.btn_View);
        btnUpdate = findViewById(R.id.btn_Update);
        btnDelete = findViewById(R.id.btn_Delete);
    }
}
