package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileinputStream {

	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException   {
		// javada bir dosyaya ulaşmak istediğimizde file inputstream classından yardım alırız

		
		FileInputStream fis=new FileInputStream("java dersleriii\\day40\\yazi.txt");
		
		//java bu kodda olası bir problem öngörüyor
		//ve bu probleme karşı ne yapması gerek.
		//bize soruyor
		//yani altı çizilen her kod  CTE değildir
		
		//bunun için 2 ihtimal sözkonusu
		//1--try catch kullanara bu proğramı hanle yaparak javanın yoluna devam etmesini sağlarz
		//2--eğer dosya okunamıyorsa kod çalışmasın istiyorsak olayın farkında oldgumuzu
		//ve sorumluluğun bizde oldugunu javaya söylemeliyiz
		
		System.out.println("görev tamamlandı");
		
	}

}
