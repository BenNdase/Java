/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeinfraction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Infractions extends javax.swing.JFrame {

    Connection connect=null;
    public Infractions() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboInfractions = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ButtonSeconnecter1 = new javax.swing.JButton();
        Sanctions = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        penalite = new javax.swing.JTextField();
        jButAnnuler = new javax.swing.JButton();
        Id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        permis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Jokerman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INFRACTIONS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ROUTIERES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 99, -1));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("   -");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Jokerman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Version 1.0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Les infactions");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, 20));

        jComboInfractions.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jComboInfractions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usage de plaques falsifi??es", "Plaque d???immatriculation non conforme", "Usage d???un t??l??phone tenu en main en conduisant", "D??faut de port de ceinture de s??curit?? (par le conducteur ou par le passager)", "Refus de c??der le passage ?? un pi??ton traversant ou manifestant l???intention de traverser", "D??faut de dispositif d???attache adapt?? pour les enfants", "D??faut de port de ceinture de s??curit??", "D??faut de port du casque", "Circulation sans ??clairage : de nuit ou par visibilit?? insuffisante", "Non-respect de l???arr??t au feu rouge, au stop ou au c??dez-le-passage", "Non-respect des distances de s??curit?? entre deux v??hicules", "Refus de priorit??", "Circulation ?? gauche", "Circulation sur bande d???arr??t d???urgence", "Changement de direction sans avertissement pr??alable", "Acc??l??ration d???un conducteur sur le point d?????tre d??pass??", "D??passement dangereux ", "Exc??s de vitesse ??gal ou sup??rieur ?? 20 km/h ", "Conduite avec une alcool??mie", "Refus de se soumettre ?? une v??rification de pr??sence d???alcool dans le sang", "Conduite malgr?? une suspension administrative ou judiciaire", "D??lit de fuite", "Homicide involontaire aggrav??", "Conduite sans permis", "D??faut d???assurance" }));
        jComboInfractions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboInfractionsActionPerformed(evt);
            }
        });
        getContentPane().add(jComboInfractions, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 810, 30));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Id infranctions");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));

        ButtonSeconnecter1.setBackground(new java.awt.Color(31, 136, 172));
        ButtonSeconnecter1.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        ButtonSeconnecter1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSeconnecter1.setText("Enregistrer");
        ButtonSeconnecter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSeconnecter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSeconnecter1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSeconnecter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, 30));

        Sanctions.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Sanctions.setEnabled(false);
        getContentPane().add(Sanctions, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 810, 30));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Penalit??s");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 30));

        penalite.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        penalite.setEnabled(false);
        getContentPane().add(penalite, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 720, 30));

        jButAnnuler.setBackground(new java.awt.Color(31, 136, 172));
        jButAnnuler.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButAnnuler.setForeground(new java.awt.Color(255, 255, 255));
        jButAnnuler.setText("Annuler");
        jButAnnuler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAnnulerActionPerformed(evt);
            }
        });
        getContentPane().add(jButAnnuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 100, 30));
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sanctions");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 100, 20));

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Permis chauffeur");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 20));
        getContentPane().add(permis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/13558453-panneau-d-arr??t-par-l-autoroute.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jComboInfractionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboInfractionsActionPerformed
        if (jComboInfractions.getSelectedItem().toString().equals("Exc??s de vitesse ??gal ou sup??rieur ?? 20 km/h ")
                ||jComboInfractions.getSelectedItem().toString().equals("Refus de c??der le passage ?? un pi??ton traversant ou manifestant l???intention de traverser")
                ||jComboInfractions.getSelectedItem().toString().equals("D??faut de dispositif d???attache adapt?? pour les enfants")||jComboInfractions.getSelectedItem().toString().equals("Plaque d???immatriculation non conforme D??faut de port de ceinture de s??curit??")
                ||jComboInfractions.getSelectedItem().toString().equals("D??faut de port du casque")||jComboInfractions.getSelectedItem().toString().equals("D??faut de port de ceinture de s??curit?? (par le conducteur ou par le passager)")
                ||jComboInfractions.getSelectedItem().toString().equals("Usage d???un t??l??phone tenu en main en conduisant")
                ||jComboInfractions.getSelectedItem().toString().equals("D??faut de port de ceinture de s??curit??")){
            Sanctions.setText("Amendes");
            penalite.setText("Payez la p??nalit?? de 60$");
        }else if (jComboInfractions.getSelectedItem().toString().equals("Conduite sans permis")||jComboInfractions.getSelectedItem().toString().equals("D??lit de fuite")
                ||jComboInfractions.getSelectedItem().toString().equals("Non-respect des distances de s??curit?? entre deux v??hicules")||jComboInfractions.getSelectedItem().toString().equals("Non-respect de l???arr??t au feu rouge, au stop ou au c??dez-le-passage")
                ||jComboInfractions.getSelectedItem().toString().equals("Conduite avec une alcool??mie")||jComboInfractions.getSelectedItem().toString().equals("Refus de priorit??")){
            Sanctions.setText("Amendes");
            penalite.setText("Payez la p??nalit?? de 100$");
        }else if (jComboInfractions.getSelectedItem().toString().equals("Circulation sans ??clairage : de nuit ou par visibilit?? insuffisante")||jComboInfractions.getSelectedItem().toString().equals("Circulation ?? gauche")
                ||jComboInfractions.getSelectedItem().toString().equals("Acc??l??ration d???un conducteur sur le point d?????tre d??pass?? ")
                ||jComboInfractions.getSelectedItem().toString().equals("D??faut d???assurance")||jComboInfractions.getSelectedItem().toString().equals("Refus de se soumettre ?? une v??rification de pr??sence d???alcool dans le sang")
                ||jComboInfractions.getSelectedItem().toString().equals("Changement de direction sans avertissement pr??alable")){
            Sanctions.setText("Amendes et suspension du permis");
            penalite.setText("Payez la p??nalit?? de 60$ et le permis sera suspendu pour une dur??e de 3 mois");
        }else if (jComboInfractions.getSelectedItem().toString().equals("D??passement dangereux")||jComboInfractions.getSelectedItem().toString().equals("Circulation sur bande d???arr??t d???urgence")) {
            Sanctions.setText("Amendes et suspension du permis");
            penalite.setText("Payez la p??nalit?? de 60$ et le permis sera suspendu pour une dur??e de 5 mois");
        }else{
            Sanctions.setText("Amendes , retrait permis et l'arr??t du chauffeur ");
            penalite.setText("Retrait permis jusqu'?? nouvel odre judiciaire , arr??t du chauffeur et la p??nalit?? sera fix?? par le juge");
        }
    }//GEN-LAST:event_jComboInfractionsActionPerformed

    private void jButAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAnnulerActionPerformed
        // TODO add your handling code here:
        EnregistrementChauffeur ec = new EnregistrementChauffeur();
        ec.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButAnnulerActionPerformed

    private void ButtonSeconnecter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSeconnecter1ActionPerformed
        connect=Connecter.Connexion();
        
        
        try {
            String sql = "insert into infraction(idinfractions,infraction,penalite,sanction,permis)values(?,?,?,?,?)";

            PreparedStatement ps = connect.prepareStatement(sql);
            
            ps.setString(1, Id.getText());
            ps.setString(2, jComboInfractions.getSelectedItem().toString());
            ps.setString(3, Sanctions.getText());
            ps.setString(4, penalite.getText());
            ps.setString(5, permis.getText().toUpperCase());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Enregistrement fait");
            Acceuil ac = new Acceuil();
            ac.setVisible(true);
            this.hide();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
    }//GEN-LAST:event_ButtonSeconnecter1ActionPerformed

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
            java.util.logging.Logger.getLogger(Infractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Infractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Infractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Infractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Infractions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSeconnecter1;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Sanctions;
    private javax.swing.JButton jButAnnuler;
    private javax.swing.JComboBox<String> jComboInfractions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField penalite;
    private javax.swing.JTextField permis;
    // End of variables declaration//GEN-END:variables
}
