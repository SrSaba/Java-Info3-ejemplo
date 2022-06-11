package Level_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String [] args) {
        System.out.print("Ingrese a continuación un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int factorial = 1;
        int m = n;

        while(n != 0){
            factorial = factorial * n;
            n--;
        }
        System.out.println("El factorial de " + m + " es: " + factorial);
    }
}
