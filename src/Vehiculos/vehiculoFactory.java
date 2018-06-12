/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class vehiculoFactory {
    public static vehiculo getVehiculo(String tipo){
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
