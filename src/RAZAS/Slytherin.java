/*
 * Raza Slytherin
 */
package RAZAS;
import Edificios.CentroMandoHogwarts;
import Edificios.Edificio;
import Edificios.EdificioFactory;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Slytherin implements Raza{
    private String nombre;

    @Override
    public String getNombre() {
        return "SLYTHRIN";
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
     @Override
   public Edificio construir(String tipo){
               return EdificioFactory.getEdificio(tipo);
    }
}
