
import java.net.URL;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Tablero extends javax.swing.JFrame {

   public static boolean v = false;
    
    
    public Tablero() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JLabel6 = new javax.swing.JLabel();
        JLabel5 = new javax.swing.JLabel();
        JLabel10 = new javax.swing.JLabel();
        JLabel9 = new javax.swing.JLabel();
        JLabel12 = new javax.swing.JLabel();
        JLabel11 = new javax.swing.JLabel();
        JLabel14 = new javax.swing.JLabel();
        JLabel13 = new javax.swing.JLabel();
        JLabel18 = new javax.swing.JLabel();
        JLabel17 = new javax.swing.JLabel();
        JLabel20 = new javax.swing.JLabel();
        JLabel19 = new javax.swing.JLabel();
        JLabel22 = new javax.swing.JLabel();
        JLabel21 = new javax.swing.JLabel();
        JLabel26 = new javax.swing.JLabel();
        JLabel25 = new javax.swing.JLabel();
        JLabel28 = new javax.swing.JLabel();
        JLabel27 = new javax.swing.JLabel();
        JLabel30 = new javax.swing.JLabel();
        JLabel29 = new javax.swing.JLabel();
        JLabel34 = new javax.swing.JLabel();
        JLabel33 = new javax.swing.JLabel();
        JLabel36 = new javax.swing.JLabel();
        JLabel35 = new javax.swing.JLabel();
        JLabel38 = new javax.swing.JLabel();
        JLabel37 = new javax.swing.JLabel();
        JLabel42 = new javax.swing.JLabel();
        JLabel41 = new javax.swing.JLabel();
        JLabel44 = new javax.swing.JLabel();
        JLabel43 = new javax.swing.JLabel();
        JLabel46 = new javax.swing.JLabel();
        JLabel45 = new javax.swing.JLabel();

        jLabel49.setText("jLabel1");

        jLabel50.setText("jLabel1");

        jLabel52.setText("jLabel1");

        jLabel51.setText("jLabel1");

        jLabel55.setText("jLabel1");

        jLabel56.setText("jLabel1");

        jLabel54.setText("jLabel1");

        jLabel53.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabel2.setBackground(new java.awt.Color(0, 0, 0));
        JLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jjjj.gif"))); // NOI18N
        JLabel2.setOpaque(true);
        JLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel2MouseClicked(evt);
            }
        });

        JLabel1.setBackground(new java.awt.Color(153, 0, 0));
        JLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel1.setOpaque(true);

        JLabel4.setBackground(new java.awt.Color(0, 0, 0));
        JLabel4.setOpaque(true);

        JLabel3.setBackground(new java.awt.Color(153, 0, 0));
        JLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jjjj.gif"))); // NOI18N
        JLabel3.setOpaque(true);

        JLabel6.setBackground(new java.awt.Color(0, 0, 0));
        JLabel6.setOpaque(true);

        JLabel5.setBackground(new java.awt.Color(153, 0, 0));
        JLabel5.setOpaque(true);

        JLabel10.setBackground(new java.awt.Color(153, 0, 0));
        JLabel10.setOpaque(true);
        JLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel10MouseClicked(evt);
            }
        });

        JLabel9.setBackground(new java.awt.Color(0, 0, 0));
        JLabel9.setOpaque(true);

        JLabel12.setBackground(new java.awt.Color(153, 0, 0));
        JLabel12.setOpaque(true);

        JLabel11.setBackground(new java.awt.Color(0, 0, 0));
        JLabel11.setOpaque(true);

        JLabel14.setBackground(new java.awt.Color(153, 0, 0));
        JLabel14.setOpaque(true);

        JLabel13.setBackground(new java.awt.Color(0, 0, 0));
        JLabel13.setOpaque(true);

        JLabel18.setBackground(new java.awt.Color(0, 0, 0));
        JLabel18.setOpaque(true);

        JLabel17.setBackground(new java.awt.Color(153, 0, 0));
        JLabel17.setOpaque(true);

        JLabel20.setBackground(new java.awt.Color(0, 0, 0));
        JLabel20.setOpaque(true);

        JLabel19.setBackground(new java.awt.Color(153, 0, 0));
        JLabel19.setOpaque(true);

        JLabel22.setBackground(new java.awt.Color(0, 0, 0));
        JLabel22.setOpaque(true);

        JLabel21.setBackground(new java.awt.Color(153, 0, 0));
        JLabel21.setOpaque(true);

        JLabel26.setBackground(new java.awt.Color(153, 0, 0));
        JLabel26.setOpaque(true);

        JLabel25.setBackground(new java.awt.Color(0, 0, 0));
        JLabel25.setOpaque(true);

        JLabel28.setBackground(new java.awt.Color(153, 0, 0));
        JLabel28.setOpaque(true);

        JLabel27.setBackground(new java.awt.Color(0, 0, 0));
        JLabel27.setOpaque(true);

        JLabel30.setBackground(new java.awt.Color(153, 0, 0));
        JLabel30.setOpaque(true);

        JLabel29.setBackground(new java.awt.Color(0, 0, 0));
        JLabel29.setOpaque(true);

        JLabel34.setBackground(new java.awt.Color(0, 0, 0));
        JLabel34.setOpaque(true);

        JLabel33.setBackground(new java.awt.Color(153, 0, 0));
        JLabel33.setOpaque(true);

        JLabel36.setBackground(new java.awt.Color(0, 0, 0));
        JLabel36.setOpaque(true);

        JLabel35.setBackground(new java.awt.Color(153, 0, 0));
        JLabel35.setOpaque(true);

        JLabel38.setBackground(new java.awt.Color(0, 0, 0));
        JLabel38.setOpaque(true);

        JLabel37.setBackground(new java.awt.Color(153, 0, 0));
        JLabel37.setOpaque(true);

        JLabel42.setBackground(new java.awt.Color(153, 0, 0));
        JLabel42.setOpaque(true);

        JLabel41.setBackground(new java.awt.Color(0, 0, 0));
        JLabel41.setOpaque(true);

        JLabel44.setBackground(new java.awt.Color(153, 0, 0));
        JLabel44.setOpaque(true);

        JLabel43.setBackground(new java.awt.Color(0, 0, 0));
        JLabel43.setOpaque(true);

        JLabel46.setBackground(new java.awt.Color(153, 0, 0));
        JLabel46.setOpaque(true);

        JLabel45.setBackground(new java.awt.Color(0, 0, 0));
        JLabel45.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel2MouseClicked
      
     
      
    }//GEN-LAST:event_JLabel2MouseClicked

    private void JLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel10MouseClicked
       
        if( v == true)
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("copyyy-iloveimg-resized.gif")); /*fantasmas-halloween-gifs-156x130[4].gif*/
            JLabel10.setIcon(icon);
            JLabel2.setIcon(null);
            
        }
        else
        {
             JLabel10.setIcon(null);
             v = false;
        }
        
        v = false; 
    }//GEN-LAST:event_JLabel10MouseClicked
    
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel10;
    private javax.swing.JLabel JLabel11;
    private javax.swing.JLabel JLabel12;
    private javax.swing.JLabel JLabel13;
    private javax.swing.JLabel JLabel14;
    private javax.swing.JLabel JLabel17;
    private javax.swing.JLabel JLabel18;
    private javax.swing.JLabel JLabel19;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel20;
    private javax.swing.JLabel JLabel21;
    private javax.swing.JLabel JLabel22;
    private javax.swing.JLabel JLabel25;
    private javax.swing.JLabel JLabel26;
    private javax.swing.JLabel JLabel27;
    private javax.swing.JLabel JLabel28;
    private javax.swing.JLabel JLabel29;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel30;
    private javax.swing.JLabel JLabel33;
    private javax.swing.JLabel JLabel34;
    private javax.swing.JLabel JLabel35;
    private javax.swing.JLabel JLabel36;
    private javax.swing.JLabel JLabel37;
    private javax.swing.JLabel JLabel38;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel41;
    private javax.swing.JLabel JLabel42;
    private javax.swing.JLabel JLabel43;
    private javax.swing.JLabel JLabel44;
    private javax.swing.JLabel JLabel45;
    private javax.swing.JLabel JLabel46;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel9;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    // End of variables declaration//GEN-END:variables
}
