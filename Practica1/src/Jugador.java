
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
public class Jugador {

    private static int CONTIDEJUGADOR = 0;

    private int idJugador;
    private String nombre;

    Jugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum demarcacion {

        portero, defensa, medio, delantero
    };
    private String posicion;
    private float importeClausula;

    public Jugador(String nombre, String demarcacion, float importeClausula) {
        this.idJugador = ++CONTIDEJUGADOR;
        this.nombre = nombre;
        this.posicion = demarcacion;
        this.importeClausula = importeClausula;
    }

    public String getNombre() {
        return nombre;
    }

    public float getImporteClausula() {
        return importeClausula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImporteClausula(float importeClausula) {
        this.importeClausula = importeClausula;
    }
    
     public void setDemarcacion(String demarcacion) {
        this.importeClausula = importeClausula;
    }

    @Override
    public String toString() {
        String result = "";
        
        result += "ID: " + String.format("%03d", idJugador);
        result += " Nombre " + nombre;
        result += " Posicion" + posicion;
        result += " Clausula" + String.format("%.2f", importeClausula) + " €";
        
        return result;
        
        
    }
    
}
