package day16_forloop;

public class C01_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+" ");
		}
		
	  //for loop başlangıç ve bitiş şartı bir sayının değerine bağlı olan 
	//durumlarda tercih edilir	
		
		
		
		//for (int i = 0; i < 10; i--) {
			//System.out.println(i+" ");
		
	
	//eğer başlangıç sayısı artış/azalış ile bitiş değeri yaklaşmıyor
    //uzaklaşıyor ise loop hiçbir zaman durmaz
    //bu durumda sonsuz loop deriz ve bu durumun gerçekleşmesiniz istemeyiz
	
	
	for (int i = 0; i>10; i++) {
		System.out.println(i);
	}
	

     //eğer ilk değer için bitiş şartı TRUE olmassa daha ilk adımda
     //loop broken olur bundan dolayıda loop body hiç çalışmadan
	//loop un sonrasına geçilir
	//yani loop çalışır ama hiç bir işlem yapmaz

    
	
	}

}
