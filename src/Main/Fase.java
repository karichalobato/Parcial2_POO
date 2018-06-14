/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Edificios.edificio;
import Milicias.milicia;
import Vehiculos.vehiculo;
import java.util.ArrayList;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Fase {
    public int numfase=1;
    public ArrayList<Jugador> jugadores;
    public ArrayList<milicia> milicias;
    public ArrayList<vehiculo> vehiculos;
    public ArrayList<edificio> edificios;
    
    public Fase() {
        jugadores = new ArrayList<>();
        milicias = new ArrayList<>();
        vehiculos = new ArrayList<>();
        edificios = new ArrayList<>();
        
    }
    
    public ArrayList<milicia> escuadron(){
        return milicias;
    }
    public void setEscuadron(milicia nueva){
        milicias.add(nueva);
    }
    
    public ArrayList<vehiculo> car(){
        return vehiculos;
    }
    public void setCar(vehiculo nuevo){
        vehiculos.add(nuevo);
    }
    
    public ArrayList<edificio> edis (){
        return edificios;
    }
    public void setEdis (edificio ataque){
        edificios.add(ataque);
    }
    
}
