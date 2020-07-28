package vjezba;

import java.util.Random;

import javax.swing.JOptionPane;


public class Pomocno {
	public static double randomDouble(double pocetak, double kraj) {
		return pocetak + (double) Math.round(Math.random()* (kraj - pocetak));
		
	}
	
	public static double ucitajDecimalniBroj(String poruka) {
	
		while(true) {
			try {
				return Double.parseDouble(JOptionPane.showInputDialog(poruka));
			}catch (Exception e ) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	public static double ucitajDecimalniBroj(String poruka, double trenutno) {
		
		while(true) {
			try {
				return Double.parseDouble(JOptionPane.showInputDialog(poruka));
			}catch (Exception e ) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}

	public static int ucitajBroj(String poruka) throws IndexOutOfBoundsException {
		while(true) {
		try {
	
			return Integer.parseInt(JOptionPane.showInputDialog(poruka));
		}
		catch ( Exception e) {
			JOptionPane.showMessageDialog(null, "Krivi unos pokusaj ponovno!!");
		}
		}
		}
		
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
	
			s = JOptionPane.showInputDialog(poruka);
		
		if(s.trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Obavezan unos!");
			continue;
		}
		if(s.length() >25) {
			JOptionPane.showMessageDialog(null, "Unesena vrijednost je predugacka");
		continue;
		}
		
		return s;	
		}
	}
	public static String ucitajString(String poruka, String trenutno) {
		String s;
		while(true) {
	
			s = JOptionPane.showInputDialog(poruka);
		
		if(s.trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Obavezan unos!");
			continue;
		}
		if(s.length() >25) {
			JOptionPane.showMessageDialog(null, "Unesena vrijednost je predugacka");
		continue;
		}
		
		return s;	
		}
	}
	public static boolean booleanMetoda(String poruka) {
		String s;
		boolean daNE = false;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if(!s.trim().toLowerCase().equals("da")
					|| !s.trim().toLowerCase().equals("ne")) {
				break;
			}
				
		}
		if(s == "da") {
			daNE = true;
			System.out.println("DA");
			if(s == "ne") {
				daNE =false;
				System.out.println("NE");
			}
			
		}
		return daNE;	
	}
	public static String randomStringGenerator(int duzina){
		
		String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		//int duzina = 5;
				
		Random rand = new Random ();
		duzina = rand.nextInt(15);
		
		char[] text = new char[duzina];
		
		for(int i = 0; i<duzina; i ++) {
			text[i] = slova.charAt(rand.nextInt(slova.length()));
		}
		for(int  i = 0; i< text.length; i++) {
			randomString += text[i];
		}
		
		System.out.println(randomString);
		return randomString;
	}
	
}
