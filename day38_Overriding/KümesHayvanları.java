package day38_Overriding;

public class KümesHayvanları extends Kuslar{

	public static void main(String[] args) {
		
		
		KümesHayvanları kms1=new KümesHayvanları();
		kms1.beslenme();//tüm hayvanlar beslenir
		kms1.hareket();//kümes hayvanları yürüyerek haraket eder
		kms1.solunum();//kuşlar akciğerleriyle nefes alır
		
		
		Kuslar kms2=new KümesHayvanları();
		kms2.beslenme();//animals++   tüm hayvanlar beslenir
		kms2.hareket();//kuslar++     kümes hayvanları yürüyerek haraket eder
		kms2.solunum();//kuslar++     kuşlar akciğerleriyle nefes alır
		
		
		//kendi spesifik özellikleri dışında kuşşlara tabi olur
		//ama spesifik özelliği varsa farkını ortaya koyar
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();//tüm hayvanlar beslenir
		kms3.hareket();//kuşlar uçarak haraket eder
		kms3.solunum();//kuşlar akciğerleriyle nefes alır
		
		
		
		Animals kms4=new KümesHayvanları();
		kms4.beslenme();//animals++  tüm hayvanlar beslenir
		kms4.hareket();//animals++   kümes hayvanları yürüyerek haraket eder
		kms4.solunum();//animals++   kuşlar akciğerleriyle nefes alır
		
		
		
		
		
		

	}

	
	public void hareket() {
		System.out.println("kümes hayvanları yürüyerek haraket eder");
	}

	
	
	
	

	
	
	
}
