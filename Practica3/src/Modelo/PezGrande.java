/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
        int probNacer = CalculaRandom(0, 1000);
        if(probNacer <= 198){
            nace = true;
        }
        return nace;
    }

    @Override
    public int Comer() {
        return CalculaRandom(1, 2);
    }

    @Override
    public boolean Morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SeresVivos Nacer() {
        return new PezGrande(fechaNacimiento, especie, velocidad);
    }
    
}
