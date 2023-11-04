package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	
	protected String tekst;
	
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		this.tekst = tekst;
		super.likes = 0;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		this.tekst = tekst;
		super.likes = likes;
	}
	
	public String getTekst() {
		return this.tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		String s;
		s = "TEKST" + "\n" + super.toString() + this.tekst + "\n";
		return s;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
