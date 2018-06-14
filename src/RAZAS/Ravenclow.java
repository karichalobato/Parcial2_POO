/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RAZAS;
import Edificios.centroMandoHogwarts;
import Edificios.edificio;
import Edificios.edificioFactory;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Ravenclow implements raza {
    
    private String nombre;

    @Override
    public String getNombre() {
        return "RAVENCLOW";
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   @Override
   public edificio construir(String tipo){
               return edificioFactory.getEdificio(tipo);
    }
    
}
