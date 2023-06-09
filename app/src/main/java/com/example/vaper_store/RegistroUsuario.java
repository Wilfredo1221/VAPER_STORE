package com.example.vaper_store;

public class RegistroUsuario {
    private String nombre;
    private String correo;
    private String direccion;

    private RegistroUsuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.direccion = builder.direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public static class UsuarioBuilder {
        private String nombre;
        private String correo;
        private String direccion;

        public UsuarioBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioBuilder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public UsuarioBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public RegistroUsuario build() {
            return new RegistroUsuario(this);
        }
    }}
