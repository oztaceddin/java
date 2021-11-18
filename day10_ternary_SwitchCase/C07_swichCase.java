package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C07_swichCase {

	public static void main(String[] args) {
		//gün numarasýna göre gün isimlerini yazdýralým
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 den 7 arasý rakam yazýnýz : ");
		
		int gunNo=scan.nextInt();
       
       switch(gunNo) {
       
       case 1:
    	   System.out.println("pazartesi");
           break;
       case 2:
    	   System.out.println("salý");
    	   break;
       case 3:
    	   System.out.println("çarþamba");
    	   break;
       case 4:
    	   System.out.println("perþembe");
    	   break;
       case 5:
    	   System.out.println("cuma");
    	   break;
       case 6:
    	  System.out.println("cumartesi");
    	  break;
       
       case 7:
    	   System.out.println("pazar");
    	   
    	   break;
       default:
    	   
    	   System.out.println("lütfen 1 den 7 arasý....");
      
       }
		
		
		
		
		
		
	scan.close();	
		
		
		
		

	}

}
