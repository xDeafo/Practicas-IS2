/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Oceano;
import Modelo.GranDepredador;
import Modelo.KrillPlacton;
import Modelo.Peces;
import Modelo.PezGrande;
import Modelo.PezPequeño;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ventura
 */
public class Pecera extends javax.swing.JFrame {

    private Oceano oc = new Oceano();
    ArrayList<Peces> pecesAux;

    /**
     * Creates new form Pecera
     */
    public Pecera(Oceano oc) {

        initComponents();
        this.setSize(1019, 650);

        this.oc = oc;
        pecesAux = oc.getPeces();
        RellenaInformacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_calentamiento = new javax.swing.JButton();
        btn_deshielo = new javax.swing.JButton();
        btn_captura_depredadores = new javax.swing.JButton();
        btn_contaminacion = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btnCambiarDia = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lb_fecha_mar = new javax.swing.JLabel();
        lb_temperatura = new javax.swing.JLabel();
        lb_tibu_blancos = new javax.swing.JLabel();
        lb_tibu_toro = new javax.swing.JLabel();
        lb_pez_espada = new javax.swing.JLabel();
        lb_atunes = new javax.swing.JLabel();
        lb_dorados = new javax.swing.JLabel();
        lb_bacalaos = new javax.swing.JLabel();
        lb_besugos = new javax.swing.JLabel();
        lb_meros = new javax.swing.JLabel();
        lb_boquerones = new javax.swing.JLabel();
        lb_TotalDepre = new javax.swing.JLabel();
        lb_sardinas = new javax.swing.JLabel();
        lb_lenguados = new javax.swing.JLabel();
        lb_jureles = new javax.swing.JLabel();
        lb_gallos = new javax.swing.JLabel();
        lb_TotalPP = new javax.swing.JLabel();
        lb_plancton = new javax.swing.JLabel();
        lb_TotalPG1 = new javax.swing.JLabel();
        lb_catastrofes = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_calentamiento.setText("Calentamiento global");
        btn_calentamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calentamientoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calentamiento);
        btn_calentamiento.setBounds(570, 60, 200, 31);

