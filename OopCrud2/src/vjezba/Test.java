package vjezba;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		//int duzina = 5;
		
		Random rand = new Random ();
		int duzina = rand.nextInt(15);		
		
		char[] text = new char[duzina];
		
		for(int i = 0; i<duzina; i ++) {
			text[i] = slova.charAt(rand.nextInt(slova.length()));
		}
		for(int  i = 0; i< text.length; i++) {
			randomString += text[i];
		}
		
		System.out.println(randomString);
	}
	
	}

