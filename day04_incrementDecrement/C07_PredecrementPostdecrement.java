package day04_incrementDecrement;

public class C07_PredecrementPostdecrement {

	public static void main(String[] args) {
		int sayi=10;
		
		sayi--;
		
		System.out.println(sayi);//9
		
		int a=sayi--;
		
		System.out.println(a);//9
		
		System.out.println(sayi);
		
		System.out.println(--a);

	}

}
