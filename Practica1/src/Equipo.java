
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
    private ArrayList<Jugador> plantilla; 

    public Equipo(String nombre, float importeCaja, int numAbonados) {
        this.idEquipo = ++CONTIDEQUIPO;
        this.nombre = nombre;
        this.importeCaja = importeCaja;
        this.numAbonados = numAbonados;
    }

    public int getIdEquipo() {
        return idEquipo;
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

    
    
}
