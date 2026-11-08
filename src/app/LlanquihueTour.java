/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import model.Cliente;
import model.Direccion;
import model.Empleado;
import model.Persona;
/**
 *
 * @author carlo
 */
public class LlanquihueTour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("==============================================");
        System.out.println("   AGENCIA DE TURISMO - LLANQUIHUE TOUR             ");
        System.out.println("==============================================\n");
        
        Direccion dire1 = new Direccion ("Puerto varas", "Pasaje San ignacio, 035");
        Direccion dire2 = new Direccion ("Santiago Centro", "Calle Moneda 440");
        Direccion dire3 = new Direccion ("Maipu", "Calle Nueva San Martin 987");
        Direccion dire4 = new Direccion ("Puerto Montt", "Calle regimiento, 025");
        
        Cliente clien1 = new Cliente ("05-12-2026", "Paseos lacustres", true,
                "Sergio Rebolledo", "20.441.652-3", "+56963558791", dire3);
        
        Cliente clien2 = new Cliente ("28-12-2026", "Rutas Gastronomicas", false,
                "Daniel Henriquez", "21.231.122-6", "+56993551790", dire2);
        
        Empleado emp1 = new Empleado ("Guia turistico", 700000,
                "Jorge Hernandez", "12.345.687-9", "+56913598357", dire4);
        
        Empleado emp2 = new Empleado ("Operador local", 650000,
                "Mario Rojas", "19.115.677-2", "+56999598310", dire1);
               
        //VISTA DEL DESAROLLADOR
        System.out.println("---- LISTA DE RESERVAS ---");
        System.out.println(clien1.toString());
        System.out.println(clien2.toString());
        
        
        System.out.println("\n--- TRABAJADORES ASIGNADOS ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        
        
        //VISTA PARA EL USUARIO
        System.out.println("\n--- CLIENTE #1 ---");
        System.out.println("Nombre: " + clien1.getNombre());
        System.out.println("RUT: " + clien1.getRut());
        System.out.println("Telefono: " + clien1.getTelefono());
        System.out.println("Direccion: " + clien1.getDireccion().getCalle()+ ", " + clien1.getDireccion().getCiudad());
        System.out.println("Fecha de reserva: " + clien1.getFechaReserva());
        System.out.println("Tipo de tour: " + clien1.getTipoTour());
        System.out.println("Estado de reserva: " + (clien1.isEstadoReserva()? "Confirmada" : "Pendiente"));
        
        System.out.println("\n--- CLIENTE #2 ---");
        System.out.println("Nombre: " + clien2.getNombre());
        System.out.println("RUT: " + clien2.getRut());
        System.out.println("Telefono: " + clien2.getTelefono());
        System.out.println("Direccion: " + clien2.getDireccion().getCalle()+ ", " + clien2.getDireccion().getCiudad());
        System.out.println("Fecha de reserva: " + clien2.getFechaReserva());
        System.out.println("Tipo de tour: " + clien2.getTipoTour());
        System.out.println("Estado de reserva: " + (clien2.isEstadoReserva()? "Confirmada" : "Pendiente"));
        
        System.out.println("\n--- TRABAJADOR #1 ---");
        System.out.println("Nombre: " + emp1.getNombre());
        System.out.println("RUT: " + emp1.getRut());
        System.out.println("Telefono: " + emp1.getTelefono());
        System.out.println("Direccion: " + emp1.getDireccion().getCalle()+ ", " + emp1.getDireccion().getCiudad());
        System.out.println("Cargo: " + emp1.getCargo());
        System.out.println("Sueldo: $" + emp1.getSueldo());
        
        System.out.println("\n--- TRABAJADOR #2 ---");
        System.out.println("Nombre: " + emp2.getNombre());
        System.out.println("RUT: " + emp2.getRut());
        System.out.println("Telefono: " + emp2.getTelefono());
        System.out.println("Direccion: " + emp2.getDireccion().getCalle()+ ", " + emp2.getDireccion().getCiudad());
        System.out.println("Cargo: " + emp2.getCargo());
        System.out.println("Sueldo: $" + emp2.getSueldo());
    
        
        
        
        
        
    }
    
}
