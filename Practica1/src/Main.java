
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
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
        String nombreJugadorTraspaso;
        String equipoOrigen;
        String equipoDestino;
        Date fechaTraspaso = new Date();
        float importeClausulaTraspaso;
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
                    System.out.println("Introduce los datos del traspaso: ");
                    System.out.println("Nombre del judador: ");
                    nombreJugadorTraspaso = sc.nextLine();
                    System.out.println("Importe Clausula: ");
                    importeClausulaTraspaso = sc.nextFloat();
                    System.out.println("Nombre del equipo de origen: ");
                    equipoOrigen = sc.nextLine();
                    System.out.println("Nombre del equipo de destino: ");
                    equipoDestino = sc.nextLine();
                    
                    Traspaso t = new Traspaso();
                    
                    t.setNombreJugador(nombreJugadorTraspaso);
                    t.setFecha(fechaTraspaso);
                    t.setImporteClausula(importeClausulaTraspaso);
                    t.setOrigen(equipoOrigen);
                    t.setDestino(equipoDestino);
                    
                    break;
                case 4:
                    gl.mostrarEquiposBasico();
                    break;

                case 5:
                    gl.mostrarEquiposCompletos();
                    break;
                case 6:
                    gl.mostrarTraspasos();
                    break;
                case 7:
                    EscribeFichero(gl);
                    System.exit(0);
                    break;
                    
            }
        } while (opcion != -1);

        
    }

    public static void EscribeFichero(GestorLiga gl) {

        FileWriter fichero = null;
        PrintWriter pw = null;
        ArrayList<Equipo> equipos = gl.getEquiposBasico();
        ArrayList<Traspaso> traspasos = gl.getTraspasos();
        
        try {
            fichero = new FileWriter("c:/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < equipos.size(); i++) {
                pw.println(equipos.get(i).getNombre());
                pw.println(equipos.get(i).getImporteCaja());
                pw.println(equipos.get(i).getNumAbonados());
                pw.println("_____________________________");

                for (int j = 0; j < equipos.get(i).getPlantilla().size(); j++) {
                    pw.println(equipos.get(i).getPlantilla().get(j).getNombre());
                }
                pw.println("_____________________________");
                
                pw.println(traspasos.get(i).getNombreJugador());
                pw.println(traspasos.get(i).getFecha());
                pw.println(traspasos.get(i).getImporteClausula());
                pw.println(traspasos.get(i).getOrigen());
                pw.println(traspasos.get(i).getDestino());
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
           // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
