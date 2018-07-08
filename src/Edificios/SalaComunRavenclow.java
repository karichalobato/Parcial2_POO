/*
 * Centro de recuperacion Ravenclow
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
public class SalaComunRavenclow extends Edificio {
        public int Precio1=200;
    public int Precio2=30;
    public int Precio3=10;
    private int vida = 200;
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
         return "salaComunRavenclow";
    }
}
