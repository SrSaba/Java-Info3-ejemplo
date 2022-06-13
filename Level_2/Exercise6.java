package Level_2;

import java.util.*;

public class Exercise6 {
    public static void main(String [] args){
        Set<Empleados> empleados = new HashSet();
        Map<Integer, Integer> sueldos = new HashMap();

        empleados.add(new Empleados("Fulano Detal", 17890450, 8, 60));
        empleados.add(new Empleados("Gustavo Sellama", 32461987, 9, 50));
        empleados.add(new Empleados("Camila Gimenez", 33177893, 8, 55));
        extraerHorasYvalor(empleados, sueldos);
    }

    public static void extraerHorasYvalor(Set<Empleados> empleados, Map<Integer, Integer> sueldos){
        for(Empleados empleado : empleados){
            Integer salario = empleado.horasTrabajadas * empleado.valorXhora;
            sueldos.put((empleado.dni), (salario));
            for(Map.Entry<Integer, Integer> sueldo : sueldos.entrySet()){
                if (sueldo.getKey() == empleado.dni);
                System.out.println("Empleado con DNI " + empleado.dni + " recibe un sueldo de $" + sueldo.getValue());
            }
            
        }
    }
}
