package S6D5PROJECT.esercizio1;

//Leaf

public class Pagina implements Elemento {
	private int paginaNumero;

	public Pagina(int paginaNumero) {

		this.paginaNumero = paginaNumero;
	}

	@Override
	public int getNumeroPagine() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void print() {
		System.out.println("Stampo la pagina " + paginaNumero);

	}

}
