package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_while_döngülü {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ArrayIndexOutOfBoundsException
		// InputMismatchException
		char a = 0;
		
		while (a != 'h') {
			try {
				int arr[] = { 2, 3, 5, 6, 7, 9, 1 };
				System.out.println("Lütfen elementi yazdırmak için index numrasın girin: ");
				int index = scan.nextInt();

				System.out.println("girdiginiz index deki element : " + arr[index]);
				
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Girdiginiz index array de yok..");
			} catch (InputMismatchException b) {
				System.out.println("index numarası pozitif tamsayı olmalıdır");
			}

			System.out.println("devam edicekmisin?(e/H)");
			a = scan.next().charAt(0);

		}
		scan.close();
	}
}
