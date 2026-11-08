/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Cliente extends Persona {
    private String fechaReserva;
    private String tipoTour;
    private boolean estadoReserva;

    public Cliente(String fechaReserva, String tipoTour, boolean estadoReserva) {
        this.fechaReserva = fechaReserva;
        this.tipoTour = tipoTour;
        this.estadoReserva = estadoReserva;
    }

    public Cliente(String fechaReserva, String tipoTour, boolean estadoReserva, String nombre, String rut, String telefono, Direccion direccion) {
        super(nombre, rut, telefono, direccion);
        this.fechaReserva = fechaReserva;
        this.tipoTour = tipoTour;
        this.estadoReserva = estadoReserva;
    }

    public Cliente() {
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public boolean isEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    @Override
    public String toString(){
        return "Cliente{"+
                "nombre=" + getNombre() +
                ", rut=" + getRut() + 
                ", telefono=" + getTelefono() +
                ", direccion=" + getDireccion() + 
                ", fechaReserva=" + fechaReserva +
                ", tipoTour=" + tipoTour + 
                ", estadoReserva=" + estadoReserva +
                '}';
    }
         
}
