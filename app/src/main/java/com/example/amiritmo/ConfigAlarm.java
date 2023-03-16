package com.example.amiritmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class ConfigAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_alarm);

        Switch switch_sound = (Switch) findViewById(R.id.switch_sound);
        switch_sound.bringToFront();

        Button cancel = (Button) findViewById(R.id.cancel_button);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                onBackPressed();

            }
        });

        TextView configSound = (TextView) findViewById(R.id.sonido);
        configSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openConfigSound();}
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

        FragmentContainerView fragmentContainer = (FragmentContainerView) findViewById(R.id.fragment_alarm_name_input);
        Button editName = (Button) findViewById(R.id.button_nombre_alarma);
        editName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentContainer.setVisibility(View.VISIBLE);
            }
        });

        Button monday = (Button) findViewById(R.id.monday);
        monday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button monday_hide = (Button) findViewById(R.id.monday_hide);
                monday_hide.setVisibility(View.VISIBLE);
                monday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button mondayHide = (Button) findViewById(R.id.monday_hide);
        mondayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button mondayShow = (Button) findViewById(R.id.monday);
                mondayShow.setVisibility(View.VISIBLE);
                mondayHide.setVisibility(View.INVISIBLE);
            }
        });

        Button tuesday = (Button) findViewById(R.id.tuesday);
        tuesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button tuesday_hide = (Button) findViewById(R.id.tuesday_hide);
                tuesday_hide.setVisibility(View.VISIBLE);
                tuesday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button tuesdayHide = (Button) findViewById(R.id.tuesday_hide);
        tuesdayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button tuesdayShow = (Button) findViewById(R.id.tuesday);
                tuesdayShow.setVisibility(View.VISIBLE);
                tuesdayHide.setVisibility(View.INVISIBLE);
            }
        });

        Button wednesday = (Button) findViewById(R.id.wednesday);
        wednesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button wednesday_hide = (Button) findViewById(R.id.wednesday_hide);
                wednesday_hide.setVisibility(View.VISIBLE);
                wednesday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button wednesdayHide = (Button) findViewById(R.id.wednesday_hide);
        wednesdayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button wednesdayShow = (Button) findViewById(R.id.wednesday);
                wednesdayShow.setVisibility(View.VISIBLE);
                wednesdayHide.setVisibility(View.INVISIBLE);
            }
        });

        Button thursday = (Button) findViewById(R.id.thursday);
        thursday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button thursday_hide = (Button) findViewById(R.id.thursday_hide);
                thursday_hide.setVisibility(View.VISIBLE);
                thursday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button thursdayHide = (Button) findViewById(R.id.thursday_hide);
        thursdayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button thursdayShow = (Button) findViewById(R.id.thursday);
                thursdayShow.setVisibility(View.VISIBLE);
                thursdayHide.setVisibility(View.INVISIBLE);
            }
        });

        Button friday = (Button) findViewById(R.id.friday);
        friday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button friday_hide = (Button) findViewById(R.id.friday_hide);
                friday_hide.setVisibility(View.VISIBLE);
                friday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button fridayHide = (Button) findViewById(R.id.friday_hide);
        fridayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button fridayShow = (Button) findViewById(R.id.friday);
                fridayShow.setVisibility(View.VISIBLE);
                fridayHide.setVisibility(View.INVISIBLE);
            }
        });

        Button saturday = (Button) findViewById(R.id.saturday);
        saturday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button saturday_hide = (Button) findViewById(R.id.saturday_hide);
                saturday_hide.setVisibility(View.VISIBLE);
                saturday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button saturdayHide = (Button) findViewById(R.id.saturday_hide);
        saturdayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button saturdayShow = (Button) findViewById(R.id.saturday);
                saturdayShow.setVisibility(View.VISIBLE);
                saturdayHide.setVisibility(View.INVISIBLE);
            }
        });

        Button sunday = (Button) findViewById(R.id.sunday);
        sunday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button sunday_hide = (Button) findViewById(R.id.sunday_hide);
                sunday_hide.setVisibility(View.VISIBLE);
                sunday.setVisibility(View.INVISIBLE);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button sundayHide = (Button) findViewById(R.id.sunday_hide);
        sundayHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button sundayShow = (Button) findViewById(R.id.sunday);
                sundayShow.setVisibility(View.VISIBLE);
                sundayHide.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void openConfigSound() {
        Intent intent = new Intent(this, ConfigSound.class);
        startActivity(intent);
    }
}