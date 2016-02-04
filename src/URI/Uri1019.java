package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int horas, minutos;
		int segundos = scan.nextInt();

		horas = segundos / 3600;
		minutos = (segundos - (horas * 3600)) / 60;
		segundos = segundos - (horas * 3600) - (minutos * 60);

		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

		scan.close();
	}
}
