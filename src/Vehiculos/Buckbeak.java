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

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
}
