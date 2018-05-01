package com.example.daniel.todosobreseries;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SeasonActivity extends AppCompatActivity {

    ImageView imagen;
    TextView nombre;
    TextView temporada;
    TextView etiqueta;
    TextView genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
 //       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imagen = (ImageView) findViewById(R.id.image_dos);
        nombre = (TextView) findViewById(R.id.serieTitulo_dos);
        temporada = (TextView) findViewById(R.id.season_dos);
        etiqueta = (TextView) findViewById(R.id.tem2);
        genero = (TextView) findViewById(R.id.gen2);

        imagen.setImageResource(getIntent().getExtras().getInt("curImagen"));
        nombre.setText(getIntent().getExtras().getString("curNombre"));
        temporada.setText(getIntent().getExtras().getString("curTemporada"));
        etiqueta.setText(getIntent().getExtras().getString("curEtiq"));
        genero.setText(getIntent().getExtras().getString("curGen"));



    }

}
