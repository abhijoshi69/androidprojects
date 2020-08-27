package com.learning.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtId,edtName,edtSurname,edtMarks;
    Button btnSave,btnRead;
    String nm,snm,mrk;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtId = findViewById(R.id.edt_id);
        edtName = findViewById(R.id.edt_name);
        edtSurname = findViewById(R.id.edt_surname);
        edtMarks = findViewById(R.id.edt_marks);
        btnSave = findViewById(R.id.btn_save);
        btnRead = findViewById(R.id.btn_get);
        databaseHelper = new DatabaseHelper(this);

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetails();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm = edtName.getText().toString();
                snm = edtSurname.getText().toString();
                mrk = edtMarks.getText().toString();
                insertValues(nm,snm,mrk);
            }
        });

    }

    private void showDetails() {
        Cursor res = databaseHelper.getAllData();
        if(res.getCount()==0)
        {
            showToast("No Data Found");
        }
        else
        {
            StringBuffer buffer = new StringBuffer();
            while(res.moveToNext())
            {
                buffer.append("ID: "+res.getString(0)+"\n");
                buffer.append("Name: "+res.getString(1)+"\n");
                buffer.append("Surname: "+res.getString(2)+"\n");
                buffer.append("Marks: "+res.getString(3)+"\n");
            }
            showToast(buffer.toString());
        }
    }

    private void insertValues(String nm, String snm, String mrk) {
        boolean isDataInserted = databaseHelper.insertData(nm,snm,mrk);
        if(isDataInserted)
        {
            showToast("Data saved");

        }
        else
        {
            showToast("Data not saved");
        }
    }
    private void showToast(String msg)
    {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

}
