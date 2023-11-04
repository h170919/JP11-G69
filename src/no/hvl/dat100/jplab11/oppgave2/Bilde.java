package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.tekst = tekst;
		this.url = url;
		super.likes = 0;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.tekst = tekst;
		this.url = url;
		super.likes = likes;
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String s;
		s = "BILDE" + "\n" + super.id + "\n" + super.bruker + "\n" + super.dato + "\n" + 
				super.likes + "\n" + super.tekst + "\n" + this.url + "\n";
		return s;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
