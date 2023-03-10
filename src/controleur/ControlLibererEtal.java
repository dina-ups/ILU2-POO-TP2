package controleur;
import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		String[] donneesEtal = null;
		Etal etalVendeur= controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		if (etalVendeur!=null) {
			donneesEtal=etalVendeur.etatEtal();
			etalVendeur.libererEtal();
			
		}
		return donneesEtal;
	}
	public boolean isVendeur(String nom) 
	{
		boolean vendeurReconnu=false;
		Etal etal= controlTrouverEtalVendeur.trouverEtalVendeur(nom);
		if (etal!=null) 
		{
			vendeurReconnu=true;
		}
		return vendeurReconnu;
	}

}
