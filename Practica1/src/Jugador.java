
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
    private float costeAnual;

    Jugador() {    
    }

    public Jugador(String nombre, String demarcacion, float importeClausula,float costeAnual) {
        this.idJugador = ++CONTIDEJUGADOR;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.importeClausula = importeClausula;
        this.costeAnual = costeAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public float getImporteClausula() {
        return importeClausula;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public float getCosteAnual() {
        return costeAnual;
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

    public void setCosteAnual(float costeAnual) {
        this.costeAnual = costeAnual;
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
