package vjezba;

import java.time.LocalDate;
import java.util.List;

public class Student {

	//Aplikacija omogućuje unos više entiteta tipa student.
	//Projekt u Eclipse-u se zove OOPCRUD_02, paket u kojem se nalaze sve klase se zove edunova.student. 
	//Za entitet student potrebno je definirati sljedeća svojstva:
	//šifra (cijeli broj), prodan (datum), adresa (znakovni tip), iznos (decimalni broj), količina (decimalni broj),
	//twitter (znakovni tip) te smjer. 
	
	//Za entitet Smjer potrebno je definirati sljedeća svojstva: šifra (cijeli broj), boja (znakovni tip),
	//mrežno mjesto (znakovni tip), telefon (znakovni tip), broj (cijeli broj) i prisutan (logička vrijednost).
	//Program omogućuje CRUD entitet tipa student dok se ne prekine unos (slovo r). Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
	//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva količina s svih instanca unesenih entiteta tipa student.
	//Za sve znakovne tipove podataka u entitetu smjer izračunava se zbroj svih unesenih znakova na entitetu student.
	//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s svim popunjenim svojstvima.

private int sifra;
private LocalDate prodan;
private String adresa;
private double iznos;
private double kolicina;
private String twitter;
private List<Smjer> smjer;

public Student() {
	
}



public Student(int sifra, LocalDate prodan, String adresa, double iznos, double kolicina, String twitter, List<Smjer> smjer) {
	super();
	this.sifra = sifra;
	this.prodan = prodan;
	this.adresa = adresa;
	this.iznos = iznos;
	this.kolicina = kolicina;
	this.smjer = smjer;
	this.twitter = twitter;
}



public String getTwitter() {
	return twitter;
}



public void setTwitter(String twitter) {
	this.twitter = twitter;
}



public List<Smjer> getSmjer() {
	return smjer;
}



public void setSmjer(List<Smjer> smjer) {
	this.smjer = smjer;
}



public int getSifra() {
	return sifra;
}

public void setSifra(int sifra) {
	this.sifra = sifra;
}

public LocalDate getProdan() {
	return prodan;
}

public void setProdan(LocalDate prodan) {
	this.prodan = prodan;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public double getIznos() {
	return iznos;
}

public void setIznos(double iznos) {
	this.iznos = iznos;
}

public double getKolicina() {
	return kolicina;
}

public void setKolicina(double kolicina) {
	this.kolicina = kolicina;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
