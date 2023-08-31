package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewholder extends RecyclerView.ViewHolder
{
    ImageView image;
    TextView t1,t2;
    public myViewholder(@NonNull View itemView) {
        super(itemView);
        image=(ImageView)itemView.findViewById(R.id.img);
        t1=(TextView)itemView.findViewById(R.id.text1);
        t2=(TextView)itemView.findViewById(R.id.text2);
    }
}
