package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C10_switcCase {

	public static void main(String[] args) {
		
		// Soru3 : verilen sayiyi inceleyin
        // Girilen sayi
        // 10  ise �Iki basamakli en kucuk sayi                   
        // 100 ise �uc basamakli en kucuk sayi�
        // 1000 ise �dort basamakli en kucuk sayi�
        // diger durumlarda �Girdigin sayiyi degistir� yazdirin
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen l�tven bir say� giriniz : ");
		
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 10:
			System.out.println("iki basamakl� sayi");
		break;
		case 100:
			System.out.println("�� basamakl� sayi");
		break;
		case 1000:
			System.out.println("d�rt basamakl� sayi");
		break;
		default:
			System.out.println("ge�ersiz");
		
		}
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
