package URI;

import java.util.Scanner;
import java.util.Locale;

public class Uri1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		float autonomia = 12;
		float tempogasto = scan.nextFloat();
		float velocidademedia = scan.nextFloat();

		float distanciapercorrida = velocidademedia * tempogasto;
		float qtdlitros = distanciapercorrida / autonomia;

		System.out.printf("%.3f%n", qtdlitros);

		scan.close();
	}
}