package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Model> mainList;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        // Use LinearLayoutManager for vertical scrolling
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Add your data to mainList
        mainList.add(new Model(R.drawable.virat, "Virat Kohli", "vk@gmail.com", "9090909090"));
        mainList.add(new Model(R.drawable.dhoni, "MS Dhoni", "ms@gmail.com", "8080808080"));
        mainList.add(new Model(R.drawable.rahul, "KL Rahul", "kl@gmail.com", "7070707070"));
        mainList.add(new Model(R.drawable.siraj, "Mohammed Siraj", "sm@gmail.com", "6060606060"));
        mainList.add(new Model(R.drawable.shreyas, "Shreyas Iyer", "si@gmail.com", "5050505050"));
        mainList.add(new Model(R.drawable.rohit, "Rohit Sharma", "rs@gmail.com", "4040404040"));
        mainList.add(new Model(R.drawable.kishan, "Ishan Kishan", "ik@gmail.com", "3030303030"));
        mainList.add(new Model(R.drawable.hardik, "Hardik Pandya", "hp@gmail.com", "2020202020"));
        mainList.add(new Model(R.drawable.chahal, "Yuzvendra Chahal", "yc@gmail.com", "1010101010"));
        mainList.add(new Model(R.drawable.gill, "Shubman Gill", "sg@gmail.com", "1919191919"));
        // Set up the adapter
        adapter = new CustomAdapter(mainList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }



//     layoutManager.setOrientation(recyclerView.HORIZONTAL);
}