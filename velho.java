import java.util.Locale;
import java.util.Scanner;

public class velho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		String[] b = new String[n];
		String s = "a";
		int velho = 0;

		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
			a[i] = sc.nextInt();
			if (velho < a[i]) {
				velho = a[i];
				s = b[i];
			}
		}
		System.out.println("Pessoa mais velha: " + s);

		sc.close();
	}
}
