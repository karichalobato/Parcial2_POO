/*
 * Interfaz de paquete Raza de la Abstract factory
 */
package RAZAS;
import Edificios.centroMandoHogwarts;
import Edificios.edificio;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public interface raza {
    public edificio construir(String tipo);
    
    public String getNombre();
    public void setNombre(String nombre);
        
}
