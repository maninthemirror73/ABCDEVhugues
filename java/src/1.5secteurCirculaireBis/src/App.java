import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		double R ;
		double A ;
		double aireDuSecteurCirculaire ;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer le rayon :");
		R = sc.nextDouble();
		
		System.out.println("Entrer l'angle :");
		A = sc.nextDouble();
		
		aireDuSecteurCirculaire = (Math.PI * (R * R) * A) / 360;
		
		System.out.println(aireDuSecteurCirculaire);

		sc.close();

	}

}
