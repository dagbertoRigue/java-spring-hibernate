
public class EstruturaCondicionalTern�ria {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Express�o condicional tern�ria � uma outra op��o ao if-else quando se deseja decidir um VALOR com base em uma condi��o.");
		System.out.println("Sintaxe :");
		System.out.println("(condi��o) ? valor_se_verdadeiro : valor_se_falso");
		System.out.println();
		
		System.out.println("Exemplo com if-else:");
		double preco = 34.5;
		double desconto;
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println("Exemplo com condicional tern�ria :");
		double price = 34.5;
		double discount = (price < 20) ? price * 0.1 : price * 0.05;
	}

}
