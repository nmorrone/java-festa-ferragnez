package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[]args) {
		
		/* l'utente inserirà il suo nome per vedere se è presente nella
		 * lista invitati della festa, se il nome è presente gli sarà consentito
		 * l'accesso altrimenti gli verrà negato */

		//creo array con lista invitati
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", 
							"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		//verifico funzionamento
		System.out.println("Benvenuto nel CheckGuest della Festa");
		System.out.println("Controlliamo subito se sei fai parte degli invitati");
		
		
		//chiediamo all'utente di inserire il nome
		Scanner userName = new Scanner(System.in);
		System.out.println("Inserisci qui sotto il tuo Nome e Cognome");
		//salviamo il valore in una variabile
		String user = userName.next();
		//verifico acquisizione
		//System.out.println(user);
	
		
		for (int i = 0; i < invitati.length; i++) {
			
			//definisco la variabile che cambiera di volta in volta per il controlo
			//acquisira ogni valore singolo dell'Array ad ogni ciclo
			String nameCheck = invitati[i];
			//controllo funzionamento ciclo for
			System.out.println(nameCheck);
			
		}
		
	}

}
