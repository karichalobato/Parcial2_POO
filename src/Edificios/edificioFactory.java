/*
 * Factory de edificios.
 */
package Edificios;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class edificioFactory {
    public static edificio getEdificio(String opcion){
        switch(opcion){
            case "CENTRODEMANDOHOGWARTS":
                return new centroMandoHogwarts.buildercentro().vida(2000).builder();
                
            case "CONSTRUCCIONMILICIAS":
                return new contruirMilicias.builderConstMilicias().vida(150).Builder();
                
            case "CONSTRUCCIONVEHICULOS":
                return new contruirVehiculos.builderConstVehiculos().vida(150).Builder();
           
            case "MAZMORRASSLYTHERIN":
                return new MazmorrasSlytherin();
                
            case "SALACOMUNGRYFFINDOR":
                return new salaComunGryffindor();
               
            case "SALACOMUNRAVENCLOW":
                return new salaComunRavenclow();
                
            case "SALACOMUNSLYTHERIN":
                return new salaComunSlytherin();
            
            case "SALAMENESTERES":
                return new salaMenesteres();
                
            case "TORRERAVENCLOW":
                return new torreRavenclow();
        }
        return null;
    } 
}
