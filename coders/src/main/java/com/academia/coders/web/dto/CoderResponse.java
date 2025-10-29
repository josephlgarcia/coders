package com.academia.coders.web.dto;

public class CoderResponse {
    
    private String nombre;
    private Integer edad;
    private String email;
    private String clan;

    public CoderResponse(String nombre, Integer edad, String email, String clan) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.clan = clan;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getClan() {
        return clan;
    }

}
