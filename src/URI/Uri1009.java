package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double salario = scan.nextDouble();
		double vendas = scan.nextDouble();

		double TOTAL = salario + (vendas * 0.15);

		System.out.printf("TOTAL = R$ %.2f%n", TOTAL);

		scan.close();
	}
}