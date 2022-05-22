package com.tesoem.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void anterior (View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
        super.onRestart();

    }
}