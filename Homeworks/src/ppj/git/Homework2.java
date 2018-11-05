package ppj.git;

import java.util.*;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h, rate, wage;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê przepracowanych godzin");
		h = odczyt.nextDouble();
		System.out.println("Podaj stawkê godzinow¹");
		rate = odczyt.nextDouble();
		wage = h * rate;
		if (h > 60) {
			System.out.println("Maksymalna iloœæ przepracowanych godzin w tygodniu wynosi 60.");
		} else if (h > 40) {
			if (rate < 12) {
				System.out.println("P³aca minimalna to 12PLN/h");
			} else {
				wage = (40 * rate) + ((h - 40) * (rate * 1.5));
				System.out.println("Twoja pensja wynosi: " + wage);
			}
		}
	}
}
