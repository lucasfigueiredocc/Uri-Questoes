package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();

		double media = ((n1 * (3.5 / 11)) + (n2 * (7.5 / 11)));

		System.out.printf("MEDIA = %.5f%n", media);

		scan.close();
	}
}