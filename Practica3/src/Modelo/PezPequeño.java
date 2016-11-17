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
public class PezPequeño extends Peces{

    private int probabilidadMorir = 163;
    
    public PezPequeño(int fechaNacimiento, String especie, float velocidad) {
        super(fechaNacimiento, especie);
        this.velocidad = velocidad;
    }

    @Override
    public boolean Reproducirse() {
        boolean nace = false;
        int probNacer = Utilidades.CalculaRandom(0, 1000);
        if(probNacer <= 250){
            nace = true;
        }
        return nace;
    }

    @Override
    public int Comer() {
        return Utilidades.CalculaRandom(1000000, 2000000);
    }

    @Override
    public PezPequeño Nacer(int fecha) {
        return new PezPequeño(fecha, especie, velocidad);
    }

    @Override
    public boolean Morir() {
        boolean muere = false;
        int probMorir = Utilidades.CalculaRandom(0, 1000);
        if(probMorir <= probabilidadMorir){
            muere = true;
        }
        return muere;
    }
    public void setProbabilidadMorir(int probabilidadMorir) {
        this.probabilidadMorir = probabilidadMorir;
    }

    public int getProbabilidadMorir() {
        return probabilidadMorir;
    }
}
