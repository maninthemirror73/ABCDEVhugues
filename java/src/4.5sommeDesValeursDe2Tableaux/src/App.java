
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] tableau1;
		int [] tableau2;
		int [] tableau3;
		int somme;
		
		tableau1 = new int [] {4, 6};
		tableau2 = new int [] {41, 16};
		
		somme = tableau1 [0] + tableau2 [0];
		
		System.out.println(somme);
		
		tableau3 = new int [] {(tableau1[0] + tableau2[0]),(tableau1[1] + tableau2[1])};
		System.out.println(tableau3);
		
		

	}

}
