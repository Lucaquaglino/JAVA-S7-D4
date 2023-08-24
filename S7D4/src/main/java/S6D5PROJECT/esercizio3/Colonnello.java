package S6D5PROJECT.esercizio3;

public class Colonnello implements Ufficiale {
	private Ufficiale prossimoUfficiale;

	@Override
	public void setProssimoUfficiale(Ufficiale prossimoUfficiale) {
		this.prossimoUfficiale = prossimoUfficiale;
	}

	@Override
	public void gestisciRichiesta(int importo) {
		if (importo <= 4000) {
			System.out.println("Colonnello gestisce la richiesta di stipendio.");
		} else if (prossimoUfficiale != null) {
			prossimoUfficiale.gestisciRichiesta(importo);
		}
	}
}
