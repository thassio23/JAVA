
public class Imposto {
	
	int faixa;
	static float aliquota;
	static float valor;
	static float valordoimposto;
	static float valorfaixa[] = new float[5];
	static float valorimpostofinal;
	
	public float calculo(float valor) {
		
	
	if(valor <= 1903.98) {
		
	valorfaixa[0] = 0;
	
	return valorimpostofinal = 0;
	
	}
	
	if (valor > 1903.98) {
		
		if(valor - 1903.98 > 922.67) {
			
			valorfaixa[1] = (float) ((float) 922.67* 0.075);
		}		
	}
	
	if(2862.66 < valor) {
		
if(valor - 2862.66 > 924.40) {
			
			valorfaixa[2] = (float) ((float) 924.40* 0.15);
			
		}		
		
	}
	
	if(3751.06 < valor) {
		
		if(valor - 3751.06 > 913.63) {
			valorfaixa[3] = (float) ((float) 913.63*0.225);
		}		
	}
	
	if(valor > 4682.69) {
		valorfaixa[4] = (float) ((valor - 4664.68)*0.275);
	}
	
	valorimpostofinal = valorfaixa[4] + valorfaixa[3] + valorfaixa[2] + valorfaixa[1] +valorfaixa[0];
	
	for(int i =0;i<5;i++) {
		
		System.out.println(valorfaixa[i]);
	}
	return valorimpostofinal;
	
	}
	
}
