package harkkatyo;
import java.util.Scanner;

public class DriverLuokka {
	public static void main (String[] arg){		
		System.out.println("Anna jäsen numero, kiitos.");
		Scanner lukija1 = new Scanner(System.in);
		int vastaus1 = lukija1.nextInt();
		lukija1.close();
		Jasenyys.onkoJasen(vastaus1);
	
		
	}

}
