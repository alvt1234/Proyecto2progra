
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;




public class MenuTwitter extends javax.swing.JFrame {
 
    String image1,image2,lupan,lupaA,campana,campanaA,sobre,sobreA,gente,genteA,user,userA,mas,masA,lista,listaA;
   
    public MenuTwitter() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        image1= "src/imagentwitter/casa.png";
        image2= "src/imagentwitter/casa_azul.png";
        lupan ="src/imagentwitter/lupa.png";
        lupaA ="src/imagentwitter/lupa_azul.png";
        campana="src/imagentwitter/campana.png";
        campanaA="src/imagentwitter/campana_azul.png";
        sobre ="src/imagentwitter/sobre.png";
        sobreA ="src/imagentwitter/sobre_azul.png";
        gente="src/imagentwitter/gente.png";
        genteA="src/imagentwitter/gente_azul.png";
        user="src/imagentwitter/user.png";
        userA="src/imagentwitter/user_azul.png";
        mas="src/imagentwitter/mas.png";
        masA="src/imagentwitter/mas_azul.png";
        lista="src/imagentwitter/lista2.png";
        listaA="src/imagentwitter/lista2_azul.png";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bthogar = new javax.swing.JButton();
        btexplorar = new javax.swing.JButton();
        btnotificacion = new javax.swing.JButton();
        btmsj = new javax.swing.JButton();
        btliza = new javax.swing.JButton();
        btcomunidad = new javax.swing.JButton();
        btuser = new javax.swing.JButton();
        btmas = new javax.swing.JButton();
        bttweet = new javax.swing.JButton();

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
        btnotificacion.setText(" NOTIFICACIONES");
        btnotificacion.setBorderPainted(false);
        btnotificacion.setContentAreaFilled(false);
        btnotificacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotificacionActionPerformed(evt);
            }
        });

        btmsj.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btmsj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/sobre.png"))); // NOI18N
        btmsj.setText(" MENSAJES");
        btmsj.setBorderPainted(false);
        btmsj.setContentAreaFilled(false);
        btmsj.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btmsj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmsjActionPerformed(evt);
            }
        });

        btliza.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btliza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/lista2.png"))); // NOI18N
        btliza.setText(" LIZA");
        btliza.setBorderPainted(false);
        btliza.setContentAreaFilled(false);
        btliza.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlizaActionPerformed(evt);
            }
        });

        btcomunidad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btcomunidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/gente.png"))); // NOI18N
        btcomunidad.setText(" COMUNIDADES");
        btcomunidad.setBorderPainted(false);
        btcomunidad.setContentAreaFilled(false);
        btcomunidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btcomunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcomunidadActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmas)
                    .addComponent(btuser)
                    .addComponent(btliza)
                    .addComponent(btmsj)
                    .addComponent(btnotificacion)
                    .addComponent(btexplorar)
                    .addComponent(bthogar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bttweet, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btcomunidad)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bthogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btexplorar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmsj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btliza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btcomunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bttweet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1052, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthogarActionPerformed
       botonesblack();
       bthogar.setForeground(new Color(0, 153, 255));
       bthogar.setIcon(new ImageIcon(image2));
   
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

    private void btmsjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmsjActionPerformed
        botonesblack();
        btmsj.setForeground(new Color(0, 153, 255));
        btmsj.setIcon(new ImageIcon(sobreA));
    }//GEN-LAST:event_btmsjActionPerformed

    private void btlizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlizaActionPerformed
        botonesblack();
        btliza.setForeground(new Color(0, 153, 255));
        btliza.setIcon(new ImageIcon(listaA));
    }//GEN-LAST:event_btlizaActionPerformed

    private void btcomunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcomunidadActionPerformed
        botonesblack();
        btcomunidad.setForeground(new Color(0, 153, 255));
        btcomunidad.setIcon(new ImageIcon(genteA));
    }//GEN-LAST:event_btcomunidadActionPerformed

    private void btuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuserActionPerformed
        botonesblack();
        btuser.setForeground(new Color(0, 153, 255));
        btuser.setIcon(new ImageIcon(userA));
    }//GEN-LAST:event_btuserActionPerformed

    private void btmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmasActionPerformed
        botonesblack();
        btmas.setForeground(new Color(0, 153, 255));
        btmas.setIcon(new ImageIcon(masA));
    }//GEN-LAST:event_btmasActionPerformed

    private void bttweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttweetActionPerformed


    }//GEN-LAST:event_bttweetActionPerformed

    private void botonesblack(){
        btliza.setIcon(new ImageIcon(lista));
       btmas.setIcon(new ImageIcon(mas));
       btuser.setIcon(new ImageIcon(user));
       btcomunidad.setIcon(new ImageIcon(gente));
       btmsj.setIcon(new ImageIcon(sobre));
       bthogar.setIcon(new ImageIcon(image1));
       btexplorar.setIcon(new ImageIcon(lupan));
       btnotificacion.setIcon(new ImageIcon(campana));
       bthogar.setForeground(Color.black);
       btexplorar.setForeground(Color.black);
       btnotificacion.setForeground(Color.black);
       btmsj.setForeground(Color.black);
       btliza.setForeground(Color.black);
       btcomunidad.setForeground(Color.black);  
       btuser.setForeground(Color.black);  
       btmas.setForeground(Color.black);  
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcomunidad;
    private javax.swing.JButton btexplorar;
    private javax.swing.JButton bthogar;
    private javax.swing.JButton btliza;
    private javax.swing.JButton btmas;
    private javax.swing.JButton btmsj;
    private javax.swing.JButton btnotificacion;
    private javax.swing.JButton bttweet;
    private javax.swing.JButton btuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
