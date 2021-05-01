/*
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//SISTEMA : ALIBABÁ Y LOS CIENTO UN MIL LADRONES
//MODULO : ConfiguracionGeneral
//PROCESO : Menú 
//DESCRIPCION : El código nos guíara a las ventanas de Perfil, ¿Comó Jugar? y Creditos
//ANALISTAS : Ing. Mauro Rosas
//PROGRAMADOR : Saúl Alpala, Doménica Erazo, Samantha Jara
//FECHA CREACION, MODIFICACION:23 de agosto 2020, 20 de septiembre 2020
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

 */
package Ventanas;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class ConfiguracionGeneral extends javax.swing.JFrame {

    public ConfiguracionGeneral() {
        initComponents();
        setLocationRelativeTo(this);
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setLocationRelativeTo(null);
       
        btn_regresar.setOpaque(false);
        btn_regresar.setBorder(BorderFactory.createEmptyBorder());
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.setToolTipText("regresar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_creditos = new javax.swing.JButton();
        btn_comoJugar = new javax.swing.JButton();
        btn_perfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/creditos.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 90, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hlp.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 110, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 90, 110));

        btn_creditos.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        btn_creditos.setText("CREDITOS");
        btn_creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 130, -1));

        btn_comoJugar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        btn_comoJugar.setText("¿COMÓ JUGAR?");
        btn_comoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comoJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_comoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        btn_perfil.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        btn_perfil.setText("PERFIL");
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 100, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 970, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoArabew.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed

        Perfil pe = new Perfil();
        pe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void btn_comoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comoJugarActionPerformed
        Ayuda ayu = new Ayuda();
        ayu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_comoJugarActionPerformed

    private void btn_creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditosActionPerformed
        Creditos cre = new Creditos();
        cre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_creditosActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        MenuPrincipal bi = new MenuPrincipal();
        bi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConfiguracionGeneral().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comoJugar;
    private javax.swing.JButton btn_creditos;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
