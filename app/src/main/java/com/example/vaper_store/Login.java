package com.example.vaper_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText etCorreoLogin, etContraseñaLogin;
    private Button btnIngresarLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etCorreoLogin = findViewById(R.id.etCorreoLogin);
        etContraseñaLogin = findViewById(R.id.etContraseñaLogin);
        btnIngresarLogin = findViewById(R.id.btnIngresarLogin);
        btnIngresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en el botón Ingresar
                //String correo = etCorreoLogin.getText().toString();
                //String contraseña = etContraseñaLogin.getText().toString();

                // Verificar si el correo y la contraseña son correctos (comparar con la base de datos)

                //boolean correoValido = false;
                //boolean contraseñaValida = false;
                //if (correoValido && contraseñaValida) {
                    // Redirigir a la pantalla del catálogo de productos (CatalogoActivity)
                Intent intent = new Intent(Login.this, Menu.class);
                startActivity(intent);
                }// else {
                    // Mostrar un mensaje de error de inicio de sesión o cualquier otra acción necesaria
               // }
            //}
        });
    }
}