package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import math.Calcul;

public class Main {

	public static void main(String[] args) {
	     
		int choice;
		Calcul calcul = new Calcul();
		boolean nextStep = true;
		double a = 0.0D;
		double b = 0.0D;
		
		do{
			choice = displayMenu();
			
			BufferedReader saisie = new BufferedReader
				      (new InputStreamReader(System.in));
		    
			switch (choice){
			case 1:
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre\n");
						a = readStrToDouble(saisie);
						System.out.println("Veuillez saisir le deuxième nombre\n");
						b = readStrToDouble(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;
					}
				}while(!nextStep);
				
				try {
					System.out.println("Le résultat de l'addition de " + Double.toString(a) + " et " + Double.toString(b) + " vaut " 
							+ Double.toString(calcul.addition(a, b)));					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 2:
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a = readStrToDouble(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b = readStrToDouble(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;					
					}
				}while(!nextStep);
				
				try {
					System.out.println("Le résultat de la soustraction de " + Double.toString(a) + " par " + Double.toString(b) + " vaut " 
						+ Double.toString(calcul.soustraction(a, b)));					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 3:
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a = readStrToDouble(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b = readStrToDouble(saisie);
						
						nextStep = true;			
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;		
					}	
				}while(!nextStep);
				
				try {
					System.out.println("Le résultat de la multiplication de " + Double.toString(a) + " par " + Double.toString(b) + " vaut " 
							+ Double.toString(calcul.multiplication(a, b)));						
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 4:
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a = readStrToDouble(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b = readStrToDouble(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;								
					}
				}while(!nextStep);
				
				try {					
					System.out.println("Le résultat de la division entière de " + Double.toString(a) + " par " + Double.toString(b) + " vaut " 
							+ Double.toString(calcul.divisionRetourQuotient(a, b)));					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 5:
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a = readStrToDouble(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b = readStrToDouble(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;	
					}			
				}while(!nextStep);
				
				try {
					System.out.println("Le reste de la division entière de " + Double.toString(a) + " par " + Double.toString(b) + " vaut " 
						+ Double.toString(calcul.divisionRetourQuotient(a, b)));	
					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 6:
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le nombre");
						a = readStrToDouble(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;	
					}			
				}while(!nextStep);
				
				try {
					System.out.println("La racine carrée de " + Double.toString(a) + " vaut " 
						+ String.format("%.1f", calcul.racineCarree(a)));	
					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}			
				break;
			case 0:
				System.out.println("Au revoir.");
				break;
			default:
				System.out.println("Saisie non reconnu, le programme va se fermer.");	
				break;
			}
		}while(choice != 0);

		System.exit(0);		
	}
		
	public static int displayMenu()
	{
		int choice = -1;	
		
		BufferedReader saisie = new BufferedReader
	      (new InputStreamReader(System.in));
		
		do{
			try {
				System.out.println("Veuillez saisir une opération :");
				System.out.println("Tapez 1 pour l'addition");
				System.out.println("Tapez 2 pour la soustraction");
				System.out.println("Tapez 3 pour la multiplication");
				System.out.println("Tapez 4 pour la division entière");
				System.out.println("Tapez 5 pour le reste de la division entière");
				System.out.println("Tapez 0 pour quitter");					
				
				choice = Integer.parseInt(saisie.readLine());
			}catch (Exception e){
				System.out.println("Veuilez saisir un des chiffres proposées.");
			}
		}while(choice == -1);
		
		return choice;
	}
		
	/**
	 * Return the value of the input String
	 * 
	 * @param input BufferedReader
	 * @return double converted
	 * @throws Exception
	 */
	public static double readStrToDouble(BufferedReader input) throws Exception
	{
		try {
			return Double.parseDouble(input.readLine());				
		} catch (NumberFormatException e) {
			throw new Exception();
		}catch (Exception ex){
			throw new Exception();
		}
	}
}

