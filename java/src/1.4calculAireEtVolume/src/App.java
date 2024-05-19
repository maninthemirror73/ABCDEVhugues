import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		double R;
		double aire;
		double volume;
		Scanner sc = new Scanner (System.in);

		//TRAITEMENT
		
		System.out.println("Entrer le rayon entier R de la sphère :");
		R = sc.nextDouble();
		
		aire = 4* 3.1456 * (R*R);
		volume = (4* 3.1456* (R*R*R))/3;
		
		System.out.println("aire = " + aire);
		System.out.println("volume = " + volume);
		
		sc.close();

	}

}
