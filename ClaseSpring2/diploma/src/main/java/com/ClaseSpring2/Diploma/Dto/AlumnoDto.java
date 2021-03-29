package com.ClaseSpring2.Diploma.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class AlumnoDto {
    private String nombre;
    private Map<String,Double> materiasNotas;
}
