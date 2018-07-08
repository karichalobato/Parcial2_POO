/*
 * Edificio de contrucción de milicias.
 */
package Edificios;
import java.util.ArrayList;
import Milicias.Milicias;
import Vehiculos.Vehiculo;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class ContruirMilicias extends Edificio{
    private int vida;
    public int Precio1=200;
    public int Precio2=30;
    public int Precio3=10;
               public ArrayList<Milicias> miliciasa;
    public ArrayList<Vehiculo> vehiculosa;
    public ContruirMilicias(builderConstMilicias Builder) {
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
       return "contruirMilicias"; 
    }
    
    public static class builderConstMilicias{
        private int vida;
        
        public builderConstMilicias vida (int vida){
            this.vida = vida;
            return this;
            
        }
        
        public ContruirMilicias Builder(){
            return new ContruirMilicias(this);
        }
    }

}