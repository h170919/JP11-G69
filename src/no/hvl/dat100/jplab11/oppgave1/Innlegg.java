package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

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
		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
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
		throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		throw new UnsupportedOperationException(TODO.method());

	}

	public void doLike() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}

	@Override
	public String toString() {

		throw new UnsupportedOperationException(TODO.method());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
