/*
 * Es un animal hidrido que se obtiene al cruzar un caballo con un grifo. 
 * Es nativo de Europa, aunque actualmente se encuentra en todo el mundo.
 */
package Vehiculos;

/**
 *
 * @author UCA
 */
public class Buckbeak implements vehiculo{
    private int vida,ataque;
    private String nombre;

    @Override
    public String getNombre() {
        return "Buckbeak";
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getAtaque() {
        return 50;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int getVida() {
        return 10;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
