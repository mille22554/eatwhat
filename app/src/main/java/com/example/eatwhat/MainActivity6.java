package com.example.eatwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        gv gv=(gv) getApplicationContext();
        EditText infoedit=findViewById(R.id.editTextTextPersonName3);
        infoedit.setText(gv.shopinfo.get(gv.list.indexOf(gv.shopname)));
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void editdone(View view){
        gv gv=(gv) getApplicationContext();
        EditText infoedit=findViewById(R.id.editTextTextPersonName3);
        gv.shopinfo.set(gv.list.indexOf(gv.shopname),infoedit.getText().toString());
        Intent intent = new Intent();
        intent.setClass(MainActivity6.this, MainActivity5.class);
        startActivity(intent);
    }
}