/*
 * Centro de mando.
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
public class CentroMandoHogwarts extends Edificio{
    private int vida = 500;
    public ArrayList<Recursos> recur_1;
    public ArrayList<Recursos> recur_2;
    public ArrayList<Recursos> recur_3;
           public ArrayList<Milicias> miliciasa;
    public ArrayList<Vehiculo> vehiculosa;
    public CentroMandoHogwarts(buildercentro builder) {
        this.vida=builder.vida;
        recur_1 =new ArrayList<>();
        recur_2 =new ArrayList<>();
        recur_3 =new ArrayList<>();
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
       return "centroMandoHogwarts"; 
    }
    
    public static class buildercentro{
        private int vida;
        
        public buildercentro vida (int vida){
            this.vida=vida;
            return this;
            
        }
        
        public CentroMandoHogwarts builder(){
            return new CentroMandoHogwarts(this);
        }
    }
}
