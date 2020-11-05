package com.example.gridwithadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class G_adapter extends BaseAdapter {
    Context context;
    int pics[];
    LayoutInflater layoutInflater;
    ImageView imgviw;

    public G_adapter (Context context,int[] pics){
        this.context=context;
        this.pics=pics;
        layoutInflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return pics.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=layoutInflater.inflate(R.layout.layout,null);
        imgviw=convertView.findViewById(R.id.imgviw);
        imgviw.setImageResource(pics[position]);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,MainActivity2.class);
                intent.putExtra("Pos",position);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
