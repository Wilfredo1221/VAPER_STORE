package com.example.vaper_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Registro extends AppCompatActivity {
    private EditText etNombre, etCorreo, Password;
    private Button btnRegistrar, btnIngresar;

    private static final String TAG = "RegistroActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etNombre = findViewById(R.id.Nombre);
        etCorreo = findViewById(R.id.Correo);
        Password = findViewById(R.id.Password);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String correo = etCorreo.getText().toString();
                String direccion = Password.getText().toString();

                // Aquí puedes realizar las operaciones de registro
                registrarUsuario(nombre, correo, direccion);
            }
        });
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registro.this, Login.class);
                startActivity(intent);
            }
        });
    }

    private void registrarUsuario(String nombre, String correo, String direccion) {
        // Aquí puedes implementar la lógica de registro de usuario
        Log.d(TAG, "Registrando usuario: Nombre = " + nombre + ", Correo = " + correo + ", Dirección = " + direccion);
        // Por ejemplo, puedes enviar los datos a un servidor
    }
}
