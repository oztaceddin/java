package day19_wehileloop_dowhileloop;

import java.util.Scanner;

public class C06_dowhile_loop {

	public static void main(String[] args) {
		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki
		 * sartlara gore kontrol edin ve sifredeki hatalari yazdirin. Kullanici gecerli
		 * bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
		 * “Sifreniz Kabul edilmistir” yazdirin. - Sifre kucuk harf icermelidir - Sifre
		 * buyuk harf icermelidir - Sifre ozel karakter icermelidir - Sifre en az 8
		 * karakter olmalidir.
		 */

		Scanner scan = new Scanner(System.in);

		String sifre = "";
		boolean khk = false;
		boolean bhk = false;
		boolean okk = false;
		boolean uk = false;
		
		do {
			System.out.println("Lütfen bir şifre giriniz..:");
			sifre = scan.nextLine();

			khk = kucukharf(sifre);
			bhk = buyukHarf(sifre);
			okk = ozelKarakter(sifre);
			uk= uzunlukKontrol(sifre);

		} while (!khk || !bhk|| !okk ||!uk);

		System.out.println("şifreniz başarılı şekilde kaydedildi");
scan.close();
	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk = false;
		 if (sifre.length()>=8) {
	            uk=true;
	        } else {
	            System.out.println("sifreniz en az 8 karakter olmalidir");
	        }
		return uk;
		
	}

	private static boolean ozelKarakter(String sifre) {

		boolean okk = false;
		String harfler = "!'^+%&/@#$?.,";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				okk = true;
				break;
			}
		} // bu satırda şifrede küçük harf varsa bhk true olur yoksa false olur
		if (!okk) {
			System.out.println("şifreniz en az bir tane özel karakter(!'^+%&/@#$?)  içermelidir");
		}

		return okk;

	}

	
	private static boolean buyukHarf(String sifre) {

		boolean bhk = false;
		String harfler = "ABCDEFGĞHIİJKLMNOÖPRSTUVYZWQX";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				bhk = true;
				break;
			}
		} // bu satırda şifrede küçük harf varsa bhk true olur yoksa false olur
		if (!bhk) {
			System.out.println("şifreniz en az bir büyük harf içermelidir");
		}

		return bhk;

	}

	
	
	private static boolean kucukharf(String sifre) {
		boolean khk = false;
		String harfler = "abcdefgğhiıjklmnoöprstuvyzxqw";
		// String harfler="[a-z]";

		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				khk = true;
				break;
			}
		} // bu satırda şifrede küçük harf varsa khk true olur yoksa false olur
		if (!khk) {
			System.out.println("şifreniz en az bir küçük harf içermelidir");
		}

		return khk;

	}

}
