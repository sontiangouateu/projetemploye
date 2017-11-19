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
        public abstract class Employe{
    

    
    
	//déclaration des attributs et constantes
	private String nom;
	private String prenom;
	private int age;
	private String matricule;
	private String date;
	public final static int SALAIRE_DE_BASE = 110000;
	
	
	//Constructeurs
	public Employe(String nom, String prenom, int age, String matricule, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.matricule = matricule;
		this.date = date;
		
	}

	
	//Acesseurs et modificateurs
	public String getNom() {
		return " L'employé " + nom + " " + prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	//Methode
	public abstract double calculerSalaire();
	

    /**
     * @param args the command line arguments
     */
   
      }

    
           
    
    
    
