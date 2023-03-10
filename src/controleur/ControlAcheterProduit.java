package controleur;

import villagegaulois.Village;
import personnages.Gaulois;
import villagegaulois.Etal;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
		
	}

	public boolean verifierIdentite(String nomAcheteur) 
	{
		return controlVerifierIdentite.verifierIdentite(nomAcheteur);
	}
	
	public Gaulois[] rechercherVendeurProduit(String nomProduit) 
	{
		return village.rechercherVendeursProduit(nomProduit);
	}
	
	
	 public int acheterProduit(String nomVendeur,int quantiteAcheter) 
	 {
		 Etal etalVendeur= controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		 return etalVendeur.acheterProduit(quantiteAcheter);
		
				 
	 }
}
