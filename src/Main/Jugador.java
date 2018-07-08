/*
 * Clase jugador y se guardara en un ArrayList
 */
package Main;
import Edificios.Edificio;
import java.util.ArrayList;
import Milicias.Milicias;
import RAZAS.Raza;
import Vehiculos.Vehiculo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Jugador {
    private String Nombre;
    public ArrayList<Edificio> edificios;
    private Raza raza;
       public ArrayList<Milicias> milicias;
    public ArrayList<Vehiculo> vehiculos;
  
    

public Jugador() {
    edificios = new ArrayList<>();
    milicias = new ArrayList<>();
        vehiculos = new ArrayList<>();
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    
}
    
