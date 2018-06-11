/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import RAZAS.raza;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Menu {

    private static Menu creador;

    private Menu() {
    }

    /**
     * Para acceso global al menú. Se crea solo una instancia.
     * @return 
     */
    public static Menu getInstance() {
        if (creador == null) {
            creador = new Menu();
        }
        return creador;
    }

    public void opcionesiniciales() {
        Fase fase = new Fase();
        
        fase.jugadores.add(new Jugador());
        fase.jugadores.add(new Jugador());
        System.out.println("Ingrese nombre Jugador 1");
        Scanner leer = new Scanner(System.in);
        fase.jugadores.get(0).setNombre(leer.nextLine());
        System.out.println("Ingrese nombre Jugador 2");
        fase.jugadores.get(1).setNombre(leer.nextLine());
        System.out.println("Elegir raza Jugador 1");
        while (fase.jugadores.get(0).getRaza() == null) {
            fase.jugadores.get(0).setRaza(getraza());
        }

        System.out.println("Elegir raza Jugador 2");
        while (fase.jugadores.get(1).getRaza() == null) {
            fase.jugadores.get(1).setRaza(getraza());
            
        }
             fase.jugadores.get(0).edificios.add(fase.jugadores.get(0).getRaza().
                construir("CENTROMANDO"));
        fase.jugadores.get(1).edificios.add(fase.jugadores.get(1).getRaza().
                construir("CENTROMANDO"));
           Random o = new Random();
        int n = o.nextInt(2);
        int y;
        if (n == 0) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println(fase.jugadores.get(0).edificios.size());
        
        System.out.println("A JUGAR");
       
            System.out.println("#########################################");
            System.out.println("Empieza fase "+fase.numfase);
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("Turno de jugador"+(n+1));
            menufasefuc(fase.jugadores.get(n));
             System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("Turno de jugador"+(y+1));
            menufasefuc(fase.jugadores.get(y));
            fase.numfase++;
        
        

    }
     public void menufasefuc(Jugador jugador) {
        int opcion =5;
        boolean bandera=true;
        Scanner leer = new Scanner(System.in);
        while (bandera==true) {
            opcionesMenuPrincipal();
            try {
                System.out.print("\tElección: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Aun no agrego el metodo que va aqui");
                        break;
                    case 2:
                            System.out.println("Aun no agrego el metodo que va aqui");
                        break;
                    case 3:
                        bandera=false;
                   
                        break;
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }

    public raza getraza() {
        int opcion = 5;
        Scanner leer = new Scanner(System.in);
        while (opcion != 4) {
            menuraza();
            try {
                System.out.print("\tElección: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                       return razaFactory.getRaza("GRYFFINDOR");
                      
                    case 2:
                        return razaFactory.getRaza("RAVENCLOW");
                    case 3:
                      return razaFactory.getRaza("SLYTHRIN");
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }
return null;
    }

    

    public void menuraza() {
        System.out.println("Precione 1 para GRYFFINDOR");
        System.out.println("Precione 2 para RAENCLOW");
        System.out.println("Precione 3 para SLYTHERIN");

    }

  public void opcionesMenuPrincipal() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Construir Edificios.");
        System.out.println("2. Ver dificios disponibles para acciones.");
        System.out.println("3. Pasar de turno.");
    }
    
   
}