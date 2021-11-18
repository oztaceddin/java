package day19_wehileloop_dowhileloop;

public class C05_dowhileloop {

	public static void main(String[] args) {
		// Soru 2 ) ’m’ harfinden baslayarak
		// ‘c’ harfine kadar tum harfleri yazdirin.

//************for loop*********		
		for (char i = 'm'; i > 'c'; i--) {
			System.out.print(i + " ");
		}

	System.out.println("");
	
	//*******while loop*******
	char krk='m';
	
	while (krk>'c') {
		System.out.print(krk+" ");
		krk--;
	}
	
	System.out.println("");
	
	//**********dowhileloop*********
	
	
	char harf='m';
	
	do {
		System.out.print(harf+" ");
		harf--;
	} while (harf>'c');
	
	
	
	
	
	
	
	}

}
