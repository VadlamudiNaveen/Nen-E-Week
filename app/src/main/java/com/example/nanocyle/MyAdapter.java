package com.example.nanocyle;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> implements Filterable {

    Context c;
    ArrayList<Model> models,filterList;
    CustomFilter filter;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
        this.filterList=models;
    }
    //now evert thing is created for the next step...

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //covert the xml to view obj
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {
//binding the data to the views which have created
myHolder.mTitleTv.setText(models.get(i).getTitle());        //title
myHolder.mDescrTv.setText(models.get(i).getDescription());  //description
myHolder.mImageIv.setImageResource(models.get(i).getImg()); //image
myHolder.mDayTv.setText(models.get(i).getDay());            //day of event
myHolder.mTypeTv.setText(models.get(i).getType());          //type of event
myHolder.mTypeTv.setText(models.get(i).getVenue());         //venue of the event

//animation
        Animation animation= AnimationUtils.loadAnimation(c,android.R.anim.slide_in_left);
        myHolder.itemView.startAnimation(animation);

        //to put the data into same activity

            myHolder.setItemClickListener(new ItemClickListener() {

        @Override
        public void onItemClick(View v, int pos) {
            //Animation animation= AnimationUtils.loadAnimation(c,android.R.anim.fade_in);
            //myHolder.itemView.startAnimation(animation);
            int temp_img = models.get(i).getImg();

            Intent intent= new Intent(c,DetailActivity.class);
            intent.putExtra("iTitle",models.get(pos).getTitle());
            intent.putExtra("iDescr",models.get(pos).getDescription());
            intent.putExtra("iDay",models.get(pos).getDay());
            intent.putExtra("iType",models.get(pos).getType());
            intent.putExtra("iVenue",models.get(pos).getVenue());
            intent.putExtra ("iImage",temp_img);
             c.startActivity(intent);
        }
    });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public Filter getFilter() {
        if(filter==null) {
            filter = new CustomFilter(filterList, this);
        }
        return filter;
    }

}
