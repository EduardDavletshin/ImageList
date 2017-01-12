package com.example.eddy.imagelist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
        import butterknife.ButterKnife;

/**
 * Created by eddy on 1/11/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.image_view)
    ImageView imageView;

    public ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
