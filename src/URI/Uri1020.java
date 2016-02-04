package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1020 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int idade = scan.nextInt();

		int anos = idade / 365;
		int meses = (idade - (anos * 365)) / 30;
		int dias = idade - (anos * 365) - (meses * 30);

		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(es)%n", meses);
		System.out.printf("%d dia(s)%n", dias);

		scan.close();
	}
}