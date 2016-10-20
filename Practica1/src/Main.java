
import Excepciones.DemarcacionException;
import Excepciones.EquipoException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
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
        float gastosFijos = 0;
        float gastosVariables = 0;
        GestorLiga gl = new GestorLiga();
        float importeCaja;
        int numeroAbonados;
        Scanner sc = new Scanner(System.in); //Creación de un objeto Scanner

        cargaInicialDeDatos(gl);

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
                    try {
                        System.out.println("Introduce los datos del equipo: ");
                        System.out.println("Nombre del equipo: ");
                        sc.nextLine();
                        nombreEquipo = sc.nextLine();
                        System.out.println("Importe caja: ");
                        importeCaja = sc.nextFloat();
                        System.out.println("Nº abonados: ");
                        numeroAbonados = sc.nextInt();

                        Equipo e = new Equipo(nombreEquipo, importeCaja, numeroAbonados, gastosFijos, gastosVariables);
                        gl.añadirEquipo(e);
                    } catch (InputMismatchException e) {
                        System.out.println("Has introducido una letra en lugar de un numero");
                        sc.nextLine();
                    } finally {
                        break;
                    }

                case 2:
                    try {
                        System.out.println("Introduce los datos del jugador: ");
                        System.out.println("Nombre del judador: ");
                        sc.nextLine();
                        nombreJugador = sc.nextLine();
                        System.out.println("Demarcacion (portero, defensa, medio o delantero): ");
                        demarcacion = sc.nextLine();
                        compruebaDemarcacion(demarcacion);
                        System.out.println("Importe Clausula: ");
                        importeClausula = sc.nextFloat();
                        System.out.println("Nombre del equipo al que pertenece: ");
                        sc.nextLine();
                        nombreEquipoJugador = sc.nextLine();

                        Jugador j = new Jugador(nombreJugador, demarcacion, importeClausula);

                        gl.addJugadorEquipo(j, nombreEquipoJugador);
                    } catch (InputMismatchException e) {
                        System.out.println("Has introducido una letra en lugar de un numero");
                        sc.nextLine();
                    } catch (EquipoException ex) {
                        System.out.println(ex.getMessage());
                    } catch (DemarcacionException dx) {
                        System.out.println(dx.getMessage());
                    } finally {
                        break;
                    }

                case 3:

                    try {
                        System.out.println("Introduce los datos del traspaso: ");
                        System.out.println("Nombre del judador: ");
                        sc.nextLine();
                        nombreJugadorTraspaso = sc.nextLine();
                        System.out.println("Importe Clausula: ");
                        importeClausulaTraspaso = sc.nextFloat();
                        System.out.println("Nombre del equipo de origen: ");
                        sc.nextLine();
                        equipoOrigen = sc.nextLine();
                        System.out.println("Nombre del equipo de destino: ");
                        equipoDestino = sc.nextLine();

                        Traspaso t = new Traspaso(nombreJugadorTraspaso, fechaTraspaso, importeClausulaTraspaso, equipoOrigen, equipoDestino);

                        if (gl.realizarTraspaso(equipoOrigen, equipoDestino, nombreJugadorTraspaso, importeClausulaTraspaso)) {
                            System.out.println("El traspaso se realizo con exito");
                            gl.añadirTraspaso(t);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Has introducido una letra en lugar de un numero");
                        sc.nextLine();
                    } finally {
                        break;
                    }

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
        File outputFile = null;
        FileWriter out = null;
        try {
            outputFile = new File("./Registros.txt");
            out = new FileWriter(outputFile);

            for (Equipo e : gl.getEquiposBasico()) {
                out.write(e.toString());
            }
            for (Traspaso t : gl.getTraspasos()) {
                out.write(t.toString());
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void cargaInicialDeDatos(GestorLiga gl) {
        Equipo equipo1 = new Equipo("Valencia", 30000000, 100000, 10000, 20000);
        Equipo equipo2 = new Equipo("Barcelona", 120000000, 500000, 10000, 20000);
        Equipo equipo3 = new Equipo("Real Madrid", 100000000, 400000, 10000, 20000);

        Jugador j1 = new Jugador("Leo Messi", "Delantero", 100000000);
        Jugador j2 = new Jugador("Ter Stegen", "Portero", 20000000);
        Jugador j3 = new Jugador("Pique", "Defensa", 40000000);
        Jugador j4 = new Jugador("Busquets", "Medio", 60000000);

        Jugador j5 = new Jugador("Cristiano Ronaldo", "Delantero", 90000000);
        Jugador j6 = new Jugador("Keylor Navas", "Portero", 30000000);
        Jugador j7 = new Jugador("Sergio Ramos", "Defensa", 40000000);
        Jugador j8 = new Jugador("Modric", "Medio", 70000000);

        Jugador j9 = new Jugador("Rodrigo", "Delantero", 20000000);
        Jugador j10 = new Jugador("Diego Alves", "Portero", 30000000);
        Jugador j11 = new Jugador("Mustafi", "Defensa", 40000000);
        Jugador j12 = new Jugador("Javi Fuego", "Medio", 20000000);

        equipo1.anyadirJugador(j9);
        equipo1.anyadirJugador(j10);
        equipo1.anyadirJugador(j11);
        equipo1.anyadirJugador(j12);

        equipo2.anyadirJugador(j1);
        equipo2.anyadirJugador(j2);
        equipo2.anyadirJugador(j3);
        equipo2.anyadirJugador(j4);

        equipo3.anyadirJugador(j5);
        equipo3.anyadirJugador(j6);
        equipo3.anyadirJugador(j7);
        equipo3.anyadirJugador(j8);

        gl.añadirEquipo(equipo1);
        gl.añadirEquipo(equipo2);
        gl.añadirEquipo(equipo3);
    }

    private static void compruebaDemarcacion(String demarcacion) throws DemarcacionException {
        boolean correcta = false;
        switch (demarcacion) {
            case "delantero":
            case "portero":
            case "defensa":
            case "medio":
                correcta = true;
                break;
        }

        if (!correcta) {
            throw new DemarcacionException("La demarcacion no es la adecuada, debe ser uno de los siguientes valores: \n portero, defensa, medio o delantero");
        }
    }
}
