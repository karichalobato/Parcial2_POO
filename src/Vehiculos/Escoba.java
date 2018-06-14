/*
 * 
 */
package Vehiculos;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Escoba implements vehiculo {
    private int vida,ataque;
    private String nombre;
    
    
    @Override
    public String getNombre() {
        return "Escoba";
    }

    @Override
    public void setNombre(String nombre) {
       this.nombre = nombre; 
    }
    
    @Override
    public int getAtaque() {
        return 10;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    

    @Override
    public int getVida() {
        return 25;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    
}
