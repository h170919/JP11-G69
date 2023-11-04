package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave2.*;


public class TestkodeTerje {

	public static void main(String[] args) {
		Blogg samling = new Blogg(20);
		Blogg samling2 = new Blogg(2);
		
		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10","teksten");
		Tekst innlegg2 = new Tekst(2,"Oline Olsen","24-10","tekstto");
		
		
		samling.leggTil(innlegg1);
		samling.leggTil(innlegg2);
		
		samling2.leggTil(innlegg1);
		samling2.leggTil(innlegg2);
		
		System.out.println(samling.toString());
		System.out.println(samling.ledigPlass());
		System.out.println(samling2.ledigPlass());
		

	}

}
