package com.example.amiritmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AlarmsOfRoutineList extends AppCompatActivity {
    public static final String FOR_ROUTINE = "com.example.amiritmo.FOR_ROUTINE";
    public static final String ROUTINE_CREATED = "com.example.amiritmo.FOR_ROUTINE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarms_of_routine_list);

        Intent intent = getIntent();
        Boolean alarmCreated = intent.getBooleanExtra(ConfigAlarm.ALARM_CREATED, false);

        if (alarmCreated == true){
            Button alarm = (Button) findViewById(R.id.button_nombre_alarm_of_routine);
            alarm.setVisibility(View.VISIBLE);
        }

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.addButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfigAlarm();
            }
        });

        Button cancel = (Button) findViewById(R.id.cancel_button);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMainActivity();
            }
        });

        Button save = (Button) findViewById(R.id.save_button);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                saveRoutine();
            }
        });

        FragmentContainerView fragmentContainer = (FragmentContainerView) findViewById(R.id.fragment_name_input);
        Button editName = (Button) findViewById(R.id.button_nombre_alarma);
        editName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fragmentContainer.setVisibility(View.VISIBLE);
            }
        });

    }

    public void openConfigAlarm() {
        Intent intent = new Intent(this, ConfigAlarm.class);
        intent.putExtra(FOR_ROUTINE, true);
        startActivity(intent);
    }

    public void saveRoutine(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(ROUTINE_CREATED, true);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}