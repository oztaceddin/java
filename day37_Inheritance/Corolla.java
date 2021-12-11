package day37_Inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;

	int tekerlekSayısı=4;
	String uretimYeri="türkiye";
	
	
	
	

	
	
	
	public static void main(String[] args) {

	
	    Corolla                arb1          =        new       Corolla();
//class ismi && data type	obje ismi   assigment   keyword    constructor
	
	
	//javada obje oluşturduğumuz her class ismi
	//aynı zamanda bir data türüdür
	
	//bu örnek için corolla hem class adı hemde oluşturduğumuz arb1 objesinin
	//data type dır...
	    
	//javada obj üretilen her bir class aynı zmanda non-primitive data türüdür    
	    System.out.println(arb1.CalisiyorMu);//true
	    System.out.println(arb1.tekerlekSayısı);//4	
	    System.out.println(arb1.uretimYeri);//türkiye
	
	
	    Toyota arb2 = new Corolla();
	
	 System.out.println(arb2.CalisiyorMu);//true
	 System.out.println(arb2.tekerSayısı); //0  
	  
	    
	 
	 
	 
	  Araba arb3= new Corolla();
	    
	   System.out.println(arb3.CalisiyorMu); //true
	





	}

}
