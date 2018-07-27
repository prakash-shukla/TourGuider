    package com.example.android.tourguider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class Home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
        TextView marquee=(TextView) findViewById(R.id.marquee);
        Intent intent=getIntent();
        String user=intent.getStringExtra(getString(R.string.user));
        String msg=getString(R.string.wel)+user+getString(R.string.to);
        marquee.setText(msg);
        marquee.setSelected(true);
        Button hotel=(Button) findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_page.this,List_of_Hotel.class);
                startActivity(i);

            }
        });
        Button img=(Button) findViewById(R.id.images);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Home_page.this,Combination.class);
                startActivity(i);
            }
        });
        Button fort=(Button) findViewById(R.id.fort);
        fort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_page.this,ListOfForts.class);
                startActivity(i);
            }
        });
        Button temple=(Button) findViewById(R.id.temple);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_page.this,ListOfTemple.class);
                startActivity(i);
            }
        });


    }
}
