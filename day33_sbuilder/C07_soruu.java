package day33_sbuilder;

public class C07_soruu {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Soru : For loop ile 1000 defa bir islem yapalim. 
		//Oncesinde ve sonrasinda zamani kontrol edip 
		//StringBuilder ve String class’larinin performanslarini 
		//karsilastiralim.   
		//Ipucu: long TimeSb = System.nanoTime(); kullanalim
	
	String str="merhaba";
	StringBuilder sb=new StringBuilder("merhaba");
	sb.trimToSize();//kapasiteyi length boyutuna indirir
	
	long time1=System.nanoTime();
	
	
	
	for (int i = 0; i < 1000; i++) {
		str+=" ";
	}
	
	long time2=System.nanoTime();
	
	long stringSüre=time2-time1;
	
	
   
	
	
	long time3=System.nanoTime();
	
	
	
	for (int i = 0; i < 1000; i++) {
		sb.append(" ");
	}
	
	long time4=System.nanoTime();
	
	long sbSüre=time4-time3;
	
	
	if (sbSüre>stringSüre) {
		System.out.println("string daha hizlıdır");
	} else {
       System.out.println("stringbuilder daha hızlı");
	}
	
	System.out.println(stringSüre/sbSüre);//19
	
	System.out.println("String sure : " + stringSüre);//String sure : 2467400
	System.out.println("sb sure : " + sbSüre);//sb sure : 154400
	
	
	}

}
