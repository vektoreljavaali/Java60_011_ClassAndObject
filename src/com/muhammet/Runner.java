package com.muhammet;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// bir s�n�ftan obje yaratmak 
		Kus kus; // De�i�ken tan�m�
		Kus kus2 = new Kus();// Obje Yaratmak	
		int sayi;
		int sayi2=2;

		// Collections
		// Personel listesi olu�tur
		List<Personel> plist = new ArrayList<Personel>();
		Personel personel = new Personel();
		personel.ad = "Muhammet";
		personel.id = 343434;
		personel.soyad="HOCA";
		personel.telefon="0 555 999 8887";
		plist.add(personel);
	
		personel = new Personel(); // Yeni Adresleme
		personel.ad = "Ay�e";
		personel.soyad = "HOCA";
		personel.telefon = "0 888 888 7777";
		plist.add(personel);		
		/// Listele
		for (Personel item : plist) {
			
			System.out.println("Personel Ad�.......: "+ item.ad);
			System.out.println("Personel Soyad�....: "+ item.soyad);
			System.out.println("Personel Telefonu..: "+ item.telefon);
			System.out.println("Personel Id........: "+ item.id);
			System.out.println("---------------------------------");
		}
		
	}//Main Sonu
}//Class Sonu
