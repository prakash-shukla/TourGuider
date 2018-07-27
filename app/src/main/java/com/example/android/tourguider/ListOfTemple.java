package com.example.android.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListOfTemple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_temple);
        ArrayList<List> temple=new ArrayList<>();
        temple.add(new List(getString(R.string.t1),getString(R.string.tp1),R.drawable.mahakaleshwar));
        temple.add(new List(getString(R.string.t2),getString(R.string.tp2),R.drawable.babaganesh4));
        temple.add(new List(getString(R.string.t3),getString(R.string.tp3),R.drawable.bharav));
        temple.add(new List(getString(R.string.t4),getString(R.string.tp4),R.drawable.mahakaleshwar));
        temple.add(new List(getString(R.string.t5),getString(R.string.tp5),R.drawable.babaganesh4));
        temple.add(new List(getString(R.string.t6),getString(R.string.tp6),R.drawable.kandira));
        temple.add(new List(getString(R.string.t7),getString(R.string.tp7),R.drawable.chaturbhuj));
        temple.add(new List(getString(R.string.t8),getString(R.string.tp8),R.drawable.bharatmilap));
        ListAdapter list=new ListAdapter(this,temple);
        ListView view=(ListView) findViewById(R.id.temples);
        view.setAdapter(list);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListOfTemple.this, R.string.msg4,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
