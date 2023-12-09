
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;


/**
 *
 * @author villa
 */
public class buscarhashtag extends javax.swing.JPanel {

    LogicaTwitter logica=new LogicaTwitter();
    public buscarhashtag() {
        initComponents();
        scrollhash.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbname2 = new javax.swing.JLabel();
        txttexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        scrollhash = new javax.swing.JScrollPane();
        listahash = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbname2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbname2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagentwitter/lupa.png"))); // NOI18N
        lbname2.setText("Buscar #");
        jPanel1.add(lbname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        txttexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttextoKeyTyped(evt);
            }
        });
        jPanel1.add(txttexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 290, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 650, 680));

        listahash.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listahash.setForeground(new java.awt.Color(102, 153, 255));
        scrollhash.setViewportView(listahash);

        jPanel1.add(scrollhash, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 290, 80));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttextoKeyTyped
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listahash.setModel(listModel);
        scrollhash.setVisible(true);
        try{
        String datos=imprimirhashtags();
        if(!datos.isEmpty()){
            for (String linea : datos.split("\n")) {
                    listModel.addElement(linea);
                }
        }else {
                listahash.clearSelection();
            }
        }catch(IOException e){
            System.out.println("No se imprimen #");
        }
    }//GEN-LAST:event_txttextoKeyTyped

     public String imprimirhashtags() throws IOException{
         String texto=txttexto.getText();
         List<String> hash=logica.extraerHashtags(texto);
         StringBuilder resultBuilder = new StringBuilder();
         if(!hash.isEmpty()){
             for(String hashtags: hash){
                 resultBuilder.append(hashtags).append("\n");
             }
         }
         return resultBuilder.toString();
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbname2;
    private javax.swing.JList<String> listahash;
    private javax.swing.JScrollPane scrollhash;
    private javax.swing.JTextField txttexto;
    // End of variables declaration//GEN-END:variables
}
