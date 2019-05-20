
import java.util.Locale;
import java.util.Scanner;

public class parque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt(), cont=0;
			float[] b = new float[n];

			for (int i = 0; i < n; i++) {
				b[i] = sc.nextFloat();
			}		
			float m = sc.nextFloat();	
			
			for (int i = 0; i < n; i++) {
				if(b[i]>=m) {
					cont++;
				}
			}
			System.out.println(cont);
			sc.close();
		}
	}
