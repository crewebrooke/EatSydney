package com.example.android.eatsydney;



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Create ItemAdapter
public class ItemAdapter extends ArrayAdapter<Item> {

    //Create a ViewHolder class to improve scrolling performance
    static class ViewHolder {
        TextView title;
        TextView location;
        ImageView image;
        TextView review;
    }

    //ItemAdapter constructor
    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    //Override getView method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Get the current view
        View listItemView = convertView;

        //If listItemView is null, inflate it from list_item
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the current item by position index
        Item currentItem = getItem(position);

        //Create a view holder
        ViewHolder holder = new ViewHolder();

        //Get the title TextView and set its title value
        holder.title = listItemView.findViewById(R.id.title);
        holder.title.setText(currentItem.getTitle());

        //Get the location TextView and set its location value
        holder.location = listItemView.findViewById(R.id.address);
        holder.location.setText(currentItem.getLocation());

        //Get the image ImageView and set its image resource ID
        holder.image = listItemView.findViewById(R.id.image);
        holder.image.setImageResource(currentItem.getImageResourceId());

        //Get the review TextView and set its review value
        holder.review = listItemView.findViewById(R.id.rating);
        holder.review.setText(currentItem.getReview());


        //Return the view
        return listItemView;
    }
}