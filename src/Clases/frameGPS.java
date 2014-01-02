
/*
 * frameGPS.java
 *
 * Created on Apr 7, 2012, 5:22:24 PM
 */
package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author HCarrasc
 */
public class frameGPS extends javax.swing.JFrame {

    ArrayList<Punto> puntos = new ArrayList();
    ArrayList<arista> lineas = new ArrayList();
    gestionDB basedatos = new gestionDB();
    Punto p = new Punto();
    Punto[] ps = new Punto[800];
    arista arista = new arista();
    Punto aux[] = new Punto[3];
    int accionCase;
    int k = 0;
    int linea = 0;
    int op = 0;
    int id = 1;

    public frameGPS() {
        p.x = 0;
        p.y = 0;
        arista.x1 = 0;
        arista.x2 = 0;
        arista.y1 = 0;
        arista.y2 = 0;
        initComponents();
        puntos.clear();
    }

    //<editor-fold defaultstate="collapsed" desc="Codigo usado para marcar los nodos">
    @Override
    public void paint(Graphics g) {

        //super.paint(g);
        switch (accionCase) {

            case 1: {
                puntos.add(p);
                k++;
                g.setColor(Color.red);
                Font f = new Font("Tahoma", Font.BOLD, 29);
                g.setFont(f);
                int i = 0;

                while (puntos.size() > i) {
                    g.drawString(".", puntos.get(i).x + 7, puntos.get(i).y + 127);
                    i++;
                }
                break;
            }
            case 2: {

                linea = 0;
                k = 0;
                g.setColor(Color.BLUE);
                Graphics2D g2 = (Graphics2D) g;
                while (lineas.size() > k) {
                    g.drawLine(lineas.get(k).x1 + 8, lineas.get(k).y1 + 128, lineas.get(k).x2 + 7, lineas.get(k).y2 + 127);
                    System.out.println("Linea creada!");
                    k++;
                }
                break;
            }

            case 3: {

                int i = 0;
                g.setColor(Color.red);
                Font f = new Font("Tahoma", Font.BOLD, 29);
                g.setFont(f);

                while (puntos.size() > i) {
                    g.drawString(".", puntos.get(i).x + 7, puntos.get(i).y + 127);
                    System.out.println("dibujando");
                    i++;
                }
                break;
            }
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jlidcoordenada = new javax.swing.JLabel();
        jlcoordenadax = new javax.swing.JLabel();
        jlcoordenaday1 = new javax.swing.JLabel();
        jtcoordenadax = new javax.swing.JTextField();
        jtIdOrigen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtDensidad = new javax.swing.JTextField();
        jtcoordenaday = new javax.swing.JTextField();
        jtEstacionamiento = new javax.swing.JTextField();
        jtVorigen = new javax.swing.JTextField();
        jtCalle = new javax.swing.JTextField();
        jtSentido = new javax.swing.JTextField();
        jtDistancia = new javax.swing.JTextField();
        jlIdArista = new javax.swing.JTextField();
        jtComerciales = new javax.swing.JTextField();
        jtAdministrativo = new javax.swing.JTextField();
        jtOcio = new javax.swing.JTextField();
        jtPeatonal = new javax.swing.JTextField();
        jtVelocidad = new javax.swing.JTextField();
        jtIdDestino = new javax.swing.JTextField();
        jtcoordenadaxDestino = new javax.swing.JTextField();
        jtcoordenadayDestino = new javax.swing.JTextField();
        jlcoordenaday2 = new javax.swing.JLabel();
        jlcoordenadax1 = new javax.swing.JLabel();
        jlidcoordenada1 = new javax.swing.JLabel();
        jtVdestino = new javax.swing.JTextField();
        jlMapa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Simulador GPS - Hector Carrasco");
        setLocationByPlatform(true);
        setName("principalFrame"); // NOI18N
        setResizable(false);

        jlidcoordenada.setText("id:");
        jlidcoordenada.setBounds(50, 20, 20, 20);
        jLayeredPane3.add(jlidcoordenada, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlcoordenadax.setText("x:");
        jlcoordenadax.setBounds(50, 50, 20, 20);
        jLayeredPane3.add(jlcoordenadax, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlcoordenaday1.setText("y:");
        jlcoordenaday1.setBounds(50, 80, 20, 20);
        jLayeredPane3.add(jlcoordenaday1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtcoordenadax.setBounds(70, 50, 70, 25);
        jLayeredPane3.add(jtcoordenadax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtIdOrigen.setBounds(70, 20, 70, 25);
        jLayeredPane3.add(jtIdOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(40, 120, 290, 10);
        jLayeredPane3.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("peatonal");
        jLabel4.setBounds(160, 240, 80, 20);
        jLayeredPane3.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("id");
        jLabel5.setBounds(40, 130, 20, 20);
        jLayeredPane3.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("v.o");
        jLabel6.setBounds(40, 160, 30, 20);
        jLayeredPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("v.d");
        jLabel7.setBounds(40, 190, 30, 20);
        jLayeredPane3.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("calle");
        jLabel8.setBounds(40, 230, 30, 20);
        jLayeredPane3.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("sentido");
        jLabel9.setBounds(20, 260, 50, 20);
        jLayeredPane3.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setText("distancia");
        jLabel10.setBounds(10, 290, 60, 20);
        jLayeredPane3.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("velocidad");
        jLabel11.setBounds(160, 270, 80, 20);
        jLayeredPane3.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setText("estacionam.");
        jLabel12.setBounds(160, 300, 70, 20);
        jLayeredPane3.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setText("densidad");
        jLabel13.setBounds(10, 320, 60, 20);
        jLayeredPane3.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setText("comerciales");
        jLabel14.setBounds(160, 150, 80, 20);
        jLayeredPane3.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setText("administrat.");
        jLabel15.setBounds(160, 180, 80, 20);
        jLayeredPane3.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setText("ocio");
        jLabel16.setBounds(160, 210, 80, 20);
        jLayeredPane3.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtDensidad.setBounds(70, 320, 70, 25);
        jLayeredPane3.add(jtDensidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtcoordenaday.setBounds(70, 80, 70, 25);
        jLayeredPane3.add(jtcoordenaday, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtEstacionamiento.setBounds(240, 300, 70, 25);
        jLayeredPane3.add(jtEstacionamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtVorigen.setBounds(70, 160, 70, 25);
        jLayeredPane3.add(jtVorigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtCalle.setBounds(70, 230, 70, 25);
        jLayeredPane3.add(jtCalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtSentido.setBounds(70, 260, 70, 25);
        jLayeredPane3.add(jtSentido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtDistancia.setBounds(70, 290, 70, 25);
        jLayeredPane3.add(jtDistancia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlIdArista.setBounds(70, 130, 70, 25);
        jLayeredPane3.add(jlIdArista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtComerciales.setBounds(240, 150, 70, 25);
        jLayeredPane3.add(jtComerciales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtAdministrativo.setBounds(240, 180, 70, 25);
        jLayeredPane3.add(jtAdministrativo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtOcio.setBounds(240, 210, 70, 25);
        jLayeredPane3.add(jtOcio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtPeatonal.setBounds(240, 240, 70, 25);
        jLayeredPane3.add(jtPeatonal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtVelocidad.setBounds(240, 270, 70, 25);
        jLayeredPane3.add(jtVelocidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtIdDestino.setBounds(190, 20, 70, 25);
        jLayeredPane3.add(jtIdDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtcoordenadaxDestino.setBounds(190, 50, 70, 25);
        jLayeredPane3.add(jtcoordenadaxDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtcoordenadayDestino.setBounds(190, 80, 70, 25);
        jLayeredPane3.add(jtcoordenadayDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlcoordenaday2.setText("y:");
        jlcoordenaday2.setBounds(170, 80, 20, 20);
        jLayeredPane3.add(jlcoordenaday2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlcoordenadax1.setText("x:");
        jlcoordenadax1.setBounds(170, 50, 20, 20);
        jLayeredPane3.add(jlcoordenadax1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlidcoordenada1.setText("id:");
        jlidcoordenada1.setBounds(170, 20, 20, 20);
        jLayeredPane3.add(jlidcoordenada1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtVdestino.setBounds(70, 190, 70, 25);
        jLayeredPane3.add(jtVdestino, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        jPanel2.setBounds(730, 0, 360, 360);
        jLayeredPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa/mapa.png"))); // NOI18N
        jlMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMapaMouseClicked(evt);
            }
        });
        jlMapa.setBounds(10, 100, 1070, 590);
        jLayeredPane1.add(jlMapa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Sistema Simulador GPS: Ciudad de Concepción, Chile");
        jLabel1.setBounds(50, 10, 570, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("ingresar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(570, 50, 160, 27);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("caminando");
        jLabel2.setBounds(350, 50, 80, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setText("transporte p");
        jLabel17.setBounds(250, 50, 80, 30);
        jLayeredPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setText("vehiculo");
        jLabel18.setBounds(440, 50, 80, 30);
        jLayeredPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMapaMouseClicked

        p.x = evt.getX();
        p.y = evt.getY();

        try {
            p = basedatos.GetPunto(p);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frameGPS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (p.x != 0 && p.y != 0) {
            switch (op) {
                case 0:
                    jtIdOrigen.setText(String.valueOf(p.idpunto));
                    jtVorigen.setText(String.valueOf(p.idpunto));
                    op = 1;
                    break;
                case 1:
                    jtIdDestino.setText(String.valueOf(p.idpunto));
                    jtVdestino.setText(String.valueOf(p.idpunto));
                    op = 0;
                    break;
            }
        }
        
        accionCase = 1;

        repaint();

        //<editor-fold defaultstate="collapsed" desc="Codigo para obtener un punto y dibujarlos en pantalla">
//        try {
//            p = basedatos.GetPunto(p);
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(frameGPS.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        if (p.x != 0 && p.y != 0) {
//            accionCase = 1;
//            repaint();
//        }
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Codigo usado para ingresar nodos a la BD">
//        try {
//            basedatos.poblarNodos(id, p.x, p.y);
//            id++;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(frameGPS.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(frameGPS.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        accionCase = 1;
//
//        repaint();

        //jlpunto.setLocation(x+7, y+95);
        //</editor-fold>
    }//GEN-LAST:event_jlMapaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        arista.idOrigen = Integer.parseInt(jtIdOrigen.getText());
        arista.idDestino = Integer.parseInt(jtIdDestino.getText());
        arista.nombreCalle = jtCalle.getText();
        arista.sentido = Integer.parseInt(jtSentido.getText());
        arista.distancia = Integer.parseInt(jtDistancia.getText());
        arista.velocidad = Integer.parseInt(jtVelocidad.getText());
        arista.densidad  = Integer.parseInt(jtDensidad.getText());
        arista.estacionamiento = Integer.parseInt(jtEstacionamiento.getText());
        arista.comerciales = Integer.parseInt(jtComerciales.getText());
        arista.administrativo = Integer.parseInt(jtAdministrativo.getText());
        arista.ocio = Integer.parseInt(jtOcio.getText());
        arista.peatonal = Integer.parseInt(jtPeatonal.getText());
        
        try {
            basedatos.poblarCalles(arista);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frameGPS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("  -  Calle ingresada ok!");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException |
                InstantiationException |
                IllegalAccessException |
                UnsupportedLookAndFeelException e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frameGPS().setVisible(true);
            }
        });
    }
    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jlIdArista;
    private javax.swing.JLabel jlMapa;
    private javax.swing.JLabel jlcoordenadax;
    private javax.swing.JLabel jlcoordenadax1;
    private javax.swing.JLabel jlcoordenaday1;
    private javax.swing.JLabel jlcoordenaday2;
    private javax.swing.JLabel jlidcoordenada;
    private javax.swing.JLabel jlidcoordenada1;
    private javax.swing.JTextField jtAdministrativo;
    private javax.swing.JTextField jtCalle;
    private javax.swing.JTextField jtComerciales;
    private javax.swing.JTextField jtDensidad;
    private javax.swing.JTextField jtDistancia;
    private javax.swing.JTextField jtEstacionamiento;
    private javax.swing.JTextField jtIdDestino;
    private javax.swing.JTextField jtIdOrigen;
    private javax.swing.JTextField jtOcio;
    private javax.swing.JTextField jtPeatonal;
    private javax.swing.JTextField jtSentido;
    private javax.swing.JTextField jtVdestino;
    private javax.swing.JTextField jtVelocidad;
    private javax.swing.JTextField jtVorigen;
    private javax.swing.JTextField jtcoordenadax;
    private javax.swing.JTextField jtcoordenadaxDestino;
    private javax.swing.JTextField jtcoordenaday;
    private javax.swing.JTextField jtcoordenadayDestino;
    // End of variables declaration//GEN-END:variables
    //
}
