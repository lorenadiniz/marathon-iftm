
import java.util.Locale;
import java.util.Scanner;

public class reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			float[] b = new float[n];

			for (int i = 0; i < n; i++) {
				b[i] = sc.nextFloat();
			}		
			float m = sc.nextFloat();	
			
			for (int i = 0; i < n; i++) {
				b[i]=b[i]*((m/100)+1);
				System.out.printf("%.2f%n",b[i]);
			}
			sc.close();
		}
	}
