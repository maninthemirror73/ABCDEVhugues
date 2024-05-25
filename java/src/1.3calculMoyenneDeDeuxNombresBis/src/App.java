import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		double nombre1;
		double nombre2;
		double moyenne;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer le nombre 1");
		nombre1 = sc.nextInt();
		
		System.out.println("Entrer le nombre 2");
		nombre2 = sc.nextInt();
		
		moyenne = (nombre1 + nombre2) / 2;
		
		System.out.println(moyenne);

		sc.close();

	}

}
