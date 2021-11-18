package day08_ıfElseStatement;

import java.util.Scanner;

public class C08_ifElseif {

	public static void main(String[] args) {
		 //Kullanicidan maas icin bir teklif isteyin ve 
		//asagidaki degerlere gore cevap azdirin.    
		//Teklif 80.000�in uzerinde ise �Kabul ediyorum� , 
	    // 60 � 80.000 arasinda ise �Konusabiliriz�, 
	    //  60.000�nin altinda ise �Maalesef Kabul edemem� yazdirin 

	
	
		Scanner scan=new Scanner(System.in);
        System.out.println("l�tfen istedi�iniz maa�� giriniz");
        
        double maas=scan.nextDouble();
        		
        if (maas>80000) {
			System.out.println("kabul ediyorum");
		} else if(maas>60000) {
                System.out.println("konu�abiliriz");
		}else {
			System.out.println("malesef kabul edemem");
		}
			
		
        scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	


}
