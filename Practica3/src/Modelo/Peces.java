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
public abstract class Peces extends SeresVivos {

    protected int fechaNacimiento;
    protected float velocidad;
    protected String especie;
    protected boolean muerto;

    public abstract int Comer();

    public abstract Peces Nacer(int fecha);

    public abstract boolean Morir();

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

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

}
