package com.example.amiritmo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ConfigSound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_sound);

        ImageButton back = (ImageButton) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openConfigAlarm();}
        });
    }

    public void voiceClicked(View view) {
        RadioButton picnic = (RadioButton) findViewById(R.id.radioPicnic);
        RadioButton serenity = (RadioButton) findViewById(R.id.radioSerenity);
        RadioButton sunshine = (RadioButton) findViewById(R.id.radioSunshine);
        RadioButton timeup = (RadioButton) findViewById(R.id.radioTimeup);
        picnic.setVisibility(View.INVISIBLE);
        serenity.setVisibility(View.INVISIBLE);
        sunshine.setVisibility(View.INVISIBLE);
        timeup.setVisibility(View.INVISIBLE);
    }

    public void melodyClicked(View view) {
        RadioButton picnic = (RadioButton) findViewById(R.id.radioPicnic);
        RadioButton serenity = (RadioButton) findViewById(R.id.radioSerenity);
        RadioButton sunshine = (RadioButton) findViewById(R.id.radioSunshine);
        RadioButton timeup = (RadioButton) findViewById(R.id.radioTimeup);
        picnic.setVisibility(View.VISIBLE);
        serenity.setVisibility(View.VISIBLE);
        sunshine.setVisibility(View.VISIBLE);
        timeup.setVisibility(View.VISIBLE);
    }

    public void openConfigAlarm() {
        Intent intent = new Intent(this, ConfigAlarm.class);
        startActivity(intent);
    }
}
