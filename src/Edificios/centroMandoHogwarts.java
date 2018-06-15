/*
 * Centro de mando.
 */
package Edificios;

import Recursos.recursos;
import Vehiculos.vehiculo;
import java.util.ArrayList;


/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class centroMandoHogwarts implements edificio{
    private int vida = 500;
    public ArrayList<recursos> recur_1;
    public ArrayList<recursos> recur_2;
    public ArrayList<recursos> recur_3;

    public centroMandoHogwarts(buildercentro builder) {
        this.vida=builder.vida;
        recur_1 =new ArrayList<>();
        recur_2 =new ArrayList<>();
        recur_3 =new ArrayList<>();
    }
    
@Override
public vehiculo crearVehiculo(String tipo){
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
       return "centroMandoHogwarts"; 
    }
    
    public static class buildercentro{
        private int vida;
        
        public buildercentro vida (int vida){
            this.vida=vida;
            return this;
            
        }
        
        public centroMandoHogwarts builder(){
            return new centroMandoHogwarts(this);
        }
    }
}

