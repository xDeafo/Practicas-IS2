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
public class KrillPlacton extends SeresVivos{
    private final int TEMPALTA = 19;
    private final int TEMPOPTIMA = 18;
    private final int TEMPBAJA = 17;
    private double numPlacton;

    public KrillPlacton() {
        numPlacton = Utilidades.CalculaRandomLong(50000000000L, 70000000000L);
    }
    
    @Override
    public boolean Reproducirse() {
        switch(Oceano.getTemperatura()){
            case TEMPALTA | TEMPBAJA:
                numPlacton += 5000000000L;
                break;
            case TEMPOPTIMA:
                numPlacton += 12000000000L;
                break;
            default:
                break;
        }
        
        return true;
    }
    
}