        btn_deshielo.setText("Deshielo de polos");
        btn_deshielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deshieloActionPerformed(evt);
            }
        });
        getContentPane().add(btn_deshielo);
        btn_deshielo.setBounds(790, 60, 200, 31);

        btn_captura_depredadores.setText("Captura de depredadores");
        btn_captura_depredadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_captura_depredadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_captura_depredadores);
        btn_captura_depredadores.setBounds(570, 110, 200, 31);

        btn_contaminacion.setText("Gran contaminacion");
        btn_contaminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contaminacionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_contaminacion);
        btn_contaminacion.setBounds(790, 110, 200, 31);

        btn_atras.setText("Salir");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras);
        btn_atras.setBounds(790, 520, 200, 31);

        btnCambiarDia.setText("Siguiente día");
        btnCambiarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarDiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiarDia);
        btnCambiarDia.setBounds(790, 423, 200, 30);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(790, 473, 200, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Catastrofes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 20, 120, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha del mar:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(58, 31, 110, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Temperatura del agua:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(253, 31, 150, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Animales:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(58, 80, 140, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grandes depredadores:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(102, 100, 160, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peces grandes:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(102, 248, 120, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peces pequeños:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(102, 391, 130, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Krill y plancton:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(58, 542, 120, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catastrofes:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(58, 584, 110, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tiburones blancos:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(162, 132, 120, 14);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tiburones toro:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(162, 166, 90, 14);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Peces espada:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(162, 198, 90, 14);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Atunes:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(163, 280, 60, 14);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Dorados:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(163, 300, 60, 14);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Bacalaos:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(163, 319, 70, 14);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Besugos:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(163, 339, 60, 14);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Meros:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(163, 359, 50, 14);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Boquerones:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(163, 416, 80, 14);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Sardinas:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(163, 441, 70, 14);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Lenguados:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(163, 461, 80, 14);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Jureles:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(163, 486, 60, 14);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Gallos:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(163, 511, 50, 14);

        lb_fecha_mar.setForeground(new java.awt.Color(255, 255, 255));
        lb_fecha_mar.setText("Fecha del mar:");
        getContentPane().add(lb_fecha_mar);
        lb_fecha_mar.setBounds(175, 31, 70, 14);

        lb_temperatura.setForeground(new java.awt.Color(255, 255, 255));
        lb_temperatura.setText("Temperatura del agua:");
        getContentPane().add(lb_temperatura);
        lb_temperatura.setBounds(409, 31, 50, 14);

        lb_tibu_blancos.setForeground(new java.awt.Color(255, 255, 255));
        lb_tibu_blancos.setText("Tiburones blancos:");
        getContentPane().add(lb_tibu_blancos);
        lb_tibu_blancos.setBounds(282, 132, 100, 14);

        lb_tibu_toro.setForeground(new java.awt.Color(255, 255, 255));
        lb_tibu_toro.setText("Tiburones toro:");
        getContentPane().add(lb_tibu_toro);
        lb_tibu_toro.setBounds(282, 166, 90, 14);

        lb_pez_espada.setForeground(new java.awt.Color(255, 255, 255));
        lb_pez_espada.setText("Peces espada:");
        getContentPane().add(lb_pez_espada);
        lb_pez_espada.setBounds(278, 198, 80, 14);

        lb_atunes.setForeground(new java.awt.Color(255, 255, 255));
        lb_atunes.setText("Atunes:");
        getContentPane().add(lb_atunes);
        lb_atunes.setBounds(231, 280, 70, 14);

        lb_dorados.setForeground(new java.awt.Color(255, 255, 255));
        lb_dorados.setText("Dorados:");
        getContentPane().add(lb_dorados);
        lb_dorados.setBounds(233, 300, 80, 14);

        lb_bacalaos.setForeground(new java.awt.Color(255, 255, 255));
        lb_bacalaos.setText("Bacalaos:");
        getContentPane().add(lb_bacalaos);
        lb_bacalaos.setBounds(235, 319, 80, 14);

        lb_besugos.setForeground(new java.awt.Color(255, 255, 255));
        lb_besugos.setText("Besugos:");
        getContentPane().add(lb_besugos);
        lb_besugos.setBounds(237, 339, 80, 14);

        lb_meros.setForeground(new java.awt.Color(255, 255, 255));
        lb_meros.setText("Meros:");
        getContentPane().add(lb_meros);
        lb_meros.setBounds(226, 359, 70, 14);

        lb_boquerones.setForeground(new java.awt.Color(255, 255, 255));
        lb_boquerones.setText("Boquerones:");
        getContentPane().add(lb_boquerones);
        lb_boquerones.setBounds(260, 416, 70, 14);

        lb_TotalDepre.setForeground(new java.awt.Color(255, 255, 255));
        lb_TotalDepre.setText("jLabel24");
        getContentPane().add(lb_TotalDepre);
        lb_TotalDepre.setBounds(270, 100, 80, 14);

        lb_sardinas.setForeground(new java.awt.Color(255, 255, 255));
        lb_sardinas.setText("Sardinas:");
        getContentPane().add(lb_sardinas);
        lb_sardinas.setBounds(244, 441, 50, 14);

        lb_lenguados.setForeground(new java.awt.Color(255, 255, 255));
        lb_lenguados.setText("Lenguados:");
        getContentPane().add(lb_lenguados);
        lb_lenguados.setBounds(260, 461, 60, 14);

        lb_jureles.setForeground(new java.awt.Color(255, 255, 255));
        lb_jureles.setText("Jureles:");
        getContentPane().add(lb_jureles);
        lb_jureles.setBounds(237, 486, 40, 14);

        lb_gallos.setForeground(new java.awt.Color(255, 255, 255));
        lb_gallos.setText("Gallos:");
        getContentPane().add(lb_gallos);
        lb_gallos.setBounds(231, 511, 40, 14);

        lb_TotalPP.setForeground(new java.awt.Color(255, 255, 255));
        lb_TotalPP.setText("jLabel24");
        getContentPane().add(lb_TotalPP);
        lb_TotalPP.setBounds(240, 390, 80, 14);

        lb_plancton.setForeground(new java.awt.Color(255, 255, 255));
        lb_plancton.setText("Krill y plancton:");
        getContentPane().add(lb_plancton);
        lb_plancton.setBounds(197, 542, 280, 14);

        lb_TotalPG1.setForeground(new java.awt.Color(255, 255, 255));
        lb_TotalPG1.setText("jLabel24");
        getContentPane().add(lb_TotalPG1);
        lb_TotalPG1.setBounds(240, 250, 80, 14);

        lb_catastrofes.setForeground(new java.awt.Color(255, 255, 255));
        lb_catastrofes.setText("Catastrofes:");
        getContentPane().add(lb_catastrofes);
        lb_catastrofes.setBounds(175, 584, 240, 14);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo-del-mar-189765.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 1030, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calentamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calentamientoActionPerformed
        oc.calentamientoGlobal();
        lb_catastrofes.setText("Calentamiento global");
    }//GEN-LAST:event_btn_calentamientoActionPerformed

    private void btnCambiarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDiaActionPerformed
        if (oc.getDiasContaminado() > 0 && oc.getDiasContaminado() < 2) {
            oc.ContaminarOceano();
        } else {
            oc.setDiasContaminado(0);
        }

        Iterator<Peces> itr = pecesAux.iterator();
        ArrayList<Peces> pecesNacidos = new ArrayList<>();

        while (itr.hasNext()) {
            Peces pez = itr.next();

            if (pez instanceof GranDepredador) {
                if (oc.getDiasContaminado() > 0) {
                    ((GranDepredador) pez).setProbabilidadMorir(((GranDepredador) pez).getProbabilidadMorir() + 10);
                }
                if (oc.isCazaFurtiva()) {
                    ((GranDepredador) pez).setProbabilidadMorir(((GranDepredador) pez).getProbabilidadMorir() + 15);
                }
                if (pez.isMuerto()) {

                    itr.remove();
                } else {
                    if (pez.Morir()) {

                        itr.remove();
                    } else {
                        int numeroPecesComidos = pez.Comer();
                        if (numeroPecesComidos == 0) {
                            itr.remove();
                        } else {
                            if (oc.getPecesGrandes().get(Oceano.TOTALESPG) == 0) {
                                itr.remove();
                            } else {
                                MatarMasLentos(numeroPecesComidos, "PG");
                                if (pez.Reproducirse()) {
                                    pecesNacidos.add(pez.Nacer(oc.getDia()));
                                }

                            }
                        }

                    }
                }
            } else if (pez instanceof PezGrande) {
                if (oc.getDiasContaminado() > 0) {
                    ((PezGrande) pez).setProbabilidadMorir(((PezGrande) pez).getProbabilidadMorir() + 10);
                }
                if (pez.isMuerto()) {

                    itr.remove();
                } else {
                    if (pez.Morir()) {

                        itr.remove();
                    } else {
                        int numeroPecesComidos = pez.Comer();
                        if (numeroPecesComidos == 0) {
                            itr.remove();
                        } else {
                            if (oc.getPecesPequeños().get(Oceano.TOTALESPG) == 0) {
                                itr.remove();
                            } else {
                                MatarMasLentos(numeroPecesComidos, "PP");

                                if (pez.Reproducirse()) {
                                    pecesNacidos.add(pez.Nacer(oc.getDia()));
                                }
                            }
                        }

                    }
                }
            } else {
                if (oc.getDiasContaminado() > 0) {
                    ((PezPequeño) pez).setProbabilidadMorir(((PezPequeño) pez).getProbabilidadMorir() + 10);
                }
                if (pez.isMuerto()) {
                    itr.remove();
                } else {
                    if (pez.Morir()) {
                        itr.remove();
                    } else {
                        int numKrillComido = pez.Comer();
                        if (oc.getKrillPlancton() == 0) {
                            itr.remove();
                        } else {
                            oc.DecrementarPlacton(numKrillComido);

                            if (pez.Reproducirse()) {
                                pecesNacidos.add(pez.Nacer(oc.getDia()));
                            }
                        }

                    }
                }
            }
        }

        pecesAux.addAll(pecesNacidos);

        KrillPlacton placton = oc.getPlacton();
        placton.Reproducirse(oc.getTemperatura());
        oc.setPlacton(placton);

        oc.setPeces(pecesAux);
        oc.IncrementarDia();
        oc.CambiarTemperatura();
        oc.setDiasCazaFurtiva(false);
        RellenaInformacion();

    }//GEN-LAST:event_btnCambiarDiaActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_deshieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deshieloActionPerformed
        oc.deshieloPolos();
        lb_catastrofes.setText("Deshielo de polos");
    }//GEN-LAST:event_btn_deshieloActionPerformed

    private void btn_contaminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contaminacionActionPerformed
        oc.ContaminarOceano();
        lb_catastrofes.setText("Oceano contaminado");
    }//GEN-LAST:event_btn_contaminacionActionPerformed

    private void btn_captura_depredadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_captura_depredadoresActionPerformed
        oc.CazaFurtiva();
        lb_catastrofes.setText("Se esta produciendo caza furtiva");
    }//GEN-LAST:event_btn_captura_depredadoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       escribir();
       dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public int PezGrandeMasLento() {
        int pezMasLento = 0;
        float velocidad = 0;
        for (int i = 0; i < pecesAux.size(); i++) {
            if (!pecesAux.get(i).isMuerto()) {
                if (pecesAux.get(i) instanceof PezGrande) {
                    if (pezMasLento == 0) {
                        pezMasLento = i;
                        velocidad = pecesAux.get(i).getVelocidad();
                    } else {
                        if (pecesAux.get(i).getVelocidad() < velocidad) {
                            pezMasLento = i;
                            velocidad = pecesAux.get(i).getVelocidad();
                        }
                    }
                }
            }
        }
        return pezMasLento;
    }

    public int PezPequeñoMasLento() {
        int pezMasLento = 0;
        float velocidad = 0;
        for (int i = 0; i < pecesAux.size(); i++) {
            if (!pecesAux.get(i).isMuerto()) {
                if (pecesAux.get(i) instanceof PezPequeño) {
                    if (pezMasLento == 0) {
                        pezMasLento = i;
                        velocidad = pecesAux.get(i).getVelocidad();
                    } else {
                        if (pecesAux.get(i).getVelocidad() < velocidad) {
                            pezMasLento = i;
                            velocidad = pecesAux.get(i).getVelocidad();
                        }
                    }
                }
            }
        }
        return pezMasLento;
    }

    public void MatarMasLentos(int numeroPecesComidos, String tipo) {
        for (int i = 0; i < numeroPecesComidos; i++) {
            if (tipo.equals("PG")) {
                pecesAux.get(PezGrandeMasLento()).setMuerto(true);
            } else {
                pecesAux.get(PezPequeñoMasLento()).setMuerto(true);
            }

        }
    }

    private void RellenaInformacion() {
        lb_fecha_mar.setText(String.valueOf(oc.getDia()));
        lb_temperatura.setText(String.valueOf(oc.getTemperatura()));
        lb_tibu_blancos.setText(String.valueOf(oc.getDepredadores().get(Oceano.TIBU_BLANCO)));
        lb_tibu_toro.setText(String.valueOf(oc.getDepredadores().get(Oceano.TIBU_TORO)));
        lb_pez_espada.setText(String.valueOf(oc.getDepredadores().get(Oceano.ESPADA)));
        lb_atunes.setText(String.valueOf(oc.getPecesGrandes().get(Oceano.ATUNES)));
        lb_bacalaos.setText(String.valueOf(oc.getPecesGrandes().get(Oceano.BACALAOS)));
        lb_besugos.setText(String.valueOf(oc.getPecesGrandes().get(Oceano.BESUGOS)));
        lb_boquerones.setText(String.valueOf(oc.getPecesPequeños().get(Oceano.BOQUERONES)));
        lb_dorados.setText(String.valueOf(oc.getPecesGrandes().get(Oceano.DORADOS)));
        lb_gallos.setText(String.valueOf(oc.getPecesPequeños().get(Oceano.GALLOS)));
        lb_jureles.setText(String.valueOf(oc.getPecesPequeños().get(Oceano.JURELES)));
        lb_lenguados.setText(String.valueOf(oc.getPecesPequeños().get(Oceano.LENGUADOS)));
        lb_meros.setText(String.valueOf(oc.getPecesGrandes().get(Oceano.MEROS)));
        lb_sardinas.setText(String.valueOf(oc.getPecesPequeños().get(Oceano.SARDINAS)));
        lb_plancton.setText(String.valueOf(oc.getKrillPlancton()));
        lb_TotalDepre.setText(String.valueOf(oc.getDepredadores().get(Oceano.TOTALESD)));
        lb_TotalPG1.setText(String.valueOf(oc.getPecesGrandes().get(Oceano.TOTALESPG)));
        lb_TotalPP.setText(String.valueOf(oc.getPecesPequeños().get(Oceano.TOTALESPG)));
        
        lb_catastrofes.setText("Ninguna");
    }

    
    //Funcion para crear un fichero binario con los datos de mar
    public void escribir(){
        
        File myFile = new File("Oceano_guardado");
        ObjectOutputStream oos;
        
        try{
            
            oos = new ObjectOutputStream(new FileOutputStream(myFile));
            oos.writeObject(oc);
            oos.close();
            
        }catch(IOException e){}
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarDia;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_calentamiento;
    private javax.swing.JButton btn_captura_depredadores;
    private javax.swing.JButton btn_contaminacion;
    private javax.swing.JButton btn_deshielo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_TotalDepre;
    private javax.swing.JLabel lb_TotalPG1;
    private javax.swing.JLabel lb_TotalPP;
    private javax.swing.JLabel lb_atunes;
    private javax.swing.JLabel lb_bacalaos;
    private javax.swing.JLabel lb_besugos;
    private javax.swing.JLabel lb_boquerones;
    private javax.swing.JLabel lb_catastrofes;
    private javax.swing.JLabel lb_dorados;
    private javax.swing.JLabel lb_fecha_mar;
    private javax.swing.JLabel lb_gallos;
    private javax.swing.JLabel lb_jureles;
    private javax.swing.JLabel lb_lenguados;
    private javax.swing.JLabel lb_meros;
    private javax.swing.JLabel lb_pez_espada;
    private javax.swing.JLabel lb_plancton;
    private javax.swing.JLabel lb_sardinas;
    private javax.swing.JLabel lb_temperatura;
    private javax.swing.JLabel lb_tibu_blancos;
    private javax.swing.JLabel lb_tibu_toro;
    // End of variables declaration//GEN-END:variables
}
