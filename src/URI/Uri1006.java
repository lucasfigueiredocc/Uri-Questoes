package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();

		double MEDIA = (0.2 * x) + (0.3 * y) + (0.5 * z);

		System.out.printf("MEDIA = %.1f%n", MEDIA);

		scan.close();
	}

}
