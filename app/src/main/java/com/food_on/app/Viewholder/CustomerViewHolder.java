package com.food_on.app.Viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.food_on.app.R;

public class CustomerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtproductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;


    public CustomerViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.menu_image);
        txtproductName = (TextView) itemView.findViewById(R.id.dishname);
        txtProductPrice=(TextView) itemView.findViewById(R.id.dishprice);
    }


    @Override
    public void onClick(View view) {

    }
}
