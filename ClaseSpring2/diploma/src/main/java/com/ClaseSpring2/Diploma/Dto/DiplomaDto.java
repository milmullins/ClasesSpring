package com.ClaseSpring2.Diploma.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiplomaDto {
    private String mensaje;
    private double promedio;
    private String alumno;
}
