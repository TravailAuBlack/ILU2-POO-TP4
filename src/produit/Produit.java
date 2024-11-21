package produit;



public abstract class Produit {
	
	protected String nom;
	protected Unites unite;
	
	
	protected Produit(String nom , Unites unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit();

}
