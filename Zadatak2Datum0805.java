package domazizasreduuvece;

import java.util.Scanner;

public class Zadatak2Datum0805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva ima u nizu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		int[] b = minMax(a);
		System.out.println("Minimum i maksimum niz: " + b[0] + " , " + b[1]);
	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + i + ". element niza: ");
			a[i] = sc.nextInt();
		}
	}

	static int[] minMax(int[] a) {
		int[] b = new int[2];
		b[0] = b[1] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < b[0]) {
				b[0] = a[i];
			} else if (a[i] > b[1]) {
				b[1] = a[i];
			}
		}
		return b;
	}

}
