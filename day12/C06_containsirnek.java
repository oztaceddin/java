package day12;

import java.util.Scanner;

public class C06_containsirnek {

	public static void main(String[] args) {
//Soru 1) Kullanicidan email adresini girmesini isteyin
//, mail @gmail.com icermiyorsa 
//�lutfen gmail adresi giriniz�,
//@gmail.com ile bitiyorsa 
//�Email adresiniz kaydedildi � , 
//@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen gmail adresinizi giriniz  :");

	
	
	    String email=scan.nextLine();
	
	    int uzunluk=email.length();
	    int index=email.lastIndexOf("@gmail.com");
	    
	
	    
	    
	    
	    if (!email.contains("@gmail.com")) {
		
	System.out.println("�lutfen gmail adresi giriniz�");
	
	} else if(index==uzunluk-10){
System.out.println("imail adresiniz kaydedildi");
	}else {
		System.out.println("l�tfen yaz�m� kontrol edin");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}
