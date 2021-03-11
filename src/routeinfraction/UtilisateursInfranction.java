 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeinfraction;


public class UtilisateursInfranction {
    private String Infraction,penalite,sanction,permis;
    private int Id;
    
    public UtilisateursInfranction(int Id,String permis ,String Infraction,String penalite,String sanction){
        this.Id=Id;
        this.permis=permis;
        this.Infraction=Infraction;
        this.penalite=penalite;
        this.sanction=sanction;
    }
    public int getId(){
        return Id;
    }
    public String getpermis(){
        return permis;
    }
    public String getInfraction(){
        return Infraction;
    }
    public String getpenalite(){
        return penalite;
    } 
    public String getsanction(){
        return sanction;
    }
}
