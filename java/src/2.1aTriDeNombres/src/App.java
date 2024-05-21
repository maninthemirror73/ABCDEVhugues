import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES 
		int A = 15 ;
		int B = 45;
		Scanner sc = new Scanner (System.in);
		
		if (A > B) {
			System.out.println(B);
			System.out.println(A);
			
		}
		else {
			System.out.println(A);
			System.out.println(B);
		}

		sc.close();

	}

}
