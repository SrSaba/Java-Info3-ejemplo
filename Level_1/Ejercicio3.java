package Level_1;

import java.util.*;

public class Ejercicio3 {
    public static void main(String [] args) {
        System.out.print("A continuacion ingrese un numero entero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        ArrayList<Integer> numList = new ArrayList<Integer>();;

        for (int num = 1; num <= n; num++){
            numList.add(num);
            System.out.println(numList);
        }
    }
}
