import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int nombreChoisi = 12;
		int nombreSaisi;
		Scanner sc = new Scanner (System.in);

		//TRAITEMENT

		System.out.println("Entrer un nombre entre 10 et 20");
		nombreSaisi = sc.nextInt();

		if (nombreSaisi != nombreChoisi) {
			System.out.println("Entrer un nombre entre 10 et 20");

			if (nombreSaisi < 10) {
				System.out.println("Plus grand");
			}
			else if (nombreSaisi > 20) {
				System.out.println("Plus petit");
			}
		}
		else{
			System.out.println(nombreSaisi + " Yes you did it !");
		}











		sc.close();

	}

}
