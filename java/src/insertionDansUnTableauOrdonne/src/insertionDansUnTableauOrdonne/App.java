package insertionDansUnTableauOrdonne;
import java.util.Scanner;
import java.util.Arrays;
public class App {

	public static void main(String[] args) {

		//VARIABLES
		int i;
		int [] tableauInitial;
		int [] tableauFinal; 
		int nombreAInserer;
		Scanner sc = new Scanner (System.in);
		
		tableauInitial = new int [] {1, 4, 5};
		
		System.out.println("Entrer la valeur à ajouter :");
		nombreAInserer = sc.nextInt();
				
		tableauFinal = new int[4];
		
		
		  tableauFinal [0] = tableauInitial [0];
		  tableauFinal [1] = tableauInitial [1];
		  tableauFinal [2] = tableauInitial [2];
		  tableauFinal [3] = nombreAInserer;
		 
		
		/*
		 * for (i = 0; i < tableauFinal.length; i++) {
		 * System.out.println(tableauFinal[i]); }
		 */

        Arrays.sort(tableauFinal);

		for (i = 0; i < tableauFinal.length; i++) {
			System.out.println(tableauFinal[i]);
		}


	sc.close();	
	}

}
