package controleur;

import villagegaulois.Etal;
import personnages.Gaulois;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		Gaulois g =village.trouverHabitant(nomVendeur);
		Etal etal = null;
		if (g!=null) {
			etal=village.rechercherEtal(g);
		}
		return etal;
	}
}
