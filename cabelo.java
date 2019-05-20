import java.util.Scanner;

public class cabelo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		int m = sc.nextInt();
		
		if(m == 0) {
			System.out.println(q);
			System.out.println(q+(2*q));
		}
		else {
			System.out.println(2*q);
			System.out.println((2*q)+q);
		}
		
		sc.close();
	}
}
