package soccer;
import java.util.Scanner;
public class Soccer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //Variables
				int a;
				Scanner sc;
				
				sc = new Scanner(System.in);
				
				System.out.println("Veuillez entrer l'age du joueur:");
				a = sc.nextInt();
				
			if(a <5 ) {
				System.out.println("trop jeune");
			}
			else if (a==5 || a==6 ) {
				System.out.println("débutant");
			}
			else if (a==7 || a==8 ) {
				System.out.println("poussin");
			}	
			else if (a==9 || a==10 ) {
				System.out.println("benjamin");
			}	
			else if (a==11 || a==12 ) {
				System.out.println("pupille");
			}
			else if (a==13 || a==14 ) {
				System.out.println("minime");
			}	
			else if (a==15 || a==16 ) {
				System.out.println("cadet");
			}
			else if (a==17 || a==18 ) {
				System.out.println("junior");
			}
			else if (a > 18 && a < 35 ) {
				System.out.println("sénior");
			}
			else {
				System.out.println("vétéran");
			}
				
			
				sc.close();
			}
		}

	


