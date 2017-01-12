package com.example.eddy.imagelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    String[] images = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        images[0] = "http://imgsv.imaging.nikon.com/lineup/lens/zoom/normalzoom/af-s_dx_18-140mmf_35-56g_ed_vr/img/sample/sample1_l.jpg";
        images[1] = "http://nikonrumors.com/wp-content/uploads/2014/03/Nikon-1-V3-sample-photo.jpg";
        images[2] = "http://previews.123rf.com/images/stasvolik/stasvolik0804/stasvolik080400011/2910643-Golden-Gate-Bridge-from-Fort-Point-Vertical-portrait-orientation-Stock-Photo.jpg";
        images[3] = "https://thumbs.dreamstime.com/z/rice-field-terraces-gorgeous-blue-sky-black-hmong-village-area-sapa-vietnam-portrait-orientation-37855783.jpg";
        images[4] = "http://sample.com/images/freeproductsamples.jpg";
        images[5] = "http://wp.wpi.edu/challenge/files/2014/01/sample-return-robot-4-1024x319.jpg";
        images[6] = "http://www.themarkeworld.com/wp-content/uploads/2012/12/Dreamy-end.jpg";
        images[7] = "http://www.mamiyaleaf.com/images/samples/credo_50/CF000387.jpg";
        images[8] = "https://cdn2.tnwcdn.com/wp-content/blogs.dir/1/files/2016/09/iPhone-7-Sample-Photo-4.jpg";
        images[9] = "https://s-media-cache-ak0.pinimg.com/736x/b6/3c/bf/b63cbfb13dede5c15c1ae442a519c617.jpg";
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerViewAdapter(images));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
