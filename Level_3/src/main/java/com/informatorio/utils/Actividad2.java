package com.informatorio.utils;

import java.util.*;

public class Actividad2 {
    public static List<Integer> generarListaConCuadrados (List<Integer> listaInteger){
        List <Integer> cuadrados = new ArrayList<>();
        for (int i=0; i < listaInteger.size(); i++) {
            Integer alados = listaInteger.get(i) * listaInteger.get(i);
            cuadrados.add(alados);
        }
        return cuadrados;
    }
}
