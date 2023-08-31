package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and card View Demo");
        rcv=(RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter=new myAdapter(dataqueue());
        rcv.setAdapter(adapter);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model obj1=new Model();
        obj1.setItemName("Zinger Burger");
        obj1.setPrice("Price Rs:500");
        obj1.setImg(R.drawable.burger);
        holder.add(obj1);

        Model obj2=new Model();
        obj2.setItemName("Cheese Pizza");
        obj2.setPrice("Price Rs:350");
        obj2.setImg(R.drawable.pizza);
        holder.add(obj2);

        Model obj3=new Model();
        obj3.setItemName("Malai Boti Roll");
        obj3.setPrice("Price Rs:300");
        obj3.setImg(R.drawable.malai);
        holder.add(obj3);

        Model obj4=new Model();
        obj4.setItemName("Pizza Fries");
        obj4.setPrice("Price Rs:1200");
        obj4.setImg(R.drawable.fries);
        holder.add(obj4);

        Model obj5=new Model();
        obj5.setItemName("Chicken Shahi Roll");
        obj5.setPrice("Price Rs:1500");
        obj5.setImg(R.drawable.shahi);
        holder.add(obj5);

        Model obj6=new Model();
        obj6.setItemName("Seekh kebab");
        obj6.setPrice("Price Rs:1700");
        obj6.setImg(R.drawable.seekh);
        holder.add(obj6);

        Model obj7=new Model();
        obj7.setItemName("Mutton Roll");
        obj7.setPrice("Price Rs:1500");
        obj7.setImg(R.drawable.mutton);
        holder.add(obj7);

        Model obj8=new Model();
        obj8.setItemName("Cheese Fries");
        obj8.setPrice("Price Rs:600");
        obj8.setImg(R.drawable.cheesefries);
        holder.add(obj8);
        return holder;

    }
}