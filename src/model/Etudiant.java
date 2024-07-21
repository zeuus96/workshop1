package model;

public class Etudiant {
	
		private String nom;
		private String adresse;
		private int age;
		private double moyenne;
		
		 public void info() {
		        System.out.println("Etudiant{" +
		                "nom='" + nom + '\'' +
		                ", adresse='" + adresse + '\'' +
		                ", age=" + age +
		                ", moyenne=" + moyenne +
		                '}'); 
		    }
		 
		    public Etudiant() {}
		    
		    public Etudiant(String nom, String adresse, int age, double moyenne) {
		        this.nom = nom;
		        this.adresse = adresse;
		        this.age = age;
		        this.moyenne = moyenne;
		    }
		    
		    public String getNom() {
		        return nom;
		    }

		    public void setNom(String nom) {
		    	var l = nom.length();
		    	if (l>=8 && l<31)
		    		this.nom = nom;
		    	else 
		    		System.out.println("le nom est un String de 8 à 30 caractères");
		    }

		    public String getAdresse() {
		        return adresse;
		    }

		    public void setAdresse(String adresse) {
		        this.adresse = adresse;
		    }

		    public int getAge() {
		        return age;
		    }

		    public void setAge(int age) {
		    	if (age >=18 && age < 29)
		    		this.age = age;
		    	else
		    		System.out.println("l’âge entre 18 et 28");

		    }

		    public double getMoyenne() {
		        return moyenne;
		    }

		    public void setMoyenne(double moyenne) {
		    	if (moyenne >=0 && moyenne <= 20)
		    		this.moyenne = moyenne;
		    	else
		    		System.out.println("la moyenne entre 0 et 20");

		        
		    }

}
