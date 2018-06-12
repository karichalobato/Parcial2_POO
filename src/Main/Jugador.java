/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Edificios.edificio;
import RAZAS.raza;
import java.util.ArrayList;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Jugador {
    private String Nombre;
    public ArrayList<edificio> edificios;
    private raza raza;
    
    

public Jugador() {
    edificios = new ArrayList<>();
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public raza getRaza() {
        return raza;
    }

    public void setRaza(raza raza) {
        this.raza = raza;
    }
    
}
    

