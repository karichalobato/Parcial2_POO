/*
 * Factory de vehiculos
 */
package Vehiculos;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class VehiculoFactory {
    public static Vehiculo getVehiculo(String tipo){
        switch(tipo){
            case "VEHICULO_GRIFFINDOR":
                return new Escoba();
           
            case "VEHICULO_SLYTHERIN":
                return new Thestral();
                
            case "VEHICULO_RAVENCLOW":
                return new Buckbeak();
                
        }
        return null;
    } 
    
}