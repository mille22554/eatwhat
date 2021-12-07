package com.example.eatwhat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        gv gv=(gv) getApplicationContext();
        RecyclerView recycler_view;
        MyAdapter adapter;
        ArrayList<String> mData = new ArrayList<>();
        // 準備資料，塞50個項目到ArrayList裡
        for(int i = 0; i < gv.list.size(); i++) {
            mData.add(gv.list.get(i));
        }

        // 連結元件
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        // 設置RecyclerView為列表型態
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        // 設置格線
        recycler_view.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        // 將資料交給adapter
        adapter = new MyAdapter(mData);
        // 設置adapter給recycler_view
        recycler_view.setAdapter(adapter);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    public void Return(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity4.this, MainActivity2.class);
        startActivity(intent);
    }
}