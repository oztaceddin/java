package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C08_SwitchCase {

	public static void main(String[] args) {
		 //gun numarasina gore hafta ici veya hafta sonu yazdiralim
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 den 7 arasý rakam yazýnýz : ");
		
		int gunNo=scan.nextInt();
       
       switch(gunNo) {
       
       case 1:
    	   System.out.println("pazartesi\nhafta içi");
          
    	   break;
       case 2:
    	   System.out.println("salý\nhafta içi");
    	   break;
       case 3:
    	   System.out.println("çarþamba\nhafta içi");
    	   break;
       case 4:
    	   System.out.println("perþembe\nhafta içi");
    	   break;
       case 5:
    	   System.out.println("cuma\nhafta içi");
    	   break;
       case 6:
    	  System.out.println("cumartesi\nhafta sonu");
    	  break;
       
       case 7:
    	   System.out.println("pazar\nhafta sonu");
    	   
    	   break;
       default:
    	   
    	   System.out.println("lütfen 1 den 7 arasý....");
      
       }
		
		
		
		
		
		
	scan.close();

	}

}
