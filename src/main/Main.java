package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) {
	     
		int choix = 0;
		
		System.out.println("Veuillez saisir une opération :");
		System.out.println("Tapez 1 pour l'addition");
		System.out.println("Tapez 2 pour la soustraction");
		System.out.println("Tapez 3 pour la multiplication");
		System.out.println("Tapez 4 pour la division entière");
		System.out.println("Tapez 5 pour le reste de la division entière");
		System.out.println("Tapez 6 pour la racine carrée");
		System.out.println("Tapez 0 pour quitter");
		
		BufferedReader saisie = new BufferedReader
	      (new InputStreamReader(System.in));
		
		try {
			choix = Integer.parseInt(saisie.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		}catch (Exception ex){
			ex.printStackTrace();
			System.exit(0);
		}
	    
		switch (choix){
		case 1:
			
			System.exit(0);
		case 2:
			System.exit(0);
		case 3:
			System.exit(0);
		case 4:
			System.exit(0);
		case 5:
			System.exit(0);
		case 6:
			System.exit(0);
		case 0:
			System.out.println("Au revoir.");
			System.exit(0);
		default:
			System.out.println("Saisie non reconnu, le programme va se fermer.");
			System.exit(0);		
		}
		
		
		
		
	    
	 
	}

}
