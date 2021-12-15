package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("unused")
public class C06_parenChildexception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("java dersleriii\\day40\\yazi.txt");
			
		    int k=0;
		    while((k=fis.read())!=-1) {
		        System.out.print((char)k);
		        
		    }
		    }catch(IOException e){//hatayı genişletirsek problem çözülür
		      
		   
		System.out.println("");
		System.out.println("görev tamamlandı");

		    }
	}

}
