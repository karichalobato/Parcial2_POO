/*
 * Raza Ravenclow
 */
package RAZAS;
import Edificios.CentroMandoHogwarts;
import Edificios.Edificio;
import Edificios.EdificioFactory;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Ravenclow implements Raza {
    
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
   public Edificio construir(String tipo){
               return EdificioFactory.getEdificio(tipo);
    }
    
}
