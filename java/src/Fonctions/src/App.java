
public class App {

	public static void main(String[] args) {

		System.out.println("Démo sur les fonctions");
		
		App.afficherHelloWorld();
		App.hello("Mike");
		
		int somme = App.calculerSomme(7, 3);
		
		System.out.println(somme);
		
	}
	
	/**AFFICHE "HelloWorld !" dans la console
	 * Utilisation : App.helloworld();**/
	
	public static void afficherHelloWorld()
	{
		System.out.println("Hello World !");
	}
	public static void hello(String prenom)
	{
		
		System.out.println("Hello" + prenom);
	}
	
	public static int calculerSomme(int a, int b)
	{
		int resultat = a + b;
		return resultat;
	}

}
