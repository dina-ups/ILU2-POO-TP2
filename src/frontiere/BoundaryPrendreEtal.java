package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		
		if (!(controlPrendreEtal.verifierIdentite(nomVendeur))){
			System.out.println("je suis désolée"+nomVendeur+"je suis désoler mais vous ne pouvez pas commercialisez ici.");
		}
		else {
			System.out.println("bonjour"+nomVendeur+"je vais regarder si je peux vous trouver un étal");
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("Désolée"+nomVendeur+"je n'ai plus d'étal disponible");				
			}
			else {
				
				installerVendeur(nomVendeur);
			}
				
		}
	}

	private void installerVendeur(String nomVendeur) {
		
	
		System.out.println("c'est pardfait il me reste un étal pour vous!\n il me faudra quelques renseignements.\n quel produit souhaitez-vous vendre?");
		String produit=scan.next();
		System.out.println("combien souhaitez vous en prendre?");
		int nbProduit=Clavier.entrerEntier(produit);
		int numeroEtal;
		numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal!=-1) {
			System.out.println("le vendeur"+nomVendeur+"s'est installé à l'étal n°"+numeroEtal);
		}
	}
}
