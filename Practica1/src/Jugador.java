
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
    private String demarcacion;
    private float importeClausula;

    Jugador() {    
    }

    public Jugador(String nombre, String demarcacion, float importeClausula) {
        this.idJugador = ++CONTIDEJUGADOR;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
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
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        String result = "";
        
        result += "ID: " + String.format("%03d", idJugador);
        result += " Nombre " + nombre;
        result += " Posicion " + demarcacion;
        result += " Clausula " + String.format("%.2f", importeClausula) + " €";
        
        return result;
        
        
    }
}
