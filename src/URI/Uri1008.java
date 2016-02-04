package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int nfuncionario = scan.nextInt();
		int horastrabalhadas = scan.nextInt();
		float valorporhora = scan.nextFloat();

		double total = horastrabalhadas * valorporhora;

		System.out.printf("NUMBER = %d%n", nfuncionario);
		System.out.printf("SALARY = U$ %.2f%n", total);

		scan.close();
	}
}
