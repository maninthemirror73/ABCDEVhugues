import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int nombreSaisi;
		int nombreChoisi = 15;
		Scanner sc = new Scanner (System.in);
		
		
		//TRAITEMENT
		
		do {
			System.out.println("Entrer un nombre entre 10 et 20");
			nombreSaisi = sc.nextInt();
			
			if (nombreSaisi < 10) {
				
				System.out.println("Trop petit !");	
			}
			else if (nombreSaisi > 20) {
				System.out.println("Trop grand !");	
			}
			
		} while(nombreSaisi != nombreChoisi);
		
		System.out.println("Yes, you did it !");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
