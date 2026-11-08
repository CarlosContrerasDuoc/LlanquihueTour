/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Empleado extends Persona{
    private String cargo;
    private double sueldo;

    public Empleado(String cargo, double sueldo) {
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado(String cargo, double sueldo, String nombre, String rut, String telefono, Direccion direccion) {
        super(nombre, rut, telefono, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "Empleado{"+
                "nombre=" + getNombre() +
                ", rut=" + getRut() + 
                ", telefono=" + getTelefono() +
                ", direccion=" + getDireccion() + 
                ", cargo=" + cargo +
                ", sueldo=" + sueldo + 
                '}';
    }

}
