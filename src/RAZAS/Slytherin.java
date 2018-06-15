/*
 * Raza Slytherin
 */
package RAZAS;
import Edificios.centroMandoHogwarts;
import Edificios.edificio;
import Edificios.edificioFactory;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Slytherin implements raza{
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
   public edificio construir(String tipo){
               return edificioFactory.getEdificio(tipo);
    }
}
