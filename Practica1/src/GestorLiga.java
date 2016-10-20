
import Excepciones.EquipoException;
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
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Traspaso> traspasos = new ArrayList<>();

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

    public void addJugadorEquipo(Jugador jugador, String nombre) throws EquipoException {
        boolean existe = false;
        for (Equipo equipo1 : equipos) {
            if (equipo1.getNombre().equals(nombre)) {
                equipo1.anyadirJugador(jugador);
                existe = true;
            }
        }
        if(!existe){
            throw new EquipoException("El equipo seleccionado no existe");
        }
    }

    public void mostrarEquiposBasico() {
        for (Equipo e : equipos) {
            System.out.println("Nombre del equipo: " + e.getNombre() + "\n");
            System.out.println("Importe caja: " + e.getImporteCaja() + "\n");
            System.out.println("Numero de abonados: " + e.getNumAbonados() + "\n");
            System.out.println("_____________________________________\n");

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
            System.out.println(e.toString());
        }
    }

    public void mostrarTraspasos() {
        for (Traspaso t : traspasos) {
            System.out.println(t.toString());
        }
    }

    public boolean realizarTraspaso(String equipoOrigen, String equipoDestino, String nombreJugadorTraspaso, float importe) {
        Jugador jugador = new Jugador();
        boolean encontrado = false;
        for (Equipo e : equipos) {
            if (e.getNombre().equals(equipoOrigen)) {
                for (int i = 0; i < e.getPlantilla().size(); i++) {
                    jugador = e.getPlantilla().get(i);
                    if (jugador.getNombre().equals(nombreJugadorTraspaso)) {
                        e.eliminarJugador(jugador);
                        encontrado = true;
                    }
                }
            }
        }
        if (!encontrado) {
            System.out.println("El equipo de origen no existe");
        } else {
            encontrado = false;
            for (Equipo e : equipos) {
                if (e.getNombre().equals(equipoDestino)) {
                    e.anyadirJugador(jugador);
                    e.setImporteCaja(importe);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("El equipo de destino no existe");
            }
        }

        return encontrado;
    }
}
