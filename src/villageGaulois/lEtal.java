package villageGaulois;

import personnages.Gaulois;

public interface lEtal {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	String getProduit();

	void occuperEtal(Gaulois vendeur, String produit, int quantite);

	boolean contientProduit(String produit);

	int acheterProduit(int quantiteAcheter);

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	void libererEtal();

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	String[] etatEtal();

}