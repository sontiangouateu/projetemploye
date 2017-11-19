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
public class Technicien extends Employe{
   
	//Attribut
private double nombreUnitesProduites;

	
	
	//Constructeur
public Technicien(String nom, String prenom, int age, String matricule, String date, double nombreUnitesProduites) {
    
	super(nom, prenom, age, matricule, date);
                
	this.nombreUnitesProduites = nombreUnitesProduites;
}
		
	
	
	//Accesseurs et Modificateurs
public double getNombreUnitesProduites() {
    
	return nombreUnitesProduites;
}


public void setNombreUnitesProduites(double nombreUnitesProduites) {
    
	this.nombreUnitesProduites = nombreUnitesProduites;
}

	
	
	
	//Methode
	@Override
public double calculerSalaire() {
	
	return SALAIRE_DE_BASE + (nombreUnitesProduites *  5);
}

		
}
 
    

