package com.muhammet;

import java.util.Date;

public class Personel {

	// Bir kimlik bilgisi
	// benzersiz anahtar
	// ID - UUID - Primary Key
	long id;
	// int id;
	String uuid;
	// Personel düþük sayýlý yapýlarda  int kullanýlabilir.
	// Satýþ sýnýfý, long  ??? neden
	// 10.000 * 100 * 3 * 365 * 10 = int > long
	//--------------------------
	String tckimlik;
	String ad;
	String soyad;
	int yas;
	String cinsiyet;
	String bolum;
	String brans;
	String telefon;
	Date isegiristarihi;
	String adres;
	String yakintelefon;
	
	
}
