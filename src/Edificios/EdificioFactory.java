/*
 * Factory de edificios.
 */
package Edificios;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class EdificioFactory {
    public static Edificio getEdificio(String opcion){
        switch(opcion){
            case "CENTROMANDO":
                return new CentroMandoHogwarts.buildercentro().vida(200).builder();
                
            case "CONSTRUCCIONMILICIAS":
                return new ContruirMilicias.builderConstMilicias().vida(150).Builder();
                
            case "CONSTRUCCIONVEHICULOS":
                return new ContruirVehiculos.builderConstVehiculos().vida(150).Builder();
           
            case "MAZMORRASSLYTHERIN":
                return new MazmorrasSlytherin();
                
            case "SALACOMUNGRYFFINDOR":
                return new SalaComunGryffindor();
               
            case "SALACOMUNRAVENCLOW":
                return new SalaComunRavenclow();
                
            case "SALACOMUNSLYTHERIN":
                return new SalaComunSlytherin();
            
            case "SALAMENESTERES":
                return new SalaMenesteres();
                
            case "TORRERAVENCLOW":
                return new TorreRavenclow();
        }
        return null;
    } 
}
