package day19_wehileloop_dowhileloop;

public class C04_doWhileloop {

	public static void main(String[] args) {

		int i = 0;

		while (i < 5) {
			System.out.print(i + " ");// 0 1 2 3 4
			i++;
		}

		//while loop önce kontrol eder sonra kodu çalıştırır
		//loop içinde artış yapılsada bir sonraki kontrole kadar kod çalışır
		//buda bazı durumlarda hatalı sonuçlara ulaşmamıza sebep olabilir!!!
		
		
		
		System.out.print("*************  DOWHİLELOOP*********");

		//dowhile loop ise önce işlem yapar  sonra şartı kontrol eder
		//özellikle kullanıcıdan değer almalarda dowhile loop kullanılır
		
		
		
		int a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 5);

	
	
	}

}
