package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if (!(controlLibererEtal.isVendeur(nomVendeur)))
				{
				System.out.println("Mais vous n'etes pas inscrit sur notre marché aujourd'hui!");
				}
		else 
		{
			String[] donneeEtal=controlLibererEtal.libererEtal(nomVendeur);
			boolean etalOccupe= Boolean.parseBoolean(donneeEtal[0]);
			if (etalOccupe) {
			System.out.println("vous avez vendu"+donneeEtal[4]+"sur "+donneeEtal[3]+""+donneeEtal[2]+".");
			System.out.println("Au revoir"+nomVendeur+", passez une bonne journée");
			}
		}
	}

}
