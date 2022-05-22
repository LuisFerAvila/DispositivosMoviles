package com.tesoem.practoca_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView textView4;
    private TextView textView5;

    String titulos[] = {"Blusa", "Falda", "Vestido", "Vestido Rojo",
            "Vestidos", "Blusa Blanca", "Blusa Girasol", "Falda Negra"};
    String descripciones[] = {"Precio: 100$", "Precio: 150$",
            "Precio: 250$", "Precio: 350$",
            "Precio: Depende", "Precio: 200$",
            "Precio: 170$", "Precio: 230$"};
    int avatar[] = {R.drawable.b3, R.drawable.f2, R.drawable.v, R.drawable.vdos,
            R.drawable.vs, R.drawable.images, R.drawable.b, R.drawable.f};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView4=(TextView) findViewById(R.id.textView4);
        textView5=(TextView) findViewById(R.id.textView5);
        String ResultadoO= getIntent().getStringExtra("Resultado");


        int numEntero = Integer.parseInt(ResultadoO);
      textView4.setText(titulos[numEntero]);
        textView5.setText(descripciones[numEntero]);

    }

    public void cambio2(View view){

        Intent intent = new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);




    }
}