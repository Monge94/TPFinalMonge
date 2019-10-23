package com.example.tpfinalmonge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Prueba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Prueba = findViewById(R.id.Prueba);
        Prueba.setOnClickListener( this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == Prueba.getId())
        {
            Toast.makeText(getApplicationContext(),"TIRO LIBRE PARA BOCA",Toast.LENGTH_LONG).show();
        }

    }
}
