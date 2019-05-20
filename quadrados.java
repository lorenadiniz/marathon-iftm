import java.util.Scanner;

public class quadrados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n!=0) {
			System.out.printf("%.0f%n",Math.pow(n,2));
			n = sc.nextInt();
		}
		
		sc.close();
		
	}
}
