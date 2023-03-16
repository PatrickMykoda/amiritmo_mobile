package com.example.amiritmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Boolean routineCreated = intent.getBooleanExtra(AlarmsOfRoutineList.ROUTINE_CREATED, false);

        if (routineCreated == true){
            Button alarm = (Button) findViewById(R.id.button_new_routine);
            alarm.setVisibility(View.VISIBLE);
        }

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.addButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlarmasRutina();
            }
        });

        ImageButton alarmas = (ImageButton) findViewById(R.id.buttonAlarmas);
        alarmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openListaAlarmas();}
        });
    }

    public void openAlarmasRutina() {
        Intent intent = new Intent(this, AlarmsOfRoutineList.class);
            startActivity(intent);
    }

    public void openListaAlarmas() {
        Intent intent = new Intent(this, AlarmsList.class);
        startActivity(intent);
    }
}