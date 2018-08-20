package com.example.adinda.photographyapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tokohtokohphotography extends AppCompatActivity {


    ViewPager viewPager;
    viewpageradapter adapter;


    int [] gambar = {
            R.drawable.tokoh1,
            R.drawable.tokoh2,
            R.drawable.tokoh3,
            R.drawable.tokoh4,
            R.drawable.tokh5,
            R.drawable.tokoh6,
            R.drawable.tokoh7,


    };
    String [] judul = {
            "ALEX MENDUR",
            "DARWIS TRIADI",
            "ANSEL ADAMS",
            "JOSEPH NICEPHORE NIEPCE",
            "LOUIS JACQUES MANDE DAGUERRE",
            "WILLIAM HENDRY FOX TALBOT",
            "GEORGE EASTMAN",

    };
    String [] keterangan = {
      String.valueOf(R.string.tokoh1_alex_mendur),
      String.valueOf(R.string.tokoh2_darwis_triadi),
      String.valueOf(R.string.tokoh3_ansel_adams),
      String.valueOf(R.string.tokoh4_joseph),
      String.valueOf(R.string.tokoh5),
      String.valueOf(R.string.tokoh6),
      String.valueOf(R.string.tokoh7)
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokohtokohphotography);


        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),gambar,judul,keterangan);
        viewPager.setAdapter(adapter);
    }
}
