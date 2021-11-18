package day13_StringManipulations;

import java.util.Scanner;

public class C06_iifreSubstring {

	public static void main(String[] args) {
		//Soru 7) Kullanicidan ismini, soyismini ve 
		//kredi karti bilgisini isteyin ve asagidaki gibi
		//yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        
        String isim=scan.nextLine();
        
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim =scan.nextLine();
        
        System.out.println("lutfen 16 karakterli KK numaranizi bosluk birakmadan yazin");
        String kkNo=scan.nextLine();
        
        String isimFormatli=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        String soyisimFormatli=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
        String kkFormatli= "**** **** **** " + kkNo.substring(15);
        
        System.out.println("isim-soyisim : " + isimFormatli + " " + soyisimFormatli);
        System.out.println("kart no : " + kkFormatli);
	
	
	
	
	
	scan.close();
	
	
	}

}
