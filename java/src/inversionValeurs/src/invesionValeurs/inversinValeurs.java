package invesionValeurs;
	import java.util.Scanner;
public class inversinValeurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A;
		
		int B;
		
		int C;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre");
		A = sc.nextInt();
		
		System.out.println("Saisir le second nombre");
		B = sc.nextInt();
		
		System.out.println("Les valeurs sont " + A + "et" + B);
		
		C = B;
		B = A;
		A = C;
		
			
		System.out.println("Les valeurs sont " + A + "et" + B);

	}

}
