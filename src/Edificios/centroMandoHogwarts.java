/*
 * Centro de mando.
 */
package Edificios;

import Vehiculos.vehiculo;


/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class centroMandoHogwarts implements edificio{
    private int vida;

    public centroMandoHogwarts(buildercentro builder) {
        this.vida=builder.vida;
    }
    
@Override
public vehiculo crearVehiculo(String tipo){
    return null;
}
@Override
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

