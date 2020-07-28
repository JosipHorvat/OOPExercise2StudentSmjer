package vjezba;

public class Smjer {

	//Za entitet Smjer potrebno je definirati sljedeća svojstva: šifra (cijeli broj), boja (znakovni tip),
		//mrežno mjesto (znakovni tip), telefon (znakovni tip), broj (cijeli broj) i prisutan (logička vrijednost).
		//Program omogućuje CRUD entitet tipa student dok se ne prekine unos (slovo r). Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
		//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva količina s svih instanca unesenih entiteta tipa student.
		//Za sve znakovne tipove podataka u entitetu smjer izračunava se zbroj svih unesenih znakova na entitetu student.
		//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s svim popunjenim svojstvima.

	private int sifra;
	private String boja;
	private String mreznoMjesto;
	private String telefon;
	private int broj;
	private boolean prisutan;
	
	public Smjer() {
		//  Auto-generated constructor stub
	}
	

	public Smjer(int sifra, String boja, String mreznoMjesto, String telefon, int broj, boolean prisutan) {
		super();
		this.sifra = sifra;
		this.boja = boja;
		this.mreznoMjesto = mreznoMjesto;
		this.telefon = telefon;
		this.broj = broj;
		this.prisutan = prisutan;
	}


	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getMreznoMjesto() {
		return mreznoMjesto;
	}

	public void setMreznoMjesto(String mreznoMjesto) {
		this.mreznoMjesto = mreznoMjesto;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public boolean isPrisutan() {
		return prisutan;
	}

	public void setPrisutan(boolean prisutan) {
		this.prisutan = prisutan;
	}
	
}
