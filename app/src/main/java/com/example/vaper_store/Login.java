package com.example.vaper_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vaper_store.databinding.*;
import com.example.vaper_store.ui.DataBase.DataBaseCreate;

public class Login extends AppCompatActivity {
    private EditText etCorreoLogin;
    private EditText etContraseñaLogin;
    private Button btnIngresarLogin, btnregistrarase;
    private DataBaseCreate databaseHelper;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        etCorreoLogin = binding.etCorreoLogin;
        etContraseñaLogin = binding.Password;
        btnIngresarLogin = binding.btnIngresarLogin;
        btnregistrarase = binding.btnregistrarase;

        databaseHelper = new DataBaseCreate(this);

        btnIngresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etCorreoLogin.getText().toString();
                String password = etContraseñaLogin.getText().toString();

                if (email.equals("") || password.equals("")) {
                    Toast.makeText(Login.this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
                } else {
                    if (databaseHelper.verifyLogin(email, password)) {
                        // Acceso exitoso
                        Toast.makeText(Login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                        SharedPreferences sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("isLoggedIn", true);
                        editor.apply();

                        Intent intent = new Intent(Login.this, Menu.class);
                        startActivity(intent);
                    } else {
                        // Credenciales inválidas
                        Toast.makeText(Login.this, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnregistrarase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registro.class);
                startActivity(intent);
            }
        });
    }
}
