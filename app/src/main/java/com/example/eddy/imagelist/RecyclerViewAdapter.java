package com.example.eddy.imagelist;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

/**
 * Created by eddy on 1/11/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    String[] images;

    public RecyclerViewAdapter(String[] list) {
        images = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.e("position", String.valueOf(position));
        Picasso.with(holder.imageView.getContext()).load(images[position]).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}
