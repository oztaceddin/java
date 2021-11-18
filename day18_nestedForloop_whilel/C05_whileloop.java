package day18_nestedForloop_whilel;

public class C05_whileloop {

	public static void main(String[] args) {
		// Soru 2 ) For loop ve while Loop kullanarak 
		//3 basamakli sayilardan 15, 20 ve 90’na tam bolunebilen
		//sayilari yazdirin.

	
	
	for (int i = 100; i <1000; i++) {
		if (i%15==0 && i%20==0 && i%90==0) {
			System.out.println(i+" ");
		}
	}
	
	System.out.println("*********whileloop ile********");
	
	int sayi=100;//başlangıç değeri için
	
	while (sayi<1000) {
		if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
			System.out.println(sayi+" ");
		}
	sayi++;
	}
	
	
	//eğer başlangıç ve bitiş şartı bir sayının artısına bağlı ise veya
	//tekrar edilecek işlem adedi belli ise for loop tercih ediniz
	//işlem tekrar sayısı belli değilse vey a bitiş için sınır değerinde
	//büyük olma gibi bir şart varsa  while kullanılır
	
	
	
	
	
	
	
	
	
	
	
	}

}
