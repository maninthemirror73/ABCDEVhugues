import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		double rayonR = 78;
		double angleA = 12.3;
		double aireDuSecteur;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		aireDuSecteur = ( 3.1456 * (rayonR * rayonR) * angleA ) /360;
		
		System.out.println("L’ aire du secteur circulaire = " + aireDuSecteur);

		sc.close();

	}

}
