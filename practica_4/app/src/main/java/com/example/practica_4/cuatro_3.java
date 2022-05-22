package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cuatro_3 extends AppCompatActivity {
    private TextView NO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro3);

        NO =(TextView) findViewById(R.id.NO);
        String Resultado= getIntent().getStringExtra("Resultado");
        NO.setText("El resultado es:" + Resultado);
    }
    public void cambio3(View view){

        Intent intent = new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);

    }

}