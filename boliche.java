import java.util.Locale;
import java.util.Scanner;

public class boliche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt(), fim = 0;

		for (int a = e; a != 0; a--) {
			fim += a;
		}
		System.out.println(fim);
		sc.close();
	}

}
