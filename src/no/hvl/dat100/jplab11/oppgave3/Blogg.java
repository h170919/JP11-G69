package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	protected Innlegg[] innleggsTabell;
	protected int nesteLedig;

	public Blogg() {
		this.innleggsTabell = new Innlegg[20];
		this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		this.innleggsTabell = new Innlegg[lengde];
		this.nesteLedig = 0;
	}

	public int getAntall() {
		return this.nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		if (this.nesteLedig == 0) {
			return -1;
		}
		for (int i = 0; i< innleggsTabell.length; i ++) {
			if ( this.innleggsTabell[i].getId() == innlegg.getId()) {
				return i;
			} 
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (this.nesteLedig == 0) {
			return false;
		}
		for (int i = 0; i< innleggsTabell.length; i ++) {
			if ( this.innleggsTabell[i].getId() == innlegg.getId()) {
				return true;
			} 
		}
		return false;
	}

	public boolean ledigPlass() {
		if (this.nesteLedig > this.innleggsTabell.length) {
			return true;
		} else return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (this.nesteLedig+1 == this.innleggsTabell.length) {
			return false;
		}
		
		if (finnes(innlegg) == true) {
			return false;
		}
		
		this.innleggsTabell[nesteLedig] = innlegg;
		nesteLedig++;
		return true;
	}
	
	public String toString() {
		String s = "";
		for (Innlegg i : innleggsTabell) {
			s += i.toString() + "\n";
		}
		return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}