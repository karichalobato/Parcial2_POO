/*
 * Factory de raza
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
