package com.example.android.metalplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // HEAVY METAK ONCLICKLISTENER
        RelativeLayout heavyRelativeLayout = (RelativeLayout) findViewById(R.id.heavy);
        heavyRelativeLayout.setOnClickListener(this);

        // METALCORE ONCLICKLISTENER
        RelativeLayout metalcoreRelativeLayout = (RelativeLayout) findViewById(R.id.metalcore);
        metalcoreRelativeLayout.setOnClickListener(this);

        // SWEDISH ONCLICKLISTENER
        RelativeLayout swedishRelativeLayout = (RelativeLayout) findViewById(R.id.swedish);
        swedishRelativeLayout.setOnClickListener(this);
    }

        public void onClick(View view){
        switch(view.getId()) {
            case R.id.heavy:
                startActivity(new Intent(MainActivity.this, HeavyMetalActivity.class));
                break;
            case R.id.metalcore:
                startActivity(new Intent(MainActivity.this, MetalcoreActivity.class));
                break;
            case R.id.swedish:
                startActivity(new Intent(MainActivity.this, SwedishActivity.class));
                break;
        }
    }

}

