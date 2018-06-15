/*
 * Centro de entrenamiento de la milicia de Gryffindor
 */
package Edificios;
import Vehiculos.vehiculo;
import Vehiculos.vehiculoFactory;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class salaMenesteres implements edificio {
    private int vida = 175;
    @Override
       public vehiculo crearVehiculo(String tipo){
        return vehiculoFactory.getVehiculo(tipo);
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
      return "salaMenesteres";  
    }
}
    

