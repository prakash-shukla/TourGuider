package com.example.android.tourguider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<List> {

    public ListAdapter(@NonNull Context context, ArrayList<List> list) {
        super(context, 0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.listview,parent,false);

        }
        List currentPosition=getItem(position);
        TextView name=(TextView) convertView.findViewById(R.id.hotel_name);
        name.setText(currentPosition.getText());
        TextView place=(TextView) convertView.findViewById(R.id.place);
        place.setText(currentPosition.getText2());
        ImageView img=(ImageView) convertView.findViewById(R.id.img);
        img.setImageResource(currentPosition.getImg());
        return convertView;
    }
}
