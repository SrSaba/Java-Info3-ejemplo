package Level_2;

public class Empleados{
    public String nombre;
    public Integer dni;
    public Integer horasTrabajadas;
    public Integer valorXhora;

    public Empleados(String nombre, Integer dni, Integer horasTrabajadas, Integer valorXhora){
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorXhora = valorXhora;
    }
    @Override
    public String toString(){
        return "Empleado{" + nombre + dni + horasTrabajadas + valorXhora + '}';
    }
}
