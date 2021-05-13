package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;  //a palavra reservada "this" informa que o quantity a ser usado � o da atributo da classe e n�o o par�metro da fun��o addProduct.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	/*
	 * Toda classe em Java � uma subclasse da classe Object
	 * Object possui os seguintes m�todos:
	 * getClass- retorna o tipo do objeto
	 * equals - compara se o objeto � igual a outro
	 * hashCode - retorna um c�digo hash do objeto
	 * toString - converte o objeto para string
	 * 
	 * Para tornar o m�todo toString de acordo com o que queremos que seja impresso,
	 * podemos fazer uma classe para "sobreposi��o" da classe padr�o.
	 * 
	 * */
	
	public String toString() {
		return name 
				+ ", $" 
				+ String.format("%.2f", price)  
				+ ", " 
				+ quantity 
				+ " units, Total: $" 
				+ String.format("%.2f", TotalValueInStock());
	}
}
