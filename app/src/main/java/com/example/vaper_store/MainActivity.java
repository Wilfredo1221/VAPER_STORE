package com.example.vaper_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.vaper_store.ui.DataBase.DataBaseCreate;

public class MainActivity extends AppCompatActivity {
    ImageView vapers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vapers = findViewById(R.id.imageView);
        SharedPreferences sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DataBaseCreate dataBaseCreate = new DataBaseCreate(MainActivity.this);
                SQLiteDatabase db = dataBaseCreate.getWritableDatabase();
                if(db != null){
                    Toast.makeText(MainActivity.this, "base de datos creada", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "error al crear la base de datos", Toast.LENGTH_SHORT).show();
                }

                if (isLoggedIn) {
                    // Usuario ya ha iniciado sesión, redirigir a la actividad del menú
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                    finish(); // Opcional: Finalizar actividad principal para no volver atrás
                } else {
                    // Usuario no ha iniciado sesión, mostrar actividad de inicio de sesión
                    Intent intent = new Intent(MainActivity.this, Login.class);
                    startActivity(intent);
                    finish(); // Opcional: Finalizar actividad principal para no volver atrás
                }
            }

        }, 1000); // 1000 milisegundos = 1 segundos

    }
}