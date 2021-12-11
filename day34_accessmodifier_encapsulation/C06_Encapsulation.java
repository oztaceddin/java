package day34_accessmodifier_encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {
		
		
		C05 obj1=new C05();
		
		System.out.println(obj1.getAsgariMaas());//4000
		//obj1.asgariMaas=3000;----
		
		//c05 classında asgarimaası private yapıp getter metgodu kullandığımızdan 
		//asgari maası görebiliyoruz ama değiştiremiyoruz
		
		
		//classic access modifier larimiz ile bir variable a ulaşabilirsek
		//istediğimiz zaman değiştirme seçeneğimizde olur
		

	}

}
