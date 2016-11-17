/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Oceano;
import Recursos.Utilidades;

/**
 *
 * @author Ventura
 */
public class KrillPlacton implements java.io.Serializable{
    private final float TEMPALTA = 19;
    private final float TEMPOPTIMA = 18;
    private final float TEMPBAJA = 17;
    private double numPlacton;

    public KrillPlacton() {
        numPlacton = Utilidades.CalculaRandomLong(50000000000L, 70000000000L);
    }
    
    public boolean Reproducirse(float temp) {
        float temperatura = temp;
        if (temperatura > TEMPALTA || temperatura < TEMPBAJA) {
            numPlacton += 0;
        } else if (temperatura == TEMPALTA || temperatura == TEMPBAJA) {
            numPlacton += 5000000000l;
        } else {
            numPlacton += 12000000000l;
        }
        
        return true;
    }

    public double getNumPlacton() {
        return numPlacton;
    }

    public void setNumPlacton(double numPlacton) {
        this.numPlacton = numPlacton;
    }
    
    
    
}
