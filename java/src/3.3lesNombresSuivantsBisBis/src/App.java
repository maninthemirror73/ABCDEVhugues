import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		
		int nombreDeDepart;
		int i = 1;
		Scanner sc = new Scanner (System .in);
		
		System.out.println("Entrer un nombre entier");
		nombreDeDepart = sc.nextInt();
		
		while (i <= 10) {
			System.out.println(nombreDeDepart + i);
			i++;
		}
		sc.close();
		

	}

}
