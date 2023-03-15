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
    }
}