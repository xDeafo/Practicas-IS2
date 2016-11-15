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

        for (int i = 0; i <= numeroPeces; i++) {

            int velocidad = Utilidades.CalculaRandom(15, 35);

            if (i <= numeroPeces / 5) {

                pp = new PezPequeño(dia, "Boquerones", velocidad);
                peces.add(pp);

            } else if ((i > numeroPeces / 5) && (i <= numeroPeces / 5 * 2)) {

                pp = new PezPequeño(dia, "Sardinas", velocidad);
                peces.add(pp);

            } else if ((i > numeroPeces / 5 * 2) && (i <= numeroPeces / 5 * 3)) {

                pp = new PezPequeño(dia, "Lenguados", velocidad);
                peces.add(pp);

            } else if ((i > numeroPeces / 5 * 3) && (i <= numeroPeces / 5 * 4)) {

                pp = new PezPequeño(dia, "Jureles", velocidad);
                peces.add(pp);

            } else {

                pp = new PezPequeño(dia, "Gallos", velocidad);
                peces.add(pp);

            }
        }
    }
    
    public void crearPecesGrandes() {

        PezGrande pg;
        int numeroPeces = Utilidades.CalculaRandom(1800, 2100);

        for (int i = 0; i <= numeroPeces; i++) {
            
            int velocidad = Utilidades.CalculaRandom(40, 60);
            
            if (i <= numeroPeces / 5) {

                pg = new PezGrande(dia, "Atunes",velocidad);
                peces.add(pg);

            } else if ((i > numeroPeces / 5) && (i <= numeroPeces / 5 * 2)) {

                pg = new PezGrande(dia, "Dorados",velocidad);
                peces.add(pg);

            } else if ((i > numeroPeces / 5 * 2) && (i <= numeroPeces / 5 * 3)) {

                pg = new PezGrande(dia, "Bacalaos",velocidad);
                peces.add(pg);

            } else if ((i > numeroPeces / 5 * 3) && (i <= numeroPeces / 5 * 4)) {

                pg = new PezGrande(dia, "Besugos",velocidad);
                peces.add(pg);

            } else {

                pg = new PezGrande(dia, "Meros",velocidad);
                peces.add(pg);

            }
        }
    }
    
    public void crearGrandesDepredadores() {

        GranDepredador gd;
        int numeroPeces = Utilidades.CalculaRandom(1800, 2100);

        for (int i = 0; i <= numeroPeces; i++) {
            
            int velocidad = Utilidades.CalculaRandom(40, 60);
                  

            if (i <= numeroPeces / 3) {

                gd = new GranDepredador(dia, "Voraces tiburones blancos");
                peces.add(gd);

            } else if ((i > numeroPeces / 3) && (i <= numeroPeces / 3 * 2)) {

                gd = new GranDepredador(dia, "Tiburones toro");
                peces.add(gd);

            } else {

                gd = new GranDepredador(dia, "Peces espada");
                peces.add(gd);

            }
        }
    }
    
    public void crearKrillPlancton() {
        KrillPlacton plancton = new KrillPlacton();
    }
    
    
}
