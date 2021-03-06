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
public class GranDepredador extends Peces{

    private int probabilidadMorir = 28;
    
    public GranDepredador(int fechaNacimiento, String especie) {
        super(fechaNacimiento, especie);
    }

    @Override
    public boolean Reproducirse() {
        boolean nace = false;
        int probNacer = Utilidades.CalculaRandom(0, 1000);
        if(probNacer <= 35){
            nace = true;
        }
        return nace;
    }

    @Override
    public int Comer() {
        //puede comer 0 , 1  o 2 peces cada dia
        return Utilidades.CalculaRandom(0, 2);
    }

    @Override
    public GranDepredador Nacer(int fecha) {
        return new GranDepredador(fecha, especie);
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
