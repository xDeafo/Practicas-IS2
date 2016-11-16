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
            if (cont % NUM_DEPREDADORES == 0) {
                cont = 0;
            }
        }
    }

    public void crearKrillPlancton() {
        KrillPlacton plancton = new KrillPlacton();
    }
    
    public KrillPlacton getKrillPlancton(){
        return this.placton;
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

    public ArrayList getPecesPequeños() {
        int cont = 0;
        int boquerones = 0;
        int jureles = 0;
        int sardinas = 0;
        int gallos = 0;
        int lenguados = 0;
        int pecesTotales = 0;
        ArrayList totalPequeños = new ArrayList();
                
        for (int i = 0; i < peces.size(); i++) {
            switch (peces.get(i).getEspecie()) {
                case "Boquerones":
                    boquerones++;
                    break;
                case "Jureles":
                    jureles++;
                    break;
                case "Sardinas":
                    sardinas++;
                    break;
                case "Gallos":
                    gallos++;
                    break;
                case "Lenguados":
                    lenguados++;
                    break;
            }
        }
        pecesTotales = boquerones + jureles + sardinas + gallos + lenguados;
        totalPequeños.set(1, boquerones);
        totalPequeños.set(2, jureles);
        totalPequeños.set(3, sardinas);
        totalPequeños.set(4, gallos);
        totalPequeños.set(5, lenguados);
        totalPequeños.set(6, pecesTotales);
        
        return totalPequeños;
    }
    
    public ArrayList getPecesGrandes() {
        int cont = 0;
        int atunes = 0;
        int dorados = 0;
        int bacalaos = 0;
        int besugos = 0;
        int meros = 0;
        int pecesTotales = 0;
        ArrayList totalGrandes = new ArrayList();
                
        for (int i = 0; i < peces.size(); i++) {
            switch (peces.get(i).getEspecie()) {
                case "Atunes":
                    atunes++;
                    break;
                case "Dorados":
                    dorados++;
                    break;
                case "Bacalaos":
                    bacalaos++;
                    break;
                case "Besugos":
                    besugos++;
                    break;
                case "Meros":
                    meros++;
                    break;
            }
        }
        pecesTotales = atunes + dorados + bacalaos + besugos + meros;
        totalGrandes.set(1, atunes);
        totalGrandes.set(2, dorados);
        totalGrandes.set(3, bacalaos);
        totalGrandes.set(4, besugos);
        totalGrandes.set(5, meros);
        totalGrandes.set(6, pecesTotales);
        
        return totalGrandes;
    }
    
    public ArrayList getDepredadores() {
        int cont = 0;
        int tiburonesBlancos = 0;
        int TiburonesToro = 0;
        int PecesEspada = 0;
    
        int pecesTotales = 0;
        ArrayList totalDepredadores = new ArrayList();
                
        for (int i = 0; i < peces.size(); i++) {
            switch (peces.get(i).getEspecie()) {
                case "Voraces tiburones blancos":
                    tiburonesBlancos++;
                    break;
                case "Tiburones toro":
                    TiburonesToro++;
                    break;
                case "Peces espada":
                    PecesEspada++;
                    break;
             
            }
        }
        pecesTotales = tiburonesBlancos + TiburonesToro + PecesEspada;
        totalDepredadores.set(1, tiburonesBlancos);
        totalDepredadores.set(2, TiburonesToro);
        totalDepredadores.set(3, PecesEspada);
        totalDepredadores.set(4, pecesTotales);
        
        return totalDepredadores;
    }
}
