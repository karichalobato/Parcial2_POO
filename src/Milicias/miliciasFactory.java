/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicias;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class miliciasFactory {
    public static milicia getMilicia(String opcion,String milicia){
        switch(opcion){
            case "GRIFFINDOR":
                switch (milicia){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaBuilder().nombre("GrageasBertriBott").ataque(10).vida(100).Builder();
                    case "ESPECIALISTA":
                        return new Especialistas.miliciaBuilder().nombre("CortezaDeArbolVital").ataque(20).vida(50).Builder();
                   
                }
            
            case "SLYTHERIN":
                switch (milicia){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaBuilder().nombre("GrageasBertriBott").ataque(10).vida(100).Builder();
                    case "ESPECIALISTAS":
                        return new Especialistas.miliciaBuilder().nombre("CortezaDeArbolVital").ataque(20).vida(50) .Builder();
                    
                }
            
            case "RAVENCLOW":
                switch (milicia){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaBuilder().nombre("GrageasBertriBott").ataque(10).vida(100).Builder();
                    case "ESPECIALISTA":
                        return new Especialistas.miliciaBuilder().nombre("CortezaDeArbolVital").ataque(20).vida(50).Builder();
                    
                }
        }
        return null;
    }
}

