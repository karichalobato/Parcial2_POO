/*
 * Centro de entrenamiento de las milicias de  Ravenclow
 */
package Edificios;
import Vehiculos.VehiculoFactory;
import java.util.ArrayList;
import Milicias.Milicias;
import Vehiculos.Vehiculo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class TorreRavenclow extends Edificio {
    private int vida = 100;
           public int Precio1=200;
    public int Precio2=30;
    public int Precio3=10;
               public ArrayList<Milicias> miliciasa;
    public ArrayList<Vehiculo> vehiculosa;
    @Override
       public Vehiculo crearVehiculo(String tipo){
        return VehiculoFactory.getVehiculo(tipo);
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
      return "torreRavenclow" ; 
    }
}

