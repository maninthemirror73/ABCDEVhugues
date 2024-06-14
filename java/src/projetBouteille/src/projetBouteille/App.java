package projetBouteille;
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bouteille bouteille1 = new Bouteille();

		Bouteille bouteille2 = new Bouteille(1.2f,0.8f,true,"h2o");

		Bouteille bouteille3 = new Bouteille();


		boolean reussirAFermerLaBouteille = bouteille2.fermer();
		
		boolean bouteilleAReussiAOuvrir = bouteille2.ouvrir();
		
		boolean possibleDeVider = bouteille2.vider();
		
		boolean bouteilleRemplie = bouteille2.remplir();
		
		boolean bouteillePleine = bouteille2.estPleine();
	
	}
}

