package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variables globales
    EditText valor1, valor2;
    RadioButton Suma,Resta,Mult,Div;
    TextView Resultado;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar variables con elementos de interfaz
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        Suma = findViewById(R.id.Multiplicacion);
        Resta = findViewById(R.id.Division);
        Mult = findViewById(R.id.Suma);
        Div = findViewById(R.id.Resta);
        Resultado = findViewById(R.id.Resultado);
        cl = findViewById(R.id.ConstrainLayout);

    }

    public void Calcular(View view){
        Intent intent = new Intent(view.getContext(),cuatro_1.class);
        Intent intent2 = new Intent(view.getContext(),cuatro_2.class);
        Intent intent3 = new Intent(view.getContext(),cuatro_3.class);
        Intent intent4 = new Intent(view.getContext(),cuatro_4.class);
        //convertimos la cadena proveniente  de la caja de texto
        // en un valor utilizable en nuestras operaciones
        int valor1_int = Integer.parseInt(valor1.getText().toString());
        int valor2_int = Integer.parseInt(valor2.getText().toString());

        if(Suma.isChecked()){

            float multiplicacion = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicacion);
            Resultado.setText(resultado);
            intent.putExtra("Resultado",Resultado.getText().toString());
            startActivity(intent);
        } else if(Resta.isChecked()){
            float multiplicacion = valor1_int / valor2_int;

            String resultado = String.valueOf(multiplicacion);
            Resultado.setText(resultado);
            intent2.putExtra("Resultado",Resultado.getText().toString());
            startActivity(intent2);
        } else if(Mult.isChecked()){
            int multiplicacion = valor1_int + valor2_int;
            String resultado = String.valueOf(multiplicacion);
            Resultado.setText(resultado);
            intent3.putExtra("Resultado",Resultado.getText().toString());
            startActivity(intent3);
        } else if(Div.isChecked()){
            if(valor2_int != 0){
                double division =  Double.valueOf(valor1_int) - Double.valueOf(valor2_int);
                String resultado = String.valueOf(division);
                Resultado.setText(resultado);
                intent4.putExtra("Resultado",Resultado.getText().toString());
                startActivity(intent4);
            } else {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();
            }
        }
    }
}