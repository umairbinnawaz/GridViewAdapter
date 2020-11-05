package com.example.gridwithadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
   static int pics []={R.drawable.imag12,R.drawable.imag13,R.drawable.imag14,R.drawable.imag15,R.drawable.imag16,R.drawable.imag18,R.drawable.imag12,R.drawable.imag13,R.drawable.imag14,R.drawable.imag15,R.drawable.imag16,R.drawable.imag18};
    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=findViewById(R.id.grid);

        G_adapter adapter=new G_adapter(getApplicationContext(),pics);
        grid.setAdapter(adapter);
    }
}