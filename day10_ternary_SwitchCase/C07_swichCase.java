package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C07_swichCase {

	public static void main(String[] args) {
		//g�n numaras�na g�re g�n isimlerini yazd�ral�m
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 den 7 aras� rakam yaz�n�z : ");
		
		int gunNo=scan.nextInt();
       
       switch(gunNo) {
       
       case 1:
    	   System.out.println("pazartesi");
           break;
       case 2:
    	   System.out.println("sal�");
    	   break;
       case 3:
    	   System.out.println("�ar�amba");
    	   break;
       case 4:
    	   System.out.println("per�embe");
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
    	   
    	   System.out.println("l�tfen 1 den 7 aras�....");
      
       }
		
		
		
		
		
		
	scan.close();	
		
		
		
		

	}

}
