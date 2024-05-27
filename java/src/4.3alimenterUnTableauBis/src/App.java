import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		int i ;
		int tailleDuTableau;
		int positif = 0;
		int negatif = 0;
		int []tableau;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrez le nombre de valeurs que vous souhaitez saisir :");
		tailleDuTableau = sc.nextInt();
		
		tableau = new int [tailleDuTableau];
		
		for (i = 0; i < tailleDuTableau; i++) {
			System.out.println("Saisissez la valeur n°" + (i+1));
			tableau [i] = sc.nextInt();
			
			if (tableau [i] >= 0){
				positif++;
			}
			else {
				negatif++;
			}
		}//FIN FOR
		
		System.out.println("Vous avez  saisi" + positif + "nombres positifs");
		System.out.println("Vous avez  saisi" + negatif + "nombres negatifs");

		sc.close();

	}

}
