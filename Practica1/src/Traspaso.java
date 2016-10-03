
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
public class Traspaso {
    private String nombreJugador;
    private Date fecha;
    private float importeClausula;
    private Equipo origen;
    private Equipo destino;

    public Traspaso(String nombreJugador, Date fecha, float importeClausula, Equipo origen, Equipo destino) {
        this.nombreJugador = nombreJugador;
        this.fecha = fecha;
        this.importeClausula = importeClausula;
        this.origen = origen;
        this.destino = destino;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getImporteClausula() {
        return importeClausula;
    }

    public Equipo getOrigen() {
        return origen;
    }

    public Equipo getDestino() {
        return destino;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setImporteClausula(float importeClausula) {
        this.importeClausula = importeClausula;
    }

    public void setOrigen(Equipo origen) {
        this.origen = origen;
    }

    public void setDestino(Equipo destino) {
        this.destino = destino;
    }
    
    
}
