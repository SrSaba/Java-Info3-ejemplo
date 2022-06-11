package Level_1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String [] args){
        System.out.print("Ingrese su Nombre y Apellido: ");
        Scanner scan = new Scanner(System.in);
        String nombre_completo = scan.nextLine();
        System.out.print("Ingrese su edad: ");
        String edad = scan.nextLine();
        System.out.print("Ingrese su direccion: ");
        String domicilio = scan.nextLine();
        System.out.print("Ingrese el nombre de la ciudad en la que reside: ");
        String ciudad = scan.next();
        scan.close();
        String guion = " - ";

        System.out.print(ciudad + guion + domicilio + guion + edad + guion + nombre_completo);
    }
}
