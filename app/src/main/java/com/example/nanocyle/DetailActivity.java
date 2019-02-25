package com.example.nanocyle;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity {
TextView mTitleTv,mDescrTv,mVenueTv,mDayTv,mTypeTv;
ImageView mImageIv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //actionbar
        ActionBar actionBar=getSupportActionBar();

        mTitleTv=findViewById(R.id.dTitleTv);  //1
        mDescrTv=findViewById(R.id.dDescrTv);  //2
        mImageIv=findViewById(R.id.dImageIv);  //3
        mVenueTv=findViewById(R.id.dVenueTv);  //4
        mDayTv=findViewById(R.id.dDayTv);      //5
        mTypeTv=findViewById(R.id.dTypeTv);    //6

        Intent intent=getIntent();

        int img_res =intent.getIntExtra("iImage",0);
        mImageIv.setImageResource(img_res); //image
        mTitleTv.setText(intent.getStringExtra("iTitle"));
        mDescrTv.setText(intent.getStringExtra("mDescr"));
        mTypeTv.setText(intent.getStringExtra("iType"));
        mVenueTv.setText(intent.getStringExtra("iVenue"));
        mDayTv.setText(intent.getStringExtra("iDay"));
    }

        //mImageIv.setImageResource(mImage);
}
