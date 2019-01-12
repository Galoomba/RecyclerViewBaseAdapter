package com.example.starhood.recyclerviewbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.baseadapter.BaseAdapter;
import com.example.baseadapter.RecyclerViewClickListener;
import com.example.starhood.recyclerviewbaseadapter.POJO.Pets;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Pets> pets=new ArrayList<>();
    private BaseAdapter<Pets> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fill the array with dummy data
        for (int i =0;i<10;i++){
            Pets buffer = new Pets("Dog"+i,"Rokie"+i,null);
            pets.add(buffer);
        }

        //config the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);

        //init the Adapter
        mAdapter = new BaseAdapter<>(pets, new RecyclerViewClickListener<Pets>() {
            @Override
            public void onClick(Pets pos) {
                Toast.makeText(getApplicationContext(),pos.getPetType(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(Pets pos) {
                Toast.makeText(getApplicationContext(),pos.getPetType(),Toast.LENGTH_SHORT).show();

            }
        }, R.layout.list_item);

        // Attach the adapter to the recyclerView
        recyclerView.setAdapter(mAdapter);
    }
}
