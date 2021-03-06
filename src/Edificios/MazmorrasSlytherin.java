/*
 * Centro de entrenamiento para la Milicias de  Slytherin
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
public class MazmorrasSlytherin extends Edificio{
    public int Precio1=300;
    public int Precio2=30;
    public int Precio3=10;
    private int vida = 100;
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
       return "MazmorrasSlytherin"; 
    }
    
}


