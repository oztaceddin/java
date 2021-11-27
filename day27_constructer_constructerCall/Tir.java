package day27_constructer_constructerCall;

public class Tir {

	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Tir(int i, String string, String string2, int j, boolean b) {
		km = i;
		model = string;
		renk = string2;
		yil = j;
		satilikMi = b;

	}

	public Tir(int km, String model, String renk) {
		// i string ve string 2 güzel değil ve anlaşılmaz
		// daha anlaşılır olması için variable isimlerini anlamlı yapalım
		// int km,string model,string renk

		this.km = km;
		this.model = model;
		this.renk = renk;
		// başına this. yazdığımızda java bu variable classtan(yukarıdan) alaraak yansıtır
	}

}
