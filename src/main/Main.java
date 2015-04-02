package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import math.Calcul;

public class Main {

	public static void main(String[] args) {
	     
		int choice;
		Calcul calcul = new Calcul();
		boolean nextStep = true;
		
		do{
			choice = displayMenu();
			
			BufferedReader saisie = new BufferedReader
				      (new InputStreamReader(System.in));
		    
			switch (choice){
			case 1:
				long a1 = 0;
				long b1 = 0;
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre\n");
						a1 = readStrToLong(saisie);
						System.out.println("Veuillez saisir le deuxième nombre\n");
						b1 = readStrToLong(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;
					}
				}while(!nextStep);
				
				try {
					System.out.println("Le résultat de l'addition de " + Long.toString(a1) + " et " + Long.toString(b1) + " vaut " 
							+ Long.toString(calcul.addition(a1, b1)));					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 2:
				long a2 = 0;
				long b2 = 0;
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a2 = readStrToLong(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b2 = readStrToLong(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;					
					}
				}while(nextStep);
				
				try {
					System.out.println("Le résultat de la soustraction de " + Long.toString(a2) + " par " + Long.toString(b2) + " vaut " 
						+ Long.toString(calcul.soustraction(a2, b2)));					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 3:
				long a3 = 0;
				long b3 = 0;
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a3 = readStrToLong(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b3 = readStrToLong(saisie);
						
						nextStep = true;			
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;		
					}	
				}while(nextStep);
				
				try {
					System.out.println("Le résultat de la multiplication de " + Long.toString(a3) + " par " + Long.toString(b3) + " vaut " 
							+ Long.toString(calcul.multiplication(a3, b3)));						
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 4:
				float a4 = 0.F;
				float b4 = 0.F;
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a4 = readStrToLong(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b4 = readStrToLong(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;								
					}
				}while(nextStep);
				
				try {					
					System.out.println("Le résultat de la division entière de " + Float.toString(a4) + " par " + Float.toString(b4) + " vaut " 
							+ Float.toString(calcul.divisionRetourQuotient(a4, b4)));					
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
				break;
			case 5:
				float a5 = 0.F;
				float b5 = 0.F;
				nextStep = true;
				
				do{
					try {
						System.out.println("Veuillez saisir le premier nombre");
						a5 = readStrToLong(saisie);
						System.out.println("Veuillez saisir le deuxième nombre");
						b5 = readStrToLong(saisie);
						
						nextStep = true;
					} catch (Exception e) {
						System.out.println("Erreur de saisie, réessayez !");
						nextStep = false;	
					}			
				}while(nextStep);
				
				try {
					System.out.println("Le reste de la division entière de " + Float.toString(a5) + " par " + Float.toString(b5) + " vaut " 
						+ Float.toString(calcul.divisionRetourQuotient(a5, b5)));	
					
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
	 * @return long to convert
	 * @throws Exception
	 */
	public static long readStrToLong(BufferedReader input) throws Exception
	{
		try {
			return Long.parseLong(input.readLine());				
		} catch (NumberFormatException e) {
			throw new Exception();
		}catch (Exception ex){
			throw new Exception();
		}
	}
	
	/**
	 * Return the value of the input String
	 * 
	 * @param input BufferedReader
	 * @return float converted
	 * @throws Exception
	 */
	public static float readStrToFloat(BufferedReader input) throws Exception
	{
		try {
			return Float.parseFloat(input.readLine());				
		} catch (NumberFormatException e) {
			throw new Exception();
		}catch (Exception ex){
			throw new Exception();
		}
	}
}

