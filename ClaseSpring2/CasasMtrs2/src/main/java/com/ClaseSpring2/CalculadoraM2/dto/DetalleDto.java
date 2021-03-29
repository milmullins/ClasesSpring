package com.ClaseSpring2.CalculadoraM2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleDto {
    private String nombre;
    private String direccion;
    private double valor;
    private double mts2;
    private HabitacionDto habitacionMasGrande;
    private Map<String,Double> mtrs2Habitaciones;
}
