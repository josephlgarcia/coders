package com.academia.coders.web.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CoderRequest {

    @NotBlank(message = "El nombre no pueded estar vacío")
    private String nombre;

    private Integer edad;

    @Email(message = "Formato inválido para email")
    private String email;

    private String clan;


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
