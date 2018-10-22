package ppj.git;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		n = odczyt.nextInt();
		int tablica[][] = new int[n][n];
		for (i = 0; i < tablica.length; i++) {
			for (j = 0; j < tablica.length; j++) {
				tablica[i][j] = j;
				System.out.print(tablica[i][j] + ", ");
				if (i == j)	
				break;
			}
			System.out.println();
		}
	}

}
