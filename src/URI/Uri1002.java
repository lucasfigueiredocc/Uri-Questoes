package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double raio = scan.nextDouble();
		double area = 3.14159 * raio * raio;

		System.out.printf("A=%.4f%n", area);

		scan.close();
	}
}