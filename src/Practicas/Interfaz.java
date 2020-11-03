package Practicas;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;

public class Interfaz extends javax.swing.JFrame {
    public Interfaz() {
        initComponents();
        ButtonGroup Algoritmo = new ButtonGroup();
        Algoritmo.add(condicionesCompetancias);
        Algoritmo.add(desacInterrup);
        Algoritmo.add(varCerra);
        Algoritmo.add(Dekker);
        Algoritmo.add(Dijkstra);
        Algoritmo.add(mutex);
        cd = new Cerradura();
        rc = new RCompartido(cd);
        rc.setTurno(0);
        t1 = new Hilo(Area1, rc);
        t1.setName("Gallo 1");
        
        rc.setTurno(1);
        t2 = new Hilo(Area2, rc);
        t2.setName("Gallo 2");
        
        rc.setTurno(2);
        t3 = new Hilo(Area3, rc);
        t3.setName("Gallo 3");
        
        rc.setTurno(3);
        t4 = new Hilo(Area4, rc);
        t4.setName("Gallo 4");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jScrollPane6 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        Correr = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        Area3 = new javax.swing.JTextArea();
        Matar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        Area4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area5 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        condicionesCompetancias = new javax.swing.JRadioButtonMenuItem();
        desacInterrup = new javax.swing.JRadioButtonMenuItem();
        varCerra = new javax.swing.JRadioButtonMenuItem();
        Dekker = new javax.swing.JRadioButtonMenuItem();
        Dijkstra = new javax.swing.JRadioButtonMenuItem();
        mutex = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica Final de las practicas de entrenamiento");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane6.setViewportView(Area2);

        Correr.setText("Correr");
        Correr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrerActionPerformed(evt);
            }
        });

        Area3.setColumns(20);
        Area3.setRows(5);
        jScrollPane7.setViewportView(Area3);

        Matar.setText("Kill - 9");
        Matar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatarActionPerformed(evt);
            }
        });

        jButton3.setText("Terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Area4.setColumns(20);
        Area4.setRows(5);
        jScrollPane8.setViewportView(Area4);

        jLabel1.setText("Plato 1");

        jLabel2.setText("Plato 2");

        jLabel3.setText("Plato 3");

        jLabel4.setText("Plato 4");

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane5.setViewportView(Area1);

        Area5.setEditable(false);
        Area5.setColumns(20);
        Area5.setRows(5);
        jScrollPane1.setViewportView(Area5);
        Area5.getAccessibleContext().setAccessibleName("Area1");

        jMenu4.setText("Algoritmos");

        condicionesCompetancias.setSelected(true);
        condicionesCompetancias.setText("Condiciones de Competencia");
        condicionesCompetancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionesCompetanciasActionPerformed(evt);
            }
        });
        jMenu4.add(condicionesCompetancias);

        desacInterrup.setText("Desactivacion de Interrupciones ");
        desacInterrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desacInterrupActionPerformed(evt);
            }
        });
        jMenu4.add(desacInterrup);

        varCerra.setText("Petterson (VCerradura)");
        varCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varCerraActionPerformed(evt);
            }
        });
        jMenu4.add(varCerra);

        Dekker.setText("Dekker (Alternancia Estricta)");
        Dekker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DekkerActionPerformed(evt);
            }
        });
        jMenu4.add(Dekker);

        Dijkstra.setText("Dijkstra - Paper");
        Dijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraActionPerformed(evt);
            }
        });
        jMenu4.add(Dijkstra);

        mutex.setText("Mutex");
        mutex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutexActionPerformed(evt);
            }
        });
        jMenu4.add(mutex);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Otros");

        jMenuItem6.setText("Limpiar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem12.setText("Cerrar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Correr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Matar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Correr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Matar)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrerActionPerformed
     if(parar){
         reset();
     }  
     parar=false; 
        
        if(condicionesCompetancias.isSelected()){
            t1.setAlgoritmo(0);
            t2.setAlgoritmo(0);
            t3.setAlgoritmo(0);
            t4.setAlgoritmo(0);
        }
        if(desacInterrup.isSelected()){
            t1.setAlgoritmo(1);
            t2.setAlgoritmo(1);
            t3.setAlgoritmo(1);
            t4.setAlgoritmo(1);
        }
        if(varCerra.isSelected()){
            t1.setAlgoritmo(2);
            t2.setAlgoritmo(2);
            t3.setAlgoritmo(2);
            t4.setAlgoritmo(2);
        }
        if(Dekker.isSelected()){
            rc.setTurno(0);
            t1.setAlgoritmo(3);
            t2.setAlgoritmo(3);
            t3.setAlgoritmo(3);
            t4.setAlgoritmo(3);
        }
        if(Dijkstra.isSelected()){
            t1.setAlgoritmo(4);
            t2.setAlgoritmo(4);
            t3.setAlgoritmo(4);
            t4.setAlgoritmo(4);
        }
        if(mutex.isSelected()){
            t1.setAlgoritmo(5);
            t2.setAlgoritmo(5);
            t3.setAlgoritmo(5);
            t4.setAlgoritmo(5);
        }
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Correr.setEnabled(false);
    }//GEN-LAST:event_CorrerActionPerformed

    private void MatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatarActionPerformed
        int opcion = (int) (Math.random()*4);
        Area5.setText("El gallo que \nse detiene \nes el: "+ (opcion+1));
        try{ 
            switch(opcion){
                case 0:
                    t1.setDead(true);
                break;
                case 1:
                    t2.setDead(true);
                break;
                case 2:
                    t3.setDead(true);
                break;  
                case 3:
                    t4.setDead(true);
                break;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_MatarActionPerformed
    
    public void clean(){
        Area1.setText("");
        Area2.setText("");
        Area3.setText("");
        Area4.setText("");
        Area5.setText("");
    }
    
    public void kill(){
    if(!t1.isDead()){
        t1.stop();
    }
    if(!t2.isDead()){
        t2.stop();
    }
    if(!t3.isDead()){
        t3.stop();
    }
    if(!t4.isDead()){
        t4.stop();
    }
    parar=true;
    Correr.setEnabled(true);
    }
    
    public void reset(){
        rc.setTurno(0);
        t1 = new Hilo(Area1, rc);
        t1.setName("Gallo 1");
        
        rc.setTurno(1);
        t2 = new Hilo(Area2, rc);
        t2.setName("Gallo 2");
        
        rc.setTurno(2);
        t3 = new Hilo(Area3, rc);
        t3.setName("Gallo 3");
        
        rc.setTurno(3);
        t4 = new Hilo(Area4, rc);
        t4.setName("Gallo 4");
    }
    
    private void mutexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutexActionPerformed

    }//GEN-LAST:event_mutexActionPerformed

    private void DekkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DekkerActionPerformed

    }//GEN-LAST:event_DekkerActionPerformed

    private void condicionesCompetanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionesCompetanciasActionPerformed

    }//GEN-LAST:event_condicionesCompetanciasActionPerformed

    private void desacInterrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desacInterrupActionPerformed

    }//GEN-LAST:event_desacInterrupActionPerformed

    private void DijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraActionPerformed

    }//GEN-LAST:event_DijkstraActionPerformed

    private void varCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varCerraActionPerformed

    }//GEN-LAST:event_varCerraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        clean();
        kill();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextArea Area3;
    private javax.swing.JTextArea Area4;
    private javax.swing.JTextArea Area5;
    private javax.swing.JButton Correr;
    private javax.swing.JRadioButtonMenuItem Dekker;
    private javax.swing.JRadioButtonMenuItem Dijkstra;
    private javax.swing.JButton Matar;
    private javax.swing.JRadioButtonMenuItem condicionesCompetancias;
    private javax.swing.JRadioButtonMenuItem desacInterrup;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JRadioButtonMenuItem mutex;
    private javax.swing.JRadioButtonMenuItem varCerra;
    // End of variables declaration//GEN-END:variables
    private Hilo t1,t2, t3, t4;
    private RCompartido rc;
    private Cerradura cd;
    private boolean parar=false;
}
