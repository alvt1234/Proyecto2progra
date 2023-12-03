
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenuTwitter extends javax.swing.JFrame {
 
    String image1,image2,lupan,lupaA,campana,campanaA,user,userA,mas,masA;
   LogicaTwitter logica=new LogicaTwitter();
    public MenuTwitter() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Timeline time=new Timeline(logica);
        crearpaneles(time);
        image1= "src/imagentwitter/casa.png";
        image2= "src/imagentwitter/casa_azul.png";
        lupan ="src/imagentwitter/lupa.png";
        lupaA ="src/imagentwitter/lupa_azul.png";
        campana="src/imagentwitter/campana.png";
        campanaA="src/imagentwitter/campana_azul.png";
        user="src/imagentwitter/user.png";
        userA="src/imagentwitter/user_azul.png";
        mas="src/imagentwitter/mas.png";
        masA="src/imagentwitter/mas_azul.png";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bthogar = new javax.swing.JButton();
        btexplorar = new javax.swing.JButton();
        btnotificacion = new javax.swing.JButton();
        btuser = new javax.swing.JButton();
        btmas = new javax.swing.JButton();
        bttweet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelhome = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1606, 840));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/LogoTwitter.png"))); // NOI18N

        bthogar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bthogar.setForeground(new java.awt.Color(0, 153, 255));
        bthogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/casa_azul.png"))); // NOI18N
        bthogar.setText(" HOGAR");
        bthogar.setBorderPainted(false);
        bthogar.setContentAreaFilled(false);
        bthogar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bthogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthogarActionPerformed(evt);
            }
        });

        btexplorar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btexplorar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/lupa.png"))); // NOI18N
        btexplorar.setText(" EXPLORAR");
        btexplorar.setBorderPainted(false);
        btexplorar.setContentAreaFilled(false);
        btexplorar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btexplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexplorarActionPerformed(evt);
            }
        });

        btnotificacion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/campana.png"))); // NOI18N
        btnotificacion.setText(" INTERACCIONES");
        btnotificacion.setBorderPainted(false);
        btnotificacion.setContentAreaFilled(false);
        btnotificacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotificacionActionPerformed(evt);
            }
        });

        btuser.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/user.png"))); // NOI18N
        btuser.setText(" PERFIL");
        btuser.setBorderPainted(false);
        btuser.setContentAreaFilled(false);
        btuser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuserActionPerformed(evt);
            }
        });

        btmas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/mas.png"))); // NOI18N
        btmas.setText(" MAS");
        btmas.setBorderPainted(false);
        btmas.setContentAreaFilled(false);
        btmas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmasActionPerformed(evt);
            }
        });

        bttweet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/Twit.png"))); // NOI18N
        bttweet.setBorderPainted(false);
        bttweet.setContentAreaFilled(false);
        bttweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttweetActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnotificacion)
                            .addComponent(btexplorar)
                            .addComponent(bthogar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btmas)
                                    .addComponent(btuser)
                                    .addComponent(bttweet, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btexplorar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttweet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(102, 102, 102))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelhome.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelhomeLayout = new javax.swing.GroupLayout(panelhome);
        panelhome.setLayout(panelhomeLayout);
        panelhomeLayout.setHorizontalGroup(
            panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        panelhomeLayout.setVerticalGroup(
            panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthogarActionPerformed
       botonesblack();
       bthogar.setForeground(new Color(0, 153, 255));
       bthogar.setIcon(new ImageIcon(image2));
       
       Timeline time=new Timeline(logica);
        crearpaneles(time);
    }//GEN-LAST:event_bthogarActionPerformed

    private void btexplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexplorarActionPerformed
       botonesblack();
        btexplorar.setForeground(new Color(0, 153, 255));
        btexplorar.setIcon(new ImageIcon(lupaA));
    }//GEN-LAST:event_btexplorarActionPerformed

    private void btnotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotificacionActionPerformed
      botonesblack();
        btnotificacion.setForeground(new Color(0, 153, 255));
        btnotificacion.setIcon(new ImageIcon(campanaA));
    }//GEN-LAST:event_btnotificacionActionPerformed

    private void btuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuserActionPerformed
        botonesblack();
        btuser.setForeground(new Color(0, 153, 255));
        btuser.setIcon(new ImageIcon(userA));
        Perfil perfil=new Perfil();
        crearpaneles(perfil);
    }//GEN-LAST:event_btuserActionPerformed

    private void btmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmasActionPerformed
        botonesblack();
        btmas.setForeground(new Color(0, 153, 255));
        btmas.setIcon(new ImageIcon(masA));
    }//GEN-LAST:event_btmasActionPerformed

    private void bttweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttweetActionPerformed


    }//GEN-LAST:event_bttweetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginTwitter login=new LoginTwitter();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

     private void crearpaneles(JPanel pa){
        pa.setSize(684, 840);
        pa.setLocation(0, 0);
         panelhome.removeAll();
        panelhome.add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        panelhome.revalidate();
        panelhome.repaint(); 
     }
    private void botonesblack(){
       btmas.setIcon(new ImageIcon(mas));
       btuser.setIcon(new ImageIcon(user));
       bthogar.setIcon(new ImageIcon(image1));
       btexplorar.setIcon(new ImageIcon(lupan));
       btnotificacion.setIcon(new ImageIcon(campana));
       bthogar.setForeground(Color.black);
       btexplorar.setForeground(Color.black);
       btnotificacion.setForeground(Color.black);
       btuser.setForeground(Color.black);  
       btmas.setForeground(Color.black);  
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexplorar;
    private javax.swing.JButton bthogar;
    private javax.swing.JButton btmas;
    private javax.swing.JButton btnotificacion;
    private javax.swing.JButton bttweet;
    private javax.swing.JButton btuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelhome;
    // End of variables declaration//GEN-END:variables
}
