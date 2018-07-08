/*
 * Interfaz de paquete Raza de la Abstract factory
 */
package RAZAS;
import Edificios.CentroMandoHogwarts;
import Edificios.Edificio;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public interface Raza {
    public Edificio construir(String tipo);
    
    public String getNombre();
    public void setNombre(String nombre);
        
}