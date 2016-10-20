
import Excepciones.EquipoException;
import Excepciones.JugadorException;
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

    public void registrarEquipo(String nombre, float importeCaja, int numAbonados, float gastosGenerales) {
        this.equipo = new Equipo(nombre, importeCaja, numAbonados, gastosGenerales);
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
        Equipo e = ExisteEquipo(nombre);
        boolean existe = false;
        if (e != null) {
            e.anyadirJugador(jugador);
            existe = true;
        }
        if (!existe) {
            throw new EquipoException("El equipo seleccionado no existe");
        }
    }

    public void mostrarEquiposBasico() {
        for (Equipo e : equipos) {
            System.out.println("Nombre del equipo: " + e.getNombre() + "\n");
            System.out.println("Importe caja: " + e.getImporteCaja() + "\n");
            System.out.println("Numero de abonados: " + e.getNumAbonados() + "\n");
            System.out.println("\nGastos generales: " + String.format("%.2f", e.getGastosgastosGenerales()) + " €");
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

    public void CambiaDemarcacionJugador(String nombreJugador, String newDemarcacion)throws JugadorException {
        for(Equipo e : equipos){
            Jugador j = ExisteJugador(e, nombreJugador);
            if(j != null){
                j.setDemarcacion(newDemarcacion);
            }
        }
    }

    private Equipo ExisteEquipo(String nombreEquipo) throws EquipoException {
        Equipo e = null;
        boolean existe = false;
        for (Equipo equipo1 : equipos) {
            if (equipo1.getNombre().equals(nombreEquipo)) {
                existe = true;
                e = equipo1;
            }
        }
        if (!existe) {
            throw new EquipoException("El equipo seleccionado no existe");
        }

        return e;
    }

    private Jugador ExisteJugador(Equipo e,String nombreJugador) throws JugadorException {
        boolean existe = false;
        Jugador ju = null;
        for (Jugador j : e.getPlantilla()) {
            if (j.getNombre().equals(nombreJugador)) {
                existe = true;
                ju = j;
            }
        }
        if (!existe) {
            throw new JugadorException("El Jugador seleccionado no existe");
        }

        return ju;
    }
}
