package vjezba;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	
	private List<Student> studenti;
	
	public Start() {
		studenti = new ArrayList<Student>();
		nasumicniStudenti();
		izbornik();
	}
	//Program omogućuje CRUD entitet tipa student dok se ne prekine unos (slovo r).
	//Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
	//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva količina s svih instanca unesenih entiteta tipa student.
	//Za sve znakovne tipove podataka u entitetu smjer izračunava se zbroj svih unesenih znakova na entitetu student.
	//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta sa
	//svim popunjenim svojstvima.


	private void izbornik() {
		
		System.out.println("*******************");
		System.out.println("1. Unos novi student");
		System.out.println("2. Pregled Studenata");
		System.out.println("3. Izmjena studenata ");
		System.out.println("4. Brisanje Studenata");
		System.out.println("5. Nasumicni studenti:");
		System.out.println("t. Izlaz");
		odrediAkciju();
	}
	
	private void odrediAkciju() {
	
	switch (Pomocno.ucitajString("Odaberite zeljenu akciju 1-5 || t za izlaz")) {
	
	case "1": 
		unosNovogStudenta();
		break;
	case "2": 
		pregledStudenata();
		break;
	case "3":
		izmjenaStudenata();
		break;
	case "4":
		brisanjeStudenta();
		break;
	case "5": nasumicniStudenti();
	    break;
	case "t": 
		System.out.println("Dovidjenja");
		return;
	default:
		System.out.println("Ne postojeca akcija!");
	}
	izbornik();
	}

	private void unosNovogStudenta() {
		Student student = new Student();
		student.setAdresa(Pomocno.ucitajString("Unesi adresu:"));
		student.setIznos(Pomocno.ucitajDecimalniBroj("Unesi iznos (decimalni broj"));
		student.setKolicina(Pomocno.ucitajDecimalniBroj("Unesi kolicinu:"));
		student.setSmjer(unesiSvojstva());
		studenti.add(student);
		System.out.println("Student" + student + "je uspjesno dodan");
	  
		// ispis kolicine svih studenata
		System.out.println("*******************");
	    System.out.println("KOLICINA SVIH STUDENATA");
		for (Student kolicinaStudent : studenti) {
			System.out.println("Kolicina: "+ kolicinaStudent.getKolicina());
		}
	}

// NAKON UNOSA APLIKACIJA 
	private void pregledStudenata() {
		System.out.println("## STUDENTI U SUSTAVU ##");
		int i = 1;
		for (Student student : studenti) {
			System.out.println(i++ + ". ");
			System.out.println("Adresa: "+ student.getAdresa() + " Iznos: " + student.getIznos() );
			System.out.println("Kolicina: "+ student.getKolicina());
		}
		
	}
	
	private void izmjenaStudenata() {
		System.out.println("## PROMJENA PODATAKA STUDENT ##");	
		pregledStudenata();
		while(true) {
		try {
		int redniBroj = Pomocno.ucitajBroj("Unesite redni broj osobe koju zelite promjeniti:");
	    int index = redniBroj - 1;
//	    if(index== 0) {
//	    	return;
	//    }
	    izmjenaPodatakaStudenata(studenti.get(index));
		}catch(IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "krivi unos");
		}
		}
		
	}


	private void izmjenaPodatakaStudenata(Student student) {
   student.setAdresa(Pomocno.ucitajString("Promjeni adresu:",student.getAdresa()));
   student.setIznos(Pomocno.ucitajDecimalniBroj("Promjeni iznos (decimal)",student.getIznos()));
   student.setKolicina(Pomocno.ucitajDecimalniBroj("Promjeni kolicinu:" + "trenutna kolicina: "+ student.getKolicina()));
	}


	private void brisanjeStudenta() {
System.out.println("## BRISANJE STUDENTA ##");
pregledStudenata();
int redniBroj = Pomocno.ucitajBroj("unesi redni broj:");
int index = redniBroj - 1;
if(Pomocno.ucitajString("d za brisati "+ studenti.get(index)+ ", ostalo za odustati")!="d") {
	return;
}
studenti.remove(index);
	}


	private void nasumicniStudenti() {
		
		for(int i =0; i < 10; i++) {
			Student student = new Student();
			student.setKolicina(Pomocno.randomDouble(1.0, 100.0));
			student.setAdresa(Pomocno.randomStringGenerator(10));
		    student.setIznos(Pomocno.randomDouble(1, 10));
			studenti.add(student);
		}
		
		
	}
	private List<Smjer> unesiSvojstva() {
		List<Smjer> smjerovi = new ArrayList<Smjer>();
		while(true) {
			if(!Pomocno.ucitajString("Unos novog smjera DA?")
					.trim().toLowerCase().equals("da")) {
				break;
			}
			smjerovi.add(unesiSmjerove());
		}return smjerovi;
	}


	private Smjer unesiSmjerove() {
		Smjer smjer = new Smjer();
		smjer.setBoja(Pomocno.ucitajString("Unesi boju:"));
		smjer.setBroj(Pomocno.ucitajBroj("Unesi broj:"));
		smjer.setPrisutan(Pomocno.booleanMetoda("Unesi DA za prisutan || NE ako nije prisutan"));
		smjer.setSifra(Pomocno.ucitajBroj("Unesi sifru:"));
		smjer.setTelefon(Pomocno.ucitajString("Unesi vrstu telefona: "));
		return smjer;
	}


	public static void main(String[] args) {
		new Start();
	}
}
