package edunovaVjezba;

import java.time.LocalDate;

public class Stranica {
	/**
	 *  Za entitet Stranica potrebno je definirati sljedeća svojstva: šifra (znakovni tip), ime (znakovni tip),
	 *   twitter (znakovni tip), poštanski broj (znakovni tip), zabranjen (logička vrijednost) i prodan (datum). 
	 * 
	 */
	private int sifra;
	private String ime;
	private String twitter;
	private String postanskiBroj;
	private boolean zabranjen;
    private LocalDate prodan;
    
    public Stranica() {
    	
	}

	public Stranica(int sifra, String ime, String twitter, String postanskiBroj, boolean zabranjen, LocalDate prodan) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.twitter = twitter;
		this.postanskiBroj = postanskiBroj;
		this.zabranjen = zabranjen;
		this.prodan = prodan;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getPostanskiBroj() {
		return postanskiBroj;
	}

	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}

	public boolean isZabranjen() {
		return zabranjen;
	}

	public void setZabranjen(boolean zabranjen) {
		this.zabranjen = zabranjen;
	}

	public LocalDate getProdan() {
		return prodan;
	}

	public void setProdan(LocalDate prodan) {
		this.prodan = prodan;
	}
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Zabranjen: " + zabranjen +  "\n");
    	sb.append("Postanski broj: " + postanskiBroj + "\n");
    	return sb.toString();
    }
 
}
