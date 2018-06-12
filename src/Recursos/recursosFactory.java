/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class recursosFactory {
    public static recursos getRecursos(String opcion,String recurso){
        switch(opcion){
            case "GRIFFINDOR":
                switch (recurso){
                    case "RECURSO1":
                        return new Recur1_GrageasBertriBott.recursos_Builder().nombre("GrageasBertriBott").cantidad(600).Builder();
                    case "RECURSO2":
                        return new Recur2_CortezaDeArbolVital.recursos_Builder().nombre("CortezaDeArbolVital").cantidad(50).Builder();
                    case "RECURSO3":
                        return new Recur3_CromosDeOro.recursos_Builder().nombre("CromosDeOro").cantidad(20).Builder();
                }
            
            case "SLYTHERIN":
                switch (recurso){
                    case "RECURSO1":
                        return new Recur1_GrageasBertriBott.recursos_Builder().nombre("GrageasBertriBott").cantidad(600).Builder();
                    case "RECURSO2":
                        return new Recur2_CortezaDeArbolVital.recursos_Builder().nombre("CortezaDeArbolVital").cantidad(50).Builder();
                    case "RECURSO3":
                        return new Recur3_CromosDeOro.recursos_Builder().nombre("CromosDeOro").cantidad(20).Builder();
                }
            
            case "RAVENCLOW":
                switch (recurso){
                    case "RECURSO1":
                        return new Recur1_GrageasBertriBott.recursos_Builder().nombre("GrageasBertriBott").cantidad(600).Builder();
                    case "RECURSO2":
                        return new Recur2_CortezaDeArbolVital.recursos_Builder().nombre("CortezaDeArbolVital").cantidad(50).Builder();
                    case "RECURSO3":
                        return new Recur3_CromosDeOro.recursos_Builder().nombre("CromosDeOro").cantidad(20).Builder();
                }
        }
        return null;
    }
    
}
