/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enunciados;

/**
 *
 * @author JoseDaniel
 */
public class FrmEnunciados extends javax.swing.JFrame {

    int aleatorio;
    int aleatorio1;
    int aleatorio2;
    int aleatorio3;
    int aleatorio4;
    int aleatorio5;
    String palabra1;
    String palabra2;
    String palabra3;
    String palabra4;
    String palabra5;
    String palabra6;
    String articulo[] = {"el", "un", "algun", "ningun"};
    String sustantivo[] = {"niño", "niña", "perro", "ciudad", "auto"};
    String verbo[] = {"manejo", "salto", "corrió", "camino", "omitió"};
    String preposicion[] = {"a", "desde", "encima de", "debajo de", "sobre"};

    public FrmEnunciados() {
        initComponents();

        aleatorio = (int) (Math.random() * 4);
        System.out.println(aleatorio);
        palabra1 = Character.toString(articulo[aleatorio].charAt(0)).toUpperCase() + articulo[aleatorio].substring(1) + " ";
        lblpalabra1.setText(String.valueOf(palabra1));
        aleatorio1 = (int) (Math.random() * 5);
        System.out.println(aleatorio1);
        palabra2 = sustantivo[aleatorio1] + " ";
        lblpalabra2.setText(String.valueOf(palabra2));
        aleatorio2 = (int) (Math.random() * 5);
        System.out.println(aleatorio2);
        palabra3 = verbo[aleatorio2] + " ";
        lblpalabra3.setText(String.valueOf(palabra3));
        aleatorio3 = (int) (Math.random() * 5);
        System.out.println(aleatorio3);
        palabra4 = preposicion[aleatorio3] + " ";
        lblpalabra4.setText(String.valueOf(palabra4));
        
        
        
        
        aleatorio4 = (int) (Math.random() * 4);      
        System.out.println(aleatorio4);
        palabra5 = articulo[aleatorio4] + " ";
        lblpalabra5.setText(String.valueOf(palabra5));
        
        
        
        
        aleatorio5 = (int) (Math.random() * 5);
        System.out.println(aleatorio5);
        palabra6 = sustantivo[aleatorio5] + ".";
        lblpalabra6.setText(String.valueOf(palabra6));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpalabra1 = new javax.swing.JLabel();
        lblpalabra2 = new javax.swing.JLabel();
        lblpalabra3 = new javax.swing.JLabel();
        lblpalabra4 = new javax.swing.JLabel();
        btmnuevaoracion = new javax.swing.JButton();
        lblpalabra5 = new javax.swing.JLabel();
        lblpalabra6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btmnuevaoracion.setText("Oracion");
        btmnuevaoracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmnuevaoracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblpalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpalabra2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpalabra3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpalabra4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpalabra5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpalabra6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmnuevaoracion)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblpalabra6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblpalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblpalabra2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblpalabra3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblpalabra4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(lblpalabra5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btmnuevaoracion)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmnuevaoracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmnuevaoracionActionPerformed
        aleatorio = (int) (Math.random() * 4);
        System.out.println(aleatorio);
        palabra1 = Character.toString(articulo[aleatorio].charAt(0)).toUpperCase() + articulo[aleatorio].substring(1) + " ";
        lblpalabra1.setText(String.valueOf(palabra1));
        aleatorio1 = (int) (Math.random() * 5);
        System.out.println(aleatorio1);
        palabra2 = sustantivo[aleatorio1] + " ";
        lblpalabra2.setText(String.valueOf(palabra2));
        aleatorio2 = (int) (Math.random() * 5);
        System.out.println(aleatorio2);
        palabra3 = verbo[aleatorio2] + " ";
        lblpalabra3.setText(String.valueOf(palabra3));
        aleatorio3 = (int) (Math.random() * 5);
        System.out.println(aleatorio3);
        palabra4 = preposicion[aleatorio3] + " ";
        lblpalabra4.setText(String.valueOf(palabra4));
        
        
        
        
        aleatorio4 = (int) (Math.random() * 4);      
        System.out.println(aleatorio4);
        palabra5 = articulo[aleatorio4] + " ";
        lblpalabra5.setText(String.valueOf(palabra5));
        
        
        
        
        aleatorio5 = (int) (Math.random() * 5);
        System.out.println(aleatorio5);
        palabra6 = sustantivo[aleatorio5] + ".";
        lblpalabra6.setText(String.valueOf(palabra6));
    }//GEN-LAST:event_btmnuevaoracionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEnunciados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEnunciados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEnunciados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEnunciados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEnunciados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmnuevaoracion;
    private javax.swing.JLabel lblpalabra1;
    private javax.swing.JLabel lblpalabra2;
    private javax.swing.JLabel lblpalabra3;
    private javax.swing.JLabel lblpalabra4;
    private javax.swing.JLabel lblpalabra5;
    private javax.swing.JLabel lblpalabra6;
    // End of variables declaration//GEN-END:variables
}
