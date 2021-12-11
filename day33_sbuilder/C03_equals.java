package day33_sbuilder;

public class C03_equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("java");
		
		
		StringBuilder sb2=new StringBuilder("java");
		
		
		System.out.println(sb1==sb2);//false
		
		System.out.println(sb1.equals(sb2));//false
		
		//sb da equals methodu string deki mantıkla çalışmaz == mantığı ile çalışır
		
		
		//System.out.println(sb1.compareTo(sb2));//0
		
		//ilk harfinden başlayarak bire bire sb lari karşılaştırı
		//eğer tüm karakterler aynı ise sonuç 0 döner
		//farklı karakter bulursa ilk yazılan sb 2. yazılandan
		//kaç char önde ise onu döner
		
		
		//eğer 2sb in eşit olup olmadığını anlamak istersek
		
		//if (sb1.compareTo(sb2)==0) ile baka biliriz
		
		
		
		String str="java";
		
		//System.out.println(sb1==str);== sb ile stringi karşılaştıramaz
		
		System.out.println(sb1.equals(str));//false
		
		//System.out.println(sb1.compareTo(str)); compare string için kullanılamaz
		
		//  System.out.println(sb1=="java");
		
		
		
	}

}
