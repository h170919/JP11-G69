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
		return this.innleggsTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		if (this.nesteLedig == 0) {
			return -1;
		}
		for (int i = 0; i<getAntall(); i ++) {
			if (innlegg.erLik(innleggsTabell[i])) {
				return i;
			} 
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (this.nesteLedig == 0) {
			return false;
		}
		for (int i = 0; i<getAntall(); i ++) {
			
			Innlegg temp = innleggsTabell[i];
			if (temp != null && temp.getId() == innlegg.getId()) {
				return true;
			} 
		}
		return false;
	}

	public boolean ledigPlass() {
		if (this.nesteLedig == this.innleggsTabell.length) {
			return false;
		}
		
		return true;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!ledigPlass()) {
			return false;
		}
		
		if (finnes(innlegg)) {
			return false;
		}
		
		this.innleggsTabell[nesteLedig] = innlegg;
		nesteLedig++;
		return true;
	}
	
	public String toString() {
		String s = nesteLedig + "\n";
		
		for (int i = 0; i<innleggsTabell.length; i++) {
			if (innleggsTabell[i] != null) {
				s = s + innleggsTabell[i].toString();
			}else break;
		}
		System.out.println(s);
		return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		//throw new UnsupportedOperationException(TODO.method());
		Innlegg[] newTab = new Innlegg[this.innleggsTabell.length*2];
		for (int i = 0; i<innleggsTabell.length; i++) {
			newTab[i] = innleggsTabell[i];
		}
		innleggsTabell = newTab;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		int index = finnInnlegg(innlegg);
		if (index == -1) {
			return false;
		}
		
		for (int i = index; i <= nesteLedig; i++) {
			innleggsTabell[i] = innleggsTabell[i+1];
		}
		nesteLedig--;
		return true;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}