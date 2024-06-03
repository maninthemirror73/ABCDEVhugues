package evaluation3;
import java.util.Iterator;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner (System.in);
		int []tableau;
		double moyenne;
		int i;
		tableau = new int [] {2,4,1,8,6,14,23,25,7,42};
		int somme = 0;
		int plusGrand = 0;
		
		for (i = 0; i < tableau.length; i++) {
			
			somme += tableau[i];
			
			if (plusGrand < tableau[i]) {
				
				plusGrand = tableau[i];
			}	
			
		}
		
		moyenne = somme/tableau.length;
		int carreDePlusGrand = plusGrand * plusGrand;
		
		System.out.println("La moyenne est : " + moyenne);
		System.out.println("Le carre de plusGrand est :" + carreDePlusGrand);

		sc.close();
	}

}
