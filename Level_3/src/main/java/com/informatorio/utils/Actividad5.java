package com.informatorio.utils;
import com.informatorio.models.Alumnos;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Actividad5 {
    public static void main(String [] args){
        Alumnos estudiante1 = new Alumnos("Martina", "Gimenez", LocalDate.of(2000, 5, 13));
        Alumnos estudiante2 = new Alumnos("Javier", "Gomes", LocalDate.of(2000, 9, 19));
        Alumnos estudiante3 = new Alumnos("Leonardo", "Vinchi", LocalDate.of(1990, 12, 27));
        Alumnos estudiante4 = new Alumnos("Carolina", "Goti", LocalDate.of(1988, 7, 21));
        Alumnos estudiante5 = new Alumnos("David", "Toloza", LocalDate.of(2001, 5, 14));

        List<Alumnos> estudiantes = List.of(estudiante1, estudiante2, estudiante3, estudiante4, estudiante5);

        Map<String, Integer> mapAlumnos = estudiantes.stream()
                .collect(Collectors.toMap(x -> x.getApellido() + " " + x.getNombre(), y -> y.calcularEdad()));
        System.out.println(mapAlumnos);
    }
}
