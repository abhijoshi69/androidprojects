package com.learning.readwritedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    String FILE_NAME = "MyFile.txt";
    EditText edtData;
    TextView txtData;
    Button btnWrite,btnRead;
    public static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = findViewById(R.id.edt_data);
        txtData = findViewById(R.id.txt_data);
        btnWrite = findViewById(R.id.btn_write);
        btnRead = findViewById(R.id.btn_read);

        String state = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state))
        {
            Log.i(TAG,"Memory Card attached");
        }
        else
        {
            Log.i(TAG,"Memory Card not attached");
        }

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String datatobewritten = edtData.getText().toString();
                writeData(datatobewritten);
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readData();
            }
        });

    }

    private void readData() {
        try(FileInputStream inputStream=openFileInput(FILE_NAME))
        {
            byte[]reader = new byte[inputStream.available()];
            if(inputStream.read(reader)!=-1)
            {
                String dataRead = new String(reader);
                txtData.setText(dataRead);
            }
        }
        catch (Exception ex)
        {
            Log.e(TAG,ex.getMessage());
        }
    }

    private void writeData(String datatobewritten) {


            try (FileOutputStream stream = openFileOutput(FILE_NAME, Context.MODE_PRIVATE)) {
                stream.write(datatobewritten.getBytes());
                Toast.makeText(MainActivity.this,"Data Saved",Toast.LENGTH_LONG).show();
            }
            catch (Exception ex)
            {
                Log.e(TAG,ex.getMessage());
            }
    }
}
