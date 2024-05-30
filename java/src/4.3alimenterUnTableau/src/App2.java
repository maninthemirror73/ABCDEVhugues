import java.util.Scanner;
public class App2 {

	public static void main(String[] args) {
		//VARIABLES
		Scanner sc = new Scanner (System.in);
		int i;
		int tailleDuTableau;
		int [] tableau;
		int positif = 0;
		int negatif = 0;
		
		System.out.println ("Entrez le nombre de valeurs que vous souhaitez saisir :");
		tailleDuTableau = sc.nextInt();
		
		tableau = new int [tailleDuTableau];
		
		for (i = 0; i < tailleDuTableau; i++) {
			
			System.out.println("Saisissez la valeur N° " + (i + 1));
			tableau [i] = sc.nextInt();
			
			if (tableau [i] >= 0) {
				positif++;
			}
			else {
				negatif++;
			}
		}//FIN DU FOR
		
		System.out.println("Vous avez saisi " + positif + " nombres positifs");
		System.out.println("Vous avez saisi " + negatif + " nombresnegatifs");
		sc.close();	
		

	}

}


