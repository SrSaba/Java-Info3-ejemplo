package com.informatorio.utils;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Actividad4 {
    public static void main (String [] args){
        List<Integer> lista1 = List.of(1, 2, 4, 4, 4);
        List<Long> lista2 = lista1.stream().distinct()
                .map(lis -> LongStream.rangeClosed(1, lis).reduce(1,(long a, long b) -> a*b))
                .collect(Collectors.toList());
        System.out.println(lista2);
    }
}
