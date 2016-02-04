package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int maiorAB = (a + b + Math.abs(a - b)) / 2;
		int maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

		System.out.printf("%d eh o maior%n", maiorBC);

		scan.close();
	}
}
