package com.fourcade7.java_recyclerview_single_selection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ModelViewHolder> {

    Context context;
    ArrayList<Model> modelArrayList;
    ArrayList<Model> clearmodelArrayList=new ArrayList<>();
    ArrayList<Model> singlemodelArrayList=new ArrayList<>();
    MainActivity mainActivity;



    public ModelAdapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
        mainActivity= (MainActivity) context;
    }

    @NonNull
    @Override
    public ModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);
        return new ModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelViewHolder holder, int position) {

        if (modelArrayList.get(position).isSelected()){
            holder.linearLayout.setBackgroundResource(R.drawable.layout_background);

        }else {
            holder.linearLayout.setBackgroundResource(R.drawable.layout_background_white);

        }


        holder.textView.setText(modelArrayList.get(position).getName());
        Glide.with(context).load(modelArrayList.get(position).getImage()).into(holder.imageView);
        //Picasso.get().load(modelArrayList.get(position).getImage()).into(holder.imageView);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < modelArrayList.size(); i++) {
                    modelArrayList.get(i).setSelected(false);
                }
               mainActivity.modelAdapter.notifyDataSetChanged();
               // mainActivity.readall();
                modelArrayList.get(position).setSelected(!modelArrayList.get(position).isSelected());
                if (modelArrayList.get(position).isSelected()){
                    holder.linearLayout.setBackgroundResource(R.drawable.layout_background);
                }else {
                    holder.linearLayout.setBackgroundResource(R.drawable.layout_background_white);

                }
            }
        });




/*  Multi selection
            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a>0){

                    modelArrayList.get(position).setSelected(!modelArrayList.get(position).isSelected());
                    if (modelArrayList.get(position).isSelected()){
                        a++;
                        mainActivity.textView.setText(a+" item selected");
                        holder.linearLayout.setBackgroundResource(R.drawable.layout_background);
                        clearmodelArrayList.add(modelArrayList.get(position));
                    }else {
                        a--;
                        mainActivity.textView.setText(a+" item selected");
                        holder.linearLayout.setBackgroundResource(R.drawable.layout_background_white);
                        clearmodelArrayList.remove(modelArrayList.get(position));
                        if (a==0){
                            mainActivity.textView.setText("Selection");
                            mainActivity.imageView.setVisibility(View.INVISIBLE);

                        }
                    }
                }

            }
        });

        mainActivity.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelArrayList.removeAll(clearmodelArrayList);
                clearmodelArrayList.clear();
                mainActivity.textView.setText("Selection");
                mainActivity.imageView.setVisibility(View.INVISIBLE);
                a=0;
                mainActivity.readall();
            }
        });


        holder.linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mainActivity.imageView.setVisibility(View.VISIBLE);
                modelArrayList.get(position).setSelected(!modelArrayList.get(position).isSelected());
                if (modelArrayList.get(position).isSelected()){
                    a++;
                    mainActivity.textView.setText(a+" item selected");
                    clearmodelArrayList.add(modelArrayList.get(position));
                    holder.linearLayout.setBackgroundResource(R.drawable.layout_background);
                }else {
                    a--;
                    mainActivity.textView.setText(a+" item selected");
                    clearmodelArrayList.remove(modelArrayList.get(position));
                    holder.linearLayout.setBackgroundResource(R.drawable.layout_background_white);
                }


                return true;
            }
        });
*/

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    class ModelViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        LinearLayout linearLayout;

        public ModelViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textview1);
            imageView=itemView.findViewById(R.id.imageview1);
            linearLayout=itemView.findViewById(R.id.linearlayout1);
        }
    }


}
