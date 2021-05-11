package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	/*
	 * 
	 * Quais s�o os benef�cios de se calcular a �rea de um tri�ngulo por meio de um M�TODO dentro da CLASSE Triangle?
		1) Reaproveitamento de c�digo: n�s eliminamos o c�digo repetido (c�lculo das �reas dos tri�ngulos x e y) no programa principal.
		2) Delega��o de responsabilidades: quem deve ser respons�vel por saber como calcular a �rea de um tri�ngulo � o pr�prio tri�ngulo. 
		   A l�gica do c�lculo da �rea n�o deve estar em outro lugar.		
	*/

}
