
import java.awt.FlowLayout;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JScrollBar;


/**
 *
 * @author villa
 */
public class Timeline extends javax.swing.JPanel {

    UsersTwit user=new UsersTwit();
    LogicaTwitter logica;
    private ArrayList<String[]> twits;
    public Timeline(LogicaTwitter logica) {
        initComponents();
       try{
       this.logica=logica;
       this.twits=logica.cargarTwits();
       subirtweets();
       }catch(IOException e){
            System.out.println("error en cargar ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttexto = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        scrolltweets = new javax.swing.JScrollPane();
        paneltweets = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txttexto.setBorder(null);
        txttexto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txttexto.setForeground(new java.awt.Color(102, 102, 102));
        txttexto.setToolTipText("");
        txttexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txttexto);

        jLabel2.setText("Foto");
        jLabel2.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("Tweet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("QUE ESTA PASANDO?");

        scrolltweets.setBackground(new java.awt.Color(255, 255, 255));
        scrolltweets.setBorder(null);
        scrolltweets.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        paneltweets.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout paneltweetsLayout = new javax.swing.GroupLayout(paneltweets);
        paneltweets.setLayout(paneltweetsLayout);
        paneltweetsLayout.setHorizontalGroup(
            paneltweetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        paneltweetsLayout.setVerticalGroup(
            paneltweetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        scrolltweets.setViewportView(paneltweets);

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrolltweets)
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(scrolltweets, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String texto=txttexto.getText();
        try{
        logica.guardarTwit(texto);
        txttexto.setText("");
        subirtweets();
        this.revalidate();
                this.repaint();
                JScrollBar barra = scrolltweets.getVerticalScrollBar();
                barra.setValue(barra.getMaximum());
        }catch(IOException e){
             System.out.println("No se puede");
         } 
    }//GEN-LAST:event_jButton1ActionPerformed

  /*  private void subirtweets() throws IOException{
        paneltweets.removeAll();
        twits=logica.cargarTwits();
        if (!twits.isEmpty()) {

            Tweets[] twits_p = new Tweets[twits.size()];

            for (int i = 0; i < twits_p.length; i++) {
          String texto=txttexto.getText();
         String usuario=user.getUserlog();
         
          Date fechaActual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaEntrada = dateFormat.format(fechaActual);
             Tweets twee=new Tweets(usuario, texto, fechaEntrada);
             paneltweets.add(twee);
             paneltweets.revalidate();
             paneltweets.repaint();
             scrolltweets.revalidate();
             scrolltweets.repaint();
             JScrollBar barra = scrolltweets.getVerticalScrollBar();
                barra.setValue(barra.getMaximum());
                scrolltweets.repaint();
                this.repaint();
         
            }
            JScrollBar barra = scrolltweets.getVerticalScrollBar();
                barra.setValue(barra.getMaximum());
             panel.repaint();
         }
    }*/
private void subirtweets() throws IOException {
    paneltweets.removeAll();
        paneltweets.setLayout(new BoxLayout(paneltweets, BoxLayout.Y_AXIS));  // Usar BoxLayout para apilar verticalmente

        twits = logica.cargarTwits();

        if (!twits.isEmpty()) {
            for (String[] tweet : twits) {
                String usuario = tweet[0];  
                String texto = tweet[1];    
                String fecha = tweet[2];    

                long tiempoEnMilisegundos = Long.parseLong(fecha);
                Date fechadate = new Date(tiempoEnMilisegundos);
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String fechaFormateada = formatoFecha.format(fechadate);
                Tweets twee = new Tweets(usuario, texto, fechaFormateada);
                paneltweets.add(twee);
            }

            paneltweets.revalidate();
            paneltweets.repaint();
            scrolltweets.revalidate();
            scrolltweets.repaint();

            // Mover la barra de desplazamiento al final
            JScrollBar barra = scrolltweets.getVerticalScrollBar();
            barra.setValue(barra.getMaximum());
        scrolltweets.repaint();
        this.repaint();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel paneltweets;
    private javax.swing.JScrollPane scrolltweets;
    private javax.swing.JEditorPane txttexto;
    // End of variables declaration//GEN-END:variables
}
