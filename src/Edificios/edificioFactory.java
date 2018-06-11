/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class edificioFactory {
    public static edificio getEdificio(String opcion){
              switch(opcion){
            case "CENTRODEMANDO":
                return new centroMandoHogwarts.buildercentro().vida(2000).builder();
           
            
        }
        return null;
    } 
}
