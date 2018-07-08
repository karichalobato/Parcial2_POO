/*
 * Interfaz de edificios
 */
package Edificios;
import java.util.ArrayList;
import Milicias.Milicias;
import Recursos.Recursos;
import Vehiculos.Vehiculo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Edificio {
     public int Precio1;
    public int Precio2;
    public int Precio3;
    public ArrayList<Recursos> recur_1;
    public ArrayList<Recursos> recur_2;
    public ArrayList<Recursos> recur_3;
            public ArrayList<Milicias> miliciasa;
    public ArrayList<Vehiculo> vehiculosa;
    public Vehiculo crearVehiculo(String tipo){
        return null;
    }
   
    public int getVida()
            {
        return 3;
    }
    public void setVida(int vida){
        
    }
    public String getNombre(){
        return null;
    }
}
