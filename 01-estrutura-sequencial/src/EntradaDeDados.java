import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		System.out.println("Scanner - para fazer entrada de dados, nós vamos criar um objeto do tipo 'scanner' :");
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Obs. Pode ser digitado um por vez, dando enter, ou pode testar escrevendo tudo na mesma linha,"
				+ " apenas dando espaço.");
		
		String x;
		x = sc.next();
		System.out.println("Você digitou : " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Inteiro : " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Double : " + z);
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Char : " + w);		
		
		sc.close();
	}

}
