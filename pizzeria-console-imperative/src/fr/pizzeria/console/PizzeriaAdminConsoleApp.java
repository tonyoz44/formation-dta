package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Object[][] pizzas = new Object[100][3];
		pizzas[0] = new Object[] { "PEP", "Pépéroni", 12.50 };
		pizzas[1] = new Object[] { "MAR", "Margherita", 14.00 };
		pizzas[2] = new Object[] { "REI", "La Reine", 11.50 };
		pizzas[3] = new Object[] { "FRO", "La 4 fromages", 12.00 };
		pizzas[4] = new Object[] { "CAN", "La cannibale", 12.50 };
		pizzas[5] = new Object[] { "SAV", "La savoyarde", 13.00 };
		pizzas[6] = new Object[] { "ORI", "L'orientale", 13.50 };
		pizzas[7] = new Object[] { "IND", "L'indienne", 14.00 };

		int saisie = 0;
		do {
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas ");
			System.out.println("2. Ajouter une nouvelle pizza ");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			saisie = sc.nextInt();

			switch (saisie) {
			case 1:
				System.out.println("Liste des pizzas");
				listerPizzas(pizzas);
				break;
			case 2:
				System.out.println("Ajout d’une nouvelle pizza");
				ajouterNouvellePizza(pizzas);
				break;
			case 3:
				System.out.println("Mise à jour d’une pizza");
				break;
			case 4:
				System.out.println("Suppression d’une pizza");
				break;
			case 99:
				System.out.println("Aurevoir :-(");
				break;
			}
		} while (saisie != 99);

		sc.close();
	}

	public static void listerPizzas(Object[][] pizzas) {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i][0] != null) {
				System.out.println(pizzas[i][0] + " -> " + pizzas[i][1] + " ("
						+ pizzas[i][2] + ")");
			}

		}
	}

	public static void ajouterNouvellePizza(Object[][] pizzas) {
		boolean placeTrouve = false;
		int index = 0;
		while(!placeTrouve && index < pizzas.length) {
			placeTrouve = pizzas[index][0] == null;
			index++;
		}
		
		if(placeTrouve) {
			pizzas[index] =  new Object[] { "NEW", "PIZZA NEW", 14.00 };
		}
	}
}
