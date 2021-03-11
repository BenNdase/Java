/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeinfraction;

/**
 *
 * @author Lenovo
 */
public class Utilisateurs {
    private String PlaqueNum,PermisNum,Nom,PostnomTxt,PrenomTxt,Commune,Quartier,Avenue,LieuNaissance,DateNaissance,
            ProvinceTxt,Territoire,Secteur,NomPere,NomMere,Sexe,MaValeur;
    private byte[] Image;
    private int Maligne;
    public Utilisateurs (String PlaqueNum, String PermisNum, String Nom, String PostnomTxt, String PrenomTxt, String Commune, 
            String Quartier, String Avenue, String LieuNaissance, String DateNaissance, String ProvinceTxt, 
            String Territoire, String Secteur, String NomPere, String NomMere, String Sexe, byte[] photo){
        
        this.PlaqueNum=PlaqueNum;
        this.PermisNum=PermisNum;
        this.Nom=Nom;
        this.PostnomTxt=PostnomTxt;
        this.PrenomTxt=PrenomTxt;
        this.Commune=Commune;
        this.Quartier=Quartier;
        this.Avenue=Avenue;
        this.LieuNaissance=LieuNaissance;
        this.DateNaissance=DateNaissance;
        this.ProvinceTxt=ProvinceTxt;
        this.Territoire=Territoire;
        this.Secteur=Secteur;
        this.NomPere=NomPere;
        this.NomMere=NomMere;
        this.Sexe=Sexe;
        this.Image=photo;        
    }
    public Utilisateurs(int Maligne,String MaValeur){
        this.Maligne=Maligne;
        this.MaValeur=MaValeur;
    }
    public int getMaligne(){
        return Maligne;       
    }
    public String getMaValeur(){
        return MaValeur;       
    }
    public String getPlaqueNum (){
        return PlaqueNum;
    }
    public String getPermisNum (){
        return PermisNum;
    }
    public String getNom (){
        return Nom;
    }
    public String getPostnomTxt (){
        return PostnomTxt;
    }
    public String getPrenomTxt (){
        return PrenomTxt;
    }
    public String getCommune (){
        return Commune;
    }
    public String getQuartier (){
        return Quartier;
    }
    public String getAvenue (){
        return Avenue;
    }
    public String getLieuNaissance (){
        return LieuNaissance;
    }
    public String getDateNaissance (){
        return DateNaissance;
    }
    public String getProvinceTxt (){
        return ProvinceTxt;
    }
    public String getTerritoire (){
        return Territoire;
    }
    public String getSecteur (){
        return Secteur;
    }
    public String getNomPere (){
        return NomPere;
    }
    public String getNomMere (){
        return NomMere;
    }
    public String getSexe (){
        return Sexe;
    }
    public byte[] getphoto (){
        return Image;
    }
}
