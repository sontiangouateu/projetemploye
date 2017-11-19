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

   
public class Manutention extends Manutentionnaire implements Dangereux{

public Manutention(String nom, String prenom, int age, String matricule, String dateEntreeService,
		double nombreHeureDeTravaille) {
		super(nom, prenom, age, matricule, dateEntreeService, nombreHeureDeTravaille);
}

	
@Override
public double calculerSalaire() {
		
		return SALAIRE_DE_BASE + (getNombreHeureDeTravaille() * 65) + PRIME_DE_RISQUE_MENSUELLE;
		
		
}
}
