package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main_4_1_1 extends AppCompatActivity {
    private Button mAuthorize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_1_1);

        mAuthorize = (Button) findViewById(R.id.authorize);
        mAuthorize.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。在存放资源代码的文件夹下下，
                Intent i = new Intent(Main_4_1_1.this , Main_4.class);
                //启动
                startActivity(i);
            }
        });
    }
}
