
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class GestorLiga {

    private Jugador jugador;
    private Equipo equipo;
    private Traspaso traspaso;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Equipo> equipos;
    private ArrayList<Traspaso> traspasos;

    public GestorLiga(ArrayList<Jugador> jugadores, ArrayList<Equipo> equipos) {
        this.jugadores = jugadores;
        this.equipos = equipos;
    }

    public void registrarJugador(String nombre, String demarcacion, float importeClausula) {
        this.jugador = new Jugador(nombre, demarcacion, importeClausula);
    }

    public boolean añadirJugador(Jugador j) {
        return jugadores.add(j);
    }

    public void registrarEquipo(String nombre, float importeCaja, int numAbonados) {
        this.equipo = new Equipo(nombre, importeCaja, numAbonados);
    }

    public boolean añadirEquipo(Equipo e) {
        return this.equipos.add(e);
    }

    public void mostrarEquipos() {
        for (Equipo e : equipos) {
            e.toString();
        }
    }

    public void mostrarTraspasos() {
        for (Traspaso t : traspasos) {
            t.toString();
        }
    }

}
