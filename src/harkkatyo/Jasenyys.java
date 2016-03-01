package harkkatyo;

import java.util.ArrayList;
import java.util.Scanner;

public class Jasenyys {
	private static ArrayList<Jasen> jasenLista;
	
	public Jasenyys(){
		jasenLista = new ArrayList<Jasen>(1000);
	}
	public static boolean onkoJasen(int numero){
		
		for(int i = 0; i < jasenLista.size(); i++){
		try{	if(jasenLista.get(i).annaJasenNumero() == numero){
				return true;
			}
			else{
				for(int j=0; j<jasenLista.size(); j++){
					if(jasenLista.get(j) == null){
						System.out.println("Et ole jäsen, haluatko liittyä jäseneksi?");
						Scanner lukija = new Scanner(System.in);
						System.out.println("Paina a liittyäksesi tai b jos et halua");
						String vastaus = lukija.nextLine();
						lukija.close();
						if(vastaus.equals("a")){
							Scanner lukija2 = new Scanner(System.in);
							System.out.println("Anna nimesi");
							lisaaJasen(lukija2.nextLine());
							lukija2.close();
							
						}
						else{
							System.out.println("Varausta ei voitu tehdä");
							break;
						}
					}
				}
			}}catch(NullPointerException npe){}
		}
		return false;
	}
	public static void lisaaJasen(String nimi){
		for(int i=0; i<jasenLista.size(); i++){
			if(jasenLista.get(i) == null){
				Jasen jasen = new Jasen();
				jasen.asetaJasenNumero(i);
				jasen.asetaNimi(nimi);
				jasenLista.add(i,jasen);
			}
		}
		
	}

}
