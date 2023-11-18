package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		//- åpne filen, skrive til fil, lukke filen
		if(samling.getAntall()==0)  {
			return false;
		} else {
		PrintWriter skriver;
		try {
			skriver = new PrintWriter(mappe + filnavn);
			skriver.write(samling.toString());
			skriver.close();
		} catch (FileNotFoundException e) {
			return false;
		}
		
		}
		return true;
		
	}
}
