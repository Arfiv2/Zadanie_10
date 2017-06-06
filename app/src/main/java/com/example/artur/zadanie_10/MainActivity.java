package com.example.artur.zadanie_10;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    Context context;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sensors(View view)
    {
        context = getApplicationContext();
        intent = new Intent(context,SensorsActivity.class);
        startActivity(intent);
    }

    public void kompas(View view)
    {
        context = getApplicationContext();
        intent = new Intent(context,CompasActivity.class);
        startActivity(intent);
    }
}
