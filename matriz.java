
import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("NEGATIVOS: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					System.out.print(mat[i][j] + " ");
				}
			}

		}

		sc.close();

	}

}