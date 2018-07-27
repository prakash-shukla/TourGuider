package com.example.android.tourguider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List_of_Hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of__hotel);
        ArrayList<List> list=new ArrayList<>();
        list.add(new List(getString(R.string.h1),getString(R.string.p1),R.drawable.radisson_blu_hotel));
        list.add(new List(getString(R.string.h2),getString(R.string.p2),R.drawable.courtyard_by_marriott));
        list.add(new List(getString(R.string.h3),getString(R.string.p3),R.drawable.ginger));
        list.add(new List(getString(R.string.h4),getString(R.string.p4),R.drawable.images));
        list.add(new List(getString(R.string.h5),getString(R.string.p5),R.drawable.taj));
        list.add(new List(getString(R.string.h6),getString(R.string.p6),R.drawable.radisson));
        list.add(new List(getString(R.string.h7),getString(R.string.p7),R.drawable.marriott));
        ListAdapter adapter=new ListAdapter(this,list);

        ListView list1 = (ListView) findViewById(R.id.hotels);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent move=new Intent(List_of_Hotel.this,online.class);
                startActivity(move);
            }
        });



    }
}
