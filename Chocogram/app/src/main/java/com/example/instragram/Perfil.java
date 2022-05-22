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
import com.example.instragram.adaptadores.AdapterPub;

import java.util.ArrayList;

public class Perfil extends Fragment {

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
        View view = inflater.inflate(R.layout.fragment_perfil,container,false);

        recyclerView = view.findViewById(R.id.recyclerView2);

        listapub = new ArrayList<>();
        cargarListaa();
        mostarDataa();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        return view;
    }

    public void cargarListaa(){
        listapub.add(new Pub(R.drawable.pp7));
        listapub.add(new Pub(R.drawable.pp2));
        listapub.add(new Pub(R.drawable.pp3));
        listapub.add(new Pub(R.drawable.pp4));
        listapub.add(new Pub(R.drawable.pp5));
        listapub.add(new Pub(R.drawable.pp6));
        listapub.add(new Pub(R.drawable.pp1));
        listapub.add(new Pub(R.drawable.paprika));
        listapub.add(new Pub(R.drawable.p2));
        listapub.add(new Pub(R.drawable.p3));
        listapub.add(new Pub(R.drawable.p4));
        listapub.add(new Pub(R.drawable.p1));
        listapub.add(new Pub(R.drawable.p2));
        listapub.add(new Pub(R.drawable.p3));
        listapub.add(new Pub(R.drawable.p4));
        listapub.add(new Pub(R.drawable.p1));
        listapub.add(new Pub(R.drawable.p2));
        listapub.add(new Pub(R.drawable.p3));
        listapub.add(new Pub(R.drawable.p4));
        listapub.add(new Pub(R.drawable.p1));
        listapub.add(new Pub(R.drawable.p2));
        listapub.add(new Pub(R.drawable.p3));
        listapub.add(new Pub(R.drawable.p4));



    }

    public void mostarDataa(){

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPub = new AdapterPub(getContext(),listapub);
        recyclerView.setAdapter(adapterPub);

    }

}