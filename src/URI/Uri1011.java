package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double raio = scan.nextDouble();

		double VOLUME = ((4 / 3.0) * 3.14159) * (raio * raio * raio);

		System.out.printf("VOLUME = %.3f%n", VOLUME);

		scan.close();
	}
}