
public class retangulo {

	double area;
	double perimetro;


	void calculaarea(double valor1, double valor2){
		
	this.area = valor1*valor2;
		
	}

	void calculaperimetro(double lado1,double lado2 ){
		
	this.perimetro = lado1*2 + lado2*2;;
		
	}


	double getArea(){
		
		return this.area;
		
		
	}

	double getPerimetro(){
		return this.perimetro;
		
		
	}
	}
