package day35_encapsulation_ininheritance;

public class C01 {

	private double not=49.9;
	
	
	private boolean gecerMi=false;


	public void setNot(double not) {//patametre oluştuğundan başka classlandan argüment olarak yazılan
		                             //degerler bu method a parametre olarak gelir
		this.not = not;
	}


	public boolean isGecerMi() {  //başka class ta görünür ama değiştirelemez
		
	if (not>=50) {
		gecerMi=true;
	}
		
		
		return gecerMi;
	}

	
	




	
	
	
	
	
	
	
	
	

}
