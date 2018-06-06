/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Menu {
    
    

    private static Menu creador;

    private Menu() {
    }
    //Patron Singlenton
    public static Menu getInstance() {
        if (creador == null) {
            creador = new Menu();
        }

        return creador;
    }

    public void opciones() {
        System.out.println("\t\t********** KarichaLobato`sWorld **********");
        System.out.println("\t\t1. Elegir Razas");
        System.out.println("\t\t2. Entrenar Milicias");
        System.out.println("\t\t3. Curar Milicias");
        System.out.println("\t\t4. Construir Edificaciones");
        System.out.println("\t\t5. Crear milicias");
        System.out.println("\t\t6. Crear hechizos");
        System.out.println("\t\t7. Ver recursos disponibles");
        System.out.println("\t\t8. SALIR");
    }
    
    public void menuRazas(){
        int opcionRaza = 5;
        Scanner read = new Scanner(System.in);
        System.out.println("\t\\t********** KarichaLobato`sWorld **********");
        System.out.println("\t\t1. Gryffindor");
        System.out.println("\t\t2. Slytherin");
        System.out.println("\t\t3. Ravenclow");
        System.out.println("\t\t4. SALIR");
        
        while(opcionRaza!=4){
            try {
                opcionRaza = read.nextInt();
                switch (opcionRaza){
                    case 1:
                        System.out.println("Gryffindor...");
                        break;
                    case 2:
                        System.out.println("Slytherin...");
                        break;
                    case 3:
                        System.out.println("Ravenclow...");
                        break;
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
    }

    public  void mostrar() {
        int opcion = 9;
        Scanner leer = new Scanner(System.in);
        
        while (opcion != 8) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        menuRazas();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;

                    case 7:
                        
                        break;
                    case 8:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
                        break;

                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número ");
                leer.nextLine();
            }
        }
    }
}   

