/*
 *Interfaz de vehiculos con los metodos de los diferentes vehiculos
 */
package Vehiculos;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public interface vehiculo {
    public int getVida();
    public void setVida(int vida);
    
    public int getAtaque();
    public void setAtaque(int ataque);
    
    public String getNombre();
    public void setNombre(String nombre);
        
}
