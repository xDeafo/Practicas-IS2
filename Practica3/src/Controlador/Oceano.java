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

/**
 *
 * @author Ventura
 */
public class Oceano implements java.io.Serializable {

    public final static int TIBU_BLANCO = 0, TIBU_TORO = 1, ESPADA = 2;
    public final static int ATUNES = 0, DORADOS = 1, BACALAOS = 2, BESUGOS = 3, MEROS = 4;
    public final static int BOQUERONES = 0, JURELES = 1, SARDINAS = 2, GALLOS = 3, LENGUADOS = 4;
    public final static int TOTALESPG = 5;
    public final static int TOTALESD = 3;
    private int NUM_PECES_PEQUEÑOS = 5;
    private int NUM_PECES_GRANDES = 5;
    private int NUM_DEPREDADORES = 3;
    private  int dia = 1;
    private  float temperatura = 18;
    private KrillPlacton placton;
    private ArrayList<Peces> peces = new ArrayList<Peces>();
    private int diasContaminado = 0;
    private boolean cazaFurtiva = false;

    public Oceano() {
        this.placton = new KrillPlacton();
        crearSeresVivos();
    }

    public  int getDia() {
        return dia;
    }

    public  float getTemperatura() {
        return temperatura;
    }

    public ArrayList<Peces> getPeces() {
        return peces;
    }

    public void setPeces(ArrayList<Peces> peces) {
        this.peces = peces;
    }

    public void calentamientoGlobal() {
        this.temperatura += 3;
    }

    public void deshieloPolos() {
        this.temperatura -= 2;
    }

    public KrillPlacton getPlacton() {
        return placton;
    }

    public void setPlacton(KrillPlacton placton) {
        this.placton = placton;
    }

    public int getDiasContaminado() {
        return diasContaminado;
    }

    public boolean isCazaFurtiva() {
        return cazaFurtiva;
    }

    public void setDiasContaminado(int diasContaminado) {
        this.diasContaminado = diasContaminado;
    }

    public void setDiasCazaFurtiva(boolean cazaFurtiva) {
        this.cazaFurtiva = cazaFurtiva;
    }
    
    

    public void crearSeresVivos() {
        this.crearGrandesDepredadores();
        this.crearPecesPequeños();
        this.crearPecesGrandes();
    }

    private void crearPecesPequeños() {

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

    private void crearPecesGrandes() {

        PezGrande pg;
        int numeroPeces = Utilidades.CalculaRandom(130, 140);
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

    private void crearGrandesDepredadores() {

        GranDepredador gd;
        int numeroPeces = Utilidades.CalculaRandom(12, 15);
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

    public double getKrillPlancton() {
        return this.placton.getNumPlacton();
    }

    private PezPequeño crearEspeciePequeños(int n, int velocidad) {
        PezPequeño pp = null;
        switch (n) {
            case 0:
                pp = new PezPequeño(dia, "Boquerones", velocidad);
                break;
            case 1:
                pp = new PezPequeño(dia, "Sardinas", velocidad);
                break;
            case 2:
                pp = new PezPequeño(dia, "Lenguados", velocidad);
                break;
            case 3:
                pp = new PezPequeño(dia, "Jureles", velocidad);
                break;
            case 4:
                pp = new PezPequeño(dia, "Gallos", velocidad);
                break;

        }
        return pp;
    }

    private PezGrande crearEspecieGrandes(int n, int velocidad) {
        PezGrande pg = null;
        switch (n) {
            case 0:
                pg = new PezGrande(dia, "Atunes", velocidad);
                break;
            case 1:
                pg = new PezGrande(dia, "Dorados", velocidad);
                break;
            case 2:
                pg = new PezGrande(dia, "Bacalaos", velocidad);
                break;
            case 3:
                pg = new PezGrande(dia, "Besugos", velocidad);
                break;
            case 4:
                pg = new PezGrande(dia, "Meros", velocidad);
                break;

        }
        return pg;
    }

    private GranDepredador crearEspecieDepredadores(int n) {
        GranDepredador gd = null;
        switch (n) {
            case 0:
                gd = new GranDepredador(dia, "Voraces tiburones blancos");
                break;
            case 1:
                gd = new GranDepredador(dia, "Tiburones toro");
                break;
            case 2:
                gd = new GranDepredador(dia, "Peces espada");
                break;

        }
        return gd;
    }

    public ArrayList<Integer> getPecesPequeños() {
        int boquerones = 0;
        int jureles = 0;
        int sardinas = 0;
        int gallos = 0;
        int lenguados = 0;
        int pecesTotales = 0;
        ArrayList<Integer> totalPequeños = new ArrayList<>();

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
        totalPequeños.add(BOQUERONES, boquerones);
        totalPequeños.add(JURELES, jureles);
        totalPequeños.add(SARDINAS, sardinas);
        totalPequeños.add(GALLOS, gallos);
        totalPequeños.add(LENGUADOS, lenguados);
        totalPequeños.add(TOTALESPG, pecesTotales);

        return totalPequeños;
    }

    public ArrayList<Integer> getPecesGrandes() {
        int atunes = 0;
        int dorados = 0;
        int bacalaos = 0;
        int besugos = 0;
        int meros = 0;
        int pecesTotales = 0;
        ArrayList<Integer> totalGrandes = new ArrayList<>();

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
        totalGrandes.add(ATUNES, atunes);
        totalGrandes.add(DORADOS, dorados);
        totalGrandes.add(BACALAOS, bacalaos);
        totalGrandes.add(BESUGOS, besugos);
        totalGrandes.add(MEROS, meros);
        totalGrandes.add(TOTALESPG, pecesTotales);

        return totalGrandes;
    }

    public ArrayList<Integer> getDepredadores() {
        int tiburonesBlancos = 0;
        int TiburonesToro = 0;
        int PecesEspada = 0;

        int pecesTotales = 0;
        ArrayList<Integer> totalDepredadores = new ArrayList<>();

        for (int i = 0; i < peces.size(); i++) {
            String especie = peces.get(i).getEspecie();
            switch (especie) {
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
        totalDepredadores.add(TIBU_BLANCO, tiburonesBlancos);
        totalDepredadores.add(TIBU_TORO, TiburonesToro);
        totalDepredadores.add(ESPADA, PecesEspada);
        totalDepredadores.add(TOTALESD, pecesTotales);

        return totalDepredadores;
    }

    public void DecrementarPlacton(double num) {
        placton.setNumPlacton(placton.getNumPlacton() - num);
    }
    
    public void IncrementarDia(){
        dia++;
    }
    
    public void CambiarTemperatura(){
        int valor = Utilidades.CalculaRandom(1, 100);
        
        if (this.temperatura >= 19 && valor >= 1 && valor <= 30) {
            this.temperatura += 0.5;
        } else if (this.temperatura >= 19 && valor > 30) {
            this.temperatura -= 0.5;
        } else if (this.temperatura < 19 && this.temperatura > 17 && valor >= 1 && valor <= 45) {
            this.temperatura += 0.5;
        } else if (this.temperatura < 19 && this.temperatura > 17 && valor >= 46 && valor <= 90) {
            this.temperatura -= 0.5;
        } else if (this.temperatura < 19 && this.temperatura > 17 && valor > 90) {
            this.temperatura += 0;
        } else if (this.temperatura <= 17 && valor >= 1 && valor <= 70) {
            this.temperatura += 0.5;
        } else {
            this.temperatura -= 0.5;
        }
    }
    
    public void ContaminarOceano(){
        diasContaminado++;
    }
    
    public void CazaFurtiva(){
       cazaFurtiva = true;
    }
}
