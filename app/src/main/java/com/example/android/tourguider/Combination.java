package com.example.android.tourguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Combination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination);
        ArrayList<grid> grids =new ArrayList<>();
        grids.add(new grid(R.drawable.church,R.drawable.chaturbhuj));
        grids.add(new grid(R.drawable.pond,R.drawable.ganga));
        grids.add(new grid(R.drawable.gohad,R.drawable.kanhakisli));
        grids.add(new grid(R.drawable.pond,R.drawable.canal));
        grids.add(new grid(R.drawable.pond,R.drawable.rewa));
        GridView grid=(GridView) findViewById(R.id.grid);
        GridAdapter adapter=new GridAdapter(this,grids);
        grid.setAdapter(adapter);
    }
}
