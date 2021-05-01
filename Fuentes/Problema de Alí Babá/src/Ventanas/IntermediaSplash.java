/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//SISTEMA : ALIBABÁ Y LOS CIENTO UN MIL LADRONES
//MODULO : Intermedia
//PROCESO : Juego
//DESCRIPCION : El código indica el tiempo en el que se presenta el Splash
//ANALISTAS : Ing. Mauro Rosas
//PROGRAMADOR : Saúl Alpala, Doménica Erazo, Samantha Jara
//FECHA CREACION, MODIFICACION:23 de agosto 2020, 20 de septiembre 2020
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
*/
package Ventanas;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class IntermediaSplash extends javax.swing.JFrame {

    private Timer t;
    private ActionListener ac;
    private int x = 0;
static int prueba3 = 0;

    public static int getPrueba3() {
        return prueba3;
    }

    public static void setPrueba3(int prueba3) {
        IntermediaSplash.prueba3 = prueba3;
    }
    public IntermediaSplash() {
        initComponents();
        MenuPrincipal play = new MenuPrincipal();
        play.musica();
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        this.setLocationRelativeTo(null);
        jProgressBar1.setVisible(false);
        ac = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                x = x + 1;
                jProgressBar1.setValue(x);
                if(jProgressBar1.getValue()==1){
                    lbl_texto.setText("Cargando datos...");
                    ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/gif1.gif"));
                    Imagenes.setIcon(uno);
                }
                if(jProgressBar1.getValue()==5){
                    lbl_texto.setText("Cargando avatar...");
                    ImageIcon dos=new ImageIcon(this.getClass().getResource("/imagenes/gif2.gif"));
                    Imagenes.setIcon(dos);
                }
                if(jProgressBar1.getValue()==10){
                    lbl_texto.setText("Cargando tabla de record...");
                    ImageIcon tres=new ImageIcon(this.getClass().getResource("/imagenes/gif3.gif"));
                    Imagenes.setIcon(tres);
                }
                if(jProgressBar1.getValue()==15){
                    lbl_texto.setText("Cargando juego...");
                    ImageIcon cuatro=new ImageIcon(this.getClass().getResource("/imagenes/gif4.gif"));
                    Imagenes.setIcon(cuatro);
                }
                if(jProgressBar1.getValue()==20){
                    t.stop();
                    
                    MenuPrincipal bi = new MenuPrincipal();
                    bi.setVisible(true);
                    dispose();
                }
                        
            }
        };
        t = new Timer(200, ac);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_texto = new javax.swing.JLabel();
        Imagenes = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.gif"))); // NOI18N
        jLabel7.setText("jLabel6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 330));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 140, 330));

        lbl_texto.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_texto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 370, 30));

        Imagenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagenes.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 0, 0)));
        getContentPane().add(Imagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 530, 340));

        jProgressBar1.setMaximum(20);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondow.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntermediaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntermediaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntermediaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntermediaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntermediaSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagenes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbl_texto;
    // End of variables declaration//GEN-END:variables
}
