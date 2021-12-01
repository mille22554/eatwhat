package com.example.eatwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void newshop(View view){
        gv gv=(gv) getApplicationContext();
        EditText et=findViewById(R.id.editTextTextPersonName2);
        gv.list.add(String.valueOf(et.getText()));
        Toast.makeText(this, "新增成功", Toast.LENGTH_LONG).show();
    }
}