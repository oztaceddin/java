package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C08_SwitchCase {

	public static void main(String[] args) {
		 //gun numarasina gore hafta ici veya hafta sonu yazdiralim
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 den 7 aras� rakam yaz�n�z : ");
		
		int gunNo=scan.nextInt();
       
       switch(gunNo) {
       
       case 1:
    	   System.out.println("pazartesi\nhafta i�i");
          
    	   break;
       case 2:
    	   System.out.println("sal�\nhafta i�i");
    	   break;
       case 3:
    	   System.out.println("�ar�amba\nhafta i�i");
    	   break;
       case 4:
    	   System.out.println("per�embe\nhafta i�i");
    	   break;
       case 5:
    	   System.out.println("cuma\nhafta i�i");
    	   break;
       case 6:
    	  System.out.println("cumartesi\nhafta sonu");
    	  break;
       
       case 7:
    	   System.out.println("pazar\nhafta sonu");
    	   
    	   break;
       default:
    	   
    	   System.out.println("l�tfen 1 den 7 aras�....");
      
       }
		
		
		
		
		
		
	scan.close();

	}

}
