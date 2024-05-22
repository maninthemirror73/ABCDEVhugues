import java.util.Scanner;
public class App {

	public static void main(String[] args) {
<<<<<<< HEAD
		// VARIABLES
		
		int nombreDeDepart;
		int sommeDesEntiers = 0;
		int i = 0;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer un nombre entier :");
		nombreDeDepart = sc.nextInt();
		
		for (i = 0; i <= nombreDeDepart; i++) {
			sommeDesEntiers = sommeDesEntiers + i;
			/* sommeDesEntiers += i; */
	
		}
		System.out.println(sommeDesEntiers);
		
		
		
		sc.close();

=======
		//VARIABLES
		
		int nombre;
		int i = 1;
		int additionDesNombres;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT 
		System.out.println("Entrer un nombre :");
		nombre = sc.nextInt();
		
		
		/*
		 * for(i = 1; i <= nombre; i++) { System.out.println(i); additionDesNombres = i
		 * + i; System.out.println("Addition des nombres = " + additionDesNombres);
		 * 
		 * }
		 */
		do {
		i++;
		additionDesNombres = i + i;
			
		} while (i<= nombre);
		System.out.println("Addition des nombres = " + additionDesNombres);
		
		
		

		sc.close();
>>>>>>> dc7b39211c4bac8b6b0a978f3756b36876a7f8c3
	}

}
