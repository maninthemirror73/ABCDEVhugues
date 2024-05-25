import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES

		double R;
		double aire;
		double volume;
		Scanner sc = new Scanner (System.in);

		//TRAITEMENT

		System.out.println("Entrer le rayon :");
		R = sc.nextDouble();

		aire = 4 * Math.PI * (R * R);
		volume = 4 * Math.PI * (R * R * R)/3;

		System.out.println("Aire =  " + aire);
		System.out.println("Volume =  " + volume);

		sc.close();

	}

}
