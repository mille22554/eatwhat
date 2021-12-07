package com.example.eatwhat;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void eat_what(View view){
        gv gv=(gv) getApplicationContext();
        Random x=new Random();
        TextView eat=findViewById(R.id.textView3);
        if(gv.list.isEmpty()){
            eat.setText("沒有店鋪");
        }
        else {
            eat.setText(gv.list.get(x.nextInt(gv.list.size())));
        }
    }
    public void newselection(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }
    public void checkselection(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
    }
}