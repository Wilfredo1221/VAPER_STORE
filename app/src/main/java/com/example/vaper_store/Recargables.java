package com.example.vaper_store;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vaper_store.ui.AdapterDatos;

import java.util.ArrayList;
import java.util.List;

public class Recargables extends AppCompatActivity {

    RecyclerView recyclerDatos;
    AdapterDatos adapterDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recargables);
        inicializarElementos();
    }
    private void inicializarElementos(){
        recyclerDatos=findViewById(R.id.recycler);
        recyclerDatos.setLayoutManager(new LinearLayoutManager(this));
        List<Items> itemList=new ArrayList<>();

        itemList.add(new Items( "Producto 1", "Información del Producto 1", "$10.00" ,"https://www.zuloshishas.es/23108-large_default_2x/koko-prime-blue.jpg"));

        adapterDatos=new AdapterDatos(itemList,this);

        recyclerDatos.setAdapter(adapterDatos);


    }
}