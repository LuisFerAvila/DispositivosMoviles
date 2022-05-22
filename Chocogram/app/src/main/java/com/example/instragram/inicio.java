package com.example.instragram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instragram.Publicaciones.Publicacion;
import com.example.instragram.adaptadores.AdapterPublicaciones;

import java.util.ArrayList;

public class inicio extends Fragment {

    AdapterPublicaciones adapterPublicaciones;
    RecyclerView recyclerView;
    ArrayList<Publicacion> listaPublicacion;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inicio,container,false);
        recyclerView = view.findViewById(R.id.RecyclerView);
        listaPublicacion = new ArrayList<>();
        cargarLista();
        mostarData();

        return view;
    }

    public void cargarLista(){
        listaPublicacion.add(new Publicacion("Luis Avila","Feliz día de la madre ❤️\uD83D\uDC69\u200D\uD83D\uDC67",R.drawable.paprika,R.drawable.p1));
        listaPublicacion.add(new Publicacion("Milenio","¡Orgullo mexicano! Estudiante de Puebla es seleccionada para participar en programa de la NASA La joven Ana ganó la oportunidad gracias a su proyecto de paneles solares",R.drawable.milenio,R.drawable.p2));
        listaPublicacion.add(new Publicacion("Milenio","Mujeres marchan en CdMx contra la violencia de género",R.drawable.milenio,R.drawable.p3));
        listaPublicacion.add(new Publicacion("Milenio","\"Nuevo León está de luto\" Samuel García da mensaje tras confirmación de cuerpo de Yolanda Martínez",R.drawable.milenio,R.drawable.p18));

    }

    public void mostarData(){

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPublicaciones = new AdapterPublicaciones(getContext(),listaPublicacion);
        recyclerView.setAdapter(adapterPublicaciones);

    }
}