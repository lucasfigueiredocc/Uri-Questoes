package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		float v1 = scan.nextFloat();
		int n2 = scan.nextInt();
		float v2 = scan.nextFloat();

		double total = (n1 * v1) + (n2 * v2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		scan.close();
	}
}