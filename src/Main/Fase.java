/*
 * Obtiene los ArrayList de jugadores,milicias,vehiculos y edificios.
En el se guardan las construcciones creadas

 */
package Main;
import Edificios.Edificio;
import java.util.ArrayList;
import Milicias.Milicias;
import Recursos.Recursos;
import Vehiculos.Vehiculo;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Fase {
    public int numfase=1;
    public ArrayList<Jugador> jugadores;
    public ArrayList<Milicias> milicias;
    public ArrayList<Vehiculo> vehiculos;
    public ArrayList<Edificio> edificios;
    
    
    public Fase() {
        jugadores = new ArrayList<>();
        milicias = new ArrayList<>();
        vehiculos = new ArrayList<>();
        edificios = new ArrayList<>();
        
        
    }
    
    public ArrayList<Milicias> escuadron(){
        return milicias;
    }
    public void setEscuadron(Milicias nueva){
        milicias.add(nueva);
    }
}  