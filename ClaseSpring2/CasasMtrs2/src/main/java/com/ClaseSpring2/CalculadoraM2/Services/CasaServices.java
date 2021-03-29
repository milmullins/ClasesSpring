package com.ClaseSpring2.CalculadoraM2.Services;

import com.ClaseSpring2.CalculadoraM2.dto.CasaDto;
import com.ClaseSpring2.CalculadoraM2.dto.DetalleDto;
import com.ClaseSpring2.CalculadoraM2.dto.HabitacionDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CasaServices {

    public static DetalleDto getDetalle(CasaDto casa) {
        return new DetalleDto(casa.getNombre(), casa.getDireccion(), calcularValor(calcularMts2(casa.getListaHabitaciones())),
                calcularMts2(casa.getListaHabitaciones()), habitacionMasGrande(casa.getListaHabitaciones()), metrosHabitaciones(casa.getListaHabitaciones()));
    }

    public static double calcularMts2(List<HabitacionDto> listaHabitaciones) {
        double mts2 = 0;
        for (HabitacionDto h : listaHabitaciones) {
            mts2 += h.getLargo() * h.getAncho();
        }
        return mts2;
    }

    public static double calcularAreaHabitacion(HabitacionDto hab) {
        return hab.getAncho() * hab.getLargo();
    }

    public static double calcularValor(double mtrs2) {
        return 800 * mtrs2;
    }

    public static HabitacionDto habitacionMasGrande(List<HabitacionDto> listaHabitaciones) {
        HabitacionDto masGrande = new HabitacionDto();
        for (HabitacionDto h :
                listaHabitaciones) {
            if (calcularAreaHabitacion(h) > calcularAreaHabitacion(masGrande))
                masGrande = h;
        }
        return masGrande;
    }

    public static Map<String, Double> metrosHabitaciones(List<HabitacionDto> listaHabitacione) {
        Map<String, Double> habitaciones = new HashMap<>();
        for(HabitacionDto h:listaHabitacione){
            habitaciones.put(h.getNombre(), calcularAreaHabitacion(h));
        }
        return habitaciones;
    }
}
