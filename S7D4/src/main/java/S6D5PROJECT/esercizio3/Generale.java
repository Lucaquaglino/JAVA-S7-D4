package S6D5PROJECT.esercizio3;

public class Generale implements Ufficiale {
	@Override
	public void setProssimoUfficiale(Ufficiale prossimoUfficiale) {

	}

	@Override
	public void gestisciRichiesta(int importo) {
		if (importo <= 5000) {
			System.out.println("Generale gestisce la richiesta di stipendio.");
		} else {
			System.out.println("IMPORTO ERRATO.");
		}
	}
}
