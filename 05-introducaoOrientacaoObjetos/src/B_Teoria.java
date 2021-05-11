
public class B_Teoria {

	public static void main(String[] args) {
		/*
		 *
			Tri�ngulo � uma entidade com tr�s atributos: a, b, c.
			Estamos usando tr�s vari�veis distintas para representar cada tri�ngulo:
			double aX, bX, cX, aY, bY, cY;
			
			Mem�ria:
			aX = 3.00     aY = 7.50
			bX = 4.00     bY = 4.50
			cX = 5.00     cY = 4.02
			
			Para melhorar isso, vamos usar uma CLASSE para representar um tri�ngulo.
			
			package entities;
			public class Triangle {
			     public double a;
			     public double b;
			     public double c;
			}
			
			Triangle x, y;
			x = new Triangle();
			y = new Triangle();
			
			Dessa forma, x e y v�o alocar os dados nas vari�veis a, b, c, sendo necess�rio apenas essas tr�s.
			
			Depois, vamos criar a classe principal no package "application" para chamar a classe Triangle.
			
			
			Teoria :
			
			Classe : � um tipo estruturado que pode conter membros (atributos e m�todos) :
			Atributos (dados / campos)
			M�todos (fun��es / opera��es)
			
			A classe tamb�m pode prover muitos outros recursos, tais como:
			Construtores
			Sobrecarga
			Encapsulamento
			Heran�a
			Polimorfismo
			
			Exemplos:
			Entidades: Produto, Cliente, Triangulo
			Servi�os: ProdutoService, ClienteService, EmailService, StorageService
			Controladores: ProdutoController, ClienteController
			Utilit�rios: Calculadora, Compactador
			Outros (views, reposit�rios, gerenciadores, etc.) 
			
			IMPORTANTE : 
			CLASSE = a defini��o do tipo               (classe Triangulo)
			INST�NCIA = aloca��o din�mica de mem�ria   (x = new Triangle)
			OBJETO = s�o inst�ncias da classe          (Tri�ngulo X)
		 **/

	}

}
