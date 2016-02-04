package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		float distancia = scan.nextFloat();
		float combustivelgasto = scan.nextFloat();

		float total = distancia / combustivelgasto;

		System.out.printf("%.3f km/l%n", total);

		scan.close();
	}
}
