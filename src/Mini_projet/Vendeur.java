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

    
    
public class Vendeur extends Commerciaux{



	//Constructeur
	public Vendeur(String nom, String prenom, int age, String matricule, String date, double chiffre_Affaire) {
		super(nom, prenom, age, matricule, date,chiffre_Affaire);
		this.chiffre_Affaire=chiffre_Affaire;
	}
	

	
	//Redéfinition de la méthode
	@Override
	public double calculerSalaire() {
		return SALAIRE_DE_BASE + (getchiffre_Affaire() * 20)/100 + 100;
	}
	
	
	
	

}


