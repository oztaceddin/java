package day34_accessDeneme;

import day34_accessmodifier_encapsulation.C01;

public class C01_BaşkaPackage {

	public static void main(String[] args) {
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);//sadece ayni pacgace  dekiler kullanır
		//System.out.println(obj.sayiProtected);  //AYNI PACKAGE DEKİ VE CLASS LAR VE CHİLD CLASSLAR ULAŞIR
		System.out.println(obj.sayiPublic);  //HERYERDEN ULAŞABİLİRSİNİZ

	}

}
