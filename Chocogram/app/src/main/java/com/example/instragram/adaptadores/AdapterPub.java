package com.example.instragram.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instragram.Pub.Pub;
import com.example.instragram.Publicaciones.Publicacion;
import com.example.instragram.R;

import java.util.ArrayList;

public class AdapterPub extends RecyclerView.Adapter<AdapterPub.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<Pub> model;

    private View.OnClickListener listener;

    public AdapterPub(Context context, ArrayList<Pub> model){

        this.inflater = LayoutInflater.from(context);
        this.model = model;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_publicacion,parent,false);
        view.setOnClickListener(this);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int imagen = model.get(position).getImagen();
        holder.imagen.setImageResource(imagen);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){

            listener.onClick(view);

        }
    }

    public void setOnClickLister(View.OnClickListener listener){

        this.listener = listener;

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imgpub);
        }
    }
}