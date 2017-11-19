/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mini_projet;

/**
 *
 * @author HP
 */
public class Salary{
    
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
   
  Personnel n=new Personnel();
  
  n.ajouteremploye   (new Vendeur("Sona ","paul",39,"07C097EM","13nov2007",69.000));
  
  n.ajouteremploye   (new Manutentionnaire("Sylvester ","baron",42,"08C237EM","18sep2008",12));
  
  n.ajouteremploye   (new Representant("Mason ","guy",37,"08C157EM","13nov2008",78.000));
  
  n.ajouteremploye   (new Technicien("Fiona ","jonas",45,"10B097EM","13nov2010",50));
  
  n.ajouteremploye   (new Manutention("Massa","Elva",26,"09B213EM","12jan2009",10));
  
  n.ajouteremploye   (new Production("Fason","Ben",30,"11B013EM","22jan2011",46));
  
    //cette instruction nous permettra d'afficher les noms des personnes et leurs salaires
  
  n.affichersalaire();
  
    //nous permet d'afficher le salaire moyen
  
  System.out.println("le salaire moyen est "+ n.salairemoyen()+ "francs");
}
   
}

    
           
    
    

