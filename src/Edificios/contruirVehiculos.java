/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

import Vehiculos.vehiculo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class contruirVehiculos implements edificio {
    private int vida;
    
    public contruirVehiculos(builderConstVehiculos Builder) {
        this.vida = Builder.vida;
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
    
    public static class builderConstVehiculos{
        private int vida;
        
        public builderConstVehiculos vida (int vida){
            this.vida = vida;
            return this;
            
        }
        
        public contruirVehiculos Builder(){
            return new contruirVehiculos(this);
        }
    }

    
}
