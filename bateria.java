import java.util.Locale;
import java.util.Scanner;

public class bateria {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double hor = sc.nextDouble();
		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			double x = sc.nextDouble();
			 hor = hor-x;
			 if(hor<0) {
				 System.out.println("recarregar");
			 }
			 else {
				 System.out.printf("%.1f",hor );
			 }
		}
			 
		sc.close();
		
		
	}
}
