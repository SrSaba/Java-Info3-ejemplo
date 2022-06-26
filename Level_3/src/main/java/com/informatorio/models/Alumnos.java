package com.informatorio.models;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Alumnos {
    private String apellido;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Alumnos (String nombre, String apellido, LocalDate fechaDeNacimiento){
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    @Override
    public String toString(){
        return "Alumno{" + apellido + nombre + fechaDeNacimiento + '}';
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return Objects.equals(apellido, alumnos.apellido) && Objects.equals(nombre, alumnos.nombre) && Objects.equals(fechaDeNacimiento, alumnos.fechaDeNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellido, nombre, fechaDeNacimiento);
    }
    public Integer calcularEdad(){
        int hoy = Calendar.getInstance().getWeekYear();
        Integer edad = hoy - this.fechaDeNacimiento.getYear();
        return edad;
    }
}
