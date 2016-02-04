package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		int PROD = (x * y);

		System.out.println("PROD = " + PROD);

		scan.close();
	}
}