import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		System.out.println("Fun��es\n\n"
				+ "As fun��es representam um processamento que possui um significado :\n"
				+ "� Math.sqrt(double) \n"
				+ "� System.out.println(string) \n\n"
				+ "Principais vantagens: modulariza��o, delega��o e reaproveitamento \n\n"
				+ "Dados de entrada e sa�da :\n"
				+ "� Fun��es podem receber dados de entrada (par�metros ou argumentos); \n"
				+ "� Fun��es podem ou n�o retornar uma sa�da; \n"
				+ "� Em orienta��o a objetos, fun��es em classes recebem o nome de \"m�todos\". \n");
		System.out.println("-------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("DIgite tr�s n�meros :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		
		showResult(higher);
		sc.close();
	}
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		} 
		else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
		
	}

}
