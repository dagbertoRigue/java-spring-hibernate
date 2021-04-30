import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		System.out.println("Scanner - para fazer entrada de dados, n�s vamos criar um objeto do tipo 'scanner' :");
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Obs. Pode ser digitado um por vez, dando enter, ou pode testar escrevendo tudo na mesma linha,"
				+ " apenas dando espa�o.");
		
		String x;
		x = sc.next();
		System.out.println("Voc� digitou : " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Inteiro : " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Double : " + z);
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Char : " + w);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Entrada de dados com quebra de linha. Pode-se salvar na vari�vel a informa��o digitada at� "
				+ "a quebra de linha.");
		System.out.println("Para testar, digite um pequeno texto, aperte o enter e repita isso mais duas vezes..");
		
		String s1, s2, s3, s4;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		s4 = sc.nextLine();
		
		System.out.println("Voc� digitou :");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
		System.out.println(s4);
		
		System.out.println("Obs. nesse exemplo, est� sendo mostrado apenas as vari�veis s2 a s4.");
		System.out.println("Isso acontece porque � digitado enter no exemplo anterior.");
		System.out.println("Nesse caso, o s1 recebe o enter e salva uma informa��o null.");
		System.out.println("Isso se chama quebra de linha pendente");
		System.out.println("Para resolver isso, adiciona-se um sc.nextLine() antes do s1");
				
		sc.close();
	}

}
