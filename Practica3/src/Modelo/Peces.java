/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author Ventura
 */
public abstract class Peces extends SeresVivos{
    protected int fechaNacimiento;
    protected float velocidad;
    protected String especie;

    public Peces(int fechaNacimiento, String especie) {
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public String getEspecie() {
        return especie;
    }
    
    public int CalculaRandom(int min, int max){
        Random rdn = new Random();
        return rdn.nextInt(max - min + 1) + min;
    }
}
