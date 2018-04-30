package com.example.daniel.todosobreseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<SerieModelo> lista =new ArrayList<>();
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FillSeries();
        recycler=(RecyclerView)findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);
        lManager=new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
        adapter=new SerieAdapter(lista);
        recycler.setAdapter(adapter);

    }
    private void FillSeries(){
        lista.add(new SerieModelo(getString(R.string.Academia),getString(R.string.cuantity_seasons_3),getString(R.string.gender),getString(R.string.gender_academia),R.drawable.boku1));
        lista.add(new SerieModelo(getString(R.string.codeg),getString(R.string.cuantity_seasons_2),getString(R.string.gender),getString(R.string.gender_code),R.drawable.codegeass));
        lista.add(new SerieModelo(getString(R.string.darling),getString(R.string.cuantity_seasons_1),getString(R.string.gender),getString(R.string.gender_darling),R.drawable.darling));
        lista.add(new SerieModelo(getString(R.string.erased),getString(R.string.cuantity_seasons_1),getString(R.string.gender),getString(R.string.gender_erased),R.drawable.erased));
        lista.add(new SerieModelo(getString(R.string.full_metal),getString(R.string.cuantity_seasons_4),getString(R.string.gender),getString(R.string.gender_fullmetal),R.drawable.full_metalpanic1));
        lista.add(new SerieModelo(getString(R.string.konosuba),getString(R.string.cuantity_seasons_2),getString(R.string.gender),getString(R.string.gender_konosuba),R.drawable.konosuba));
        lista.add(new SerieModelo(getString(R.string.saint),getString(R.string.cuantity_seasons_3),getString(R.string.gender),getString(R.string.gender_saint),R.drawable.saint));
        lista.add(new SerieModelo(getString(R.string.shoku),getString(R.string.cuantity_seasons_4),getString(R.string.gender),getString(R.string.gender_shoku),R.drawable.shoku1));

    }
}
