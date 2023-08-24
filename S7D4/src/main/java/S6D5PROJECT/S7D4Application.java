package S6D5PROJECT;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import S6D5PROJECT.esercizio1.Elemento;
import S6D5PROJECT.esercizio1.Libro;
import S6D5PROJECT.esercizio1.Pagina;
import S6D5PROJECT.esercizio1.Sezione;
import S6D5PROJECT.esercizio2.Info;
import S6D5PROJECT.esercizio2.InfoAdapter;
import S6D5PROJECT.esercizio2.UserData;
import S6D5PROJECT.esercizio3.Capitano;
import S6D5PROJECT.esercizio3.Colonnello;
import S6D5PROJECT.esercizio3.Generale;
import S6D5PROJECT.esercizio3.Maggiore;
import S6D5PROJECT.esercizio3.Tenente;
import S6D5PROJECT.esercizio3.Ufficiale;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class S7D4Application {

	public static void main(String[] args) {
		SpringApplication.run(S7D4Application.class, args);
		System.out.println("ESERCIZIO 1");
//es 1
		Elemento pagina1 = new Pagina(1);
		Elemento pagina2 = new Pagina(2);
		Elemento pagina3 = new Pagina(3);

		Sezione sezione1 = new Sezione();
		sezione1.aggiungiElemento(pagina1);
		sezione1.aggiungiElemento(pagina2);

		Sezione sezione2 = new Sezione();
		sezione2.aggiungiElemento(pagina3);

		Libro libro = new Libro();
		libro.aggiungiAutore("Anto");
		libro.aggiungiAutore("Nello");
		libro.setPrezzo(9.99);
		libro.aggiungiElemento(sezione1);
		libro.aggiungiElemento(sezione2);

		libro.print();

		System.out.println("Numero totale di pagine del libro: " + libro.getNumeroPagine());
		System.out.println("-----------------------------");
		System.out.println("ESERCIZIO 2");
		// es 2

		Info info = new Info();
		info.setNome("Ajeje");
		info.setCognome("Brazorf");

		Date dataDiNascita = new Date(90, 0, 1);

		info.setDataDiNascita(dataDiNascita);

		InfoAdapter adapter = new InfoAdapter(info);

		UserData userData = new UserData();
		userData.getData(adapter);

		System.out.println("Nome completo: " + adapter.getNomeCompleto());
		System.out.println("Età: " + adapter.getEta());
		System.out.println("-----------------------------");
		System.out.println("ESERCIZIO 3");
		// es3

		Ufficiale capitano = new Capitano();
		Ufficiale maggiore = new Maggiore();
		Ufficiale tenente = new Tenente();
		Ufficiale colonnello = new Colonnello();
		Ufficiale generale = new Generale();

		capitano.setProssimoUfficiale(maggiore);
		maggiore.setProssimoUfficiale(tenente);
		tenente.setProssimoUfficiale(colonnello);
		colonnello.setProssimoUfficiale(generale);

		int importo = 4000;
		System.out.println("Richiesta di stipendio: " + importo);
		capitano.gestisciRichiesta(importo);
		System.out.println("-----------------------------");
	}

}
