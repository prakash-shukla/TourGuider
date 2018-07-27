package com.example.android.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListOfForts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_forts);
        list();
    }
    public void list(){
        ArrayList<List> list=new ArrayList<>();
        list.add(new List(getString(R.string.f1),getString(R.string.fp1),R.drawable.rewa));
        list.add(new List(getString(R.string.f2),getString(R.string.fp2),R.drawable.narsingh));
        list.add(new List(getString(R.string.f3),getString(R.string.fp3),R.drawable.as));
        list.add(new List(getString(R.string.f4),getString(R.string.fp4),R.drawable.ahilya));
        ListView view=(ListView) findViewById(R.id.forts);
        ListAdapter adapter=new ListAdapter(this,list);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListOfForts.this, R.string.ms3,Toast.LENGTH_SHORT).show();
            }
        });

    }
}

