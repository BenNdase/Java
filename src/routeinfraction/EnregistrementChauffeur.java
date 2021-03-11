/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeinfraction;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class EnregistrementChauffeur extends javax.swing.JFrame {

    Connection connect=null;
    String gender;
    String nomfile=null;
    byte[] photo=null;
    

    public EnregistrementChauffeur() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelImage.setIcon(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Plaque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Permis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PostnomTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PrenomTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Commune = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Quartier = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        avenue = new javax.swing.JTextField();
        jButAnnuler = new javax.swing.JButton();
        jButSenregistrer = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        NomMere = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LieuNaissance = new javax.swing.JTextField();
        ProvinceTxt = new javax.swing.JTextField();
        Territoire = new javax.swing.JTextField();
        Secteur = new javax.swing.JTextField();
        NomPere = new javax.swing.JTextField();
        jLabelImage = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButCapturer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Sexe = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DateLivraison = new com.toedter.calendar.JDateChooser();
        Pronvince = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Jokerman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INFRACTIONS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ROUTIERES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 99, -1));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Plaque Voiture");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 20));
        getContentPane().add(Plaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Num Permis");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 20));
        getContentPane().add(Permis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, -1));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nom ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 20));
        getContentPane().add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, -1));

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Postnom");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 20));
        getContentPane().add(PostnomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Prenom");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 20));
        getContentPane().add(PrenomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Commune");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 20));
        getContentPane().add(Commune, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, -1));

        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quartier");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, 20));
        getContentPane().add(Quartier, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, -1));

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Rue/Avenue");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 20));
        getContentPane().add(avenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 140, -1));

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
        getContentPane().add(jButAnnuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 100, 30));

        jButSenregistrer.setBackground(new java.awt.Color(31, 136, 172));
        jButSenregistrer.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButSenregistrer.setForeground(new java.awt.Color(255, 255, 255));
        jButSenregistrer.setText("Enregistrer");
        jButSenregistrer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButSenregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSenregistrerActionPerformed(evt);
            }
        });
        getContentPane().add(jButSenregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, 30));

        jLabel27.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Sexe");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 110, 20));
        getContentPane().add(NomMere, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 140, -1));

        jLabel25.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nom de la mère");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 120, 20));

        jLabel24.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Nom du père");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, 20));

        jLabel23.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Secteur");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 110, 20));

        jLabel22.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Territoire");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 110, 20));

        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Province");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 110, 20));

        jLabel20.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Date naissance");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 110, 20));

        jLabel19.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Lieu naissance");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 20));
        getContentPane().add(LieuNaissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 140, -1));
        getContentPane().add(ProvinceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 140, -1));
        getContentPane().add(Territoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 140, -1));
        getContentPane().add(Secteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 140, -1));
        getContentPane().add(NomPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 140, -1));

        jLabelImage.setIcon(new javax.swing.ImageIcon("E:\\Document\\Programmation\\JAVA\\PROJET\\image png\\admin (1).png")); // NOI18N
        jLabelImage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 200, 180));

        jLabel26.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Photo Chauffeur");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, 20));

        jButCapturer.setBackground(new java.awt.Color(31, 136, 172));
        jButCapturer.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButCapturer.setForeground(new java.awt.Color(255, 255, 255));
        jButCapturer.setText("Parcourir");
        jButCapturer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButCapturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCapturerActionPerformed(evt);
            }
        });
        getContentPane().add(jButCapturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 120, 30));

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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        Sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin" }));
        getContentPane().add(Sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 140, 30));

        jLabel4.setFont(new java.awt.Font("Jokerman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Version 1.0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 30));
        getContentPane().add(DateLivraison, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 140, -1));

        Pronvince.setForeground(new java.awt.Color(255, 255, 255));
        Pronvince.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/13558453-panneau-d-arrêt-par-l-autoroute.jpg"))); // NOI18N
        Pronvince.setToolTipText("");
        Pronvince.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Pronvince.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Pronvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Enregistrerment (){
        connect=Connecter.Connexion();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyy-MM-dd");
        String DL = dateFormat.format(DateLivraison.getDate());
        try {
            String sql = "insert into chauffeurs(plaque,nom,postnom,prenom,commune,quartier,avenue,"
                    + "lieunaissance,datenaissance,province,territoire,secteur,pere,mere,sexe,photo,permis)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, Plaque.getText().toUpperCase());
            ps.setString(2, Nom.getText().toUpperCase());
            ps.setString(3, PostnomTxt.getText().toUpperCase());
            ps.setString(4, PrenomTxt.getText().toUpperCase());
            ps.setString(5, Commune.getText().toUpperCase());
            ps.setString(6, Quartier.getText().toUpperCase());
            ps.setString(7, avenue.getText().toUpperCase());
            ps.setString(8, LieuNaissance.getText().toUpperCase());
            ps.setString(9, DL);
            ps.setString(10, ProvinceTxt.getText().toUpperCase());
            ps.setString(11, Territoire.getText().toUpperCase());
            ps.setString(12, Secteur.getText().toUpperCase());
            ps.setString(13, NomPere.getText().toUpperCase());
            ps.setString(14, NomMere.getText().toUpperCase());
            ps.setString(15, Sexe.getSelectedItem().toString().toUpperCase());
            ps.setBytes(16, photo);
            ps.setString(17, Permis.getText().toUpperCase());

            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Enregistrement fait");
            Infractions fi = new Infractions();
            fi.setVisible(true);
            this.hide();
            jLabelImage.setIcon(null);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    private void jButAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAnnulerActionPerformed
        // TODO add your handling code here:
        Acceuil ac = new Acceuil();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButAnnulerActionPerformed

    private void jButSenregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSenregistrerActionPerformed
        Enregistrerment();
    }//GEN-LAST:event_jButSenregistrerActionPerformed
    
    private void jButCapturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCapturerActionPerformed
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        File fiche = file.getSelectedFile();
        nomfile = fiche.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(nomfile).getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH));
        jLabelImage.setIcon(imageicon);

        try {
            File image = new File(nomfile);
            FileInputStream fichier = new FileInputStream(image);
            ByteArrayOutputStream baes = new ByteArrayOutputStream();
            byte[] bt = new byte[1024];
            for (int readNum; (readNum = fichier.read(bt)) != -1;) {
                baes.write(bt, 0, readNum);
            }
            photo = baes.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButCapturerActionPerformed
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        try {
//            con = Connecter.ConnectBD();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Demarrage.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EnregistrementChauffeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnregistrementChauffeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnregistrementChauffeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnregistrementChauffeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnregistrementChauffeur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Commune;
    private com.toedter.calendar.JDateChooser DateLivraison;
    private javax.swing.JTextField LieuNaissance;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField NomMere;
    private javax.swing.JTextField NomPere;
    private javax.swing.JTextField Permis;
    private javax.swing.JTextField Plaque;
    private javax.swing.JTextField PostnomTxt;
    private javax.swing.JTextField PrenomTxt;
    private javax.swing.JLabel Pronvince;
    private javax.swing.JTextField ProvinceTxt;
    private javax.swing.JTextField Quartier;
    private javax.swing.JTextField Secteur;
    private javax.swing.JComboBox<String> Sexe;
    private javax.swing.JTextField Territoire;
    private javax.swing.JTextField avenue;
    private javax.swing.JButton jButAnnuler;
    private javax.swing.JButton jButCapturer;
    private javax.swing.JButton jButSenregistrer;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImage;
    // End of variables declaration//GEN-END:variables
}
