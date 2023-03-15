package com.example.amiritmo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_alarm);

        Button cancel = (Button) findViewById(R.id.cancel_button);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                onBackPressed();

            }
        });

        Button am = (Button) findViewById(R.id.am);
        am.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button am_hide = (Button) findViewById(R.id.am_hide);
                am_hide.setVisibility(View.VISIBLE);
                Button pm_hide = (Button) findViewById(R.id.pm_hide);
                pm_hide.setVisibility(View.VISIBLE);
            }
        });

        Button pm = (Button) findViewById(R.id.pm);
        pm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button am_hide = (Button) findViewById(R.id.am_hide);
                am_hide.setVisibility(View.VISIBLE);
                Button pm_hide = (Button) findViewById(R.id.pm_hide);
                pm_hide.setVisibility(View.VISIBLE);
            }
        });

        Button pmHide = (Button) findViewById(R.id.pm_hide);
        pmHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button am_hide = (Button) findViewById(R.id.am_hide);
                am_hide.setVisibility(View.INVISIBLE);
                Button pm_hide = (Button) findViewById(R.id.pm_hide);
                pm_hide.setVisibility(View.INVISIBLE);
            }
        });

        Button amHide = (Button) findViewById(R.id.am_hide);
        amHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button am_hide = (Button) findViewById(R.id.am_hide);
                am_hide.setVisibility(View.INVISIBLE);
                Button pm_hide = (Button) findViewById(R.id.pm_hide);
                pm_hide.setVisibility(View.INVISIBLE);
            }
        });
    }
}