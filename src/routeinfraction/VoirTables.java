/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeinfraction;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class VoirTables extends javax.swing.JFrame {

    Connection connect=null;
    public VoirTables() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        Utilisation();
        Utliser();
        jLabPhoto.setIcon(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBut = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        ComboRecherche = new javax.swing.JComboBox<>();
        TextRecherche = new javax.swing.JTextField();
        jButRechecrhe = new javax.swing.JButton();
        jButSupprimer = new javax.swing.JButton();
        jLabPhoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        TextSearchInfraction = new javax.swing.JTextField();
        jButSearch = new javax.swing.JButton();
        jButSupprimer1 = new javax.swing.JButton();
        jLabPhoto1 = new javax.swing.JLabel();
        jButVu = new javax.swing.JButton();
        jButRetour = new javax.swing.JButton();
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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, -1, -1));

        jBut.setBackground(new java.awt.Color(31, 136, 172));
        jBut.setFont(new java.awt.Font("Jokerman", 3, 16)); // NOI18N
        jBut.setForeground(new java.awt.Color(255, 255, 255));
        jBut.setText(">>>>");
        jBut.setBorder(new javax.swing.border.MatteBorder(null));
        jBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBut.setEnabled(false);
        jBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButActionPerformed(evt);
            }
        });
        getContentPane().add(jBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 420, 50, 30));

        jTabbedPane1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaque", "Permis", "Nom", "Postnom", "Prenom", "Commune", "Quartier", "Avenue", "Lieu", "Date", "Province", "Territoire", "Secteur", "Pere", "Mere", "Sexe"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        ComboRecherche.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        ComboRecherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "plaque", "permis", "nom", "postnom", "prenom", "commune", "quartier", "avenue", "lieunaissance", "datenaissance", "province", "territoire", "secteur", "pere", "mere", "sexe" }));

        jButRechecrhe.setBackground(new java.awt.Color(31, 136, 172));
        jButRechecrhe.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButRechecrhe.setForeground(new java.awt.Color(255, 255, 255));
        jButRechecrhe.setText("Recherche");
        jButRechecrhe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButRechecrhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRechecrheActionPerformed(evt);
            }
        });

        jButSupprimer.setBackground(new java.awt.Color(31, 136, 172));
        jButSupprimer.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        jButSupprimer.setText("Supprimer");
        jButSupprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSupprimerActionPerformed(evt);
            }
        });

        jLabPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButRechecrhe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButRechecrhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Chauffeurs", jPanel2);

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Numero Permis", "Infranctions", "Penalités", "Sanctions"
            }
        ));
        jTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jButSearch.setBackground(new java.awt.Color(31, 136, 172));
        jButSearch.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButSearch.setText("Search");
        jButSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSearchActionPerformed(evt);
            }
        });

        jButSupprimer1.setBackground(new java.awt.Color(31, 136, 172));
        jButSupprimer1.setFont(new java.awt.Font("Jokerman", 3, 14)); // NOI18N
        jButSupprimer1.setForeground(new java.awt.Color(255, 255, 255));
        jButSupprimer1.setText("Supprimer");
        jButSupprimer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButSupprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSupprimer1ActionPerformed(evt);
            }
        });

        jLabPhoto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextSearchInfraction, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSupprimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButSupprimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextSearchInfraction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Infranctions", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 340));

        jButVu.setBackground(new java.awt.Color(31, 136, 172));
        jButVu.setFont(new java.awt.Font("Jokerman", 3, 16)); // NOI18N
        jButVu.setForeground(new java.awt.Color(255, 255, 255));
        jButVu.setText("Vu");
        jButVu.setBorder(new javax.swing.border.MatteBorder(null));
        jButVu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButVuActionPerformed(evt);
            }
        });
        getContentPane().add(jButVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 420, 50, 30));

        jButRetour.setBackground(new java.awt.Color(31, 136, 172));
        jButRetour.setFont(new java.awt.Font("Jokerman", 3, 16)); // NOI18N
        jButRetour.setForeground(new java.awt.Color(255, 255, 255));
        jButRetour.setText("<<<<");
        jButRetour.setBorder(new javax.swing.border.MatteBorder(null));
        jButRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRetourActionPerformed(evt);
            }
        });
        getContentPane().add(jButRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 50, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/13558453-panneau-d-arrêt-par-l-autoroute.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public ArrayList<Utilisateurs> utilisateurs(){
        ArrayList<Utilisateurs> Util = new ArrayList<>();
        try {
            connect= Connecter.Connexion();
            String req= "SELECT * from chauffeurs";
            Statement st = connect.createStatement();
            ResultSet Rs = st.executeQuery(req);
            Utilisateurs ul;
            while (Rs.next()){                
                    ul = new Utilisateurs (Rs.getString("plaque"),Rs.getString("permis"),Rs.getString("nom")
                            ,Rs.getString("postnom"),Rs.getString("prenom"),Rs.getString("commune"),Rs.getString("quartier"),Rs.getString("avenue")
                            ,Rs.getString("lieunaissance"),Rs.getString("datenaissance"),Rs.getString("province"),Rs.getString("territoire"),Rs.getString("secteur")
                            ,Rs.getString("pere"),Rs.getString("mere"),Rs.getString("sexe"),Rs.getBytes("photo"));
                    Util.add(ul);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return Util;
    }
    public void Utilisation(){
        ArrayList<Utilisateurs> ut = utilisateurs();
        DefaultTableModel madata = (DefaultTableModel)jTable.getModel();
        Object [] b = new Object [16];
            for (int i = 0; i < ut.size(); i++) {
             b[0] =ut.get(i).getPlaqueNum();
             b[1] =ut.get(i).getPermisNum();
             b[2] =ut.get(i).getNom();
             b[3] =ut.get(i).getPostnomTxt();
             b[4] =ut.get(i).getPrenomTxt();
             b[5] =ut.get(i).getCommune();
             b[6] =ut.get(i).getQuartier();
             b[7] =ut.get(i).getAvenue();
             b[8] =ut.get(i).getLieuNaissance();
             b[9] =ut.get(i).getDateNaissance();
             b[10] =ut.get(i).getProvinceTxt();
             b[11] =ut.get(i).getTerritoire();
             b[12] =ut.get(i).getSecteur();
             b[13] =ut.get(i).getNomPere();
             b[14] =ut.get(i).getNomMere();
             b[15] =ut.get(i).getSexe();
                      
             madata.addRow(b);
            }     
        }
    public ArrayList<UtilisateursInfranction> utilisateursInfranctions(){
        ArrayList<UtilisateursInfranction> Util = new ArrayList<>();
        
        try {
            connect= Connecter.Connexion();
            String req= "SELECT * from infraction";
            Statement st = connect.createStatement();
            ResultSet Rs = st.executeQuery(req);
            UtilisateursInfranction ul;
            while (Rs.next()){                
                    ul = new UtilisateursInfranction( Rs.getInt("idinfractions"), Rs.getString("permis"),Rs.getString("infraction"), Rs.getString("penalite"), Rs.getString("sanction"));
                    Util.add(ul);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return Util;
    }
    public void Utliser(){
        ArrayList<UtilisateursInfranction> ut = utilisateursInfranctions();
        DefaultTableModel data = (DefaultTableModel)jTab.getModel();
        Object [] b = new Object [5];
            for (int i = 0; i < ut.size(); i++) {
             b[0] =ut.get(i).getId();
             b[1] =ut.get(i).getpermis();
             b[2] =ut.get(i).getInfraction();
             b[3] =ut.get(i).getpenalite();
             b[4] =ut.get(i).getsanction();
             
             data.addRow(b);
            }     
        }
    public ArrayList<Utilisateurs> UserUtilisateurses() {
        ArrayList<Utilisateurs> Util = new ArrayList<>();
        connect = Connecter.Connexion();
        try {
             String req= "SELECT * from chauffeurs Where "+ ComboRecherche.getSelectedItem().toString()+"='" + TextRecherche.getText().toUpperCase()+ "'";
             Statement st = connect.createStatement();
             ResultSet Rs = st.executeQuery(req);
             Utilisateurs Ul;
            while (Rs.next()) {                
                Ul = new Utilisateurs (Rs.getString("plaque"),Rs.getString("permis"),Rs.getString("nom"),Rs.getString("postnom"),Rs.getString("prenom"),Rs.getString("commune"),Rs.getString("quartier"),Rs.getString("avenue")
                            ,Rs.getString("lieunaissance"),Rs.getString("datenaissance"),Rs.getString("province"),Rs.getString("territoire"),Rs.getString("secteur")
                            ,Rs.getString("pere"),Rs.getString("mere"),Rs.getString("sexe"),Rs.getBytes("photo"));
                Util.add(Ul);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
           return Util;
    }
    public void Utlise(){
        ArrayList<Utilisateurs> ut = UserUtilisateurses();
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        Object [] b = new Object [16];
               for (int i = 0; i < ut.size(); i++) {
             b[0] =ut.get(i).getPlaqueNum();
             b[1] =ut.get(i).getPermisNum();
             b[2] =ut.get(i).getNom();
             b[3] =ut.get(i).getPostnomTxt();
             b[4] =ut.get(i).getPrenomTxt();
             b[5] =ut.get(i).getCommune();
             b[6] =ut.get(i).getQuartier();
             b[7] =ut.get(i).getAvenue();
             b[8] =ut.get(i).getLieuNaissance();
             b[9] =ut.get(i).getDateNaissance();
             b[10] =ut.get(i).getProvinceTxt();
             b[11] =ut.get(i).getTerritoire();
             b[12] =ut.get(i).getSecteur();
             b[13] =ut.get(i).getNomPere();
             b[14] =ut.get(i).getNomMere();
             b[15] =ut.get(i).getSexe();
             model.addRow(b);
            }     
        }
    public String val(){
        int i = jTable.getSelectedRow();
        String v = UserUtilisateurses().get(i).getPermisNum();
        TextSearchInfraction.setText(v);
        return v;
    }
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked
    
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
        
        int i = jTable.getSelectedRow();
        byte[] img = (utilisateurs().get(i).getphoto());
             ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabPhoto.getWidth(), jLabPhoto.getHeight(), Image.SCALE_SMOOTH));
             jLabPhoto.setIcon(imageIcon);    
        val();
        byte[] im = (UserUtilisateurses().get(i).getphoto());
             ImageIcon imageIcn = new ImageIcon(new ImageIcon(im).getImage().getScaledInstance(jLabPhoto.getWidth(), jLabPhoto.getHeight(), Image.SCALE_SMOOTH));
             jLabPhoto.setIcon(imageIcn);
    
    }//GEN-LAST:event_jTableMouseClicked
    public ArrayList<UtilisateursInfranction> userInfraction() {
        ArrayList<UtilisateursInfranction> Uti = new ArrayList<>();
        
        connect = Connecter.Connexion();
        try {
             String req= "select * from chauffeurs c, infraction i where i.permis = '" + TextSearchInfraction.getText().toUpperCase() + "'" ;
             Statement st = connect.createStatement();
             ResultSet Rs = st.executeQuery(req);
             UtilisateursInfranction Ul;
            while (Rs.next()) {                
                Ul = new UtilisateursInfranction(Rs.getInt("idinfractions"), Rs.getString("permis"),Rs.getString("infraction"), Rs.getString("penalite"), Rs.getString("sanction"));
                Uti.add(Ul);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
           return Uti;
    }
    public void Utlisee(){
        ArrayList<UtilisateursInfranction> ut = utilisateursInfranctions();
        DefaultTableModel data = (DefaultTableModel)jTab.getModel();
        Object [] b = new Object [5];
            for (int i = 0; i < ut.size(); i++) {
             b[0] =ut.get(i).getId();
             b[1] =ut.get(i).getpermis();
             b[2] =ut.get(i).getInfraction();
             b[3] =ut.get(i).getpenalite();
             b[4] =ut.get(i).getsanction();
             
             data.addRow(b);
            }     
        }
    
    private void jButRechecrheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRechecrheActionPerformed
         try {
             
            DefaultTableModel mod = (DefaultTableModel)jTable.getModel();
            mod.setRowCount(0);
            Utlise();
            
            if (mod.getRowCount()==0) {
                jLabPhoto.setIcon(null);
                TextSearchInfraction.setText("");
                JOptionPane.showMessageDialog(null, "il n'y a aucun chauffeur qui porte ce  " + ComboRecherche.getSelectedItem().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButRechecrheActionPerformed

    private void jButSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSearchActionPerformed
        try {
             
            DefaultTableModel mod = (DefaultTableModel)jTab.getModel();
            mod.setRowCount(0);
            Utlisee();
            
            if (mod.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "le chauffeur n'a jamais été enregistré");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButSearchActionPerformed
    
    private void jButSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSupprimerActionPerformed
        try {
            connect = Connecter.Connexion();
            int row = jTable.getSelectedRow();
            String valeur=(jTable.getModel().getValueAt(row, 0).toString());
            String query= "DELETE FROM chauffeurs Where plaque = ?";
            PreparedStatement pst = connect.prepareStatement(query);
            
            //instenciation de la classe et vérification de la valeur à supprimer
            Utilisateurs p = new Utilisateurs(row, valeur);
            pst.setString(1, p.getMaValeur());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable.getModel();
            model.setRowCount(0);
            Utilisation();
            jLabPhoto.setIcon(null);
            
            JOptionPane.showMessageDialog(null, "Suppression réussie");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de suppression\n" + e);
        }
    }//GEN-LAST:event_jButSupprimerActionPerformed

    private void jButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButActionPerformed
        EnregistrementChauffeur ec = new EnregistrementChauffeur();
        ec.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButActionPerformed

    private void jButRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRetourActionPerformed
        Acceuil ac= new Acceuil();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButRetourActionPerformed

    private void jButVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButVuActionPerformed
        jBut.setEnabled(true);
    }//GEN-LAST:event_jButVuActionPerformed

    private void jButSupprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSupprimer1ActionPerformed
        try {
            connect = Connecter.Connexion();
            int row = jTab.getSelectedRow();
            String valeur=(jTab.getModel().getValueAt(row, 0).toString());
            String query= "DELETE FROM infraction Where idinfractions = ?";
            PreparedStatement pst = connect.prepareStatement(query);
            
            //instenciation de la classe et vérification de la valeur à supprimer
            Utilisateurs p = new Utilisateurs(row, valeur);
            pst.setString(1, p.getMaValeur());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTab.getModel();
            model.setRowCount(0);
            Utliser();
            
            JOptionPane.showMessageDialog(null, "Suppression réussie");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de suppression\n" + e);
        }
    }//GEN-LAST:event_jButSupprimer1ActionPerformed

    private void jTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMouseClicked
        int i = jTab.getSelectedRow();
        byte[] img = (utilisateurs().get(i).getphoto());
             ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabPhoto1.getWidth(), jLabPhoto1.getHeight(), Image.SCALE_SMOOTH));
             jLabPhoto1.setIcon(imageIcon);    
        val();
        byte[] im = (UserUtilisateurses().get(i).getphoto());
             ImageIcon imageIcn = new ImageIcon(new ImageIcon(im).getImage().getScaledInstance(jLabPhoto.getWidth(), jLabPhoto.getHeight(), Image.SCALE_SMOOTH));
             jLabPhoto.setIcon(imageIcn);
    }//GEN-LAST:event_jTabMouseClicked

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
            java.util.logging.Logger.getLogger(VoirTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoirTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoirTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoirTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoirTables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboRecherche;
    private javax.swing.JTextField TextRecherche;
    private javax.swing.JTextField TextSearchInfraction;
    private javax.swing.JButton jBut;
    private javax.swing.JButton jButRechecrhe;
    private javax.swing.JButton jButRetour;
    private javax.swing.JButton jButSearch;
    private javax.swing.JButton jButSupprimer;
    private javax.swing.JButton jButSupprimer1;
    private javax.swing.JButton jButVu;
    private javax.swing.JLabel jLabPhoto;
    private javax.swing.JLabel jLabPhoto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTab;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
