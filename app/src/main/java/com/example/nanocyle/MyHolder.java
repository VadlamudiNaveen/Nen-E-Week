package com.example.nanocyle;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    //views of the model created in the ui components...

    ImageView mImageIv;
    TextView mTitleTv,mDescrTv,mDayTv,mVenueTv,mTypeTv;
ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        mImageIv=itemView.findViewById(R.id.modelImageIv);
        mTitleTv=itemView.findViewById(R.id.modelTitleTv);
        mDescrTv=itemView.findViewById(R.id.modelDescrTv);
        mDayTv=itemView.findViewById(R.id.modelDayTv);
        mVenueTv=itemView.findViewById(R.id.modelVenueTv);
        mTypeTv=itemView.findViewById(R.id.modelTypeTv);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener=ic;
    }
}
