package com.example.instragram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instragram.Pub.Pub;
import com.example.instragram.Publicaciones.Publicacion;
import com.example.instragram.adaptadores.AdapterPub;
import com.example.instragram.adaptadores.AdapterPublicaciones;

import java.util.ArrayList;


public class Buscar extends Fragment {

    AdapterPub adapterPub;
    RecyclerView recyclerView;
    ArrayList<Pub> listapub;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buscar,container,false);

        recyclerView = view.findViewById(R.id.RecyclerView);

        listapub = new ArrayList<>();
        cargarLista();
        mostarData();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        return view;
    }

    public void cargarLista(){
        listapub.add(new Pub(R.drawable.p1));
        listapub.add(new Pub(R.drawable.p2));
        listapub.add(new Pub(R.drawable.p3));
        listapub.add(new Pub(R.drawable.p4));
        listapub.add(new Pub(R.drawable.p5));
        listapub.add(new Pub(R.drawable.p6));
        listapub.add(new Pub(R.drawable.p7));
        listapub.add(new Pub(R.drawable.p8));
        listapub.add(new Pub(R.drawable.p9));
        listapub.add(new Pub(R.drawable.p10));
        listapub.add(new Pub(R.drawable.p11));
        listapub.add(new Pub(R.drawable.p12));
        listapub.add(new Pub(R.drawable.p13));
        listapub.add(new Pub(R.drawable.p14));
        listapub.add(new Pub(R.drawable.p15));
        listapub.add(new Pub(R.drawable.p16));
        listapub.add(new Pub(R.drawable.p17));



    }

    public void mostarData(){

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPub = new AdapterPub(getContext(),listapub);
        recyclerView.setAdapter(adapterPub);

    }

}