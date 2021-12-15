package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exception {

	public static void main(String[] args) {
		//verilen bir int array için 
		//kullanıcıdan sayı isteyin ve girilen sayıyı index olarak kabul edip
		//o index deki elemti yazdırın
		
		int arr[]= {2,3,4,5,6,2,7,9,1};
		
		Scanner scan = new Scanner(System.in);
		
		//InputMismatchException
		//ArrayIndexOutOfBoundsException
		
		try {
			
			System.out.println("lütfen elementi yazdırmak için index giriniz: ");
			int index=scan.nextInt();
			
			System.out.println("girdiğimiz indexdeki element:"+arr[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiğiniz index array de yok");
		}catch (InputMismatchException e) {
			System.out.println("girdiğiniz index pozitif tam sayı olmalı");
		}
		
		
		scan.close();

	}

}
