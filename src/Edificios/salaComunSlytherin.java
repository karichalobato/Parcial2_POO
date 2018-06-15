/*
 * Centro de recuperacion para Slytherin
 */
package Edificios;

import Vehiculos.vehiculo;
import Vehiculos.vehiculoFactory;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class salaComunSlytherin implements edificio {
    private int vida = 150;
    @Override
       public vehiculo crearVehiculo(String tipo){
        return vehiculoFactory.getVehiculo(tipo);
    }
       @Override
    public int getVida() {
        return vida;
    }
    
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String getNombre() {
        return "salaComunSlytherin";
    }
    
}
