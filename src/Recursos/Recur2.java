/*
 * Creacion de recurso 2 con el patron de diseño Builder
 */
package Recursos;

/**
 *
 * @author UCA
 */
public class Recur2 implements Recursos {
    private String nombre;
    private int cantidad; 

    public Recur2(recursos_Builder Builder) {
        this.nombre = Builder.nombre;
        this.cantidad =Builder.cantidad;
    }

    @Override
    public String getNombre() {
        return "CortezaDeArbolVital";
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
    
    public Recur2 Builder(){
        return new Recur2(this);
    }
    
    }
    
}
