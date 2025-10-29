package com.academia.coders.domain;

public class Coder {

    private Long id;
    private String nombre;
    private Integer edad;
    private String email;
    private String clan;

    public Coder() {
    }

    public Coder(Long id, String nombre, Integer edad, String email, String clan) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.clan = clan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

}
