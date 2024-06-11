package projetBouteille;

public class Bouteille {

	//attributes

	public float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDeContenu;

	// access/ modifiers

	// constructor

	//default constructor where values are forced
	public Bouteille(){
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvert = false;
		typeDeContenu = "H2O";
	}

	//constructeur classique
	public Bouteille(float _contenanceEnL,float _contenuEnL,boolean _ouvert,String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu  = _typeDeContenu;
	}

	//constructeur de clonage

	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu  = _bouteilleARecopier.typeDeContenu = "Champagne";

	}
	

	
	public boolean ouvrir() {
		boolean bouteilleAReussiAOuvrir = false;
		if (ouvert == true) {
			bouteilleAReussiAOuvrir = false;
		}
		else {
			ouvert = true;
		}
		return 	bouteilleAReussiAOuvrir;
	}
	
	public boolean fermer() {
		boolean bouteilleAReussiAFermer;
		if (ouvert == true) {
			bouteilleAReussiAFermer = true;
		}
		else {
			bouteilleAReussiAFermer = false;
		}
		return bouteilleAReussiAFermer;
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean remplir() {
		boolean possibleDeRemplir;
		if (ouvert == true && contenuEnL < contenanceEnL){
			possibleDeRemplir = true;
			contenuEnL = contenanceEnL;
		}
		else {
			possibleDeRemplir = false;
		}
		return possibleDeRemplir;
	}
}





