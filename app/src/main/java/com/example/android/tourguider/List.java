package com.example.android.tourguider;

public class List {
    int img;
    String text,text2;
    public List(String text1,String text3,int id){
        img=id;
        text=text1;
        text2=text3;
    }

    public String getText2() {
        return text2;
    }

    public int getImg() {
        return img;
    }

    public String getText() {
        return text;
    }
}
