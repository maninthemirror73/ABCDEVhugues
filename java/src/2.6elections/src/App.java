import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		double scoreCandidat1;
		double scoreCandidat2;
		double scoreCandidat3;
		double scoreCandidat4;
		int nombreDeVoix = 100;
		Scanner sc = new Scanner (System.in);
		
		// Traitement
		
		System.out.println("1er tour !");
		
		System.out.println("Entrer le score du candidat 1 :");
		scoreCandidat1 = sc.nextDouble();
		
		System.out.println("Entrer le score du candidat 2 :");
		scoreCandidat2 = sc.nextDouble();
		
		System.out.println("Entrer le score du candidat 3 :");
		scoreCandidat3 = sc.nextDouble();
		
		System.out.println("Entrer le score du candidat 4 :");
		scoreCandidat4 = sc.nextDouble();
		
		if (scoreCandidat1 > (50 * nombreDeVoix /100)){
			System.out.println("Candidat 1 élu au premier tour !");
		}
		else if (scoreCandidat1 > (12.5 * nombreDeVoix /100)) {
			System.out.println("2e tour !");
			if(scoreCandidat1 > scoreCandidat2 && scoreCandidat1 > scoreCandidat3 && scoreCandidat1 > scoreCandidat4) {
				System.out.println("Balottage favorable !");
			}
			else {
				System.out.println("Balottage défavorable !");
			}
		}
		else {
			System.out.println("Candidat 1 battu !");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
