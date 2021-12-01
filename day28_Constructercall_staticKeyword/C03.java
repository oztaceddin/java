package day28_Constructercall_staticKeyword;

public class C03 {

	public static void main(String[] args) {

		// java run time bir programdır
		// run tuşuna bastığımızda java çalışmaya başlar ve işlemleri yapar
		// javanın işi bittiğinde (çalışma tuşu kırmızı griye döndüğünde herşey başa
		// döner

		// static variable ve method'lar bulunduklari class ile ilintilidir (obje ile
		// degil class ile)
		// baska bir class'da iken C02'deki static variable veya method'a ulasmak
		// istedigimizde
		// C02.staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur

		C02 obje1 = new C02();

		System.out.println("obje1 için x: " + obje1.x + " obje1 için y: " + C02.y);

		obje1.x++;
		C02.y++;
		// static bir variable a class ismi üzerinden ulaşmak yerine
		// instance variable ler gibi obje ile ulaşmaya çalışırsanız
		// java cte vermez ama solda ! işareti ile bizi uyarır
		// "static bir field olan C02.y'ye static yoldan ulas" der
		System.out.println("işlmdn obje1 için x: " + obje1.x + " işlemd obje1 için y: " + C02.y);

		C02 obje2 = new C02();

		System.out.println("obje2 için x: " + obje2.x + " obje2 için y: " + C02.y);

		obje2.x++;
		C02.y++;

		System.out.println("işlm obje2 için x: " + obje2.x + " işlm obje2 için y: " + C02.y);

		System.out.println("obje2 oluş. ve işlemden sonra obje 1" + " x : " + obje1.x + " y: " + C02.y);

		C02 obje3 = new C02();

		obje3.x = 20;
		C02.y = 40;

		System.out.println("obje 3 ten sonra obje 1 in x :" + obje1.x);// 6
		System.out.println("obje 3 ten sonra obje 2 in x :" + obje2.x);// 6
		System.out.println("obje 3 ten sonra obje 3 in x :" + obje3.x);// 20

		System.out.println("obje 3 ten sonra obje 1 in y :" + C02.y);// 40
		System.out.println("obje 3 ten sonra obje 2 in y :" + C02.y);// 40
		System.out.println("obje 3 ten sonra obje 3 in y :" + C02.y);// 40

	}

}
