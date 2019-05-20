import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
	
		double peso, altura, imc;
		Scanner sc = new Scanner(System.in);
		peso = sc.nextDouble();
		altura = sc.nextDouble();
		imc = peso/(altura*altura);
		
		System.out.printf("IMC = %.3f %n", imc);
		sc.close();
		
	}
}
