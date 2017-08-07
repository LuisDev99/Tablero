
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Eduardo Zepeda
 */
public class Configuracion extends javax.swing.JFrame {
    Menu_principal menup = new Menu_principal();
    public static boolean confirme = false; //Esta variable sirve para hacer la verificacion si el usuario le dio guardar, se pone en verdadero

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Salir_Configuracion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Salir_config(evt);
            }
        });

        Salir_Configuracion.setText("Salir y guardar");
        Salir_Configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salir_Configuracion(evt);
            }
        });
        Salir_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_ConfiguracionActionPerformed(evt);
            }
        });

        jLabel2.setText("Eliga la dificultad que desea");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Genious");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Expert");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Normal");

        jLabel3.setText("Eliga el modo de juego");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Aleatorio");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Manual");

        jButton1.setText("Poner por defalto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir_Configuracion)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(51, 51, 51)
                                .addComponent(jRadioButton2)
                                .addGap(46, 46, 46)
                                .addComponent(jRadioButton3)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir_Configuracion)
                    .addComponent(jButton1))
                .addGap(47, 47, 47))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Salir_Configuracion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir_Configuracion
        /* Este evento lo que hace es guardar la configuracion de parte del usuario */
 //Esta siguiente condicion se asegura que los dos radiobuttons esten seleccionados, si no le tira un mensaje al usuario a que seleccione los dos radiobutton      
        if(jRadioButton1.getSelectedObjects() == null &&
           jRadioButton2.getSelectedObjects() == null &&
           jRadioButton3.getSelectedObjects() == null ||
           jRadioButton4.getSelectedObjects() == null &&
           jRadioButton5.getSelectedObjects() == null){
            
            JOptionPane.showMessageDialog(null, "Porfavor selecciona todos los botones para guardar la configuracion!");
  
        }else{ //Si los dos radiobuttons estan seleccionados, se guarda la configuracion personalizada y regresa al menu principal
            confirme = true;
            menup.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Salir_Configuracion

    private void Salir_config(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Salir_config
/*Este evento lo que hace es avisarle al usuario si esta seguro que quiere salir solo si no ha guardado la configuracion*/
        if(confirme == false){
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            String ObjButtons[] = {"Yes","No"};
            int PromptResult = JOptionPane.showOptionDialog(null,"¿Estas seguro que quieres salir?\n No has guardado los datos","Confirmar",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION){
            confirme = false;       
            menup.setVisible(true);
            dispose(); 
        }
      }
    }//GEN-LAST:event_Salir_config

    private void Salir_ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_ConfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salir_ConfiguracionActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     /*Este evento lo que hace es poner la configuracion por defalto tal y como dice el lineamiento
       del proyecto, osea poner la dificultad en normal, y el modo de juego en aleatorio
       y hace la variable global booleana en false*/
     
      jRadioButton1.setSelected(true);
      jRadioButton4.setSelected(true);
      confirme = false;
   
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });   
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir_Configuracion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    // End of variables declaration//GEN-END:variables
}
