package edunovaVjezba;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	/*
	 *
	 *  Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
	 *   Nakon završetka unosa aplikacija ispisuje vrijednost svojstva opis s svih instanca unesenih entiteta tipa zgrada.
	 *    Za sve znakovne tipove podataka u entitetu stranica izračunava se zbroj svih unesenih znakova na entitetu zgrada.
	 *     Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s
	 *      svim popunjenim svojstvima.

	 */
	
	private List<Zgrada> zgrade;
	
	Start(){
		zgrade = new ArrayList<Zgrada>();
		
		izbornik();
	}
// Program omogućuje CRUD entitet tipa zgrada dok se ne prekine unos (slovo s).
	private void izbornik() {
		while(true) {
		System.out.println("****************");
		System.out.println("1. Unos zgrade:");
		System.out.println("2. Pregled zgrade");
		System.out.println("3. Update zgrade");
		System.out.println("4. Delete zgrade");
		System.out.println("5. Dodaj random zgrade");
		System.out.println("6. Link za github");
		System.out.println("S. EXIT");
		System.out.println();
		
		String izbor = PomocnaMetoda.ucitajString("Odaberi akciju:");
		
		if(izbor.matches("1") ) {
			unosNoveZgrade();
		}
		if(izbor.matches("2")) {
			pregledZgrade();
		}
		if(izbor.matches("3")) {
			updateZgrade();
		}
		if(izbor.matches("4")) {
			deleteZgrade();
		}
		if(izbor.matches("5")) {
			unosRandomZgrada();
		}
		if(izbor.matches("6")) {
			linkZaGitHub();
		}
		if(izbor.toLowerCase().matches("s")) {
			System.out.println("Hvala i dovidjenja.");
			return;
		}
		else {
			System.out.println("krivi izbor");
		}
		
		}
	}

	private void unosNoveZgrade() {
		Zgrada zgrada = new Zgrada();
	//	zgrada.setOpis(PomocnaMetoda.ucitajString("Opisi zgradu"));
		zgrada.setDatum(PomocnaMetoda.lokalDatum("Upisi datum u formatu dd/MM/yyyy:"));
//		zgrada.setDopusten(PomocnaMetoda.ucitajBoolean("Upisi DA za dopusten NE ako nije dopusten"));
//		zgrada.setOpseg(PomocnaMetoda.ucitajDouble("Unesi opseg zgrade u decimalnom broju"));
	    //zgrada.setPrisutan(PomocnaMetoda.ucitajBoolean("Upisi DA za prisutan, NE ako nije prisutan "));
		//zgrada.setSifra(PomocnaMetoda.ucitajInt());
		zgrada.setStranica(ucitajStranicu());
		zgrade.add(zgrada);
		
		System.out.println("Zgrada  je uspjesno dodana.");
		
	}
	private List<Stranica> ucitajStranicu() {
		List<Stranica> stranice = new ArrayList<Stranica>();
		while(true) {
			if(!PomocnaMetoda.ucitajBoolean("Unos place DA?")) {
				break;
			}
			stranice.add(unesiStranicu());
		}
    return stranice;
	}
	private Stranica unesiStranicu() {
		Stranica stranica = new Stranica();
	    stranica.setIme(PomocnaMetoda.ucitajString("Upisi ime: "));
	    stranica.setPostanskiBroj(PomocnaMetoda.ucitajString("Upisi postanski broj: "));
	    stranica.setProdan(PomocnaMetoda.lokalDatum("Unesi datum prodaje: "));
	    stranica.setZabranjen(PomocnaMetoda.ucitajBoolean("Zabranjen Da?"));
	    
			return stranica;
	}
	
	private void pregledZgrade() {
		System.out.println("###ZGRADE U SUSTAVU###");
	//	unosRandomZgrada();   ZASTO MI NECE UCITATI RANDOM ZGRADE!!!!!
		int i = 1;
		
		for (Zgrada zgrada : zgrade) {
			System.out.println(i++ + ". ");
			System.out.println(zgrada);
		  for (Stranica stranica : zgrada.getStranica()) {
			  System.out.println("\t " +"Stranica zabranjena: "+ stranica.isZabranjen()  );
			  System.out.println( "\t  "+ "Postanski broj: " + stranica.getPostanskiBroj());
		}
		}
		
		
	}
	private void promjenaPodatakaZgrade(Zgrada zgrada) {
		zgrada.setDatum(PomocnaMetoda.lokalDatum("Promijeni datum: ", zgrada.getDatum()));
		zgrada.setOpis(PomocnaMetoda.ucitajString("Promijeni opis zgrade:", zgrada.getOpis()));
		zgrada.setDopusten(PomocnaMetoda.ucitajBoolean("Upisi DA za dopusten NE ako nije dopusten"));
				//zgrada.setOpseg(PomocnaMetoda.ucitajDouble("Unesi opseg zgrade u decimalnom broju"));
			    //zgrada.setPrisutan(PomocnaMetoda.ucitajBoolean("Upisi DA za prisutan, NE ako nije prisutan "));
				//zgrada.setSifra(PomocnaMetoda.ucitajInt());
		
	for (Stranica stranica : zgrada.getStranica()) {
		stranica.setIme(PomocnaMetoda.ucitajString("Promjeni ime stranice", stranica.getIme()));
		stranica.setPostanskiBroj(PomocnaMetoda.ucitajString("Promjeni postanski broj", stranica.getPostanskiBroj()));
		stranica.setTwitter(PomocnaMetoda.ucitajString("Promjeni twitter", stranica.getTwitter()));
	}
	}
	
	private void updateZgrade() {
		System.out.println("## PROMJENA PODATAKA ZGRADE##");
	pregledZgrade();
	while(true) {
		try {
	
	int redniBroj = PomocnaMetoda.ucitajInt("Unesi redni broj zgrade: ");
	int index = redniBroj - 1;
	
	promjenaPodatakaZgrade(zgrade.get(index));
	break;
		}catch(IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "krivi unos");
		}
	}
	}
	private void deleteZgrade() {
	pregledZgrade();	
		System.out.println("~~BRISANJE ZGRADE~~");
		int redniBroj = PomocnaMetoda.ucitajInt("Unesi redni broj zgrade koju zelite obrisati: ");
		int index = redniBroj - 1;
		
		if(PomocnaMetoda.ucitajString("Da za obrisati " + zgrade.get(index)+ " ostalo za odustati")!="da") {
			return;
		}
		zgrade.remove(index);
		
	}
	private void unosRandomZgrada(){
		   
			for(int i = 0; i< 15; i++) {
				
			Zgrada zgrada = new Zgrada();
			zgrada.setOpis(PomocnaMetoda.randomStringGenerator(5));
			zgrada.setOpseg(PomocnaMetoda.randomDouble(1, 100));
			zgrada.setPrisutan(PomocnaMetoda.randomBoolean());
			zgrada.setDopusten(PomocnaMetoda.randomBoolean());
			zgrada.setSifra(PomocnaMetoda.randomIntIzmedju(1, 20));
			zgrada.setDatum(PomocnaMetoda.randomDatum(1200, 2200));
			zgrada.setStranica(new ArrayList<Stranica>());
			
			zgrade.add(zgrada);  
		}
			
		
	}
	
	
	private void linkZaGitHub() {
		
		
	}
	public static void main(String[] args) {
		new Start();
	}
}
