package Level_1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args){
        System.out.print("Ingrese un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        System.out.print("Ingrese la potencia entera a la que quiera elevar dicho numero: ");
        int expo = scan.nextInt();
        scan.close();
        int b = base;
        int i = 2;

        while (i <= expo){
            base = base * b;
            i++;
        }
        System.out.println(b + " elevado a la " + expo + " es igual a " + base);
    }
}
