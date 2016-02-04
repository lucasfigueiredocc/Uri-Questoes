package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int Y = scan.nextInt();

		int total = Y * 2;

		System.out.printf("%d minutos%n", total);

		scan.close();
	}
}
