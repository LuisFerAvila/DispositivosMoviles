package com.tesoem.practoca_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //variables globales
    ListView listView;
    String titulos[] = {"Blusa", "Falda", "Vestido", "Vestido Rojo",
            "Vestidos", "Blusa Blanca", "Blusa Girasol", "Falda Negra"};
    String descripciones[] = {"Precio: 100$", "Precio: 150$",
            "Precio: 250$", "Precio: 350$",
            "Precio: Depende", "Precio: 200$",
            "Precio: 170$", "Precio: 230$"};
    int avatar[] = {R.drawable.b3, R.drawable.f2, R.drawable.v, R.drawable.vdos,
            R.drawable.vs, R.drawable.images, R.drawable.b, R.drawable.f};
    int ItemS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instanciar vista
        listView = findViewById(R.id.lista);
        //instanciar elementos que contiene la lista mediante SetAdapter
        listView.setAdapter(new Datos(this, titulos, descripciones, avatar));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(view.getContext(),MainActivity2.class);
                String resultado = String.valueOf(i);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);




            }
        }
        );




    }





}