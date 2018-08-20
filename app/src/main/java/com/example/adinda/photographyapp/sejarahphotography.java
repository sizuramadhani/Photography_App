package com.example.adinda.photographyapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sejarahphotography extends AppCompatActivity {

    ViewPager viewPager;
    viewpageradapter adapter;


    int [] gambar = {
            R.drawable.sejarahkamera,
            R.drawable.sejarahkamera2,
            R.drawable.sejarahkamera3,
            R.drawable.sejarahkamera4


    };
    String [] judul = {
            "Sejarah Kamera",
            "Sejarah Kamera",
            "Sejarah Kamera",
            "Sejarah Kamera"

    };
    String [] keterangan = {
            String.valueOf(R.string.sejarah_photograph),
            String.valueOf(R.string.sejarah_photograph1),
            String.valueOf(R.string.sejarah_photograph2),
            String.valueOf(R.string.sejarah_photograph3)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarahphotography);

        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),gambar,judul,keterangan);
        viewPager.setAdapter(adapter);


    }
}
