package com.qbaris.projectstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

public class FoodAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] foods;
    private final int[] imageResIds;

    public FoodAdapter(@NonNull Context context, String[] foods, int[] imageResIds) {
        super(context, R.layout.list_item_food, foods);
        this.context = context;
        this.foods = foods;
        this.imageResIds = imageResIds;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_food, parent, false);
        }

        TextView foodItemTextView = convertView.findViewById(R.id.foodItemTextView);
        ImageView foodItemImageView = convertView.findViewById(R.id.foodItemImageView);

        String foodName = foods[position];
        foodItemTextView.setText(foodName);

        int imageResId = imageResIds[position];
        Glide.with(context).load(imageResId).into(foodItemImageView);

        return convertView;
    }
}