package Level_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args) {
        System.out.println("A continuación ingrese dos numeros enteros (uno por linea):");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        int nro2 = scan.nextInt();
        scan.close();

        int suma = nro1 + nro2;
        int resta = nro1 - nro2;
        int multi = nro1 * nro2;
        int div = nro1 / nro2;
        int resto = nro1 % nro2;

        System.out.println(nro1 + " + " + nro2 + " = " + suma);
        System.out.println(nro1 + " - " + nro2 + " = " + resta);
        System.out.println(nro1 + " * " + nro2 + " = " + multi);
        System.out.println(nro1 + " / " + nro2 + " = " + div);
        System.out.println("El resto de la division entre " + nro1 + " y " + nro2 + " es: " + resto );
    }
}
