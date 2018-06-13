/*
 * Edificio de contrucción de milicias.
 */
package Edificios;
import Vehiculos.vehiculo;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class contruirMilicias implements edificio{
    private int vida;
    
    public contruirMilicias(builderConstMilicias Builder) {
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
    
    public static class builderConstMilicias{
        private int vida;
        
        public builderConstMilicias vida (int vida){
            this.vida = vida;
            return this;
            
        }
        
        public contruirMilicias Builder(){
            return new contruirMilicias(this);
        }
    }

}