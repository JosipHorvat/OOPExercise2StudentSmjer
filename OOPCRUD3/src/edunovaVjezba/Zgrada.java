package edunovaVjezba;

import java.time.LocalDate;
import java.util.List;

public class Zgrada {
	/**
	 *  Za entitet zgrada potrebno je definirati sljedeća svojstva:šifra (znakovni tip),
	 *   opseg (decimalni broj), opis (znakovni tip), dopušten (logička vrijednost), prisutan (logička vrijednost), 
	 *   datum (datum) te stranica. 
	 * 
	 */
private int sifra;
private double opseg;
private String opis;
private boolean dopusten;
private boolean prisutan;
private LocalDate datum;
private List <Stranica>  stranica;

public Zgrada() {
// prazan konstruktor
}

public Zgrada(int sifra, double opseg, String opis, boolean dopusten, boolean prisutan, LocalDate datum,
		List<Stranica> stranica) {
	super();
	this.sifra = sifra;
	this.opseg = opseg;
	this.opis = opis;
	this.dopusten = dopusten;
	this.prisutan = prisutan;
	this.datum = datum;
	this.stranica = stranica;
}

public int getSifra() {
	return sifra;
}

public void setSifra(int sifra) {
	this.sifra = sifra;
}

public double getOpseg() {
	return opseg;
}

public void setOpseg(double opseg) {
	this.opseg = opseg;
}

public String getOpis() {
	return opis;
}

public void setOpis(String opis) {
	this.opis = opis;
}

public boolean isDopusten() {
	return dopusten;
}

public void setDopusten(boolean dopusten) {
	this.dopusten = dopusten;
}

public boolean isPrisutan() {
	return prisutan;
}

public void setPrisutan(boolean prisutan) {
	this.prisutan = prisutan;
}

public LocalDate getDatum() {
	return datum;
}

public void setDatum(LocalDate datum) {
	this.datum = datum;
}

public List<Stranica> getStranica() {
	return stranica;
}

public void setStranica(List<Stranica> stranica) {
	this.stranica = stranica;
}


@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Datum: "+ datum + "\n");
	if(dopusten == true) {
		System.out.println("Dopusten: " +dopusten +", Da");
	}
	if(dopusten == false) {
		System.out.println("Dopusten: "+ dopusten + ", Ne");
	}
	sb.append("Opseg: " + opseg + "\n");
	
	if(prisutan == true) {
		System.out.println("Prisutan: " +prisutan +", Da");
	}
	if(prisutan == false) {
		System.out.println("Prisutan: "+ prisutan + ", Ne");
	}
	sb.append("Sifra: " + sifra + "\n");

	return sb.toString();
}

}
