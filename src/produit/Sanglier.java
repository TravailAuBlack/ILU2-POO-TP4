package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois gaulois;
	
	
	
	public Sanglier(String nom, Unites unite, int poids, Gaulois gaulois) {
		super(nom,unite);
		this.poids = poids;
		this.gaulois = gaulois;
		
	}
	
	public String getNom() {
		return "sanglier";
	}
	
	public int getPoids() {
		return poids;
	}
	
	public Gaulois getGaulois() {
		return gaulois;
	}

	@Override
	public String decrireProduit() {
		return nom + "de " + getPoids() +  unite + "chasse par " + getGaulois() + ".\n";                                         
	}
	


}
