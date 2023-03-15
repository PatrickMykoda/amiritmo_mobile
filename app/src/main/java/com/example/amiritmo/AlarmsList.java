package com.example.amiritmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AlarmsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarms_list);

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.addButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfigAlarm();
            }
        });

        ImageButton routines = (ImageButton) findViewById(R.id.buttonRutinas);
        routines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openRoutineList();}
        });
    }

    public void openConfigAlarm() {
        Intent intent = new Intent(this, ConfigAlarm.class);
        startActivity(intent);
    }

    public void openRoutineList() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}