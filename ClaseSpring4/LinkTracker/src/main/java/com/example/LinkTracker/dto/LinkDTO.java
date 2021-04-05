package com.example.LinkTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkDTO {
    private String url;
    private int id;
    private Optional<String> password;
    private int cantidadRedirecciones;

    public LinkDTO(String link, int contador, int redirecciones) {
        this.url = link;
        this.id = contador;
        this.cantidadRedirecciones = redirecciones;
    }
}
