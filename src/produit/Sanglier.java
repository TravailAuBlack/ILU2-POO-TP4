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
	
	public String toString() {
		return nom;
	}
	
	public int getPoids() {
		return poids;
	}
	


	@Override
	public String decrireProduit() {
		System.out.println( nom + " de " + getPoids() +" "+  unite +" "+ "chasse par " + gaulois.getNom() + ".\n");   
		return nom;
	}
	


}
