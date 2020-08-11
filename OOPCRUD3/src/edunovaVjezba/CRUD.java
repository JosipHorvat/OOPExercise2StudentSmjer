package edunovaVjezba;

import java.util.ArrayList;
import java.util.List;

public class CRUD {
	
	private static List<Zgrada> zgrade;
  
  public CRUD(){
		zgrade  = new ArrayList<Zgrada>();
	}
	
	public static void create() {
		
		Zgrada zgrada = new Zgrada();
		
		zgrada.setOpis(PomocnaMetoda.ucitajString("Opis zgrade"));
		zgrade.add(zgrada);
		
	   System.out.println(zgrada.getOpis()+ " Zgrada je uspjesno dodana!");
	}

	/**
	 * Program omogućuje CRUD entitet tipa zgrada dok se ne prekine unos (slovo s).
	 *  Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost. 
	 *  Nakon završetka unosa aplikacija ispisuje vrijednost svojstva opis s svih instanca unesenih entiteta tipa zgrada. 
	 *  Za sve znakovne tipove podataka u entitetu stranica izračunava se zbroj svih unesenih znakova na entitetu zgrada. 
	 *  Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta
	 *   s svim popunjenim svojstvima.
	 */
	public static void  read() {
		System.out.println("*****Zgrade u sustavu*****");
		int i = 1;
		
		//List<Zgrada> zgrade = new ArrayList<Zgrada>();
		for (Zgrada zgrada : zgrade) {
			System.out.println(i++ + ". ");
			System.out.println("Opis: "+ zgrada.getOpis());
			
		}
	}
	
}
