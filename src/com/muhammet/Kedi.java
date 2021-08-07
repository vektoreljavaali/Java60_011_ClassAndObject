package com.muhammet;

public class Kedi {
	
	// 1- Deðiþken
	// 2- Methodlar
	// 3- Ýnner Class - Wrapper Class
	// Nesnelerin ÖZellikleri -> Class için de Deðiþkenlere denk gelir.
	// properties
	
	String gozrengi;
	int kuyrukuzunlugu;
	int boy;
	double agirlik;
	String cinsi;
	String durum; // uykuda, uyanýk, v.s.
	public void uyu() {
		System.out.println("Kedi uyudu");
		durum = "Uykuda";
	}
	

}
