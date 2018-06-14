/*
 * Escuadrones de batalla
 */
package Milicias;


/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Escuadrones implements milicia {
    
    private int vida,ataque;
    private String nombre;

    public Escuadrones(miliciaBuilder Builder) {
        this.vida = Builder.vida;
        this.ataque = Builder.ataque;
        this.nombre = Builder.nombre;
        
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
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static class miliciaBuilder{
        private int vida,ataque;
        private String nombre;
    
    public miliciaBuilder vida(int vida){
        this.vida=vida;
        return this ;
    }
     
    public miliciaBuilder ataque(int ataque){
        this.ataque=ataque;
        return this ;
    }
    
    public miliciaBuilder nombre(String nombre){
        this.nombre=nombre;
        return this ;
    }
    
    public Escuadrones Builder(){
        return new Escuadrones(this);
    }
    
    }
    
}
