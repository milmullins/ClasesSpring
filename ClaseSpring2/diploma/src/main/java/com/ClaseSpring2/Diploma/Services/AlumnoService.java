package com.ClaseSpring2.Diploma.Services;

import com.ClaseSpring2.Diploma.Dto.AlumnoDto;
import com.ClaseSpring2.Diploma.Dto.DiplomaDto;

import java.util.Map;

public class AlumnoService {

    public static DiplomaDto obtenerDiploma(AlumnoDto alumno){
        DiplomaDto diploma = new DiplomaDto();

        diploma.setAlumno(alumno.getNombre());

        diploma.setPromedio(calcularPromedio(alumno.getMateriasNotas()));

        diploma.setMensaje(obtenerMensaje(diploma.getPromedio()));

        return diploma;
    }

    public static double calcularPromedio(Map<String,Double> materiasNotas){
        int cantidadMaterias=0;
        double sumaMaterias=0;

        for(Map.Entry<String, Double> entry : materiasNotas.entrySet()){
            cantidadMaterias++;
            sumaMaterias+=entry.getValue();
        }
        return sumaMaterias/cantidadMaterias;
    }

    public static String obtenerMensaje(double promedio){
        if(promedio>9)
            return "Excelente Felicitado!!!";
        else
            return  "Aprobado!";
    }

}
