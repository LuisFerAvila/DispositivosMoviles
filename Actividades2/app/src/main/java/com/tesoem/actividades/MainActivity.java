package com.tesoem.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente (View view){
        Intent siguiente = new Intent(view.getContext(),MainActivity2.class);
        startActivity(siguiente);
        super.onRestart();

    }


}