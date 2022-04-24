package com.fourcade7.java_recyclerview_single_selection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> modelArrayList;
    RecyclerView recyclerView;
    ModelAdapter modelAdapter;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview2);
        imageView=findViewById(R.id.imageview2);

        recyclerView=findViewById(R.id.recyclerview1);
        modelArrayList=new ArrayList<>();
        modelArrayList.add(new Model("https://market.vseokoree.com/images/product/1578510564blissvishnya.png","Anor"));
        modelArrayList.add(new Model("https://gomart.uz/542-large_default/bliss.jpg","Apelsin"));
        modelArrayList.add(new Model("https://gomart.uz/546-large_default/bliss.jpg","Shaftoli"));
        modelArrayList.add(new Model("https://gomart.uz/543-large_default/bliss.jpg","Olma"));
        modelArrayList.add(new Model("https://market.vseokoree.com/images/product/1578510564blissvishnya.png","Anor"));
        modelArrayList.add(new Model("https://gomart.uz/542-large_default/bliss.jpg","Apelsin"));
        modelArrayList.add(new Model("https://gomart.uz/546-large_default/bliss.jpg","Shaftoli"));
        modelArrayList.add(new Model("https://gomart.uz/543-large_default/bliss.jpg","Olma"));
        modelArrayList.add(new Model("https://market.vseokoree.com/images/product/1578510564blissvishnya.png","Anor"));
        modelArrayList.add(new Model("https://gomart.uz/542-large_default/bliss.jpg","Apelsin"));
        modelArrayList.add(new Model("https://gomart.uz/546-large_default/bliss.jpg","Shaftoli"));
        modelArrayList.add(new Model("https://gomart.uz/543-large_default/bliss.jpg","Olma"));
        modelArrayList.add(new Model("https://market.vseokoree.com/images/product/1578510564blissvishnya.png","Anor"));
        modelArrayList.add(new Model("https://gomart.uz/542-large_default/bliss.jpg","Apelsin"));
        modelArrayList.add(new Model("https://gomart.uz/546-large_default/bliss.jpg","Shaftoli"));
        modelArrayList.add(new Model("https://gomart.uz/543-large_default/bliss.jpg","Olma"));
        modelArrayList.add(new Model("https://market.vseokoree.com/images/product/1578510564blissvishnya.png","Anor"));
        modelArrayList.add(new Model("https://gomart.uz/542-large_default/bliss.jpg","Apelsin"));
        modelArrayList.add(new Model("https://gomart.uz/546-large_default/bliss.jpg","Shaftoli"));
        modelArrayList.add(new Model("https://gomart.uz/543-large_default/bliss.jpg","Olma"));
        modelArrayList.add(new Model("https://market.vseokoree.com/images/product/1578510564blissvishnya.png","Anor"));
        modelArrayList.add(new Model("https://gomart.uz/542-large_default/bliss.jpg","Apelsin"));
        modelArrayList.add(new Model("https://gomart.uz/546-large_default/bliss.jpg","Shaftoli"));
        modelArrayList.add(new Model("https://gomart.uz/543-large_default/bliss.jpg","Olma"));


        readall();


    }

    public void readall(){
        modelAdapter=new ModelAdapter(MainActivity.this,modelArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,4));
        recyclerView.setAdapter(modelAdapter);
    }

    @Override
    public void onBackPressed() {
        for (int i = 0; i < modelArrayList.size(); i++) {
            modelArrayList.get(i).setSelected(false);
        }
        modelAdapter.notifyDataSetChanged();
    }
}