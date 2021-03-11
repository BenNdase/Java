/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeinfraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Connecter {
    Connection connect=null;
    ResultSet result= null;
    PreparedStatement ps= null;
    public static Connection Connexion()      
    {
           try {
       Connection connect= DriverManager.getConnection("jdbc:derby://localhost:1527/Routiere","rout","ri");
            return connect;          
        } catch (Exception e){
               JOptionPane.showMessageDialog(null,"Erreur de Connection\n"+ e);
        }
        return null;  
    } 
}
