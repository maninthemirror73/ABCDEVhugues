import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int A = 1;
		int B = 2;
		int CvaleurProvisoire;
		Scanner sc = new Scanner (System.in);
				
		// TRAITEMENT
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		CvaleurProvisoire = A;
		A = B;
		B = CvaleurProvisoire;
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		sc.close();
	}

}
