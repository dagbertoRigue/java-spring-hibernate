
public class Casting {

	public static void main(String[] args) {
		int x, y;
		double resultado;
		x = 5;
		y = 2;
		resultado = x / y;
		System.out.printf("Resultado = %.1f %n", resultado);
		System.out.println("Perceba que o resultado deveria ser 2,5 mas, o resultado foi 2,0.");
		System.out.println("Isso porque o compilador fez a opera��o de dois n�meros inteiros e depois, "
				+ "salvou em uma vari�vel do tipo double.");
		System.out.println("Para resolver isso, � preciso fazer um casting :");
		
		resultado = (double) x / y;
		System.out.printf("resultado = (double) x / y : %.1f", resultado);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
	}

}
