import javax.swing.JOptionPane;


public class principal {
	static quadrado[] qua;
	static retangulo[] ret;
	static int n = 0;
	public static void main(String[] Args){
	String entrada;
	int valor;
	entrada = JOptionPane.showInputDialog("Qual objeto voce gostaria de calcular a área e perimetro:\n" +
											"1-Quadrado\n" +
											"2-Retangulo\n" +
											"3-Triangulo\n" +
											"4-Trapezio\n" +
											"5-Circulo\n");

	valor = Integer.parseInt(entrada);
	
	
	switch(valor){
	
	case 1:
		funcquadrado();
	case 2:
		funcretangulo();
	case 3:
		functriangulo();
	case 4:
		functrapezio();
	case 5:
		funccirculo();	
	}
	
	
	}
	
	static void funcquadrado(){
		
		String entrada;
		double  valor;
		qua = new quadrado[n+1];
		qua[n] = new quadrado();
		entrada = JOptionPane.showInputDialog("Qual o valor do lado");
		
		valor = Double.parseDouble(entrada);
		qua[n].calculaarea(valor);
		qua[n].calculaperimetro(valor);
		System.out.println(qua[n].getArea());
		System.out.println(qua[n].getPerimetro());
		n++;
		
		
	}
	
	static void funcretangulo(){
		
		String entrada1,entrada2;
		double valor1,valor2;
		retangulo ret = new retangulo();
		entrada1 = JOptionPane.showInputDialog("Qual o valor da largura");
		entrada2 = JOptionPane.showInputDialog("Qual o valor da altura");
		
		valor1 = Double.parseDouble(entrada1);
		valor2 = Double.parseDouble(entrada2);

		ret.calculaarea(valor1,valor2);
		ret.calculaperimetro(valor1,valor2);
		System.out.println(ret.getArea());
		System.out.println(ret.getPerimetro());
		
	}
	
	static void functriangulo(){
		
		
	}
	
	static void functrapezio(){
		
		
	}
	
	static void funccirculo(){
		
		
	}
	
}