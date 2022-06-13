package Level_2;

import java.util.*;

public class Exercise4 {
    public static void main(String [] args){
        List<String> nombres = new ArrayList<>();
        List<String> curso1 = new ArrayList<>();
        List<String> curso2 = new ArrayList<>();
        List<String> curso3 = new ArrayList<>();
        cargarNombres(nombres);
        formarCurso1(nombres, curso1);
        formarCurso2(nombres, curso2);
        formarCurso3(nombres, curso3);
        System.out.print(curso1 + "\n");
        System.out.print(curso2 + "\n");
        System.out.print(curso3 + "\n");
    }

    public static void cargarNombres(List<String> nombres){
        nombres.add("Juan");
        nombres.add("Paco");
        nombres.add("Tito");
        nombres.add("David");
        nombres.add("Lamar");
        nombres.add("Lara");
        nombres.add("Martin");
        nombres.add("Pedro");
        nombres.add("Osca");
        nombres.add("Lionel");
        nombres.add("Santiago");
        nombres.add("Lautaro");
    }

    public static void formarCurso1(List<String> nombres, List<String> curso1) {
        String a1 = nombres.get(0);
        curso1.add(a1);
        String a2 = nombres.get(1);
        curso1.add(a2);
        String a3 = nombres.get(2);
        curso1.add(a3);
        String a4 = nombres.get(3);
        curso1.add(a4);
    }

    public static void formarCurso2(List<String> nombres, List<String> curso2) {
        String a5 = nombres.get(4);
        curso2.add(a5);
        String a6 = nombres.get(5);
        curso2.add(a6);
        String a7 = nombres.get(6);
        curso2.add(a7);
        String a8 = nombres.get(7);
        curso2.add(a8);
    }

    public static void formarCurso3(List<String> nombres, List<String> curso3) {
        String a9 = nombres.get(8);
        curso3.add(a9);
        String a10 = nombres.get(9);
        curso3.add(a10);
        String a11 = nombres.get(10);
        curso3.add(a11);
        String a12 = nombres.get(11);
        curso3.add(a12);
    }
}
