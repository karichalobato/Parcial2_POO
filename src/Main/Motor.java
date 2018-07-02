/*
 * La clase Motor es la que se encarga de controlar practicamente todo el juego y esta usando todas las demás clases
creadas con AbstractFactory y Builder.
 */
package Main;

import Edificios.edificio;
import Edificios.edificioFactory;
import Milicias.milicia;
import Milicias.miliciasFactory;
import java.util.InputMismatchException;
import java.util.Scanner;
import RAZAS.raza;
import RAZAS.razaFactory;
import Recursos.recursos;
import Recursos.recursosFactory;
import Vehiculos.vehiculo;
import Vehiculos.vehiculoFactory;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Motor {
    
    private static Motor creador;
    Fase fase = new Fase();
    String jugador1,jugador2;
    int sanacion = 100,ataque = 30;  
    ArrayList<edificio> edificioRazaGryffindor = new ArrayList<>(),edificioRazaSlytherin = new ArrayList<>(),edificioRazaRavenclow = new ArrayList<>();
    
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
        System.out.println("| \t\t3. Entrenar Milicias                       |");
        System.out.println("| \t\t4. Sanar Milicias                          |");
        System.out.println("| \t\t5. Crear vehiculo                          |");
        System.out.println("| \t\t6. Ver recursos disponibles                |");
        System.out.println("| \t\t7. Atacar edificios                        |");
        System.out.println("| \t\t8. Pasar de turno                          |");
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
    
    public void menuCurarMilicias(){
        System.out.println("---------------------------------------------------------------");   
        System.out.println("| \t¡QUE MILICIAS QUIERES CURAR SEGUN TU RAZA! |");
        System.out.println("| \t\t1. Griffindor - Escuadrones                    |");
        System.out.println("| \t\t2. Griffindor - Especialistas                  |");
        System.out.println("| \t\t3. Slytherin - Escuadrones                     |");
        System.out.println("| \t\t4. Slytherin - Especialistas                   |");
        System.out.println("| \t\t5. Ravenclow - Escuadrones                     |");
        System.out.println("| \t\t6. Ravenclow - Especialistas                   |");
        System.out.println("---------------------------------------------------------------");
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
        System.out.println("| \t\t2. Centro de curación                         |");
        System.out.println("| \t\t3. Construir milicias                         |");
        System.out.println("| \t\t4. Construir vehiculos                        |");
        System.out.println("---------------------------------------------------------------");
    }
    
    public void menuMilicias(){
        System.out.println("---------------------------------------------------------------");   
        System.out.println("| ¡AQUI PUEDES ELEGIR LA MILICIA QUE TE CONVEGA SEGUN TU CASA! |");
        System.out.println("| \t\t1. Griffindor - Escuadrones                    |");
        System.out.println("| \t\t2. Griffindor - Especialistas                  |");
        System.out.println("| \t\t3. Slytherin - Escuadrones                     |");
        System.out.println("| \t\t4. Slytherin - Especialistas                   |");
        System.out.println("| \t\t5. Ravenclow - Escuadrones                     |");
        System.out.println("| \t\t6. Ravenclow - Especialistas                   |");
        System.out.println("---------------------------------------------------------------");
    }
    
    public void menuRecursos(){
        System.out.println("---------------------------------------------------------------");   
        System.out.println("| ¡AQUI PUEDES ELEGIR TUS RECURSOS SEGUN TU CASA! |");
        System.out.println("| \t\t1. Griffindor - Recurso 1                      |");
        System.out.println("| \t\t2. Griffindor - Recurso 2                      |");
        System.out.println("| \t\t3. Griffindor - Recurso 3                      |");
        System.out.println("| \t\t4. Slytherin -  Recurso 1                      |");
        System.out.println("| \t\t5. Slytherin -  Recurso 2                      |");
        System.out.println("| \t\t6. Slytherin -  Recurso 3                      |");
        System.out.println("| \t\t7. Ravenclow -  Recurso 1                      |");
        System.out.println("| \t\t8. Ravenclow -  Recurso 2                      |");
        System.out.println("| \t\t9. Ravenclow -  Recurso 3                      |");
        System.out.println("---------------------------------------------------------------");
    }
    
    public void menuVehiculos(){
        System.out.println("----------------------------------------------------------");
        System.out.println("| \t¡AQUI PUEDES ELEGIR EL VEHICULO QUE DESEES! |");
        System.out.println("| \t\t1. Griffindor - Escoba          |");
        System.out.println("| \t\t2. Slytherin - Thestral         |");
        System.out.println("| \t\t3. Ravenclow - Buckbeak         |");
        System.out.println("----------------------------------------------------------");
    }
    
    public void menuEdificiosRazas(){
        System.out.println("----------------------------------------------------------");
        System.out.println("| \t¡AQUI PUEDES ELEGIR EL EDIFICIO QUE DESEES! |");
        System.out.println("| \t\t1. Gryffindor - Centro de entrenamiento   |");
        System.out.println("| \t\t2. Gryffindor - Centro de curación        |");
        System.out.println("| \t\t3. Slytherin -  Centro de entrenamiento   |");
        System.out.println("| \t\t4. Slytherin -  Centro de curación        |");
        System.out.println("| \t\t5. Ravenclow -  Centro de entrenamiento   |");
        System.out.println("| \t\t6. Ravenclow -  Centro de curación        |");
        System.out.println("----------------------------------------------------------");
    }
    
    
    public void getraza(Jugador jugadores){
        int opcionRaza = 4;
        Scanner read = new Scanner(System.in);
        boolean flag = true;
        while(flag == true){
            menuRazas();
        
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionRaza = read.nextInt();
                switch (opcionRaza){
                    case 1:
                        flag = false;
                         jugadores.setRaza(razaFactory.getRaza("GRYFFINDOR"));
                        break;
                    case 2:
                        flag = false;
                        jugadores.setRaza(razaFactory.getRaza("SLYTHRIN"));
                        break;
                        
                        
                    case 3:
                        flag = false;
                         jugadores.setRaza(razaFactory.getRaza("RAVENCLOW"));
                         break;
                        
                     
                    
                       
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número de las opciones del menú ");
                read.nextLine();
            }
            
        }
   
    }
    
    public milicia getMilicia(Jugador jugadores){
        int opcionMilicia = 7;
        Scanner read = new Scanner(System.in);
        
        while(opcionMilicia!=6){
            menuMilicias();
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionMilicia = read.nextInt();
                switch (opcionMilicia){
                    case 1:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESCUADRONES");
                        
                    case 2:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESPECIALISTAS");
                        
                    case 3:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESCUADRONES");
                        
                    case 4:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESPECIALISTAS");
                        
                    case 5:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESCUADRONES");
                        
                    case 6:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESPECIALISTAS");
                        
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
    
    public milicia getMiliciaCurada(Jugador jugadores){
        int opcionMilicia = 7;
        Scanner read = new Scanner(System.in);
        
        while(opcionMilicia!=6){
            menuCurarMilicias();
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionMilicia = read.nextInt();
                switch (opcionMilicia){
                    case 1:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESCUADRONES");
                        
                    case 2:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESPECIALISTAS");
                        
                    case 3:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESCUADRONES");
                        
                    case 4:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESPECIALISTAS");
                        
                    case 5:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESCUADRONES");
                        
                    case 6:
                        return miliciasFactory.getMilicia(jugadores.getRaza().getNombre(),"ESPECIALISTAS");
                        
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
      
    public vehiculo getVehiculo(){
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
    

    public void getEdificio2(Jugador jugdores){
        int opcionEdificioRaza = 7;
        Scanner read = new Scanner(System.in);
        boolean bandera = true;
        while(bandera == true){
            menuEdificiosRazas();      
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionEdificioRaza = read.nextInt();
                switch (opcionEdificioRaza){
                    case 1:
                        compra(jugdores, "SALAMENESTERES");
                      
                        bandera = false;
                        break;
                        
                    case 2:
                        compra(jugdores, "SALACOMUNGRYFFINDOR");
                      
                        bandera = false;
                        break;
                    case 3:
                        compra(jugdores, "MAZMORRASSLYTHERIN");
                       
                        bandera = false;
                        break;
                        
                    case 4:
                        compra(jugdores, "SALACOMUNSLYTHERIN");
                       
                        bandera = false;
                        break;
                        
                    case 5:
                        compra(jugdores, "TORRERAVENCLOW");
                        
                        bandera = false;
                        break;
                        
                    case 6:
                        compra(jugdores, "SALACOMUNRAVENCLOW");
                      
                        bandera = false;
                        break;
                        
                    default:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
                        break;
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número de las opciones del menú ");
                read.nextLine();
            }
            
        }

    }
    
    public void MostrarEdi(Jugador jugadores){
         for (int i = 0; i < jugadores.edificios.size(); i++) {
            System.out.println((i+1) + "--" + jugadores.edificios.get(i).getNombre() + "" + jugadores.getRaza().getNombre()
                    +  " Vida: "
                    + jugadores.edificios.get(i).getVida());

        }
        System.out.println("");

    }
    
   
    
        
    public void menuFases(Jugador jugadores,Jugador jugador2) {
        int opcion =8;
        boolean bandera = true;
        Scanner read = new Scanner(System.in);
        while (bandera == true) {
            opcionesDeJugada();
            try {
                System.out.print("\tOpcion a elegir: ");
                opcion = read.nextInt();
                switch (opcion) {
                    case 1:
                        getEdificio2(jugadores);
                       
                        break;
                    case 2:
                        MostrarEdi(jugadores);
                    
                        break;
                    case 3:
                        jugadores.milicias.add(getMilicia(jugadores));
                        System.out.println(jugadores.milicias.get(0).getNombre()+ " "+ jugadores.milicias.get(0).getAtaque());
                       
                        break;
                    case 4:
                        sanarMilicias(jugadores);
                        
                        break;
                    case 5:
                        jugadores.vehiculos.add(getVehiculo());
                        System.out.println("El nombre de tu vehiculo es: "+jugadores.vehiculos.get(0).getNombre()+ "\nDe ataque tiene: "+jugadores.vehiculos.get(0).getAtaque()+ "\ny de vida tiene: "+jugadores.vehiculos.get(0).getVida());
                        
                        break;
                    case 6:
                        RecursosActuales(jugadores);
                       
                        break;
                    case 7:
                        atacarcon(jugadores, jugador2);
                      
                        break;
                    case 8:
                        
                        System.out.println("TURNO TERMINADO####");
                        bandera = false;
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
       public void verificarataque(Fase fase) {
        for (int i = 0; i < fase.jugadores.size(); i++) { 
            for (int j = 0; j < fase.jugadores.get(i).edificios.size(); j++) {
                if (fase.jugadores.get(i).edificios.get(j).vehiculosa == null) {
                        fase.jugadores.get(i).edificios.get(j).vehiculosa = new ArrayList<>();
                    }
                if (fase.jugadores.get(i).edificios.get(j).miliciasa == null) {
                        fase.jugadores.get(i).edificios.get(j).miliciasa = new ArrayList<>();
                    }
                System.out.println(fase.jugadores.get(i).edificios.get(j).miliciasa.size());
               
                    if (fase.jugadores.get(i).edificios.get(j).miliciasa.size() > 0
                            || fase.jugadores.get(i).edificios.get(j).vehiculosa.size() > 0) {
                    
                        for (int h = 0; h <fase.jugadores.get(i).edificios.get(j).miliciasa.size(); h++) {
                            fase.jugadores.get(i).edificios.get(j).setVida(fase.jugadores.get(i).edificios.get(j).getVida()
                                    - fase.jugadores.get(i).edificios.get(j).miliciasa.get(h).getAtaque());
                            if(fase.jugadores.get(i).edificios.get(j).getVida()<=0){
                                fase.jugadores.get(i).edificios.get(j).miliciasa.remove(h);
                                fase.jugadores.get(i).edificios.remove(j);
                            }
                        }
                        for (int h = 0; h < fase.jugadores.get(i).edificios.get(j).vehiculosa.size(); h++) {
                            fase.jugadores.get(i).edificios.get(j).setVida(fase.jugadores.get(i).edificios.get(j).getVida()
                                    - fase.jugadores.get(i).edificios.get(j).vehiculosa.get(h).getAtaque());
                            if(fase.jugadores.get(i).edificios.get(j).getVida()<=0){
                                fase.jugadores.get(i).edificios.get(j).vehiculosa.remove(h);
                                fase.jugadores.get(i).edificios.remove(j);
                            }
                        }
                    }
                
            }

        }
    }
    
    public void atacarcon(Jugador jugador1, Jugador jugador2) {
        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag == true) {
            System.out.println("Con que quieres atacar?");
            System.out.println("1-Milicias");
            System.out.println("2-Vehiculos");
            try {
                System.out.print("\tElección: ");
                System.out.println("");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:

                        atacarconmilicia(jugador1, jugador2);
                        flag = false;
                        break;
                    case 2:
                        atacarconVehiculos(jugador1, jugador2);
                        flag = false;
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

    public void atacarconVehiculos(Jugador jugador1, Jugador jugador2) {
        if (jugador1.vehiculos.size() >= 1) {
            System.out.println("Tus milicias disponibles son ");
              if(jugador1.vehiculos==null){
                jugador1.vehiculos=new ArrayList<>();
            }
            for (int i = 0; i < jugador1.vehiculos.size(); i++) {
                System.out.println((i + 1) + "--" + jugador1.vehiculos.get(i).getNombre() + "" + jugador1.getRaza().getNombre());
            }
            System.out.println("@@@ ELIJA EL NUMERO DE MILICIA A USAR");
            int opcion;
            boolean flag = true;
            Scanner leer = new Scanner(System.in);
            while (flag == true) {

                try {

                    opcion = leer.nextInt();
                    if (opcion - 1 <= jugador1.vehiculos.size()) {
                        if (opcion != 0) {
                            menudeataquev(jugador1, opcion - 1, jugador2);
                            flag = false;
                        } else {
                            System.err.println("Opción inválida. Intente de nuevo. ");
                        }

                    } else {
                        System.err.println("Opción inválida. Intente de nuevo. ");
                    }

                } catch (InputMismatchException e) {
                    System.err.println("Por favor, ingrese un número.");
                    leer.nextLine();
                }
            }
            System.out.println("");
        } else {
            System.out.println("No tienes tropas par atacar");
        }
    }

    public void menudeataquev(Jugador jugador1, int mili, Jugador jugador2) {
        System.out.println("@@@ ELIJA EL NUMERO DEL EDIFICIO A ATACAR");
        for (int i = 0; i < jugador2.edificios.size(); i++) {
            System.out.println((i + 1) + "--" + jugador2.edificios.get(i).getNombre() + "" + jugador2.getRaza().getNombre()
                    );

        }
        System.out.println("");
        int opcion2;
        boolean flag2 = true;
        Scanner leer2 = new Scanner(System.in);
        while (flag2 == true) {

            try {

                opcion2 = leer2.nextInt();
                if (opcion2 - 1 <= jugador1.vehiculos.size()) {
                    if (jugador2.edificios.get(opcion2 - 1).vehiculosa == null) {
                        jugador2.edificios.get(opcion2 - 1).vehiculosa = new ArrayList<>();
                    }
                    jugador2.edificios.get(opcion2 - 1).vehiculosa.add(jugador1.vehiculos.get(mili));
                    flag2 = false;

                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer2.nextLine();
            }
        }

    }

    public void atacarconmilicia(Jugador jugador1, Jugador jugador2) {
        if (jugador1.milicias.size() >= 1) {
            System.out.println("Tus milicias disponibles son ");
            if(jugador1.milicias==null){
                jugador1.milicias=new ArrayList<>();
            }
            for (int i = 0; i < jugador1.milicias.size(); i++) {
                System.out.println((i + 1) + "--" + jugador1.milicias.get(i).getNombre() + "" + jugador1.getRaza().getNombre());
            }
            System.out.println("@@@ ELIJA EL NUMERO DE MILICIA A USAR");
            int opcion;
            boolean flag = true;
            Scanner leer = new Scanner(System.in);
            while (flag == true) {

                try {

                    opcion = leer.nextInt();
                    if (opcion - 1 <= jugador1.milicias.size()) {
                        if (opcion != 0) {
                            menudeataque(jugador1, opcion - 1, jugador2);
                            flag = false;
                        } else {
                            System.err.println("Opción inválida. Intente de nuevo. ");
                        }

                    } else {
                        System.err.println("Opción inválida. Intente de nuevo. ");
                    }

                } catch (InputMismatchException e) {
                    System.err.println("Por favor, ingrese un número.");
                    leer.nextLine();
                }
            }
            System.out.println("");
        } else {
            System.out.println("No tienes tropas par atacar");
        }
    }

    public void menudeataque(Jugador jugador1, int mili, Jugador jugador2) {
        System.out.println("@@@ ELIJA EL NUMERO DEL EDIFICIO A ATACAR");
        for (int i = 0; i < jugador2.edificios.size(); i++) {
            System.out.println((i + 1) + "--" + jugador2.edificios.get(i).getNombre() + "" + jugador2.getRaza().getNombre()
                    + " Vida " + jugador2.edificios.get(i).getVida());

        }
        System.out.println("");
        int opcion2;
        boolean flag2 = true;
        Scanner leer2 = new Scanner(System.in);
        while (flag2 == true) {

            try {

                opcion2 = leer2.nextInt();
                if (opcion2 - 1 <= jugador1.milicias.size()) {
                    if (jugador2.edificios.get(opcion2 - 1).miliciasa == null) {
                        jugador2.edificios.get(opcion2 - 1).miliciasa = new ArrayList<>();
                    }

                    jugador2.edificios.get(opcion2 - 1).miliciasa.add(jugador1.milicias.get(mili));
                    flag2 = false;

                } else {
                    System.err.println("Opción inválida. Intente de nuevo. ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer2.nextLine();
            }
        }

    }
    
    public recursos getRecursos(Jugador jugadores, String recurso){
        return recursosFactory.getRecursos(jugadores.getRaza().getNombre(),recurso);
    }
 
    public void setRecursos(Jugador jugadores){
            if(jugadores.edificios.get(0).recur_1==null){
            jugadores.edificios.get(0).recur_1=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_2==null){
            jugadores.edificios.get(0).recur_2=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_3==null){
            jugadores.edificios.get(0).recur_3=new ArrayList<>();
        }
        jugadores.edificios.get(0).recur_1.add(getRecursos(jugadores,"RECURSO1"));
        jugadores.edificios.get(0).recur_2.add(getRecursos(jugadores,"RECURSO2"));
        jugadores.edificios.get(0).recur_3.add(getRecursos(jugadores,"RECURSO3"));
        
       
    }
    public void RecursosActuales(Jugador jugadores){
           if(jugadores.edificios==null){
            jugadores.edificios=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_1==null){
            jugadores.edificios.get(0).recur_1=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_2==null){
            jugadores.edificios.get(0).recur_2=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_3==null){
            jugadores.edificios.get(0).recur_3=new ArrayList<>();
        }
  int acum1 = 0;
        int acum2 = 0;
        int acum3 = 0;
        for (int i = 0; i < jugadores.edificios.get(0).recur_1.size(); i++) {
            acum1 = acum1 + jugadores.edificios.get(0).recur_1.get(i).getCantidad();

        }
        for (int i = 0; i < jugadores.edificios.get(0).recur_2.size(); i++) {
            acum2 = acum2 + jugadores.edificios.get(0).recur_2.get(i).getCantidad();

        }
        for (int i = 0; i < jugadores.edificios.get(0).recur_3.size(); i++) {
            acum3 = acum3 + jugadores.edificios.get(0).recur_3.get(i).getCantidad();

        }
        System.out.println(acum1 + " de " + recursosFactory.getRecursos(jugadores.getRaza().getNombre(),"RECURSO1").getNombre());
        System.out.println(acum2 + " de " + recursosFactory.getRecursos(jugadores.getRaza().getNombre(),"RECURSO2").getNombre());
        System.out.println(acum3 + " de " + recursosFactory.getRecursos(jugadores.getRaza().getNombre(),"RECURSO3").getNombre());
       
    }
    
    public void sanarMilicias(Jugador jugadores){
        fase.milicias.add(getMiliciaCurada(jugadores));
        if (fase.milicias.get(0).getVida() == 0){
            System.out.println(fase.milicias.get(0).getVida()+ sanacion);
            System.out.println("Tu milicia ha sido sanada!!!!!");
        }
        else{
            System.out.println("¡La vida de tus tropas esta llena, aún puedes seguir usando tus tropas!");
        }
    }
       public void aumntarrecursos(Fase fase){
         for (int i = 0; i < fase.jugadores.size(); i++) {
             fase.jugadores.get(i).edificios.get(0).recur_1.get(0)
                     .setCantidad(fase.jugadores.get(i).edificios.get(0).recur_1.get(0).getCantidad()+300);
             fase.jugadores.get(i).edificios.get(0).recur_2.get(0)
                     .setCantidad(fase.jugadores.get(i).edificios.get(0).recur_2.get(0).getCantidad()+100);
             fase.jugadores.get(i).edificios.get(0).recur_3.get(0)
                     .setCantidad(fase.jugadores.get(i).edificios.get(0).recur_3.get(0).getCantidad()+70);
         }
    }
        public void compra(Jugador jugadores, String Edificio) {
        edificio temporal = edificioFactory.getEdificio(Edificio);
        if(jugadores.edificios==null){
            jugadores.edificios=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_1==null){
            jugadores.edificios.get(0).recur_1=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_2==null){
            jugadores.edificios.get(0).recur_2=new ArrayList<>();
        }
        if(jugadores.edificios.get(0).recur_3==null){
            jugadores.edificios.get(0).recur_3=new ArrayList<>();
        }
        int acum1 = 0;
        int acum2 = 0;
        int acum3 = 0;
        int temp1 = temporal.Precio1;
        int temp2 = temporal.Precio2;
        int temp3 = temporal.Precio3;
        for (int i = 0; i < jugadores.edificios.get(0).recur_1.size(); i++) {
            acum1 = acum1 + jugadores.edificios.get(0).recur_1.get(i).getCantidad();

        }
        for (int i = 0; i < jugadores.edificios.get(0).recur_2.size(); i++) {
            acum2 = acum2 + jugadores.edificios.get(0).recur_2.get(i).getCantidad();

        }
        for (int i = 0; i < jugadores.edificios.get(0).recur_3.size(); i++) {
            acum3 = acum3 + jugadores.edificios.get(0).recur_3.get(i).getCantidad();

        }
        if (temporal.Precio1 < acum1 && temporal.Precio2 < acum2 && temporal.Precio3 < acum3) {
            for (int i = 0; i < jugadores.edificios.get(0).recur_1.size(); i++) {
                acum1 = jugadores.edificios.get(0).recur_1.get(i).getCantidad();
                if (acum1 > temp1) {
                    jugadores.edificios.get(0).recur_1.get(i)
                            .setCantidad(jugadores.edificios.get(0).recur_1.get(i).getCantidad() - temp1);
                    break;
                } else {
                    acum1 = temp1 - acum1;
                    jugadores.edificios.get(0).recur_1.get(i)
                            .setCantidad(jugadores.edificios.get(0).recur_1.get(i).getCantidad() - temp1);
                }

            }
            for (int i = 0; i < jugadores.edificios.get(0).recur_2.size(); i++) {
                acum1 = jugadores.edificios.get(0).recur_2.get(i).getCantidad();
                if (acum2 > temp2) {
                    jugadores.edificios.get(0).recur_2.get(i)
                            .setCantidad(jugadores.edificios.get(0).recur_2.get(i).getCantidad() - temp2);
                    break;
                } else {
                    acum1 = temp2 - acum2;
                    jugadores.edificios.get(0).recur_2.get(i)
                            .setCantidad(jugadores.edificios.get(0).recur_2.get(i).getCantidad() - temp2);
                }

            }
            for (int i = 0; i < jugadores.edificios.get(0).recur_3.size(); i++) {
                acum1 = jugadores.edificios.get(0).recur_3.get(i).getCantidad();
                if (acum3 > temp3) {
                    jugadores.edificios.get(0).recur_3.get(i)
                            .setCantidad(jugadores.edificios.get(0).recur_3.get(i).getCantidad() - temp3);
                    break;
                } else {
                    acum3 = temp3 - acum3;
                    jugadores.edificios.get(0).recur_3.get(i)
                            .setCantidad(jugadores.edificios.get(0).recur_3.get(i).getCantidad() - temp3);
                }

            }

            jugadores.edificios.add(edificioFactory.getEdificio(Edificio));
            System.out.println("Se ha creado el edificio "+Edificio);
        } else {
            System.out.println("################################");
            System.out.println("###NO HAY RECURSOS SUFICIENTES###");
            System.out.println("#################################");
            System.out.println("");
        }
        temporal = null;
    }
        
     
    
    public  void mostrar() {       
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
            getraza(fase.jugadores.get(0));
            
            
        }

        System.out.println("Elegi tu raza: " + jugador2);
        while (fase.jugadores.get(1).getRaza() == null) {
            getraza(fase.jugadores.get(1));
            
        }
        fase.jugadores.get(0).edificios.add(fase.jugadores.get(0).getRaza().
                construir("CENTROMANDO"));
        fase.jugadores.get(1).edificios.add(fase.jugadores.get(1).getRaza().
                construir("CENTROMANDO"));
        setRecursos(fase.jugadores.get(0));
        setRecursos(fase.jugadores.get(1));
        
           Random rand = new Random();
        int aleatorio = rand.nextInt(2);
        int tur;
        if (aleatorio == 0) {
            tur = 1;
        } else {
            tur = 0;
        }
          System.out.println("***************A JUGAR***************");
        while(fase.jugadores.get(0).edificios.get(0).getVida()>0 && 
                fase.jugadores.get(1).edificios.get(0).getVida()>0){
           
          
            System.out.println("Inicia Fase "+fase.numfase);
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(aleatorio+1));
            menuFases(fase.jugadores.get(aleatorio),fase.jugadores.get(tur));
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(tur+1));
            menuFases(fase.jugadores.get(tur),fase.jugadores.get(aleatorio));
            aumntarrecursos(fase);
            verificarataque(fase);
            fase.numfase++; 
            
        
    }
        if(fase.jugadores.get(0).edificios.get(0).getVida()>0){
            System.out.println("Juego terminado ganador "+fase.jugadores.get(0).getNombre());
        }else{
              System.out.println("Juego terminado ganador "+fase.jugadores.get(1).getNombre());
        }
      
    }
}   

