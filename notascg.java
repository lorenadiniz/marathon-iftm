import java.util.Locale;
import java.util.Scanner;

public class notascg {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			float z = sc.nextFloat();

			System.out.printf("%.2f%n",x + y + z);
		}
		sc.close();
	}
}
