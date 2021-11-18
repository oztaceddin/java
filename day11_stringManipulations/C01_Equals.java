package day11_stringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		

	int a=10;
	int b=a+0;
	System.out.println(a==b);//true
	
	char ch1='K';
	char ch2=(char) (ch1+0);//'K'+0
	
	
	System.out.println(ch1==ch2);//true
	
	
	String str1="ali";
	String str2="can";
	String str3="ali can";
	String str4=str1 + " "+str2;
	
	System.out.println(str4);//ali can
	System.out.println(str3==str4);//false
	
	System.out.println(str3.equals(str4));//true
	
	
	// String variable'larda == hem degere hem de referansina bakar dolayisiyla objeler farkli oldugunda 
    // genelde false doner
    // str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
    // eger case sensitive olarak String degerleri ayni ise true doner
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
