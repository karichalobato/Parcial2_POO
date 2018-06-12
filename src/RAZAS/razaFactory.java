/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RAZAS;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class razaFactory {
    public static raza getRaza(String opcion){
        switch(opcion){
            case "GRYFFINDOR":
                   return new Gryffindor();
            case "SLYTHRIN":
                   return new Slytherin();
            case "RAVENCLOW":
                   return new Ravenclow();
            
        }
        return null;
    }
    
}
