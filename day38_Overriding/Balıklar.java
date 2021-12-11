package day38_Overriding;

public class Balıklar extends Animals{

	public static void main(String[] args) {


         Balıklar balik1=new Balıklar();
	     balik1.beslenme();//kendi classına bakar yoksa parent classına bakar
	     balik1.hareket();//önce kendi classına bakar
	     balik1.solunum();
	     //tüm hayvanlar beslenir
	     //balıklar yüzerek haraket eder
	     //balıklar solungaçlarıyla nefes alır
	     
	     
	     
	     
	     
	}

	
	
	@Override
	//child class taki bir method parent classdan bir methodu
	//override (geçersiz) ediyorsa
	//bunu istersek @override notasyonu ile deklare edebilirz
	//deklare etmesek de kod çalışır
	//ancak deklare ettiğimiz java override medhodu sürekli kontrol eder
	//ve o method da overriding uymayan bir değişiklik olursa  CTE verir
	
	
	public void hareket() {
		System.out.println("balıklar yüzerek haraket eder");
	}

	
	
	
	
	public void solunum() {
		System.out.println("balıklar solungaçlarıyla nefes alır");
	}


	



}
