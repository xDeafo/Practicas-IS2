/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Recursos.Utilidades;

/**
 *
 * @author Ventura
 */
public class PezPequeño extends Peces{

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
    public PezPequeño Nacer() {
        return new PezPequeño(fechaNacimiento, especie, velocidad);
    }

    @Override
    public boolean Morir() {
        boolean muere = false;
        int probMorir = Utilidades.CalculaRandom(0, 1000);
        if(probMorir <= 163){
            muere = true;
        }
        return muere;
    }
    
}
