
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
    private String nombre;
    public enum demarcacion {portero, defensa, medio ,delantero};
    private String posicion;
    private float importeClausula;

    public Jugador(String nombre, String demarcacion ,float importeClausula) {
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
    
    
}
