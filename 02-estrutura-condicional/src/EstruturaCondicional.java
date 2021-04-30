
public class EstruturaCondicional {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("EXPRESS�ES COMPARATIVAS :");
		System.out.println("Utilizamos os operadores '>' (maior), '<' (menor), '>=' (maior ou igual), '<=' (menor ou igual), \n"
				+ "'==' (igual) e '!=' (diferente), quando precisamos fazer compara��es. \n");
	
		int x = 5;
		boolean resposta = x > 0;
		System.out.println("A resposta para x > 0 = " + resposta + ", porque 5 � maior que 0. \n");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("EXPRESS�ES L�GICAS :");
		System.out.println("Utilizamos os operadores '&&' (E), '||' (OU) e '!' (N�O), quando precisamos fazer verifica��es l�gicas. \n");
		
		int y = 10;
		int z = 20;
		boolean a = y > 0 && z < 1;
		System.out.println("A resposta para y > 0 E z < 1 � " + a + ", porque apesar de y ser maior que 0, z n�o � menor que 1.");
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Estrutura condicional : � uma estrutura de controle que permite definir que \n"
				+ "um certo bloco de comandos somente ser� executado dependendo de uma condi��o.");
		System.out.println("Exemplo 1");
		int b = 10;
		if(b < 0) {
			System.out.println("a � menor que 0");
		} else {
			System.out.println("a n�o � menor que 0");
		}
	}

}
