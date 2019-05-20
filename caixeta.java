
import java.util.Locale;
import java.util.Scanner;

public class caixeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt(), cont=0;
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}		
			float m = sc.nextFloat();	
			
			for (int i = 0; i < n; i++) {
				if(b[i]==m) {
					cont++;
				}
			}
			System.out.println(cont);
			sc.close();
		}
	}
