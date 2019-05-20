import java.util.Locale;
import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int volu = sc.nextInt(), total = 0, total2 = 0, i = 0;

		while (n != 0) {
			n = sc.nextInt();
			if (n != 0) {
				if (i == 0) {
					total = volu + n;
				} else {
					total2 = total;
					total = total2 + n;
				}
				if (total < 0) {
					System.out.println(0);
					total = 0;
				} else if (total > 100) {
					System.out.println(100);
					total = 100;
				} else {
					System.out.println(total);
				}
			}
			i++;

		}

		sc.close();
	}
}
