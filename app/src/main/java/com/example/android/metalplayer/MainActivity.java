package com.example.android.metalplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // HEAVY METAK ONCLICKLISTENER
        RelativeLayout heavyRelativeLayout = (RelativeLayout) findViewById(R.id.heavy);
        // Set a click listener on that View
        heavyRelativeLayout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when  clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HeavyMetalActivity.class));
            }
        });

        // METALCORE ONCLICKLISTENER
        RelativeLayout metalcoreRelativeLayout = (RelativeLayout) findViewById(R.id.metalcore);
        // Set a click listener on that View
        metalcoreRelativeLayout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when  clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MetalcoreActivity.class));
            }
        });

        // SWEDISH ONCLICKLISTENER
        RelativeLayout swedishRelativeLayout = (RelativeLayout) findViewById(R.id.swedish);
        // Set a click listener on that View
        swedishRelativeLayout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when  clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SwedishActivity.class));
            }
        });

    }
}
