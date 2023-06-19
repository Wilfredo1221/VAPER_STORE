package com.example.vaper_store.ui.DataBase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
public class DataBaseCreate extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NOMBRE = "Vapers.db";
    public static final String TABLE_CLIENTE = "Cliente";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NOMBRE = "nombre";
    private static final String COLUMN_CORREO = "correo_electronico";
    private static final String COLUMN_PASSWORD = "password";



    public DataBaseCreate(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_CLIENTE + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL," +
                "correo_electronico TEXT NOT NULL," +
                "password VARCHARD NOT NULL)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_CLIENTE);

        onCreate(sqLiteDatabase);
    }


    public boolean verifyLogin(String correo_electronico, String password) {
        correo_electronico = "'" + correo_electronico+"'";
        password = "'" + password+"'";
        SQLiteDatabase db = getReadableDatabase();
        String selection = COLUMN_CORREO + " = ? AND " + COLUMN_PASSWORD + " = ?"; // Agrega el operador lógico "AND"
        String[] selectionArgs = {correo_electronico, password};
        Cursor cursor = db.query(TABLE_CLIENTE, null, selection, selectionArgs, null, null, null);
        boolean loginSuccessful = (cursor.getCount() >= 0);
        cursor.close();
        return loginSuccessful;
    }


    Context context;

    public long insertarContacto(String nombre, String correo_electronico, String password) {
        long id = 0;

        try {
            SQLiteDatabase db = getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(COLUMN_NOMBRE, nombre);
            values.put(COLUMN_CORREO, correo_electronico);
            values.put(COLUMN_PASSWORD, password);

            id = db.insert(TABLE_CLIENTE, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return id;
    }
}

