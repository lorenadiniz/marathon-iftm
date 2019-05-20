import java.util.Locale;
import java.util.Scanner;

public class maratona {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), ant=0; String name="a";
		for(int a=0; a<i; a++) {
			String nome = sc.next();
			int p = sc.nextInt();
			int p2 = sc.nextInt();
			if(ant<p+p2) {
				ant=p+p2;
				name=nome;
			}
		}
		System.out.println(name+"\n"+ant);	
		sc.close();
	}

}
