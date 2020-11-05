package com.example.gridwithadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

public class MainActivity2 extends AppCompatActivity {
    ImageView viw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viw=findViewById(R.id.viw);

        Intent intent=getIntent();

        int a=intent.getIntExtra("Pos",0);

        int [] arr=MainActivity.pics;
        int pos=arr[a];
        viw.setImageResource(pos);
        viw.setOnTouchListener(new ImageMatrixTouchHandler(getBaseContext()));


    }
}