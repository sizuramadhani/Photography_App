package com.example.adinda.photographyapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class bapakphotography extends AppCompatActivity {

    ViewPager viewPager;
    viewpageradapter adapter;


    int [] gambar = {
           R.drawable.bapakphotographyindo,
           R.drawable.bapakphotographydunia


    };
    String [] judul = {
            "Bapak Photography Indonesia",
            "Bapak Photography Dunia"
    };
    String [] keterangan = {
            String.valueOf(R.string.bapak_photography_indonesia),
            String.valueOf(R.string.bapak_photography_dunia)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bapakphotography);

        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),gambar,judul,keterangan);
        viewPager.setAdapter(adapter);
    }
}
