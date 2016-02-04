package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1003 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = a + b;

		System.out.printf("SOMA = %d%n", x);

		scan.close();
	}
}