/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Milicias.milicia;
import Milicias.miliciasFactory;
import java.util.InputMismatchException;
import java.util.Scanner;
import RAZAS.raza;
import RAZAS.razaFactory;
import Vehiculos.vehiculo;
import Vehiculos.vehiculoFactory;
import java.util.Random;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Motor {
    
    private static Motor creador;

    private Motor() {
    }
    //Patron Singlenton
    public static Motor getInstance() {
        if (creador == null) {
            creador = new Motor();
        }

        return creador;
    }

    public void opcionesDeJugada() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("| \t******* KarichaLobato`sWorld *******               |");
        System.out.println("| \t\t1. Construir Edificios                     |");
        System.out.println("| \t\t2. Ver edificios disponibles para acciones |");
        System.out.println("| \t\t3. Contruir Milicias                       |");
        System.out.println("| \t\t4. Entrenar Milicias                       |");
        System.out.println("| \t\t5. Curar Milicias                          |");
        System.out.println("| \t\t6. Crear vehiculos                         |");
        System.out.println("| \t\t7. Ver recursos disponibles                |");
        System.out.println("| \t\t8. Pasar de turno                          |");
        System.out.println("| \t\t9. SALIR                                   |");
        System.out.println("-----------------------------------------------------------");
    }
    
    public void menuRazas(){
        System.out.println("---------------------------------------");
        System.out.println("******** KarichaLobato`sWorld ********");
        System.out.println("| \t\t1. Gryffindor          |");
        System.out.println("| \t\t2. Slytherin           |");
        System.out.println("| \t\t3. Ravenclow           |");
        System.out.println("---------------------------------------");
    }
    
    public void Bienvenida(){
       System.out.println("*********************************************************************************");
       System.out.println("\t\t-------- KarichaLobato`sWorld -------- ");
       System.out.println("\nBienvenidos a este mundo en el cual podrás experimentar"
               + "\nla magía de poder jugar en contra de las  otras casas, que siempre has querido"
               + "\ntenfrentarte en las peliculas de Harry Potter,pero conotra versión de la saga.");
       System.out.println("*********************************************************************************");
    }
    
    public void menuEdificios(){
        System.out.println("---------------------------------------------------------------");   
        System.out.println("| \t¡AQUI PUEDES ELEGIR EL EDIFICIO QUE DESEES CONSTRUIR! |");
        System.out.println("| \t\t1. Centro de entrenamiento                    |");
        System.out.println("| \t\t2. Centro de curamiento                       |");
        System.out.println("| \t\t3. Construir vehiculo                         |");
        System.out.println("| \t\t4. Construir milicias                         |");
        System.out.println("---------------------------------------------------------------");
    }
    
    public void menuMilicias(){
        System.out.println("---------------------------------------------------------------");   
        System.out.println("| \t¡AQUI PUEDES ELEGIR LA MILICIA QUE TE CONVEGA SEGUN TU CASA! |");
        System.out.println("| \t\t1. Griffindor - Escuadrones                    |");
        System.out.println("| \t\t2. Griffindor - Especialistas                  |");
        System.out.println("| \t\t3. Ravenclow - Escuadrones                     |");
        System.out.println("| \t\t4. Ravenclow - Especialistas                   |");
        System.out.println("| \t\t5. Slytherin - Escuadrones                     |");
        System.out.println("| \t\t6. Slytherin - Especialistas                   |");
        System.out.println("---------------------------------------------------------------");
    }
    
    public void Milicias(){
        System.out.println("----------------------------------------------------------");
        System.out.println("| \t¡DE ESTE TIPO PUEDEN SER TUS MILICIAS!           |");
        System.out.println("| \t\t1. Escuadrones                           |");
        System.out.println("| \t\t2. Especialistas                         |");
        System.out.println("----------------------------------------------------------");
    }
    
    public void menuVehiculos(){
        System.out.println("----------------------------------------------------------");
        System.out.println("| \t¡AQUI PUEDES ELEGIR EL VEHICULO QUE DESEES! |");
        System.out.println("| \t\t1. Griffindor - Escoba          |");
        System.out.println("| \t\t1. Slytherin - Thestral         |");
        System.out.println("| \t\t1. Ravenclow - Buckbeak          |");
        System.out.println("----------------------------------------------------------");
    }
    
    public raza getraza(){
        int opcionRaza = 4;
        Scanner read = new Scanner(System.in);
        
        while(opcionRaza!=3){
            menuRazas();
        
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionRaza = read.nextInt();
                switch (opcionRaza){
                    case 1:
                        return razaFactory.getRaza("GRYFFINDOR");
                        
                    case 2:
                        return razaFactory.getRaza("RAVENCLOW");
                        
                    case 3:
                        return razaFactory.getRaza("SLYTHRIN");
                        
                    default:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
                        break;
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número de las opciones del menú ");
                read.nextLine();
            }
            
        }
        return null;
    }
    
    public milicia getmilicia(){
        int opcionMilicia = 7;
        Scanner read = new Scanner(System.in);
        
        while(opcionMilicia!=6){
            menuMilicias();
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionMilicia = read.nextInt();
                switch (opcionMilicia){
                    case 1:
                        return miliciasFactory.getMilicia("GRIFFINDOR","ESCUADRONES");
                    
                    case 2:
                        return miliciasFactory.getMilicia("GRIFFINDOR","ESPECIALISTAS");
                        
                    case 3:
                        return miliciasFactory.getMilicia("RAVENCLOW","ESCUADRONES");
                        
                    case 4:
                        return miliciasFactory.getMilicia("RAVENCLOW","ESPECIALISTAS");
                        
                    case 5:
                        return miliciasFactory.getMilicia("SLYTHRIN","ESCUADRONES");
                        
                    case 6:
                        return miliciasFactory.getMilicia("SLYTHRIN","ESPECIALISTAS");
                        
                    default:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
                        break;
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número de las opciones del menú");
                read.nextLine();
            }
            
        }
        return null;
    }
    
    public vehiculo getvehiculo(){
        int opcionVehiculo = 4;
        Scanner read = new Scanner(System.in);
        
        while(opcionVehiculo!=3){
            menuVehiculos();       
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionVehiculo = read.nextInt();
                switch (opcionVehiculo){
                    case 1:
                        return vehiculoFactory.getVehiculo("VEHICULO_GRIFFINDOR");
                        
                    case 2:
                        return vehiculoFactory.getVehiculo("VEHICULO_SLYTHERIN");
                        
                    case 3:
                        return vehiculoFactory.getVehiculo("VEHICULO_RAVENCLOW");
                        
                    default:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
                        break;
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número de las opciones del menú ");
                read.nextLine();
            }
            
        }
        return null;
    }
    
    public void menuFases(Jugador jugador) {
        int opcion =5;
        Scanner read = new Scanner(System.in);
        while (opcion!=4) {
            opcionesDeJugada();
            try {
                System.out.print("\tOpcion a elegir: ");
                opcion = read.nextInt();
                switch (opcion) {
                    case 1:
                        menuEdificios();
                        break;
                    case 2:
                        System.out.println("Aun no agrego el metodo que va aqui");
                        break;
                    case 3:
                        Milicias();
                   
                        break;
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número de las opciones del menú.");
                read.nextLine();
            }
        }

    }
    
    public  void mostrar() {
        Fase fase = new Fase();
        String jugador1,jugador2;
        Bienvenida();
        fase.jugadores.add(new Jugador());
        fase.jugadores.add(new Jugador());
        System.out.println("\nIngrese nombre del primer Jugador: ");
        Scanner leer = new Scanner(System.in);
        jugador1 = leer.nextLine();
        fase.jugadores.get(0).setNombre(jugador1);
        System.out.println("Ingrese nombre del segundo Jugador: ");
        jugador2 = leer.nextLine();
        fase.jugadores.get(1).setNombre(jugador2);
        System.out.println("Elegi tu raza: " + jugador1);
        while (fase.jugadores.get(0).getRaza() == null) {
            fase.jugadores.get(0).setRaza(getraza());
        }

        System.out.println("Elegi tu raza: " + jugador2);
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
        
        System.out.println("***************A JUGAR***************");
       
            System.out.println("Inicia Fase "+fase.numfase);
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(n+1));
            menuFases(fase.jugadores.get(n));
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(y+1));
            menuFases(fase.jugadores.get(y));
            fase.numfase++;
        
    }
    
}   

