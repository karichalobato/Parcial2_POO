/*
 * Un thestral es una variedad de caballo alado con un cuerpo esquelético, 
   rostro de rasgos reptilianos y unas alas de aspecto curtido que recuerdan a las 
   de un murciélago.
 */
package Vehiculos;

/**
 *
 * @author UCA
 */
public class Thestral implements vehiculo{
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
