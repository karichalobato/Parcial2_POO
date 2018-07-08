/*
 * Edificio de contruccion de Vehiculo
 */
package Edificios;

import java.util.ArrayList;
import Milicias.Milicias;
import Vehiculos.Vehiculo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class ContruirVehiculos extends Edificio {
    private int vida;
           public int Precio1=200;
    public int Precio2=30;
    public int Precio3=10;
    public ArrayList<Milicias> miliciasa;
    public ArrayList<Vehiculo> vehiculosa;
    public ContruirVehiculos(builderConstVehiculos Builder) {
        this.vida = Builder.vida;
    }
    
@Override
public Vehiculo crearVehiculo(String tipo){
    return null;
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
        return "contruirVehiculos";
    }
    
    public static class builderConstVehiculos{
        private int vida;
        
        public builderConstVehiculos vida (int vida){
            this.vida = vida;
            return this;
            
        }
        
        public ContruirVehiculos Builder(){
            return new ContruirVehiculos(this);
        }
    }

    
}
