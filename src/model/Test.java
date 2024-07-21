package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Etudiant x = new Etudiant();
		Etudiant y = new Etudiant("hamza","sousse",27,10.5);
		x.info();
		y.info();
		  Scanner scanner = new Scanner(System.in);
		  	
		  String nom;
		  do {
			  System.out.println("Entrez le nom: ");
		         nom = scanner.nextLine();			    	
		  }
		  while (nom.length() < 8 || nom.length() > 30);

	        System.out.println("Entrez l'adresse: ");
	        String adresse = scanner.nextLine();
	        

	        int age;
	        do {
	            System.out.print("Entrez l'âge de l'étudiant (entre 18 et 28) : ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Veuillez entrer un int.");
	                scanner.next(); 
	            }
	            age = scanner.nextInt();
	        } while (age < 18 || age > 28);  
	        
	        double moy;
	        do {
	        	 System.out.println("Entrez la moyenne ");
	 	       moy = scanner.nextDouble();
	            while (!scanner.hasNextDouble()) {
	                System.out.println("Veuillez entrer un double");
	                scanner.next(); 
	            }
	            moy = scanner.nextDouble();
		       }
	        while (moy < 0 || moy > 20);
	       
	        
	        scanner.close();
	        Etudiant z = new Etudiant(nom,adresse,age,moy);
	        z.info();
			
		
	}

}
