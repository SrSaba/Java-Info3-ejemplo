package Level_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String [] args){
        System.out.print("Ingrese una palabra en minusculas: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.next();
        scan.close();
        String mayus = palabra.toUpperCase();
        System.out.println(mayus);
    }
}

//No encontré una forma de hacerlo sin el método toUpperCase(). Y, si bien no me corresponde, tampoco veo el sentido de hacerlo sin el método, para algo fue creado.
