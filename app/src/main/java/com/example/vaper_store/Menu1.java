package com.example.vaper_store;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vaper_store.ui.AdapterDatos;

import java.util.ArrayList;
import java.util.List;

public class Menu1 extends AppCompatActivity {

    RecyclerView recyclerDatos,recyclerDatos2;
    AdapterDatos adapterDatos;
    TextView textView,textView2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        inicializarElementos();
        TextView textView = findViewById(R.id.textView);
        TextView enter = findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción a realizar al hacer clic en el TextView

                // Iniciar la actividad SegundaActividad
                Intent intent = new Intent(Menu1.this, Recargables.class);
                startActivity(intent);
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción a realizar al hacer clic en el TextView

                // Iniciar la actividad SegundaActividad
                Intent intent = new Intent(Menu1.this, Desechables.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isLoggedIn", false);
                editor.apply();

                Intent intent = new Intent(Menu1.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void inicializarElementos(){
    recyclerDatos=findViewById(R.id.recycler);
    recyclerDatos.setLayoutManager(new LinearLayoutManager(this));
    List<Items> itemList=new ArrayList<>();

        itemList.add(new Items( "Producto 1", "Información del Producto 1", "$10.00" ,"https://www.zuloshishas.es/23108-large_default_2x/koko-prime-blue.jpg"));

    adapterDatos=new AdapterDatos(itemList,this);

    recyclerDatos.setAdapter(adapterDatos);

    recyclerDatos2=findViewById(R.id.recycler2);
    recyclerDatos2.setLayoutManager(new LinearLayoutManager(this));
    List<Items> itemsList2=new ArrayList<>();
        itemsList2.add(new Items( "Producto 1", "Información del Producto 1", "$10.00" ,"https://vapori-1e4e2.kxcdn.com/wp-content/uploads/2022/06/elf-bar-vape-desechable-sabor-blueberry-2.jpg"));

    adapterDatos=new AdapterDatos(itemsList2,this);
    recyclerDatos2.setAdapter(adapterDatos);

    }

}