package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewholder>
{
    ArrayList<Model> data;

    public myAdapter(ArrayList<Model> data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_row,parent,false);
        return new myViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position)
    {
        holder.t1.setText(data.get(position).getItemName());
        holder.t2.setText(data.get(position).getPrice());
        holder.image.setImageResource(data.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
