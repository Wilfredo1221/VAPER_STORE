package com.example.vaper_store;

public class Items {
    private int Id;
    private String nombre;
    private String info;
    private String costo;
    private String image;


    public Items(String nombre, String info, String costo, String image) {
        int id=0;
        Id = id;
        this.nombre = nombre;
        this.info = info;
        this.costo = costo;
        this.image = image;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image ) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Items{" +
                "Id=" + Id +
                ", Nombre='" + nombre + '\'' +
                ", info='" + info + '\'' +
                ", costo='" + costo + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
