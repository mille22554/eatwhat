package com.example.eatwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void yes(View view){
        gv gv=(gv) getApplicationContext();
        gv.shopinfo.remove(gv.list.indexOf(gv.shopname));
        gv.list.remove(gv.list.indexOf(gv.shopname));
        Intent intent = new Intent();
        intent.setClass(MainActivity7.this, MainActivity4.class);
        startActivity(intent);
    }
    public void no(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity7.this, MainActivity5.class);
        startActivity(intent);
    }
}