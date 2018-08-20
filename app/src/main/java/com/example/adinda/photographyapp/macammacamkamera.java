package com.example.adinda.photographyapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class macammacamkamera extends AppCompatActivity {

    ViewPager viewPager;
    viewpageradapter adapter;

    int [] gambar = {
            R.drawable.camera1,
            R.drawable.camera2,
            R.drawable.camera3,
            R.drawable.camera4,
            R.drawable.camera5,
            R.drawable.camera6,
            R.drawable.camera7,
            R.drawable.camera8


    };
    String [] judul = {
            "Compact Digital",
            "Prosumer",
            "Bridge Camera",
            "Consumer",
            "Mirorrless Camera",
            "Semi Pro DSLR",
            "Boutique Camera",
            "Medium Format DSLR"
    };
    String [] keterangan = {
            String.valueOf(R.string.camera1_compact_digital),
            String.valueOf(R.string.camera2_prosumer),
            String.valueOf(R.string.camera3_bridge_camera),
            String.valueOf(R.string.camera4_consumer),
            String.valueOf(R.string.camera5_mirorrless_camera),
            String.valueOf(R.string.camera6_semipro_dslr),
            String.valueOf(R.string.camera7_boutique_camera),
            String.valueOf(R.string.camera8_medium_formatdslr)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macammacamkamera);


        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),gambar,judul,keterangan);
        viewPager.setAdapter(adapter);
    }
}
