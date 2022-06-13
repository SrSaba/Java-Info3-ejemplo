package Level_2;

import java.util.*;

public class Exercise3 {
    public static void main(String [] args){
        Integer [] baraja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int i = 0; i < baraja.length ; i++) {
            System.out.print(" " + baraja [i] + " ");
        }
        System.out.println(" ");
        System.out.println("En orden inverso:");
        for (int i = baraja.length - 1; i >= 0 ; i--) {
            System.out.print(" " + baraja [i] + " ");
        }
        System.out.println(" ");
        System.out.println("En desorden:");
        List<Integer> lista = Arrays.asList(baraja);
        Collections.shuffle(lista);
        System.out.println(lista);
    }
}
