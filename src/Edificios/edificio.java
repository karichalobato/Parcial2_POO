/*
 * Interfaz de edificios
 */
package Edificios;
import Vehiculos.vehiculo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public interface edificio {
    public vehiculo crearVehiculo(String tipo);
    
    public int getVida();
    public void setVida(int vida);
    String getNombre();
}
