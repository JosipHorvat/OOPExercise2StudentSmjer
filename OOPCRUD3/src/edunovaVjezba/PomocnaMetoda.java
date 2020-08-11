package edunovaVjezba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class PomocnaMetoda {

	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			if(s.startsWith("x")) {
				JOptionPane.showMessageDialog(null, "X se ne smije upisati!!");
			}
		return s;		
			
			
		}
		
	}
	/*
	 * Ovaj datum nije dobar. Ne izbaciva gresku ako se unesu krive vrijednosti
	 * tipa 1111/1123/12345
	 */

	public static Date ucitajDatum(String poruka) {
		while(true) {
			
			try {
				String datum1 = JOptionPane.showInputDialog(poruka);
				SimpleDateFormat format = new SimpleDateFormat("dddd/MMMM/yy");
				
				return format.parse(datum1);
				
			} catch (ParseException e ) {
				JOptionPane.showMessageDialog(null, "Krivi unos, pokusaj ponovno!");
			//	e.printStackTrace();
			} catch (Exception e) {
				
				//e.printStackTrace();
				System.out.println("krivi unos");
			}
		}
	}
	

	public static boolean ucitajBoolean(String poruka) {
		
			String s;
			boolean daIliNe =false;
			
			while(true) {
				s = JOptionPane.showInputDialog(poruka).toLowerCase();
				if (s.trim().toLowerCase().equals("da")){
					daIliNe = true;
					break;
				}
				if (s.trim().toLowerCase().equals("ne")){
					daIliNe = false;
					break;
				}
				
				if(s.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Obavezan unos.");
				continue;
				}
				
			}return daIliNe;	
			}
				
				
					
		
				
				
			
			
			

	
	public static double ucitajDouble(String poruka) {
		while(true) {
			try {
				return Double.parseDouble(JOptionPane.showInputDialog(poruka));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos.");
			}
		}
		
	}

	public static int ucitajInt(String poruka) {
		while(true) {
			try {
			return	Integer.parseInt(JOptionPane.showInputDialog(poruka));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "krivi unos");
			}
		}
	}
	
	public static LocalDate lokalDatum(String poruka) {
		while(true) {
	try {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		
		return   LocalDate.parse(JOptionPane.showInputDialog(poruka),dateFormat);
	}catch(DateTimeParseException e) {
		JOptionPane.showMessageDialog(null, "Krivi unos, pokusaj ponovno!");
	}
	}
}
	
	
	public static LocalDate lokalDatum(String poruka, LocalDate datum) {
		while(true) {
	try {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		
		return   LocalDate.parse(JOptionPane.showInputDialog(poruka, datum),dateFormat);
	}catch(DateTimeParseException e) {
		JOptionPane.showMessageDialog(null, "Krivi unos, pokusaj ponovno!");
	}
	}
}
	
	public static String ucitajString(String poruka, String opis) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka, opis);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			if(s.startsWith("x")) {
				JOptionPane.showMessageDialog(null, "X se ne smije upisati!!");
			}
		return s;		
			
			
		}
		
		
	}
	//promjeni
	public static double randomDouble(double pocetak, double kraj) {
		return pocetak + (double) Math.round(Math.random()* (kraj - pocetak));
		
	}
public static String randomStringGenerator(int duzina){
		
		String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String randomString = "";
		//int duzina = 5;
				
		Random rand = new Random ();
		duzina = rand.nextInt(15);
		
		char[] text = new char[duzina];
		
		for(int i = 0; i<duzina; i ++) {
			text[i] = slova.charAt(rand.nextInt(slova.length()));
		}
//		for(int  i = 0; i< text.length; i++) {
//			randomString += text[i];
//		}
		
		
//		System.out.println(String.valueOf(text));
		return String.valueOf(text);
	}


public static int randomIntIzmedju(int start, int kraj) {
	return start + (int) Math.round(Math.random() * (kraj - start));
}

public static LocalDate randomDatum(int pocetnaGodina, int krajGodine) {
	int dan = randomIntIzmedju(1, 31 );
	int mjesec = randomIntIzmedju(1, 12);

	
	int godina = randomIntIzmedju(pocetnaGodina, krajGodine);
return LocalDate.of(godina, mjesec, dan);
}


public static boolean randomBoolean() {
	Random rand = new Random();
	
return rand.nextBoolean();
}
}
