/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.InputMismatchException;
import java.util.Scanner;
import RAZAS.raza;
import RAZAS.razaFactory;
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
        System.out.println("\t\t********** KarichaLobato`sWorld **********");
        System.out.println("\t\t1. Construir Edificios.");
        System.out.println("\t\t2. Ver dificios disponibles para acciones.");
        System.out.println("\t\t3. Crear milicias");
        System.out.println("\t\t4. Entrenar Milicias");
        System.out.println("\t\t5. Curar Milicias");
        System.out.println("\t\t6. Crear vehiculos");
        System.out.println("\t\t7. Ver recursos disponibles");
        System.out.println("\t\t8. Pasar de turno.");
        System.out.println("\t\t9. SALIR");
    }
    
    public void menuRazas(){
        System.out.println("********** KarichaLobato`sWorld **********");
        System.out.println("\t\t1. Gryffindor");
        System.out.println("\t\t2. Slytherin");
        System.out.println("\t\t3. Ravenclow");
    }
    
    public void Bienvenida(){
       System.out.println("********** KarichaLobato`sWorld **********");
       System.out.println("\nBienvenidos a este mundo en el cual podrás experimentar"
               + "\nla magía de poder jugar en contra de las  otras casas, que siempre has querido"
               + "\ntenfrentarte en las peliculas de Harry Potter,pero conotra versión de la saga.");
    }
    
    public raza getraza(){
        int opcionRaza = 5;
        Scanner read = new Scanner(System.in);
        
        while(opcionRaza!=4){
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
                        
                    case 4:
                        System.out.println("*************SALIENDO*************");
                    default:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
                        break;
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número ");
                read.nextLine();
            }
        }
        return null;
    }
    
    
    public void menuFases(Jugador jugador) {
        int opcion =5;
        boolean bandera=true;
        Scanner leer = new Scanner(System.in);
        while (bandera==true) {
            opcionesDeJugada();
            try {
                System.out.print("\tOpcion a elegir: ");
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
    
    public  void mostrar() {
        Fase fase = new Fase();
        Bienvenida();
        fase.jugadores.add(new Jugador());
        fase.jugadores.add(new Jugador());
        System.out.println("\nIngrese nombre del primer Jugador: ");
        Scanner leer = new Scanner(System.in);
        fase.jugadores.get(0).setNombre(leer.nextLine());
        System.out.println("Ingrese nombre del segundo Jugador: ");
        fase.jugadores.get(1).setNombre(leer.nextLine());
        System.out.println("Elegi tu raza Jugador 1");
        while (fase.jugadores.get(0).getRaza() == null) {
            fase.jugadores.get(0).setRaza(getraza());
        }

        System.out.println("Elegi tu raza Jugador 2");
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

