package produit;

public class Poisson extends Produit{
	private String datePeche;
	
	
	public Poisson(String nom, Unites unites , String datePeche) {
		super(nom,unites);
		this.datePeche = datePeche;
		
	}
	
	public String getDate() {
		return datePeche;
	}
	
	@Override
	public String decrireProduit() {
		return nom + "p�ches " + getDate() + " .\n"; 
	}
	
}
