
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Tablero extends javax.swing.JFrame {
   
   public Boolean[][] fantasma_label = new Boolean[6][6]; //arreglo usado para verificar si el label tiene o no un fantasma(verdadero=si hay, false= no hay)
   public Boolean[][] mover_fantasma = new Boolean[6][6]; //arreglo usado para verificar el usuario quiere mover un fantasma
   public static JLabel[][] arreglo_labels = new JLabel[6][6];//arreglo grafico de labels
   public int fantasmas_j1 = 7; //numero de fantasmas disponibles del jugador 1
   public int fantasmas_j2 = 8; //numero de fantasmas disponibles del jugador 2
   UltimateTablero tb = new UltimateTablero();
   boolean t = false; //variable usada para verificar si quiere o no mover un fantasma(true-si quiere, false-no quiere)
   boolean turno = true; //variable que determina el turno de los jugadores (true- jugador1, false-jugador2)
   ImageIcon icon = new ImageIcon(getClass().getResource("fantasmas-halloween-gifs-156x130[4].gif"));
   boolean color=true;

    
    
    public Tablero() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        jLabel49.setText("jLabel1");

        jLabel50.setText("jLabel1");

        jLabel52.setText("jLabel1");

        jLabel51.setText("jLabel1");

        jLabel55.setText("jLabel1");

        jLabel56.setText("jLabel1");

        jLabel54.setText("jLabel1");

        jLabel53.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setBackground(java.awt.Color.red);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.red);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        jLabel8.setBackground(java.awt.Color.red);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel10.setBackground(java.awt.Color.red);
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 0, 0));
        jLabel12.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(153, 0, 0));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel15.setBackground(java.awt.Color.red);
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setOpaque(true);

        jLabel17.setBackground(java.awt.Color.red);
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });

        jLabel20.setBackground(java.awt.Color.red);
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel22.setBackground(java.awt.Color.red);
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(153, 0, 0));
        jLabel24.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(153, 0, 0));
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
        });

        jLabel27.setBackground(java.awt.Color.red);
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setOpaque(true);

        jLabel29.setBackground(java.awt.Color.red);
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel32.setBackground(java.awt.Color.red);
        jLabel32.setOpaque(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setOpaque(true);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel34.setBackground(java.awt.Color.red);
        jLabel34.setOpaque(true);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(153, 0, 0));
        jLabel36.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setOpaque(true);
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
             posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(0,1);
        if(pos==true){
           arreglo_labels[0][1].setIcon(icon);
           fantasma_label[0][1] = true;
           mover_fantasma[0][1] = false; 
           fantasmas_j1--;
            
        }
       
       
       }
      else
       {
           if(turno==true)
           {
                Boolean mover_fants = mover_fantasmitas(0,1);
                Boolean pos_disponibles = identificar_pos_disponibles(0,1);
                if(t == false &&pos_disponibles==true)           
                {
                   jLabel2.setIcon(null);
                   t = true;    
                   fantasma_label[0][1]=false;
                   mover_fantasma[0][1]=true;
                   
                   if(arreglo_labels[0][1].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                }
                else
                {
                      if(t == true && fantasma_label[0][1]==false &&mover_fants==true)
                        {
                            arreglo_labels[0][1].setIcon(icon);
                            fantasma_label[0][1]=true;
                            mover_fantasma[0][1]=false;
                            turno = false;
                            t =false;
                            falsificar_pos(0,1);
                            cambiar_bg_inicial(0,1);
                        }
                        else
                        {         
                            if(pos_disponibles==false)
                                 JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                            else if(mover_fants==false)
                                 JOptionPane.showMessageDialog(null, "No puedes hacer ese movimiento.");
                            else if(fantasma_label[0][1]==true)
                                 JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion.");
                            
                        }

                }
           } 
       }
      
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        posicionamiento_de_labels_en_arreglo();
        boolean pos = tb.ubicar_fantasma(1,1);
        if(fantasmas_j1>0)
        {
            //tugfecita
            if(pos=true)
            {
               arreglo_labels[1][1].setIcon(icon);
               fantasma_label[1][1]=true;
               mover_fantasma[1][1]=false;
               fantasma_label[2][1]=false;
               mover_fantasma[2][1]=false;
            }
        }
        else
        {
            if(turno==true)
            {
                Boolean mover_fants = mover_fantasmitas(1,1);
                Boolean pos_disponibles = identificar_pos_disponibles(1,1);
                if(t == false && fantasma_label[1][1]==false &&pos_disponibles==true)           
                      {
                         jLabel8.setIcon(null);
                         t = true;      
                         fantasma_label[1][1]=false;
                         mover_fantasma[1][1]=true;
                         
                         if(arreglo_labels[1][1].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;

                        

                      }
                else
                {

                             if(t == true && fantasma_label[1][1]==false&&mover_fants==true) 
                             {
                                 arreglo_labels[1][1].setIcon(icon);
                                 fantasma_label[1][1]=true;
                                 turno = false;
                                 t =false;
                                 falsificar_pos(1,1);
                                 cambiar_bg_inicial(1,1);
                             }
                             else
                             {
                                 if (mover_fants==false)
                                 {
                                    JOptionPane.showMessageDialog(null, "No puede hacer ese movimiento.");
                                 }
                                 else if (fantasma_label[1][1]==true)
                                 {
                                     JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion. ");
                                 }
                             
                             }
                      }
            }
            else
                JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador.");
            
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
    }//GEN-LAST:event_formWindowClosing

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 
        
        //Codigo para ver las posiciones disponibles
        /*int i[][] = tb.verPosiciones(1, 12);
        JOptionPane.showMessageDialog(this, i[0][2]);
        posicionamiento_de_labels_en_arreglo();
        Prueba();*/
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
               posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(0,2);
        if(pos==true){
           arreglo_labels[0][2].setIcon(icon);
           fantasma_label[0][2] = true;
           mover_fantasma[0][2] = false;
          fantasmas_j1--; 
            
        }
        
     
       }
      else
       {
           if(turno==true)
           {
                Boolean mover_fants = mover_fantasmitas(0,2);
                Boolean pos_disponibles = identificar_pos_disponibles(0,2);
                if(t == false &&pos_disponibles==true)           
                {
                   jLabel3.setIcon(null);
                   t = true;    
                   fantasma_label[0][2]=false;
                   mover_fantasma[0][2]=true;
                   
                   if(arreglo_labels[0][2].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                }
                else
                {
                      if(t == true && fantasma_label[0][2]==false &&mover_fants==true)
                        {
                            arreglo_labels[0][2].setIcon(icon);
                            fantasma_label[0][2]=true;
                            mover_fantasma[0][2]=false;
                            turno = false;
                            t =false;
                            falsificar_pos(0,2);
                            cambiar_bg_inicial(0,2);
                        }
                        else
                        {         
                            if(pos_disponibles==false)
                                 JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                            else if(mover_fants==false)
                                 JOptionPane.showMessageDialog(null, "No puedes hacer ese movimiento.");
                            else if(fantasma_label[0][2]==true)
                                 JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion.");
                            
                        }

                }
           }
       
       }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
           posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(0,3);
        if(pos==true){
          arreglo_labels[0][3].setIcon(icon);
          fantasmas_j1--;
          fantasma_label[0][3]=true;  
          mover_fantasma[0][3]=false;
        }
        
       
       }
      else
       {
           if(turno==true)
                {
                    Boolean mover_fants = mover_fantasmitas(0,3);
                    Boolean pos_disponibles = identificar_pos_disponibles(0,3);
                
                    if(t == false && pos_disponibles==true)           
                     {
                        jLabel4.setIcon(null);
                        t = true;      
                        fantasma_label[0][3]=false;
                        mover_fantasma[0][3]=true; 
                        
                            if(arreglo_labels[0][3].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                     }
                    else
                    {

                        if(t == true && fantasma_label[0][3]==false &&mover_fants==true)
                        {
                            arreglo_labels[0][3].setIcon(icon);
                            fantasma_label[0][3]=true;
                            mover_fantasma[0][3]=false;
                            turno = false;
                            t =false;
                            falsificar_pos(0,3);
                            cambiar_bg_inicial(0,3);
                        }
                        else
                        {         
                            if(pos_disponibles==false)
                                 JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                            else if(mover_fants==false)
                                 JOptionPane.showMessageDialog(null, "No puedes hacer ese movimiento.");
                            else if(fantasma_label[0][3]==true)
                                 JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion.");
                            
                        }
                    }
                }
           else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador");
       }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
              posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(0,4);
        if(pos==true){
           arreglo_labels[0][4].setIcon(icon);
          fantasmas_j1--;
          fantasma_label[0][4]=true;
          mover_fantasma[0][4]=false;

        }
        
 
       }
      else
       {
           if(turno==true)
           {
                Boolean mover_fants = mover_fantasmitas(0,4);
                Boolean pos_disponibles = identificar_pos_disponibles(0,4);
           
                if(t == false && pos_disponibles==true)           
                {
                   jLabel5.setIcon(null);
                   t = true;           
                   fantasma_label[0][4]=false;
                   mover_fantasma[0][4]=true; 
                   
                   if(arreglo_labels[0][4].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                   
                }
                else
                {
                    if(t == true && fantasma_label[0][4]==false && mover_fants==true)
                    {
                        arreglo_labels[1][4].setIcon(icon);
                        fantasma_label[1][4]=true;
                        mover_fantasma[1][4]=false;
                        turno = false;
                        t =false;
                        falsificar_pos(0,4);
                        cambiar_bg_inicial(0,4);
                    }
                    else
                    {  
                        if(pos_disponibles==false)
                             JOptionPane.showMessageDialog(null, "No hay posiciones disponibles");
                        else if(mover_fants==false)
                             JOptionPane.showMessageDialog(null, "No puedes hacer ese movimiento.");
                        else if(fantasma_label[0][4]==true)
                             JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion.");
                    }
                }
           }
           else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador.");
       }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
                          posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(3,0);
        if(pos==true){
           arreglo_labels[3][0].setIcon(icon);
           fantasmas_j1--;
            
        }
        else{
            JOptionPane.showMessageDialog(this, "No puedes poner el fantasma ahi");
        }
       
       }
      else
       {
           if(fantasmas_j2 == 7)
           JOptionPane.showMessageDialog(this, "Ahora le toca  el jugador poner fantasmas");
           else 
           JOptionPane.showMessageDialog(this, "No puedes colocar fantasmas aqui, le toca al jugador 2");
       }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
                           posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(4,0);
        if(pos==true){
           arreglo_labels[4][0].setIcon(icon);
          fantasmas_j1--;
            
        }
        else{
            JOptionPane.showMessageDialog(this, "No puedes poner el fantasma ahi");
        }
       
       }
      else
       {
if(fantasmas_j2 == 7)
           JOptionPane.showMessageDialog(this, "Ahora le toca  el jugador poner fantasmas");
           else 
           JOptionPane.showMessageDialog(this, "No puedes colocar fantasmas aqui, le toca al jugador 2");
       }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
                          posicionamiento_de_labels_en_arreglo();

        if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(5,0);
        if(pos==true){
           arreglo_labels[5][0].setIcon(icon);
           fantasmas_j1--;
            
        }
        else{
            JOptionPane.showMessageDialog(this, "No puedes poner el fantasma ahi");
        }
  
       }
      else
       {
          if(fantasmas_j2 == 7)
           JOptionPane.showMessageDialog(this, "Ahora le toca  el jugador poner fantasmas");
           else 
           JOptionPane.showMessageDialog(this, "No puedes colocar fantasmas aqui, le toca al jugador 2");
       }
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
       if(fantasmas_j1>0)
       {

        boolean pos = tb.ubicar_fantasma(1,2);
        if(pos==true){
           arreglo_labels[1][2].setIcon(icon);
           fantasmas_j1--;
           fantasma_label[1][2]=true;
           fantasma_label[2][2]=false;
           mover_fantasma[1][2]=false;
           mover_fantasma[2][2]=false;
        }
        
       
       }
      else
       {
           if(turno==true)
           {
            Boolean mover_fants = mover_fantasmitas(1,2);
            Boolean pos_disponibles = identificar_pos_disponibles(1,2);
           
                if(t == false && pos_disponibles==true)          
                 {
                    jLabel9.setIcon(null);
                    t = true;      
                    fantasma_label[1][2]=false;
                    mover_fantasma[1][2]=true;
                    if(arreglo_labels[1][2].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                    
                    if(pos_disponibles==false)
                        JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                 }
                 else
                 {

                        if(t == true && fantasma_label[1][2]==false && mover_fants==true)
                        {
                            arreglo_labels[1][2].setIcon(icon);
                            fantasma_label[1][2]=true;
                            turno = false;
                            t =false;
                            falsificar_pos(1,2);
                            cambiar_bg_inicial(1,2);
                        }
                        else
                        {
                            if (mover_fants==false)
                                JOptionPane.showMessageDialog(null, "No puede hacer ese movimiento.");
                            else if (fantasma_label[1][2]==true)
                                JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion. ");
                        }
                 }
           }
           else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador");
       }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
               if(fantasmas_j1>0)
       {

            boolean pos = tb.ubicar_fantasma(1,3);
            if(pos==true)
            {
               arreglo_labels[1][3].setIcon(icon);
               fantasmas_j1--;
               fantasma_label[1][3]=true;
               fantasma_label[2][3]=false;
               mover_fantasma[1][3]=false;
               mover_fantasma[2][3]=false;
           
            }        
       }
      else
       {
            if(turno==true)
            {
                Boolean mover_fants = mover_fantasmitas(1,3);
                Boolean pos_disponibles = identificar_pos_disponibles(1,3);
                if(t == false&&turno==true&&pos_disponibles==true)           
                 {
                    jLabel10.setIcon(null);
                    t = true;      
                    fantasma_label[1][3]=false;
                    mover_fantasma[1][3]=true;
                    if(arreglo_labels[1][3].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                    
                    if(pos_disponibles==false)
                        JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                 }
                 else
                 {

                        if(t == true && mover_fants==true && fantasma_label[1][3]==false) 
                        {
                            arreglo_labels[1][3].setIcon(icon);
                            fantasma_label[1][3]=true;
                            turno = false;
                            t =false;
                            falsificar_pos(1,3);
                            cambiar_bg_inicial(1,3);
                        }
                        else
                        {
                            
                            if (mover_fants==false)
                                JOptionPane.showMessageDialog(null, "No puede hacer ese movimiento.");
                            else if (fantasma_label[1][3]==true)
                                JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion. ");
                        }
                 }
            }
            else
                JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador");
                /*
                if(fantasmas_j2 == 7)
                JOptionPane.showMessageDialog(this, "Ahora le toca  el jugador poner fantasmas");
                else 
                JOptionPane.showMessageDialog(this, "No puedes colocar fantasmas aqui, le toca al jugador 2");
                */
            
            
        }
               
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
           
            
       if(fantasmas_j1>0)
       {

            boolean pos = tb.ubicar_fantasma(1,4);
            if(pos==true)
            {
                arreglo_labels[1][4].setIcon(icon);
                fantasmas_j1--;
                fantasma_label[1][4]=true;  
                mover_fantasma[1][4]=false;
                fantasma_label[2][4]=false; 
                mover_fantasma[2][4]=false;
                mover_fantasma[2][5]=false;
            }
          
      
       }
      else
       {
           if(turno==true)
           {
                Boolean mover_fants = mover_fantasmitas(1,4);
                Boolean pos_disponibles = identificar_pos_disponibles(1,4);

               if(t == false && pos_disponibles==true)           
                {              
                   jLabel11.setIcon(null);
                   t = true;           
                   fantasma_label[1][4]=false;
                   mover_fantasma[1][4]=true;
                   

                   if(arreglo_labels[1][4].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                }

                else
                {
                    if(t == true && fantasma_label[1][4]==false && mover_fants==true)
                    {
                        arreglo_labels[1][4].setIcon(icon);
                        fantasma_label[1][4]=true;
                        mover_fantasma[1][4]=false;
                        turno = false;
                        t =false;
                        falsificar_pos(1,4);
                        cambiar_bg_inicial(1,4);
                    }
                    else
                    {         
                        if(turno==false)
                            JOptionPane.showMessageDialog(null, "Es turno del segundo jugador.");
                        else if(mover_fants==false)
                             JOptionPane.showMessageDialog(null, "No puedes hacer ese movimiento.");
                        else if(fantasma_label[1][4]==true)
                             JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion.");                       
                    }

                }
           }
           else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador");
         
       }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        if(fantasmas_j1==0 && fantasmas_j2 >0)
       {

            boolean pos = tb.ubicar_fantasma(4,1);
            if(pos==true)
            {
               arreglo_labels[4][1].setIcon(icon);
               fantasmas_j2--;
               fantasma_label[4][1]=true;
               mover_fantasma[4][1]=false;
               fantasma_label[3][1]=false;
               mover_fantasma[3][1]=false;

            }

       }
      else
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(4,1);
                Boolean pos_disponibles = identificar_pos_disponibles(4,1);

                if(t == false && pos_disponibles==true)
                {
                   jLabel26.setIcon(null);
                   t = true;      
                   fantasma_label[4][1]=false;
                   mover_fantasma[4][1]=true;
                   
                        if(arreglo_labels[4][1].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                   
                }
                else
                {

                            if(t == true && fantasma_label[4][1]==false &&mover_fants==true )
                            {
                                arreglo_labels[4][1].setIcon(icon);
                                fantasma_label[4][1]=true;
                                mover_fantasma[4][1]=false;
                                turno = true;
                                t =false;
                                falsificar_pos(4,1);
                                cambiar_bg_inicial(4,1);
                            }
                            else
                            {
                                if(pos_disponibles==false)
                                    JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                                else if(mover_fants==false)
                                    JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                                else if(fantasma_label[4][1]==true)
                                    JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                                    
                            }
                }

           }
           else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador");
           
       }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
       if(fantasmas_j1==0 && fantasmas_j2 >0)
       {
            boolean pos = tb.ubicar_fantasma(4,2);
            if(pos==true){
               arreglo_labels[4][2].setIcon(icon);
               fantasmas_j2--;   
               fantasma_label[4][2]=true;
               mover_fantasma[4][2]=false;
               fantasma_label[3][2]=false;
               mover_fantasma[3][2]=false; 
               
            }
       }
      else
       {   
            if(turno==false)
            {
                Boolean mover_fants = mover_fantasmitas(4,2);
                Boolean pos_disponibles = identificar_pos_disponibles(4,2);
                
                if(t == false && pos_disponibles==true)           
                {
                    jLabel27.setIcon(null);
                    t = true;      
                    fantasma_label[4][2]=false;
                    mover_fantasma[4][2]=true;
                    
                         if(arreglo_labels[4][2].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                }
               else
                {
                
              
                        if(t == true && fantasma_label[4][2]==false &&mover_fants==true)                   
                        {
                            arreglo_labels[4][2].setIcon(icon);
                            fantasma_label[4][2]=true;
                            mover_fantasma[4][2]=false;
                            turno = true;
                            t =false;
                            falsificar_pos(4,2);
                            cambiar_bg_inicial(4,2);
                        }
                        else
                        {
                                if(pos_disponibles==false)
                                    JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                                else if(mover_fants==false)
                                    JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                                else if(fantasma_label[4][2]==true)
                                    JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                                    
                        }
                }
            }
            else
                JOptionPane.showMessageDialog(this,"Es el turno del primer jugador");
            
       }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        
        if(fantasmas_j1==0 && fantasmas_j2 >0)
       {
            boolean pos = tb.ubicar_fantasma(4,3);
            if(pos==true)
            {
               arreglo_labels[4][3].setIcon(icon);
               fantasmas_j2--; 
               fantasma_label[4][3]=true;
               mover_fantasma[4][3]=false;
               fantasma_label[3][3]=false;
               mover_fantasma[3][3]=false;
               
            } 
       }
      else
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(4,3);
                Boolean pos_disponibles = identificar_pos_disponibles(4,3);
                
               
                if(t == false && fantasma_label[4][3]==false &&pos_disponibles==true)           
                {
                        jLabel28.setIcon(null);
                        t = true;      
                        fantasma_label[4][3]=false;
                        mover_fantasma[4][3]=true;
                        
                        if(arreglo_labels[4][3].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                }
                 else
                 {

                             if(t == true && fantasma_label[4][3]==false &&mover_fants==true)
                             {
                                 arreglo_labels[4][3].setIcon(icon);
                                 fantasma_label[4][3]=true;
                                 mover_fantasma[4][3]=false;
                                 turno = true;
                                 t =false;
                                 
                                 falsificar_pos(4,3);
                                 cambiar_bg_inicial(4,3);
                             }
                             else
                             {            
                                if(pos_disponibles==false)
                                    JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                                else if(mover_fants==false)
                                    JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                                else if(fantasma_label[4][3]==true)
                                    JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                                    
                             }
                 }
            }
             else
                JOptionPane.showMessageDialog(this,"Es el turno del primer jugador");
       }
                    
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        
        if(fantasmas_j1==0 && fantasmas_j2 >0)
       {
            boolean pos = tb.ubicar_fantasma(4,4);
            if(pos==true)
            {
               arreglo_labels[4][4].setIcon(icon);
               fantasmas_j2--;
               fantasma_label[4][4]=true;
               mover_fantasma[4][4]=false;
               fantasma_label[3][4]=false;
               mover_fantasma[3][4]=false;         
            }    
       }
      else
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(4,4);
                Boolean pos_disponibles = identificar_pos_disponibles(4,4);
                    if(t == false && pos_disponibles==true)          
                    {
                        jLabel29.setIcon(null);
                        t = true;      
                        fantasma_label[4][4]=false;
                        mover_fantasma[4][4]=true;
                        
                        if(arreglo_labels[4][4].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                    }
                    else
                    {

                                if(t == true &&fantasma_label[4][4]==false &&mover_fants==true)
                                {
                                    arreglo_labels[4][4].setIcon(icon);
                                    fantasma_label[4][4]=true;
                                    mover_fantasma[4][4]=false;
                                    turno = true;
                                    t =false;
                                    
                                    falsificar_pos(4,4);
                                    cambiar_bg_inicial(4,4);
                                }
                                else
                                {  
                                    if(pos_disponibles==false)
                                        JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                                    else if(mover_fants==false)
                                        JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                                    else if(fantasma_label[4][4]==true)
                                        JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                                        
                                }
                    }
           }
           else
                JOptionPane.showMessageDialog(this,"Es el turno del primer jugador");
       }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        
        if (fantasmas_j1 == 0 && fantasmas_j2 > 0) 
        {
            boolean pos = tb.ubicar_fantasma(5, 1);
            if (pos == true) 
            {
                arreglo_labels[5][1].setIcon(icon);
                fantasmas_j2--;
                fantasma_label[5][1] = true;
                mover_fantasma[5][1] = false;
            }
        }
        else 
        {
            if (turno == false) 
            {
                Boolean mover_fants = mover_fantasmitas(5, 1);
                Boolean pos_disponibles = identificar_pos_disponibles(5, 1);

                if (t == false && pos_disponibles == true)
                {
                    jLabel32.setIcon(null);
                    t = true;
                    fantasma_label[5][1] = false;
                    mover_fantasma[5][1] = true;
                    
                     if(arreglo_labels[5][1].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                } 
                else 
                {
                    if(t==true && fantasma_label[5][1]==false &&mover_fants==true)
                    {
                        arreglo_labels[5][1].setIcon(icon);
                        fantasma_label[5][1]=true;
                        mover_fantasma[5][1]=false;
                        turno = true;
                        t =false;
                        falsificar_pos(5,1);
                        cambiar_bg_inicial(5,1);
                    }
                    else
                    {
                        if (pos_disponibles == false)
                        {
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        } else if (mover_fants == false) 
                        {
                            JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                        } else if (fantasma_label[5][1] == true) 
                        {
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                        }
                    }

                }
            }
            else
                JOptionPane.showMessageDialog(this, "Es el turno del primer jugador");
        }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        
        if(fantasmas_j1==0 && fantasmas_j2 >0)
        {
            boolean pos = tb.ubicar_fantasma(5,2);
            if(pos==true){
               arreglo_labels[5][2].setIcon(icon);
               fantasmas_j2--;
               fantasma_label[5][2]=true;
               mover_fantasma[5][2]=false;
            }  
        }
        else
        {
            if(turno==false)
            {
                Boolean mover_fants = mover_fantasmitas(5,2);
                Boolean pos_disponibles = identificar_pos_disponibles(5,2);
                if(t == false && pos_disponibles==true)        
                {
                   jLabel33.setIcon(null);
                   t = true;           
                   fantasma_label[5][2]=false;
                   mover_fantasma[5][2]=true;
                   
                   if(arreglo_labels[5][2].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                }
                else
                {
                   if(t==true && fantasma_label[5][2]==false &&mover_fants==true)
                   {
                        arreglo_labels[5][2].setIcon(icon);
                        fantasma_label[5][2]=true;
                        mover_fantasma[5][2]=false;
                        turno = true;
                        t =false;
                        falsificar_pos(5,2);
                        cambiar_bg_inicial(5,2);
                   }
                   else
                   {
                        if (pos_disponibles == false)
                        {
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        } else if (mover_fants == false) 
                        {
                            JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                        } else if (fantasma_label[5][2] == true) 
                        {
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                        }
                   }
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Es el turno del primer jugador");
       }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        
        if(fantasmas_j1==0 && fantasmas_j2 >0)
       {
            boolean pos = tb.ubicar_fantasma(5,3);
            if(pos==true){
               arreglo_labels[5][3].setIcon(icon);
               fantasmas_j2--;
               fantasma_label[5][3]=true;
               mover_fantasma[5][3]=false;
            }       
       }
      else
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(5,3);
                Boolean pos_disponibles = identificar_pos_disponibles(5,3);
                
                if(t == false && pos_disponibles==true)          
                {
                    jLabel34.setIcon(null);
                    t = true;           
                    fantasma_label[5][3]=false;
                    mover_fantasma[5][3]=true;   
                    
                        if(arreglo_labels[5][3].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                 }
                 else
                 {
                    if(t==true && fantasma_label[5][3]==false &&mover_fants==true)
                    {
                        arreglo_labels[5][3].setIcon(icon);
                        fantasma_label[5][3]=true;
                        mover_fantasma[5][3]=false;
                        turno = true;
                        t =false;
                        falsificar_pos(5,3);
                        cambiar_bg_inicial(5,3);
                    }
                    else
                    {
                        if (pos_disponibles == false)
                        {
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        } else if (mover_fants == false) 
                        {
                            JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                        } else if (fantasma_label[5][3] == true) 
                        {
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                        }
                    }
                    
                 }
           }
           else
                JOptionPane.showMessageDialog(this, "Es el turno del primer jugador");
       }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
                                       if(fantasmas_j1==0 && fantasmas_j2 >0)
       {

        boolean pos = tb.ubicar_fantasma(5,4);
        if(pos==true){
           arreglo_labels[5][4].setIcon(icon);
           fantasmas_j2--;
           fantasma_label[5][4]=true;
           mover_fantasma[5][4]=false;
        }
        
       
       }
      else
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(5,4);
                Boolean pos_disponibles = identificar_pos_disponibles(5,4);
               
                if(t == false && pos_disponibles==true)
                 {
                    jLabel35.setIcon(null);
                    t = true;           
                    fantasma_label[5][4]=false;
                    mover_fantasma[5][4]=true;
                    
                        if(arreglo_labels[5][4].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                 }
                 else
                 {
                     if(t==true && fantasma_label[5][4]==false &&mover_fants==true)
                     {
                        arreglo_labels[5][4].setIcon(icon);
                        fantasma_label[5][4]=true;
                        mover_fantasma[5][4]=false;
                        turno = true;
                        t =false;
                        falsificar_pos(5,4);
                        cambiar_bg_inicial(5,4);
                     }
                     else
                     {
                        if (pos_disponibles == false)
                        {
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        } else if (mover_fants == false) 
                        {
                            JOptionPane.showMessageDialog(this, "No puedes hacer ese movimiento");
                        } else if (fantasma_label[5][4] == true) 
                        {
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                        }
                     }

                 }
           }
           else
                JOptionPane.showMessageDialog(this, "Es el turno del primer jugador");
       }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0 && turno== true)
       {
                Boolean mover_fants = mover_fantasmitas(2,3);//
                Boolean pos_disponibles = identificar_pos_disponibles(2,3);
              if(t == false && mover_fants==true)
               { 
                    jLabel16.setIcon(null);
                    t = true;
                    fantasma_label[2][3] = false;
                    mover_fantasma[2][3] = true;

                    if(arreglo_labels[2][3].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                   }
              else
              {
                 if(t == true && fantasma_label[2][3]==false && mover_fants==true)
                    {
                        jLabel16.setIcon(icon);
                        t = false;
                        turno = false;
                        fantasma_label[2][3]=true;        
                        falsificar_pos(2,3);
                        cambiar_backg(2,3);
                        cambiar_bg_inicial(2,3);
                    }
                    else
                    {
                        if(fantasma_label[2][3]==true&&mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento.");
                        else if(fantasma_label[2][3]==true)
                            JOptionPane.showMessageDialog(null, "Ya hay un fantasma en esta posicion.");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento.");
                        else if(turno==false)
                            JOptionPane.showMessageDialog(null, "Es el turno del segundo jugador.");
                    }       
              }
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0 && turno== false)
        {
             if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(3,2);
                Boolean pos_disponibles = identificar_pos_disponibles(3,2);
           
               if( t == false&&pos_disponibles==true)
               {
                    jLabel21.setIcon(null);
                    t = true;
                    fantasma_label[3][2] = false;
                    mover_fantasma[3][2] = true;
                    
                    if(arreglo_labels[3][2].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
               }
              else
                {
                    if( t == true && fantasma_label[3][2]==false &&mover_fants==true)
                    {
                        jLabel21.setIcon(icon);
                        t = false;
                        turno = true;
                        fantasma_label[3][2]=true;                          
                        mover_fantasma[3][2]=false;
                        falsificar_pos(3,2);
                        cambiar_bg_inicial(3,2);
                    }
                    else
                    {
                        if(pos_disponibles==false)
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                        else if(fantasma_label[3][2]==false)
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                    }
                }
            }
            else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador. ");
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        
       if(fantasmas_j1 == 0 && fantasmas_j2 ==0)
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(3,1);
                Boolean pos_disponibles = identificar_pos_disponibles(3,1);
           
               if( t == false&&pos_disponibles==true)
               {
                    jLabel20.setIcon(null);
                    t = true;
                    fantasma_label[3][1] = false;
                    mover_fantasma[3][1] = true;
                    
                    if(arreglo_labels[3][1].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
               }
              else
                {
                    if( t == true && fantasma_label[3][1]==false &&mover_fants==true)
                    {
                        jLabel20.setIcon(icon);
                        t = false;
                        turno = true;
                        fantasma_label[3][1]=true;                          
                        mover_fantasma[3][1]=false;
                        falsificar_pos(3,1);
                        cambiar_bg_inicial(3,1);
                    }
                    else
                    {
                        if(pos_disponibles==false)
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                        else if(fantasma_label[3][1]==false)
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                    }
                }
            }
            else
               JOptionPane.showMessageDialog(this, "Es el turno del primer jugador. ");

       }    
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0)
       {
            if(turno==true)
            {
                Boolean mover_fants = mover_fantasmitas(2,4);
                Boolean pos_disponibles = identificar_pos_disponibles(2,4);
                
              if( t == false && pos_disponibles==true)
              {                                  
                jLabel17.setIcon(null);
                t = true;
                fantasma_label[2][4] = false;
                mover_fantasma[2][4] = true;
                mover_fantasma[2][5] = false;
                if(arreglo_labels[2][4].getBackground().equals(Color.RED))
                {
                    color=false;
                }
                else
                    color=true;
               }
              else
              {
                    if( t == true && mover_fants==true && fantasma_label[2][4]==false)
                    {                     
                        jLabel17.setIcon(icon);
                        t = false;
                        turno = false;
                        fantasma_label[2][4]=true;
                        falsificar_pos(2,4);   
                        cambiar_backg(2,4);
                        cambiar_bg_inicial(2,4);
                        
                    }
                    else
                    {
                        if(fantasma_label[2][4]==true)
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion.");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                        
                    }
              }
            }
            else
                JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador");
       }
       
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3KeyPressed

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9KeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0 && turno== true)
       {
           if(turno==true)
           {
                
                        Boolean mover_fants = mover_fantasmitas(2,2);
                        Boolean pos_disponibles = identificar_pos_disponibles(2,2);

                    if( t == false &&pos_disponibles==true)
                    { 
                        jLabel15.setIcon(null);
                        t = true;
                        fantasma_label[2][2] = false;
                        mover_fantasma[2][2] = true;
                        
                        if(arreglo_labels[2][2].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                        
                    }
                   else
                    {
                            if( t == true && fantasma_label[2][2]==false && mover_fants==true)
                            {
                                jLabel15.setIcon(icon);
                                t = false;
                                turno = false;
                                fantasma_label[2][2]=true;
                                falsificar_pos(2,2);
                                cambiar_bg_inicial(2,2);
                            }
                            else
                            {
                                if(fantasma_label[2][2]==true)
                                    JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion.");
                                else if(mover_fants==false)
                                    JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                                else if(pos_disponibles==false)
                                    JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                            }
                      } 
           }
           else
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador. ");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0 && turno== true )
       {
           if(turno==true)
           {
              Boolean mover_fants = mover_fantasmitas(2,1);
              Boolean pos_disponibles = identificar_pos_disponibles(2,1);
              if( t == false&&pos_disponibles==true)
              { 
               jLabel14.setIcon(null);
               t = true;
               fantasma_label[2][1] = false;
               mover_fantasma[2][1] = true;
                    if(arreglo_labels[2][1].getBackground().equals(Color.RED))
                    {
                        color=false;
                    }
                    else
                        color=true;
                    
               
               }
              else 
              {
                  if(t== true && mover_fants==true &&fantasma_label[2][1]==false)
                  {
                        jLabel14.setIcon(icon);
                        t = false;
                        turno = false;
                        fantasma_label[2][1]=true;
                        falsificar_pos(2,1);
                        cambiar_bg_inicial(2,1);
                  }
                  else
                  {
                        if(fantasma_label[2][1]==true)
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion.");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                        else if(pos_disponibles==false)
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles.");
                  }
              }
           }
           else 
               JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador. ");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0 && turno== false)
       {
           if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(3,3);
                Boolean pos_disponibles = identificar_pos_disponibles(3,3);
           
               if( t == false&&pos_disponibles==true)
               {
                    jLabel22.setIcon(null);
                    t = true;
                    fantasma_label[3][3] = false;
                    mover_fantasma[3][3] = true;
                    
                    if(arreglo_labels[3][3].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
               }
              else
                {
                    if( t == true && fantasma_label[3][3]==false &&mover_fants==true)
                    {
                        jLabel22.setIcon(icon);
                        t = false;
                        turno = true;
                        fantasma_label[3][3]=true;                          
                        mover_fantasma[3][3]=false;
                        falsificar_pos(3,3);
                        cambiar_bg_inicial(3,3);
                    }
                    else
                    {
                        if(pos_disponibles==false)
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                        else if(fantasma_label[3][3]==false)
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                    }
                }
           }
        }
        else
            JOptionPane.showMessageDialog(this, "Es el turno del segundo jugador. ");
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        if(fantasmas_j1 == 0 && fantasmas_j2 == 0 && turno== false)
       {
            if(turno==false)
           {
                Boolean mover_fants = mover_fantasmitas(3,4);
                Boolean pos_disponibles = identificar_pos_disponibles(3,4);
           
               if( t == false&&pos_disponibles==true)
                {
                    jLabel22.setIcon(null);
                    t = true;
                    fantasma_label[3][4] = false;
                    mover_fantasma[3][4] = true;
                    
                    if(arreglo_labels[3][4].getBackground().equals(Color.RED))
                        {
                            color=false;
                        }
                        else
                            color=true;
                }
                else
                {
                    if( t == true && fantasma_label[3][4]==false &&mover_fants==true)
                    {
                        jLabel23.setIcon(icon);
                        t = false;
                        turno = true;
                        fantasma_label[3][4]=true;                          
                        mover_fantasma[3][4]=false;
                        falsificar_pos(3,4);
                        cambiar_bg_inicial(3,4);
                    }
                    else
                    {
                        if(pos_disponibles==false)
                            JOptionPane.showMessageDialog(this, "No hay posiciones disponibles");
                        else if(mover_fants==false)
                            JOptionPane.showMessageDialog(this, "No puede hacer ese movimiento");
                        else if(fantasma_label[3][4]==false)
                            JOptionPane.showMessageDialog(this, "Ya hay un fantasma en esta posicion");
                    }
                }
           }
            else
                JOptionPane.showMessageDialog(this,"Es el turno del primer jugador");
        }
        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        // TODO add your hanoojiiuiuhuygy
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered
    //Funcion booleana(posicion del fantasma que queremos mover){
  //if(arreglo1 && arreglo2)
    //if(
//}
    
    
    
    
    
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
public void posicionamiento_de_labels_en_arreglo(){
    arreglo_labels[0][0] = jLabel1;
    arreglo_labels[0][1] = jLabel2;
    arreglo_labels[0][2] = jLabel3;
    arreglo_labels[0][3] = jLabel4;
    arreglo_labels[0][4] = jLabel5;
    arreglo_labels[0][5] = jLabel6; 

    arreglo_labels[1][0] = jLabel7;
    arreglo_labels[1][1] = jLabel8;
    arreglo_labels[1][2] = jLabel9;
    arreglo_labels[1][3] = jLabel10; 
    arreglo_labels[1][4] = jLabel11;
    arreglo_labels[1][5] = jLabel12;

    arreglo_labels[2][0] = jLabel13;
    arreglo_labels[2][1] = jLabel14; 
    arreglo_labels[2][2] = jLabel15;
    arreglo_labels[2][3] = jLabel16;
    arreglo_labels[2][4] = jLabel17;
    arreglo_labels[2][5] = jLabel18;

    arreglo_labels[3][0] = jLabel19;
    arreglo_labels[3][1] = jLabel20;
    arreglo_labels[3][2] = jLabel21;
    arreglo_labels[3][3] = jLabel22;
    arreglo_labels[3][4] = jLabel23;
    arreglo_labels[3][5] = jLabel24;

    arreglo_labels[4][0] = jLabel25;
    arreglo_labels[4][1] = jLabel26;
    arreglo_labels[4][2] = jLabel27;
    arreglo_labels[4][3] = jLabel28;
    arreglo_labels[4][4] = jLabel29;
    arreglo_labels[4][5] = jLabel30;

    arreglo_labels[5][0] = jLabel31;
    arreglo_labels[5][1] = jLabel32;
    arreglo_labels[5][2] = jLabel33;
    arreglo_labels[5][3] = jLabel34;
    arreglo_labels[5][4] = jLabel35;
    arreglo_labels[5][5] = jLabel36;
 
    Border border = BorderFactory.createLineBorder(Color.RED);

    int k[][] = tb.verPosiciones(0, 1);
    int p = k[0][1];
    int j = k[0][0];
   // arreglo_labels[p][j].setBorder(border);
    
    //arreglo_labels[p][j].setBackground(Color.yellow);
}
public void Prueba(){
    posicionamiento_de_labels_en_arreglo();
    arreglo_labels[1][1].setBackground(Color.yellow);
    
}
 public boolean identificar_pos_disponibles(int fila, int columna)
   {
     
       boolean disponibilidad=false;
       
       if(fila-1>=0 && fantasma_label[fila-1][columna]==false)
       {
            disponibilidad=true;
       }
       if(fila+1<=5 && fantasma_label[fila+1][columna]==false)
       {
           disponibilidad=true;
       }
       
       if(columna+1<5 && fantasma_label[fila][columna+1]==false)
       {
           disponibilidad=true;
       }
       
       if(columna-1>0 && fantasma_label[fila][columna-1]==false)
       {
           disponibilidad=true;
       }
       
       return disponibilidad;
       
   }
 public boolean mover_fantasmitas(int fila, int columna)
 {
     boolean disponibilidad_mover=false;
       
       if(fila-1>=0 && mover_fantasma[fila-1][columna]==true)
        disponibilidad_mover=true;
       
       if(fila+1<=5 && mover_fantasma[fila+1][columna]==true)
        disponibilidad_mover=true;
       
       if(columna+1<5 && mover_fantasma[fila][columna+1]==true)
        disponibilidad_mover=true;
       
       if(columna-1>0 && mover_fantasma[fila][columna-1]==true)
        disponibilidad_mover=true;
       
       return disponibilidad_mover;
 }
 
 public void falsificar_pos(int fila, int columna)
 {
      if(fila-1>=0 && mover_fantasma[fila-1][columna]==true)
            mover_fantasma[fila-1][columna]=false;
       
       if(fila+1<=5 && mover_fantasma[fila+1][columna]==true)
            mover_fantasma[fila+1][columna]=false;
       
       if(columna+1<5 && mover_fantasma[fila][columna+1]==true)
            mover_fantasma[fila][columna+1]=false;
       
       if(columna-1>0 && mover_fantasma[fila][columna-1]==true)
            mover_fantasma[fila][columna-1]=false;
 }

 public void cambiar_backg(int fila, int columna)
 {
     if(color==false)
     {
       arreglo_labels[fila][columna].setBackground(Color.red);
       if(fila-1>=0)       
           arreglo_labels[fila-1][columna].setBackground(Color.BLACK);
       if(fila+1<=5)
           arreglo_labels[fila+1][columna].setBackground(Color.BLACK);
       if(columna+1<5)
           arreglo_labels[fila][columna+1].setBackground(Color.BLACK);
       if(columna-1>0)
           arreglo_labels[fila][columna-1].setBackground(Color.BLACK);
     }
     else
     {
         arreglo_labels[fila][columna].setBackground(Color.BLACK);
       if(fila-1>=0)       
           arreglo_labels[fila-1][columna].setBackground(Color.RED);
       if(fila+1<=5)
           arreglo_labels[fila+1][columna].setBackground(Color.RED);
       if(columna+1<5)
           arreglo_labels[fila][columna+1].setBackground(Color.RED);
       if(columna-1>0)
           arreglo_labels[fila][columna-1].setBackground(Color.RED);
     }
 }
 public void cambiar_bg_inicial(int fila, int columna)
 {
      if(color==true)
     {
       arreglo_labels[fila][columna].setBackground(Color.red);
       if(fila-1>=0)       
           cambiar_backg(fila-1,columna);
       if(fila+1<=5)
           cambiar_backg(fila+1,columna);
       if(columna+1<5)
           cambiar_backg(fila,columna+1);
       if(columna-1>0)
           cambiar_backg(fila,columna-1);
     }
     else
     {
       arreglo_labels[fila][columna].setBackground(Color.BLACK);
       if(fila-1>=0)       
           cambiar_backg(fila-1,columna);
       if(fila+1<=5)
           cambiar_backg(fila+1,columna);
       if(columna+1<5)
           cambiar_backg(fila,columna+1);
       if(columna-1>0)
           cambiar_backg(fila,columna-1);
     }
 }
}
