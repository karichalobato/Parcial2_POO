/*
 * Factory de Recursos
 */
package Recursos;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class RecursosFactory {
    public static Recursos getRecursos(String opcion,String recurso){
        switch(opcion){
            case "GRYFFINDOR":
                switch (recurso){
                    case "RECURSO1":
                        return new Recur1.recursos_Builder().nombre("GrageasBertriBott").cantidad(600).Builder();
                    case "RECURSO2":
                        return new Recur2.recursos_Builder().nombre("CortezaDeArbolVital").cantidad(200).Builder();
                    case "RECURSO3":
                        return new Recur3.recursos_Builder().nombre("CromosDeOro").cantidad(20).Builder();
                }
            
            case "SLYTHRIN":
                switch (recurso){
                    case "RECURSO1":
                        return new Recur1.recursos_Builder().nombre("GrageasBertriBott").cantidad(600).Builder();
                    case "RECURSO2":
                        return new Recur2.recursos_Builder().nombre("CortezaDeArbolVital").cantidad(200).Builder();
                    case "RECURSO3":
                        return new Recur3.recursos_Builder().nombre("CromosDeOro").cantidad(20).Builder();
                }
            
            case "RAVENCLOW":
                switch (recurso){
                    case "RECURSO1":
                        return new Recur1.recursos_Builder().nombre("GrageasBertriBott").cantidad(600).Builder();
                    case "RECURSO2":
                        return new Recur2.recursos_Builder().nombre("CortezaDeArbolVital").cantidad(200).Builder();
                    case "RECURSO3":
                        return new Recur3.recursos_Builder().nombre("CromosDeOro").cantidad(20).Builder();
                }
        }
        return null;
    }
    
}
