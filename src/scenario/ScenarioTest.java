package scenario;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import produit.Unites;
import villageGaulois.Etal;
import villageGaulois.lEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		
		Gaulois obelix = new Gaulois("Obelix", 6);
		Produit poisson = new Poisson("Poisson",Unites.LAPIECE, "mardi");
		Produit sanglier = new Sanglier("Sanglier", Unites.KILOGRAMMES, 15, obelix );
		
		Produit[] produit = {poisson, sanglier};
		for(int i=0; i< produit.length ; i++) {
			produit[i].decrireProduit();
		}
		lEtal[] etals = new lEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>;
		etals[0] = etalSanglier;
	}
}
