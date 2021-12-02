package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

@SuppressWarnings("unused")
public class C01_LocalDate {

	public static void main(String[] args) {

		LocalDate tarih = LocalDate.now();

		System.out.println(tarih);// 2021-12-02

		System.out.println(tarih.getDayOfYear());// 336

		System.out.println(tarih.getDayOfMonth());// 2

		System.out.println(tarih.getDayOfWeek());// THURSDAY

		System.out.println(tarih.getMonthValue());// 12

		System.out.println(tarih.getMonth());// DECEMBER

		System.out.println(tarih.getEra());// ce

		// plus yapınca ekleme yapıyor

		System.out.println(tarih.plusDays(20));// 2021-12-22
		System.out.println(tarih.plusMonths(5));// 2022-05-02
		System.out.println(tarih.plusWeeks(15));// 2022-03-17
		System.out.println(tarih.plusYears(3));// 2024-12-02

		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));
		// 2032-10-12
         //minus önce demek çıkar 
		System.out.println(tarih.minusDays(20));// çıkartma 2021-11-12
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));
		// 2016-06-27

		System.out.println(tarih.minusYears(21).isLeapYear());// true

		LocalDate dogumTarihi1 = LocalDate.of(1990, Month.MAY, 14);
		LocalDate dogumTarihi2 = LocalDate.of(2000, Month.DECEMBER, 20);
		LocalDate dogumTarihi3 = LocalDate.of(1985, Month.FEBRUARY, 20);

		System.out.println(dogumTarihi1 + "," + dogumTarihi2);// 1990-05-14,2000-12-20

		System.out.println(dogumTarihi1.isAfter(dogumTarihi2));// false--sonramı
		System.out.println(dogumTarihi1.isBefore(dogumTarihi3));// false--öncemi

		Scanner scan = new Scanner(System.in);
		System.out.println("yıl ay gün olarak sırayla doğum tarihinizi yazınız");

		LocalDate dogumTarih5 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(dogumTarih5);

	scan.close();
	
	
	}

}
