package Level_1;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String texto;
        char caracter = 'a';
        int numeroDeVeces = 0;
        do {
            System.out.print("Introduce texto: ");
            texto = scan.nextLine();
        } while (texto.isEmpty());
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");  
        scan.close();
    }
    //calcular el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
}
