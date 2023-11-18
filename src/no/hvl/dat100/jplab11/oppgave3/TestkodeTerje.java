package no.hvl.dat100.jplab11.oppgave3;
import no.hvl.dat100.jplab11.oppgave2.*;


public class TestkodeTerje {

	public static void main(String[] args) {
		Blogg samling = new Blogg(20);
		Blogg samling2 = new Blogg(2);
		
		Tekst innlegg1 = new Tekst(1,"alpha","23-10","teksten");
		Tekst innlegg2 = new Tekst(2,"Bravo","24-10","tekstto");
		Tekst innlegg3 = new Tekst(3,"Charlie","24-10","teksttre");
		
		
		samling.leggTil(innlegg1);
		samling.leggTil(innlegg2);
		
		samling2.leggTil(innlegg2);
		samling2.leggTil(innlegg1);
		
		System.out.println(samling.toString());
		System.out.println(samling.ledigPlass());
		System.out.println(samling2.ledigPlass());
		
		System.out.println(samling.finnes(innlegg1));
		System.out.println(samling.finnes(innlegg3));
		System.out.println(samling.finnInnlegg(innlegg1));
		System.out.println(samling2.finnInnlegg(innlegg1));
		System.out.println(samling2.finnInnlegg(innlegg3));
		
		System.out.println("slettefunksjon");
		System.out.println("antall, bør våre2");
		System.out.println(samling.getAntall());
		System.out.println("finnes 1 og 2? true, true");
		System.out.println(samling.finnes(innlegg1));
		System.out.println(samling.finnes(innlegg2));
		System.out.println("slett 2, slett 3 : bør være true false");
		System.out.println(samling.slett(innlegg2));
		System.out.println(samling.slett(innlegg3));
		System.out.println("antall, bør være 1");
		System.out.println(samling.getAntall());
		System.out.println("finnes inlegg1 innlegg2; true false");
		System.out.println(samling.finnes(innlegg1));
		System.out.println(samling.finnes(innlegg2));
		

	}

}
