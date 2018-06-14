/*
 * Centro de recuperacion Ravenclow
 */
package Edificios;

import Vehiculos.vehiculo;
import Vehiculos.vehiculoFactory;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class salaComunRavenclow implements edificio {

    private int vida;
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
         return "salaComunRavenclow";
    }
}
