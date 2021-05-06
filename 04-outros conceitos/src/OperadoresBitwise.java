import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Opera��es Bitwise \n");
		System.out.println("Operadores bitwise s�o utilizados quando precisamos realizar opera��es em n�vel de bits com n�meros inteiros, \n"
				+ "ou seja, trabalhar com sua representa��o bin�ria. A opera��o � feira bit a bit, respeitando a tabela verdade.\n");
		
		System.out.println(" C1 | C2 | C1&C2        C1 | C2 | C1|C2         C1 | C2 | C1^C2 ");
		System.out.println("-----------------       ---------------         ----------------");
		System.out.println("  F |  F |   F           F |  F |   F            F |  F |   F   ");
		System.out.println("  F |  V |   F           F |  V |   V            F |  V |   V   ");
		System.out.println("  V |  F |   F           V |  F |   V            V |  F |   V   ");
		System.out.println("  V |  V |   V           V |  V |   V            V |  V |   F   \n");
		
		int n1 = 89;
		int n2 = 60;
		System.out.println("Exemplo :");
		System.out.println("0101 1001 (89)");
		System.out.println("0011 1100 (60)");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("O operador & ( Bitwise AND ) compara dois valores utilizando suas representa��es bin�rias, retornando um novo valor.");
		System.out.println("0101 1001 & 0011 1100 = 0001 1000 (" + (n1 & n2) + ")");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("O operador | ( Bitwise OR ) compara dois valores utilizando suas representa��es bin�rias, retornando um novo valor.");
		System.out.println("0101 1001 | 0011 1100 = 0111 1101 (" + (n1 | n2) + ")");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("O operador ^ ( Bitwise XOR ) compara dois valores utilizando suas representa��es bin�rias, retornando um novo valor."); 
		System.out.println("0101 1001 ^ 0011 1100 = 0110 0101 (" + (n1 ^ n2) + ")");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Exemplo de utiliza��o : quando � preciso comparar um ip :");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ip para testar o sexto bit : ");
		int mask = 0b00100000; //como representamos um n�mero bin�rio. adicionando "0b" no in�cio. Nesse exemplo, queremos verificar apenas o sexto bit
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}
