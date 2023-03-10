package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if (!(controlLibererEtal.isVendeur(nomVendeur))
				{
				System.out.println("Mais vous n'etes pas inscrit sur notre marché aujourd'hui!")
				}
		else 
		{
			String[]] donneeEtal=controlLibererEtal.libererEtal(nomVendeur);
		}
	}

}
