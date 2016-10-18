
import java.util.ArrayList;
import java.util.Date;

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
    private ArrayList<Equipo> equipos;
    private ArrayList<Traspaso> traspasos;

    GestorLiga() {
    }

    public void registrarEquipo(String nombre, float importeCaja, int numAbonados) {
        this.equipo = new Equipo(nombre, importeCaja, numAbonados);
    }

    public void registrarTraspaso(String nombreJugador, Date fecha, float importeClausula, String origen, String destino) {
        this.traspaso = new Traspaso(nombreJugador, fecha, importeClausula, origen, destino);
    }

    public boolean añadirTraspaso(Traspaso t) {
        return this.traspasos.add(t);
    }

    public boolean añadirEquipo(Equipo e) {
        return this.equipos.add(e);
    }

    public void addJugadorEquipo(Jugador jungador, String nombre) {

        for (Equipo equipo1 : equipos) {
            if (equipo1.getNombre().equals(nombre)) {
                equipo1.anyadirJugador(jugador);
            }
        }

    }

    public void mostrarEquiposBasico() {
        for (Equipo e : equipos) {
            System.out.println("Nombre del equipo: " + e.getNombre());
            System.out.println("Nombre del equipo: " + e.getImporteCaja());
            System.out.println("Nombre del equipo: " + e.getNumAbonados());
            System.out.println("_____________________________________");

        }
    }

    public ArrayList<Equipo> getEquiposBasico() {
        return this.equipos;
    }
    
     public ArrayList<Traspaso> getTraspasos() {
        return this.traspasos;
    }


    public void mostrarEquiposCompletos() {
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
