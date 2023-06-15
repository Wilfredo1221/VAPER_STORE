package com.example.vaper_store.ui.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DBClientes extends DataBaseCreate {

    Context context;

    public DBClientes(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarContacto(String nombre, String correo_electronico, String password) {

        long id = 0;

        try {
            DataBaseCreate dataBaseCreate = new DBClientes(context);
            SQLiteDatabase db = dataBaseCreate.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("Nombre", nombre);
            values.put("correo_electronico", correo_electronico);
            values.put("password", password);

            id = db.insert(TABLE_CLIENTE, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return id;
    }
}
