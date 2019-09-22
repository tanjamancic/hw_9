package domazizasreduuvece;

import java.util.Scanner;

public class Zadatak1Datum0805 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva ima u nizu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		sortirajNiz(a);
		ispisiSortiraniNiz(a);
		missingClan(a);
	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + i + ". element niza: ");
			a[i] = sc.nextInt();
		}
	}

	static void sortirajNiz(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	static void ispisiSortiraniNiz(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + ". element sortiranog niza je: " + a[i]);
		}
	}

	static void missingClan(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] + 1 != a[i + 1]) {
				System.out.println("Clan niza koji nedostaje je: " + (a[i] + 1));
			}
		}
	}

}
