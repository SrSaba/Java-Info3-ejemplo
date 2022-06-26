package com.informatorio.utils;

import java.util.*;
import java.util.stream.Collectors;

public class Actividad1 {
    public static List<String> quitarNulosYVacios(List<String> listaString) {
        for(int i = 0; i < listaString.size(); i++){
            if (listaString.get(i) == null || "".equals(listaString.get(i))){
                listaString.remove(i);
            }
        }
        return listaString;
    }
    public static List<String> ahoraConStreams(List<String> listaString){
        List<String> listaFiltrada = listaString.stream()
                .filter(elemento -> elemento != null)   //= .filter(elemento -> Objects.nonNull(elemento)) = .filter(Objects::nonNull) .
                .filter(elemento -> !(elemento.isEmpty()))
                .collect(Collectors.toList());
        return listaFiltrada;
    }
}
