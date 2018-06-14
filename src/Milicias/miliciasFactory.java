/*
 * Factory de milicias
 */
package Milicias;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class miliciasFactory {
    public static milicia getMilicia(String opcion,String miliciA){
        System.out.println(opcion);
        switch(opcion){
            case "GRYFFINDOR":
                switch (miliciA){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaBuilder().nombre("La orden del fenix").ataque(10).vida(100).Builder();
                    case "ESPECIALISTAS":
                        return new Especialistas.miliciaBuilder().nombre("Fenix").ataque(20).vida(50).Builder();
                   
                }
            
            case "SLYTHRIN":
                switch (miliciA){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaBuilder().nombre("Mortifagos").ataque(10).vida(100).Builder();
                    case "ESPECIALISTAS":
                        return new Especialistas.miliciaBuilder().nombre("Basilisco").ataque(20).vida(50) .Builder();
                    
                }
            
            case "RAVENCLOW":
                switch (miliciA){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaBuilder().nombre("Los guerreros Dumbledore").ataque(10).vida(100).Builder();
                    case "ESPECIALISTAS":
                        return new Especialistas.miliciaBuilder().nombre("Eagle").ataque(20).vida(50).Builder();
                    
                }
        }
        return null;
    }
}

