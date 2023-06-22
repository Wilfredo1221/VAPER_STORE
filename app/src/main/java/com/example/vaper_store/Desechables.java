package com.example.vaper_store;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vaper_store.ui.AdapterDatos;

import java.util.ArrayList;
import java.util.List;

public class Desechables extends AppCompatActivity {

    RecyclerView recyclerDatos2;
    AdapterDatos adapterDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desechables);
        inicializarElementos();
    }
    private void inicializarElementos(){
        recyclerDatos2=findViewById(R.id.recycler);
        recyclerDatos2.setLayoutManager(new LinearLayoutManager(this));
        List<Items> itemsList2=new ArrayList<>();
        itemsList2.add(new Items( "Producto 1", "Información del Producto 1", "$10.00" ,"https://vapori-1e4e2.kxcdn.com/wp-content/uploads/2022/06/elf-bar-vape-desechable-sabor-blueberry-2.jpg"));

        adapterDatos=new AdapterDatos(itemsList2,this);
        recyclerDatos2.setAdapter(adapterDatos);

    }
}