
import java.util.Locale;
import java.util.Scanner;

public class senhas {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int senha = 8294, senha2 = 2071;
		int entrada = sc.nextInt();
		int entrada2 = 0;

		while (entrada != senha) {
			System.out.println("SENHA INCORRETA");
			entrada = sc.nextInt();
		}
		entrada2 = sc.nextInt();
		while (entrada2 != senha2) {
			System.out.println("SENHA INCORRETA");
			entrada2 = sc.nextInt();
		}
		System.out.println("COFRE ABERTO");
		sc.close();
	}
}
