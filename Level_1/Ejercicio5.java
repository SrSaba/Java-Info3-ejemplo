package Level_1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args){
        System.out.print("Ingrese un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int nro2 = scan.nextInt();
        scan.close();
        int producto = 0;
        int i = 1;

        while (i <= nro2){
            producto = producto + nro1;
            i++;
        }
        System.out.println(nro1 + " * " + nro2 + " = " + producto);
    }
}
