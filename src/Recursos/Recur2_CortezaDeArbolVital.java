/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author UCA
 */
public class Recur2_CortezaDeArbolVital implements recursos {
    private String nombre;
    private int cantidad; 

    public Recur2_CortezaDeArbolVital(recursos_Builder Builder) {
        this.nombre = Builder.nombre;
        this.cantidad =Builder.cantidad;
    }

    @Override
    public String getNombre() {
        return nombre;
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
    
    public Recur2_CortezaDeArbolVital Builder(){
        return new Recur2_CortezaDeArbolVital(this);
    }
    
    }
    
}