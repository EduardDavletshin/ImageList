package com.example.eddy.imagelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    String[] images = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        images[0] = "http://imgsv.imaging.nikon.com/lineup/lens/zoom/normalzoom/af-s_dx_18-140mmf_35-56g_ed_vr/img/sample/sample1_l.jpg";
        images[1] = "http://nikonrumors.com/wp-content/uploads/2014/03/Nikon-1-V3-sample-photo.jpg";
        images[2] = "http://previews.123rf.com/images/stasvolik/stasvolik0804/stasvolik080400011/2910643-Golden-Gate-Bridge-from-Fort-Point-Vertical-portrait-orientation-Stock-Photo.jpg";
        Log.e("array", images[1]);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerViewAdapter(images));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
