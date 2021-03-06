
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ventura
 */
public class Equipo {

    private static int CONTIDEQUIPO = 0;

    private int idEquipo;
    private String nombre;
    private float importeCaja;
    private int numAbonados;
    private float gastosGenerales;
    
    private ArrayList<Jugador> plantilla = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre, float importeCaja, int numAbonados, float gastosGenerales) {
        this.idEquipo = ++CONTIDEQUIPO;
        this.nombre = nombre;
        this.importeCaja = importeCaja;
        this.numAbonados = numAbonados;
        this.gastosGenerales = gastosGenerales;
        
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public float getGastosGenerales() {
        return gastosGenerales;
    }

   

    public String getNombre() {
        return nombre;
    }

    public float getImporteCaja() {
        return importeCaja;
    }

    public int getNumAbonados() {
        return numAbonados;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setImporteCaja(float importeCaja) {
        this.importeCaja = importeCaja;
    }

    public void setNumAbonados(int numAbonados) {
        this.numAbonados = numAbonados;
    }

    @Override
    public String toString() {
        String result = "";

        result += "\nID: " + String.format("%03d", idEquipo);
        result += "\nNombre: " + nombre;
        result += "\nImporte en Caja: " + String.format("%.2f", importeCaja) + " €";
        result += "\nNº Abonados: " + String.format("%03d", numAbonados);
        result += "\nGastos generales: " + String.format("%.2f", gastosGenerales) + " €";
        result += "\nPlantilla: ";
        for (Jugador j : plantilla) {
            result += "\n     " + j.toString();
        }
        result += "\n------------------------------------------------------";
        
        return result;
    }

    public void anyadirJugador(Jugador jugador) {
        this.plantilla.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        this.plantilla.remove(jugador);
    }
}
