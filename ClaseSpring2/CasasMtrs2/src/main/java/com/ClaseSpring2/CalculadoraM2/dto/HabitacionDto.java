package com.ClaseSpring2.CalculadoraM2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDto {
    private String nombre;
    private double ancho;
    private double largo;

}
