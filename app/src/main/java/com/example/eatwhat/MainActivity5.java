package com.example.eatwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        gv gv=(gv) getApplicationContext();
        TextView shopname=findViewById(R.id.textView2);
        TextView shopinfo=findViewById(R.id.textView5);
        shopname.setText(gv.shopname);
        shopinfo.setText(gv.shopinfo.get(gv.list.indexOf(gv.shopname)));
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void infoedit(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity5.this, MainActivity6.class);
        startActivity(intent);
    }
    public void deleteshop(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity5.this, MainActivity7.class);
        startActivity(intent);
    }
    public void Return(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity5.this, MainActivity4.class);
        startActivity(intent);
    }
}