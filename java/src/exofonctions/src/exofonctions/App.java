package exofonctions;

public class App {

	public static void main(String[] args) {
		
	
		 	
		// Ecrire une procédure qui calcule la MOYENNE des valeurs d'un tableau.
		

		
		int [] valeurs = new int [] {1, 3, 5, 7, 3, 4, 2, 4, 22};
		
		App.calculerMoyenne(valeurs);

	}

	
	public static void calculerMoyenne (int[] tableau)
	{
		
		int somme = 0 ;
		float moyenne;
		
		for (int i = 0; i <tableau.length; i++) 
		{
			somme = somme + tableau [i];
			
			
		}
			moyenne = ((float)somme/(float)tableau.length);
			
			System.out.println(moyenne);
	}
		

}
