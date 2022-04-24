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
        modelArrayList.add(new Model(R.drawable.anor,"Anor"));
        modelArrayList.add(new Model(R.drawable.apelsin,"Apelsin"));
        modelArrayList.add(new Model(R.drawable.limon,"Limon"));
        modelArrayList.add(new Model(R.drawable.malina,"Malina"));
        modelArrayList.add(new Model(R.drawable.olcha,"Olcha"));
        modelArrayList.add(new Model(R.drawable.olma,"Olma"));
        modelArrayList.add(new Model(R.drawable.olmared,"Qizil Olma"));
        modelArrayList.add(new Model(R.drawable.olxori,"Olxori"));
        modelArrayList.add(new Model(R.drawable.orik,"O`rik"));
        modelArrayList.add(new Model(R.drawable.qulupnay,"Qulupnay"));
        modelArrayList.add(new Model(R.drawable.shaftoli,"Shaftoli"));
        modelArrayList.add(new Model(R.drawable.smorodina,"Smorodina"));
        modelArrayList.add(new Model(R.drawable.tomat,"Tomat"));


        readall();


    }

    public void readall(){
        modelAdapter=new ModelAdapter(MainActivity.this,modelArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,4));
        recyclerView.setAdapter(modelAdapter);
    }

    @Override
    public void onBackPressed() {
        readall();
    }
}