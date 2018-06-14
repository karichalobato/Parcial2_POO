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
    private String nombre;
    
    
    @Override
    public String getNombre() {
        return "Thestral";
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public int getAtaque() {
        return 100;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    @Override
    public int getVida() {
        return 75;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    
}
