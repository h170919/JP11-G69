package no.hvl.dat100.jplab11.oppgave1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.tests.TInnlegg;

public abstract class Innlegg {

	private int id;
	private String bruker;
	private String dato;
	private int likes;

	// TODO - deklarering av objektvariable
	public Innlegg() {
		

	}

	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	public String getBruker() {
		return this.bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato; 

	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;

	}

	public int getLikes() {
		return this.likes;

	}

	public void doLike() {
		this.likes += 1;
	}

	public boolean erLik(Innlegg innlegg) {
		if(this.id == innlegg.id) {
			return true;
		}
		return false;

	}

	@Override
	/* "1\nOle Olsen\n23-10\n7\n" 
	 * der det først tallet er id for innlegget 
	 * og 7 er antall likes for eksemplet.
	 * 
	 * 		TInnlegg innlegg = l
		assertEquals("1\nOle Olsen\n23-10\n0\n",innlegg.toString());
	 */
	public String toString() {
		
		String info = this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n";
		return info;
		
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
