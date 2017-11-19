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

    
public abstract class Commerciaux extends Employe {
	
	

	//Attributs
 double chiffre_Affaire;

	
	//Constructeurs 
public Commerciaux(String nom, String prenom, int age, String matricule, String date, double chiffre_Affaire) {
		super(nom, prenom, age, matricule, date);
		this.chiffre_Affaire = chiffre_Affaire;
}


	
	//Accesseurs et Modificateurs
public double getchiffre_Affaire() {
		return chiffre_Affaire;
}


public void setchiffre_Affaire(double chiffre_Affaire) {
		this.chiffre_Affaire = chiffre_Affaire;
}

	
}


