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
public class PezGrande extends Peces{

    public PezGrande(int fechaNacimiento, String especie, float velocidad) {
        super(fechaNacimiento, especie);
        this.velocidad = velocidad;
    }

    @Override
    public boolean Reproducirse() {
        boolean nace = false;
        int probNacer = Utilidades.CalculaRandom(0, 1000);
        if(probNacer <= 198){
            nace = true;
        }
        return nace;
    }

    @Override
    public int Comer() {
        return Utilidades.CalculaRandom(1, 2);
    }

    @Override
    public boolean Morir() {
        boolean muere = false;
        int probMorir = Utilidades.CalculaRandom(0, 1000);
        if(probMorir <= 93){
            muere = true;
        }
        return muere;
    }

    @Override
    public SeresVivos Nacer() {
        return new PezGrande(fechaNacimiento, especie, velocidad);
    }
    
}
