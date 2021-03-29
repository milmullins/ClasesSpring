package com.ClaseSpring2.CalculadoraM2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CasaDto {
    private String nombre;
    private String direccion;
    private List<HabitacionDto> listaHabitaciones = new ArrayList<>();
    private double valorMts2;
}
