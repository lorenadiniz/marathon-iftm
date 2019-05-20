import java.util.Locale;
import java.util.Scanner;

public class starcraft {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), soma=0, jogos=0;

		for (int i = 0; i < n; i++) {
			jogos = sc.nextInt();
			soma+=jogos;
		}
		System.out.println(soma);

		sc.close();
	}
}
