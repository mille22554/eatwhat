package com.example.eatwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void newshop(View view){
        gv gv=(gv) getApplicationContext();
        EditText et=findViewById(R.id.editTextTextPersonName2);
        gv.list.add(String.valueOf(et.getText()));
        gv.shopinfo.add("無");
        Toast.makeText(this, "新增成功", Toast.LENGTH_LONG).show();
    }
    public void Return(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
}