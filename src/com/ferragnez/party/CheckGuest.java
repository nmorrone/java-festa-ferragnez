package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {

	
	public static void main(String[]args) {
		/* l'utente inserirà il suo nome per vedere se è presente nella
		 * lista invitati della festa, se il nome è presente gli sarà consentito
		 * l'accesso altrimenti gli verrà negato */

		//creo array con lista invitati
		String [] invitati = {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
		//apro il metodo scanner
		Scanner keyboardInput = new Scanner(System.in);
		
		//chiedo all'utente il nome e salvo il valore
		System.out.println("Benvenuto nel CheckGuest della Festa, inserisci il tuo nome qui sotto:");
		String user = keyboardInput.nextLine();
		//controllo
		//System.out.println(user);
		
		//definisco var che mi servirà dopo il controllo per il messaggio in uscita
		int condition = 0;
		
		//apro ciclo for per confrontare il nome inserito con quelli presente in lista
		for(int i = 0; i < invitati.length; i++) {
			//apro condizione di uguaglianza
			if(user.equals(invitati[i])) {
				condition = 1;
				System.out.println(condition);
			}
			
			//apro condizione per il messaggio
			if(condition == 1) {
				
				System.out.println("Complimenti " + user + " goditi la Festa!");
			}
		}
	}
}
