import java.util.Scanner;
public class App {

	public static void main(String[] args) {
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
	}

}
