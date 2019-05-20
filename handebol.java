import java.util.Locale;
import java.util.Scanner;

public class handebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int jogadores = sc.nextInt();
		int part = sc.nextInt(), soma = 0, d1 = 1, menos = 0;
		for (int a = 0; a < jogadores; a++) {
			for (int b = 0; b < part; b++) {
				d1 = sc.nextInt();
				if (d1 == 0) {
					menos++;
				}
			}
			if (menos == 0) {
				soma++;
			}
			menos = 0;
		}
		System.out.println(soma);
		sc.close();
	}

}
