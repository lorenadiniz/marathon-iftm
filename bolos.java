import java.util.Locale;
import java.util.Scanner;

public class bolos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float valor = sc.nextFloat(), bolos=0, soma=0;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			bolos = sc.nextFloat();
			soma+=bolos*valor;
		}
		System.out.printf("%.2f%n",soma);

		sc.close();
	}
}
