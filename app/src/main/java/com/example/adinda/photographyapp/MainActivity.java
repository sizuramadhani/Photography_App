package com.example.adinda.photographyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button macamkamera = (Button) findViewById(R.id.btnmacamkamera);
        macamkamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), macammacamkamera.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        Button tokoh = (Button) findViewById(R.id.btntokohphotograph);
        tokoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), tokohtokohphotography.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        Button sejarah = (Button) findViewById(R.id.btnsejarahkamera);
        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), sejarahphotography.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        Button bpkphotography = (Button) findViewById(R.id.btnbapakphotograph);
        bpkphotography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), bapakphotography.class);
                Toast.makeText(MainActivity.this, "Geser kekanan", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
    }
}
