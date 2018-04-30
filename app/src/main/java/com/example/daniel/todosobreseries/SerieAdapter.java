package com.example.daniel.todosobreseries;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SerieAdapter extends RecyclerView.Adapter<SerieAdapter.SerieViewHolder>{

    private List<SerieModelo> items;

    public class SerieViewHolder extends RecyclerView.ViewHolder{
        public CardView serieCardview;
        public ImageView imagen;
        public TextView nombre;
        public TextView temporada;
        public TextView etiqueta;
        public TextView genero;

        public SerieViewHolder(View v) {
            super(v);
            serieCardview=(CardView)v.findViewById(R.id.serie_card);
            imagen=(ImageView)v.findViewById(R.id.image_uno);
            nombre=(TextView)v.findViewById(R.id.serieTitulo_uno);
            temporada=(TextView)v.findViewById(R.id.season_uno);
            etiqueta=(TextView)v.findViewById(R.id.gen1);
            genero=(TextView)v.findViewById(R.id.tem1);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public SerieAdapter(List<SerieModelo>items){
        this.items=items;
    }

    public List<SerieModelo> getItems(){
        return this.items;
    }

    @NonNull
    @Override
    public SerieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.serie_card, viewGroup, false);

        return new SerieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SerieViewHolder holder, final int i) {
        holder.imagen.setImageResource(items.get(i).getFotoSerie());
        holder.nombre.setText(items.get(i).getTitulo());
        holder.temporada.setText(items.get(i).getTemporadas());
        holder.etiqueta.setText(items.get(i).getEtiquetas());
        holder.genero.setText(items.get(i).getGeneros());

        holder.serieCardview.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("curImagen",items.get(i).getFotoSerie());
                bundle.putString("curNombre",items.get(i).getTitulo());
                bundle.putString("curTemporada",items.get(i).getTemporadas());
                bundle.putString("curEtiq",items.get(i).getEtiquetas());
                bundle.putString("curGen",items.get(i).getGeneros());
                Intent iconIntent = new Intent(v.getContext(), SeasonActivity.class);
                iconIntent.putExtras(bundle);
                v.getContext().startActivity(iconIntent);
            }
        });
    }

}
