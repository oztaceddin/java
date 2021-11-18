package day17_forloop;

public class C07_nestedForloop {

	public static void main(String[] args) {
		// 1 den 4 kadar olan sayıları yanyana 
		//aralarında bir boşlık bırakarak yazdır
		
		
		
		for (int satir = 1; satir <=4; satir++) {// burasıda outerforloop--dış for loop
			for (int i =1 ; i <= 4; i++) {//burası inner forloop---iç for loop
				System.out.print(satir*i+" ");
			}
           System.out.println();
		}
	
	
	
	
	
	
	}

}
