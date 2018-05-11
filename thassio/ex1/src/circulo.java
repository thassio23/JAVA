
public class circulo {
	double area;
	double perimetro;


	void calculaarea(double valor){
		
	this.area = valor*valor;
		
	}

	void calculaperimetro(double lado){
		
	this.perimetro = lado*4;
		
	}


	double getArea(){
		
		return this.area;
		
		
	}

	double getPerimetro(){
		return this.perimetro;
		
		
	}
	}
