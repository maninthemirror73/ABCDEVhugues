//package 3.3nombresSuivants;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//Variables
		int nombreDeDepart;
		int i = 1;
		Scanner sc = new Scanner (System.in);

		System.out.println("Entrez un nombre entier");
		nombreDeDepart = sc.nextInt();


		while (i <= 10) { 
			System.out.println(nombreDeDepart + i); i++; 
		}


		/*
		 * for (i = 1; i <= 10; i++) { System.out.println(nombreDeDepart + i); }
		 */


		sc.close();
	}
}
