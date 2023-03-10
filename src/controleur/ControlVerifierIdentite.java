package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		// a completer, attention le retour ne dit pas etre false :-)
		
		Gaulois g=village.trouverHabitant(nomVendeur);
		boolean response=false;
		if (g!=null) 
		{
			
			response=true;
		}
		return response;

	}
}
