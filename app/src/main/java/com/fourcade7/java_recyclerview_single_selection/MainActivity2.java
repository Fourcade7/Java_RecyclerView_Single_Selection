package com.fourcade7.java_recyclerview_single_selection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textview3);
        imageView=findViewById(R.id.imageview3);
        Intent intent=getIntent();
        String image=intent.getStringExtra("image");
        String text=intent.getStringExtra("name");
        textView.setText(text);
        Glide.with(MainActivity2.this).load(image).into(imageView);
    }
}