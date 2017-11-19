/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mini_projet;


public class Manutentionnaire extends Employe{
//Attribut
private double nombreHeureDeTravaille;
		
	
	//Constructeurs
public Manutentionnaire(String nom, String prenom, int age, String matricule, String dateEntreeService, double nombreHeureDeTravaille) {
		super(nom, prenom, age, matricule, dateEntreeService);
                
		this.nombreHeureDeTravaille = nombreHeureDeTravaille;
		
}


	
	
	//Accesseurs et Modificateurs
public double getNombreHeureDeTravaille() {
    
		return nombreHeureDeTravaille;
}

public void setNombreHeureDeTravaille(double nombreHeureDeTravaille) {
    
		this.nombreHeureDeTravaille = nombreHeureDeTravaille;
}
	
	
	
       //Méthode

	@Override
public double calculerSalaire() {
    

		return SALAIRE_DE_BASE + (nombreHeureDeTravaille * 65);
}


}

    
    

