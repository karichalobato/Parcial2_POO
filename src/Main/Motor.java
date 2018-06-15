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
                        return razaFactory.getRaza("SLYTHRIN");
                        
                    case 3:
                        return razaFactory.getRaza("RAVENCLOW");
                        
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
      
    public vehiculo getVehiculo(Jugador jugadores){
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
    
    public void getEdificio(Jugador jugdores){
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
                        edificioRazaGryffindor.add(edificioFactory.getEdificio("SALAMENESTERES"));
                        System.out.println("Se ha creado tu edificio de entrenamiento Gryffindor");
                        bandera = false;
                        break;
                        
                    case 2:
                        edificioRazaGryffindor.add(edificioFactory.getEdificio("SALACOMUNGRYFFINDOR"));
                        System.out.println("Se ha creado tu edificio de sanamiento Gryffindor");
                        bandera = false;
                        break;
                    case 3:
                        edificioRazaSlytherin.add(edificioFactory.getEdificio("MAZMORRASSLYTHERIN"));
                        System.out.println("Se ha creado tu edificio de entrenamiento Slytherin");
                        bandera = false;
                        break;
                        
                    case 4:
                        edificioRazaSlytherin.add(edificioFactory.getEdificio("SALACOMUNSLYTHERIN"));
                        System.out.println("Se ha creado tu edificio de sanamiento Slytherin");
                        bandera = false;
                        break;
                        
                    case 5:
                        edificioRazaRavenclow.add(edificioFactory.getEdificio("TORRERAVENCLOW"));
                        System.out.println("Se ha creado tu edificio entrenamiento de Ravenclow");
                        bandera = false;
                        break;
                        
                    case 6:
                        edificioRazaRavenclow.add(edificioFactory.getEdificio("SALACOMUNRAVENCLOW"));
                        System.out.println("Se ha creado tu edificio de sanamiento de Ravenclow");
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
        switch(jugadores.getRaza().getNombre()){
            case "GRYFFINDOR":
                for(edificio edi: edificioRazaGryffindor){
                    System.out.println(edi.getNombre());
                }
                break;
            case "SLYTHRIN":
                for(edificio edi: edificioRazaSlytherin){
                    System.out.println(edi.getNombre());
                }
                break;
            case "RAVENCLOW":
                for(edificio edi: edificioRazaRavenclow){
                    System.out.println(edi.getNombre());
                }
                break;     
        }

    }
    
    public void AtacarEdi(Jugador jugadores){
        
        switch(jugadores.getRaza().getNombre()){
            case "GRYFFINDOR":
                if(edificioRazaGryffindor.get(0).getVida()==100){
                    System.out.println("Te queda de vida: ");
                    System.out.println(edificioRazaGryffindor.get(0).getVida()-ataque + " Atacaste a: "+ edificioRazaGryffindor.get(0).getNombre());
                }
                else{
                    System.out.println("asas");
                }
                break;
            case "SLYTHRIN":
                if(edificioRazaSlytherin.get(0).getVida()==100){
                    System.out.println("Te queda de vida: ");
                    System.out.println(edificioRazaSlytherin.get(0).getVida()-ataque + " Atacaste a: "+edificioRazaSlytherin.get(0).getNombre());
                }
                else{
                    System.out.println("asas");
                }
                break;
            case "RAVENCLOW":
                if(edificioRazaRavenclow.get(0).getVida()==100){
                    System.out.println("Te queda de vida: ");
                    System.out.println(edificioRazaRavenclow.get(0).getVida()-ataque + " Atacaste a: "+edificioRazaRavenclow.get(0).getNombre());
                }
                else{
                    System.out.println("asas");
                }
                break;     
        }
    }
    
        
    public void menuFases(Jugador jugadores) {
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
                        getEdificio(jugadores);
                        bandera = false;
                        break;
                    case 2:
                        MostrarEdi(jugadores);
                        bandera = false;
                        break;
                    case 3:
                        fase.milicias.add(getMilicia(jugadores));
                        System.out.println(fase.milicias.get(0).getNombre()+ " "+ fase.milicias.get(0).getAtaque());
                        bandera = false;
                        break;
                    case 4:
                        sanarMilicias(jugadores);
                        bandera = false;
                        break;
                    case 5:
                        fase.vehiculos.add(getVehiculo(jugadores));
                        System.out.println("El nombre de tu vehiculo es: "+fase.vehiculos.get(0).getNombre()+ "\nDe ataque tiene: "+fase.vehiculos.get(0).getAtaque()+ "\ny de vida tiene: "+fase.vehiculos.get(0).getVida());
                        bandera = false;
                        break;
                    case 6:
                        RecursosActuales(jugadores);
                        bandera = false;
                        break;
                    case 7:
                        AtacarEdi(jugadores);
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
    
    public recursos getRecursos(Jugador jugadores, String recurso){
        return recursosFactory.getRecursos(jugadores.getRaza().getNombre(),recurso);
    }
 
    public void RecursosActuales(Jugador jugadores){
        System.out.println("RECURSO 1: "+getRecursos(jugadores, "RECURSO1").getCantidad());
        System.out.println("RECURSO 2: "+getRecursos(jugadores, "RECURSO2").getCantidad());
        System.out.println("RECURSO 3: "+getRecursos(jugadores, "RECURSO3").getCantidad());
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
           Random rand = new Random();
        int aleatorio = rand.nextInt(2);
        int tur;
        if (aleatorio == 0) {
            tur = 1;
        } else {
            tur = 0;
        }
        System.out.println(fase.jugadores.get(0).edificios.size());
        
        System.out.println("***************A JUGAR***************");
       
            System.out.println("Inicia Fase "+fase.numfase);
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(aleatorio+1));
            menuFases(fase.jugadores.get(aleatorio));
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(tur+1));
            menuFases(fase.jugadores.get(tur));
            fase.numfase++;
        
    }
    
}   

