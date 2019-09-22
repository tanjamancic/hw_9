package domazizasreduuvece;

import java.util.Scanner;

public class Zadatak3datum0805br2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko elemenata ima u nizu: ");
		int n = sc.nextInt();
		double[] a = new double[n];
		ucitajNiz(a);
		double ari = aritmeticka(a);
		System.out.println("Aritmeticka sredina niza je: " + ari);
		sortirajNiz(a);
		double med = medijana(a);
		System.out.println("Medijana niza je: " + med);
	}

	static void ucitajNiz(double[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + i + ". element niza: ");
			a[i] = sc.nextDouble();
		}
	}

	static double aritmeticka(double[] a) {
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		return suma / a.length;
	}

	static void sortirajNiz(double[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					double temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	static double medijana(double[] a) {
		double med = 0;
		if (a.length % 2 != 0) {
			med = a[ a.length / 2 ];
			System.out.println("Niz ima neparan broj elemenata.");
		} else {
			double[] b = new double[2];
			b[0] = a[a.length / 2 - 1];
			b[1] = a[a.length / 2];
			med = aritmeticka(b);
			System.out.println("Niz ima paran broj elemenata.");
		}
		return med;
	}
}