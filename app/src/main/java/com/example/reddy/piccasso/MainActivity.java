package com.example.reddy.piccasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity  {
    ImageView imageView;
    Picasso picasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        String url="http://i.imgur.com/rFLNqWI.jpg";
       // picasso.get().load("http://i.imgur.com/rFLNqWI.jpg").into(imageView);//This is for loading for loading the image from the internet
       // picasso.get().load(R.drawable.img).into(imageView); //This is for loading the image in the static way
        picasso.get().load(url).placeholder(R.drawable.img).error(R.drawable.apple_web).into(imageView);
    }
}


