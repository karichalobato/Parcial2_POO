/*
 * Creacion de recurso 3 con el patron de diseño Builder
 */
package Recursos;

/**
 *
 * @author UCA
 */
public class Recur3 implements Recursos {
    private String nombre;
    private int cantidad; 

    public Recur3(recursos_Builder Builder) {
        this.nombre = Builder.nombre;
        this.cantidad =Builder.cantidad;
    }

    @Override
    public String getNombre() {
        return "CromosDeOro";
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public static class recursos_Builder{
        private int cantidad;
        private String nombre;
    
    public recursos_Builder cantidad(int cantidad){
        this.cantidad=cantidad;
        return this ;
    }
    
    public recursos_Builder nombre(String nombre){
        this.nombre=nombre;
        return this ;
    }
    
    public Recur3 Builder(){
        return new Recur3(this);
    }
    
    }
    
}
