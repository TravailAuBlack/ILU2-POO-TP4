package produit;

public enum Unites {
	GRAMME("g"), KILOGRAMMES("kg"), LITRE("l"), CENTILITRE("cl"),
	MILLILITRE("ml"), LAPIECE("piece");
	
	private String nom;
	
	
	
	private Unites(String nom) {
		this.nom = nom;
	}
	
	public String getNom(String nom ) {
		return nom;
	}
	
	
	public String toString() {
		return nom;
	}
	
	
	

}
