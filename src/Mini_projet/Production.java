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

 

public class Production extends Technicien implements Dangereux{
    
public Production(String nom, String prenom, int age, String matricule, String date,
        
		double nombreunitesproduites) {
    
		super(nom,prenom,age,matricule,date, nombreunitesproduites);
                
}
@Override
public double calculerSalaire() {
    
	       return SALAIRE_DE_BASE + (getNombreUnitesProduites() *  5) + PRIME_DE_RISQUE_MENSUELLE;}


}
   

