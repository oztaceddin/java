package day35_encapsulation_ininheritance;

public class personel {

	protected String isim;
	protected String soyİsim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	
	personel(){
		System.out.println("personel parametresiz consr. çalıştı");
	}

	// eğer variable lere access modifier yazmazsak
    //java access  midifier olarak default acc. mod. atar
    //böyle olursa sadece o package altındaki child class lar
    //personel class ini inherit edilebilir
    //başka package lardaki child class larin personel i inherit edebilmesi için
    //variable ve method ların acc.mod. larını protected yaparız
	// public yapsak da inherit edilebilir ama biz herkesin erismesini degil
	// sadece child clas'larin erismesini istedigimizden protected tercih ederiz

	public static void main(String[] args) {

	}

}
