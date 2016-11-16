/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GranDepredador;
import Modelo.KrillPlacton;
import Modelo.Peces;
import Modelo.PezGrande;
import Modelo.PezPequeño;
import Recursos.Utilidades;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ventura
 */
public class Oceano {

    private static int NUM_PECES_PEQUEÑOS = 5;
    private static int NUM_PECES_GRANDES = 5;
    private static int NUM_DEPREDADORES = 3;
    private static int dia = 1;
    private static int temperatura = 18;
    private KrillPlacton placton;
    private ArrayList<Peces> peces = new ArrayList<Peces>();

    public static int getDia() {
        return dia;
    }

    public static int getTemperatura() {
        return temperatura;
    }

    public void calentamientoGlobal() {
        this.temperatura += 3;
    }

    public void deshieloPolos() {
        this.temperatura -= 2;
    }

    public void crearSeresVivos() {
        this.crearPecesPequeños();
        this.crearPecesGrandes();
        this.crearGrandesDepredadores();
        this.crearKrillPlancton();

    }

    public void crearPecesPequeños() {

        PezPequeño pp;
        int numeroPeces = Utilidades.CalculaRandom(1800, 2100);
        int cont = 0;

        for (int i = 0; i <= numeroPeces; i++) {

            int velocidad = Utilidades.CalculaRandom(15, 35);

            pp = crearEspeciePequeños(cont, velocidad);
            peces.add(pp);
            cont++;
            if (cont % NUM_PECES_PEQUEÑOS == 0) {
                cont = 0;
            }

        }
    }

    public void crearPecesGrandes() {

        PezGrande pg;
        int numeroPeces = Utilidades.CalculaRandom(1800, 2100);
        int cont = 0;
        for (int i = 0; i <= numeroPeces; i++) {

            int velocidad = Utilidades.CalculaRandom(15, 35);

            pg = crearEspecieGrandes(cont, velocidad);
            peces.add(pg);
            cont++;
            if (cont % NUM_PECES_GRANDES == 0) {
                cont = 0;
            }

        }

    }

    public void crearGrandesDepredadores() {

        GranDepredador gd;
        int numeroPeces = Utilidades.CalculaRandom(1800, 2100);
        int cont = 0;
        for (int i = 0; i <= numeroPeces; i++) {

            int velocidad = Utilidades.CalculaRandom(40, 60);

            gd = crearEspecieDepredadores(cont);
            peces.add(gd);
            cont++;
            if (cont % NUM_DEPREDADORES) 
                cont = 0;
            
        }
    }

    public void crearKrillPlancton() {
        KrillPlacton plancton = new KrillPlacton();
    }

    public PezPequeño crearEspeciePequeños(int n, int velocidad) {
        PezPequeño pp = null;
        switch (n) {
            case 1:
                pp = new PezPequeño(dia, "Boquerones", velocidad);
                break;
            case 2:
                pp = new PezPequeño(dia, "Sardinas", velocidad);
                break;
            case 3:
                pp = new PezPequeño(dia, "Lenguados", velocidad);
                break;
            case 4:
                pp = new PezPequeño(dia, "Jureles", velocidad);
                break;
            case 5:
                pp = new PezPequeño(dia, "Gallos", velocidad);
                break;

        }
        return pp;
    }

    public PezGrande crearEspecieGrandes(int n, int velocidad) {
        PezGrande pg = null;
        switch (n) {
            case 1:
                pg = new PezGrande(dia, "Atunes", velocidad);
                break;
            case 2:
                pg = new PezGrande(dia, "Dorados", velocidad);
                break;
            case 3:
                pg = new PezGrande(dia, "Bacalaos", velocidad);
                break;
            case 4:
                pg = new PezGrande(dia, "Besugos", velocidad);
                break;
            case 5:
                pg = new PezGrande(dia, "Meros", velocidad);
                break;

        }
        return pg;
    }

    public GranDepredador crearEspecieDepredadores(int n) {
        GranDepredador gd = null;
        switch (n) {
            case 1:
                gd = new GranDepredador(dia, "Voraces tiburones blancos");
                break;
            case 2:
                gd = new GranDepredador(dia, "Tiburones toro");
                break;
            case 3:
                gd = new GranDepredador(dia, "Peces espada");
                break;

        }
        return gd;
    }

}
