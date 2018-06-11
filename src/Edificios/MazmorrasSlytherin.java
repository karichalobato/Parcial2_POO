/*
 * Centro de entrenamiento para la raza Slytherin
 */
package Edificios;
import Vehiculos.vehiculo;
import Vehiculos.vehiculoFactory;


/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class MazmorrasSlytherin implements edificio{
    private int vida;
    @Override
       public vehiculo crearVehiculo(String tipo){
        return vehiculoFactory.getVehiculo(tipo);
    }
       @Override
    public int getVida() {
        return vida;
    }
}

