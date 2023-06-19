package com.example.vaper_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vaper_store.ui.DataBase.DataBaseCreate;


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
            public void onClick(View view) {

                if(!etNombre.getText().toString().equals("") && !etCorreo.getText().toString().equals("") && !Password.getText().toString().equals("")) {

                    DataBaseCreate dataBaseCreate = new DataBaseCreate(Registro.this);
                    long id = dataBaseCreate.insertarContacto(etNombre.getText().toString(), etCorreo.getText().toString(), Password.getText().toString());

                    if (id > 0) {
                        Toast.makeText(Registro.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                        limpiar();
                    } else {
                        Toast.makeText(Registro.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Registro.this, "DEBE LLENAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }
                Intent intent = new Intent(Registro.this, Login.class);
                startActivity(intent);
            }
            private void limpiar() {
                etNombre.setText("");
                etCorreo.setText("");
                Password.setText("");
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
}
