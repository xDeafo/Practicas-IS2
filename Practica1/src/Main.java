
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ventura
 */
public class Main {

    public static void main(String[] args) {
        int opcion;
        String nombreEquipo;
        String nombreJugador;
        String demarcacion;
        String nombreEquipoJugador;
        float importeClausula;
        GestorLiga gl = new GestorLiga();
        float importeCaja;
        int numeroAbonados;
        Scanner sc = new Scanner(System.in); //Creación de un objeto Scanner


        System.out.println("Bienvenido a la Liga BBUV");

        do {
            System.out.println("Elige una opcion\n");
            System.out.println("1. Registrar un nuevo equipo");
            System.out.println("2. Registrar un nuevo jugador");
            System.out.println("3. Registrar un traspaso de jugador");
            System.out.println("4. Listar en pantalla los datos básicos de los equipos registrados");
            System.out.println("5. Listar los jugadores de cada equipo");
            System.out.println("6. Mostrar los traspasos realizados");
            System.out.println("7. Salir del programa");
            
            opcion = sc.nextInt();
            
            switch (opcion) {

                case 1:
                    System.out.println("Introduce los datos del equipo: ");
                    System.out.println("Nombre del equipo: ");
                    nombreEquipo = sc.nextLine();
                    System.out.println("Importe caja: ");
                    importeCaja = sc.nextFloat();
                    System.out.println("Nº abonados: ");
                    numeroAbonados = sc.nextInt();
                    
                    Equipo e = new Equipo(nombreEquipo, importeCaja, numeroAbonados);
                    gl.añadirEquipo(e);
                    
                    break;

                case 2:
                    System.out.println("Introduce los datos del jugador: ");
                    System.out.println("Nombre del judador: ");
                    nombreJugador = sc.nextLine();
                    System.out.println("Demarcacion: ");
                    demarcacion = sc.nextLine();
                    System.out.println("Importe Clausula: ");
                    importeClausula = sc.nextFloat();
                    System.out.println("Nombre del equipo al que pertenece: ");
                    nombreEquipoJugador = sc.nextLine();
                    
                    Jugador j = new Jugador();
                    
                    j.setNombre(nombreJugador);
                    j.setImporteClausula(importeClausula);
                    j.setDemarcacion(demarcacion);
                    
                    gl.addJugadorEquipo(j, nombreEquipoJugador);
                    
                    
                    break;

                case 3:

                    break;
                case 4:
                        gl.mostrarEquiposBasico();
                    break;

                case 5:
                        gl.mostrarEquiposCompletos();
                    break;
                case 6:

                    break;
            }
        } while (opcion != 7);
        
        System.exit(0);
    }
}
