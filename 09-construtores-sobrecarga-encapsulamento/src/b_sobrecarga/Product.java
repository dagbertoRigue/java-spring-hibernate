package b_sobrecarga;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	/*O atributo quantity n�o deve possuir o m�todo set para esse exemplo.
	 * Isso porque a quantidade do produto em estoque poder� ser alterada somente
	 * pelos m�todos de adi��o e remo��o de itens do estoque, para proteger as 
	 * regras do neg�cio do sistema.
	 * */

	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;  //a palavra reservada "this" informa que o quantity a ser usado � o da atributo da classe e n�o o par�metro da fun��o addProduct.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
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
