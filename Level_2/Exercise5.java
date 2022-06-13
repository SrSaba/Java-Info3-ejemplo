package Level_2;

import java.util.*;

public class Exercise5 {
    public static void main(String [] args){
        //Creamos la lista de las horas trabajadas por día:
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorXhora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas el lunes: ");
        Integer hsL = scan.nextInt(); //Horas trabajadas los lunes.
        horasTrabajadas.add(hsL);
        System.out.print("Ingrese la cantidad de horas trabajadas el martes: ");
        Integer hsMa = scan.nextInt();
        horasTrabajadas.add(hsMa);
        System.out.print("Ingrese la cantidad de horas trabajadas el miercoles: ");
        Integer hsMi = scan.nextInt();
        horasTrabajadas.add(hsMi);
        System.out.print("Ingrese la cantidad de horas trabajadas el jueves: ");
        Integer hsJ = scan.nextInt();
        horasTrabajadas.add(hsJ);
        System.out.print("Ingrese la cantidad de horas trabajadas el viernes: ");
        Integer hsV = scan.nextInt();
        horasTrabajadas.add(hsV);

        System.out.print("Ingrese el valor en dolares de una hora de trabajo los lunes: ");
        Integer valorLunes = scan.nextInt();
        valorXhora.add(valorLunes);
        System.out.print("Ingrese el valor en dolares de una hora de trabajo los martes: ");
        Integer valorMartes = scan.nextInt();
        valorXhora.add(valorMartes);
        System.out.print("Ingrese el valor en dolares de una hora de trabajo los miercoles: ");
        Integer valorMiercoles = scan.nextInt();
        valorXhora.add(valorMiercoles);
        System.out.print("Ingrese el valor en dolares de una hora de trabajo los jueves: ");
        Integer valorJueves = scan.nextInt();
        valorXhora.add(valorJueves);
        System.out.print("Ingrese el valor en dolares de una hora de trabajo los viernes: ");
        Integer valorViernes = scan.nextInt();
        valorXhora.add(valorViernes);

        calcularTotales(horasTrabajadas, valorXhora, totales);
        System.out.print(totales + "\n");

        calcularTotal(totales);

        scan.close();
    }

    public static void calcularTotales(List<Integer> horasTrabajadas, List<Integer> valorXhora, List<Integer> totales) {
        Integer horasL = horasTrabajadas.get(0); //Extraemos las horas del lunes.
        Integer valorL = valorXhora.get(0); //Obtenemos el valor x hora de ese día.
        Integer totalL = horasL * valorL; //Calculamos el total a pagar por ese día.
        totales.add(totalL); //Lo añadimos a la lista correspondiente.
        Integer horasMa = horasTrabajadas.get(1);
        Integer valorMa = valorXhora.get(1);
        Integer totalMa = horasMa * valorMa;
        totales.add(totalMa);
        Integer horasMi = horasTrabajadas.get(2);
        Integer valorMi = valorXhora.get(2);
        Integer totalMi = horasMi * valorMi;
        totales.add(totalMi);
        Integer horasJ = horasTrabajadas.get(3);
        Integer valorJ = valorXhora.get(3);
        Integer totalJ = horasJ * valorJ;
        totales.add(totalJ);
        Integer horasV = horasTrabajadas.get(4);
        Integer valorV = valorXhora.get(4);
        Integer totalV = horasV * valorV;
        totales.add(totalV);
    }

    public static void calcularTotal(List<Integer> totales){
        Integer l = totales.get(0);
        Integer ma = totales.get(1);
        Integer mi = totales.get(2);
        Integer j = totales.get(3);
        Integer v = totales.get(4);
        Integer totalFinal = l + ma + mi + j + v;
        System.out.println("Total final a pagar en dolares: " + totalFinal);
    }
}
