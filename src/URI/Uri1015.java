package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1015 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		float x1 = scan.nextFloat();
		float y1 = scan.nextFloat();
		float x2 = scan.nextFloat();
		float y2 = scan.nextFloat();

		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.printf("%.4f%n", distancia);

		scan.close();
	}
}
