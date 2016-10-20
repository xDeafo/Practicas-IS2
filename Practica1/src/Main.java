
import Excepciones.DemarcacionException;
import Excepciones.EquipoException;
import Excepciones.JugadorException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    private static GestorLiga gl = new GestorLiga();

    public static void main(String[] args) {
        int opcion = 0;
        String nombreEquipo;
        String nombreEquipoD;
        String nombreJugador;
        String demarcacion;
        String nombreEquipoJugador;
        String nombreJugadorTraspaso;
        String equipoOrigen;
        String equipoDestino;
        Date fechaTraspaso = new Date();
        float importeClausulaTraspaso;
        float importeClausula;
        float gastosGenerales;
        float costeAnual;

        float importeCaja;
        int numeroAbonados;
        Scanner sc = new Scanner(System.in); //Creación de un objeto Scanner

        cargaInicialDeDatos(gl);

        System.out.println("Bienvenido a la Liga BBUV");

        do {
            try {
                System.out.println("Elige una opcion\n");
                System.out.println("1. Registrar un nuevo equipo");
                System.out.println("2. Registrar un nuevo jugador");
                System.out.println("3. Registrar un traspaso de jugador");
                System.out.println("4. Listar en pantalla los datos básicos de los equipos registrados");
                System.out.println("5. Listar los jugadores de cada equipo");
                System.out.println("6. Mostrar los traspasos realizados");
                System.out.println("7. Cambiar demarcacion del jugador");
                System.out.println("8. Evaluar el Fair Play financiero");
                System.out.println("9. Comprobar demarcacion");
                System.out.println("10. Salir del programa");
                
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        try {
                            System.out.println("Introduce los datos del equipo: ");
                            System.out.println("Nombre del equipo: ");
                            
                            nombreEquipo = sc.nextLine();
                            System.out.println("Importe caja: ");
                            importeCaja = sc.nextFloat();
                            System.out.println("Nº abonados: ");
                            numeroAbonados = sc.nextInt();
                            System.out.println("Gastos generales: ");
                            gastosGenerales = sc.nextFloat();
                            Equipo e = new Equipo(nombreEquipo, importeCaja, numeroAbonados, gastosGenerales);
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
                            
                            nombreJugador = sc.nextLine();
                            System.out.println("Demarcacion (portero, defensa, medio o delantero): ");
                            demarcacion = sc.nextLine();
                            compruebaDemarcacion(demarcacion);
                            System.out.println("Importe Clausula: ");
                            importeClausula = sc.nextFloat();
                            System.out.println("Nombre del equipo al que pertenece: ");
                            sc.nextLine();
                            nombreEquipoJugador = sc.nextLine();
                            System.out.println("Coste anual del jugador: ");
                            costeAnual = sc.nextFloat();

                            Jugador j = new Jugador(nombreJugador, demarcacion, importeClausula, costeAnual);

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
                        try {
                            System.out.println("Introduce el nombre del jugador: ");
                            
                            nombreJugador = sc.nextLine();
                            System.out.println("Introduce la demarcacion (portero, defensa, medio o delantero): ");
                            demarcacion = sc.nextLine();

                            compruebaDemarcacion(demarcacion);

                            gl.CambiaDemarcacionJugador(nombreJugador, demarcacion);

                            System.out.println("El cambio de demarcacion se ha realizado con exito");
                        } catch (DemarcacionException de) {
                            System.out.println(de.getMessage());
                        } catch (JugadorException je) {
                            System.out.println(je.getMessage());
                        } finally {
                            break;
                        }
                    case 8:
                        EvaluarFairPlay();
                        break;
                    case 9:
                        try {
                            System.out.println("Introduce el nombre del equipo: ");
                           
                            nombreEquipoD = sc.nextLine();

                            veificarDemarcacion(gl.ExisteEquipo(nombreEquipoD));

                        } catch (EquipoException ex) {
                            System.out.println(ex.getMessage());
                        } finally {
                            break;
                        }

                    case 10:
                        EscribeFichero(gl);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("La opcion introducida no es correcta");
                        break;
                }
            } catch (InputMismatchException ie) {
                System.out.println("Debes introducir un numero");

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
        Equipo equipo1 = new Equipo("Valencia", 30000000, 100000, 10000);
        Equipo equipo2 = new Equipo("Barcelona", 120000000, 500000, 10000);
        Equipo equipo3 = new Equipo("Real Madrid", 100000000, 400000, 10000);

        Jugador j1 = new Jugador("Leo Messi", "Delantero", 100000000, 40);
        Jugador j2 = new Jugador("Ter Stegen", "Portero", 20000000, (float) 13.7);
        Jugador j3 = new Jugador("Pique", "Defensa", 40000000, (float) 5.7);
        Jugador j4 = new Jugador("Busquets", "Medio", 60000000, 5);

        Jugador j5 = new Jugador("Cristiano Ronaldo", "Delantero", 90000000, 32);
        Jugador j6 = new Jugador("Keylor Navas", "Portero", 30000000, 10);
        Jugador j7 = new Jugador("Sergio Ramos", "Defensa", 40000000, 10);
        Jugador j8 = new Jugador("Modric", "Medio", 70000000, 7);

        Jugador j9 = new Jugador("Rodrigo", "Delantero", 20000000, 5);
        Jugador j10 = new Jugador("Diego Alves", "Portero", 30000000, 2);
        Jugador j11 = new Jugador("Mustafi", "Defensa", 40000000, 3);
        Jugador j12 = new Jugador("Javi Fuego", "Medio", 20000000, 1);

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

    private static void EvaluarFairPlay() {
        for (Equipo e : gl.getEquiposBasico()) {
            if (gl.CumpleFairPlay(e)) {
                System.out.println("El equipo " + e.getIdEquipo() + " con nombre " + e.getNombre() + "---> Cumple el Fair Play\n");
            } else {
                System.out.println("El equipo " + e.getIdEquipo() + " con nombre " + e.getNombre() + "---> No cumple el Fair Play\n");
            }
        }
    }

    public static void veificarDemarcacion(Equipo e) {
        int porteros = 0;
        int delanteros = 0;
        int medios = 0;
        int defensas = 0;
        boolean cumple = false;
        ArrayList<Jugador> plantilla = e.getPlantilla();

        for (Jugador j : plantilla) {
            if (j.getDemarcacion().equals("portero")) {
                porteros++;
            } else if (j.getDemarcacion().equals("delanteros")) {
                delanteros++;
            } else if (j.getDemarcacion().equals("medio")) {
                medios++;
            } else {
                defensas++;
            }
        }
        if (porteros >= 2 && defensas >= 4 && medios >= 4 && delanteros >= 3) {
            cumple = true;
        }

        if (cumple) {
            System.out.println("El equipo tiene: \n");
            System.out.println((String.valueOf(porteros)) + " porteros\n");
            System.out.println(String.valueOf(defensas) + " defensas\n");
            System.out.println(String.valueOf(medios) + " medios\n");
            System.out.println(String.valueOf(delanteros) + " delanteros\n");
            System.out.println("El equipo si que cumple con los requisitos de las demarcaciones");
        } else {
            System.out.println("El equipo tiene: \n");
            System.out.println(String.valueOf(porteros) + " porteros\n");
            System.out.println(String.valueOf(defensas) + " defensas\n");
            System.out.println(String.valueOf(medios) + " medios\n");
            System.out.println(String.valueOf(delanteros) + " delanteros\n");
            System.out.println("El equipo No que cumple con los requisitos de las demarcaciones");
        }

    }
}
