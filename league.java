import java.util.Locale;
import java.util.Scanner;

public class league {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 0;
		char time = 'a';
		while (time != 'F') {
			time = sc.next().charAt(0);
			int p = sc.nextInt();
			if (time == 'A') {
				a+=p;
			} else if(time == 'B') {
				b+=p;
			}
		}
		System.out.println("TIME A MARCOU "+a+" PONTOS");
		System.out.println("TIME B MARCOU "+b+" PONTOS");

		sc.close();
	}

}
