import javax.swing.JOptionPane;

public class IRPF {

	String cidadao;

	
	static Rendimentos[] rends; 
	static Deducoes[] deds;
	static Dependente[] deps;
	static Imposto imp;
	static float basedecalculo = 0;	
	
	public static void main(String[] Args) {
		
		float a,b,c;
		a = cadastraRendimento();
		b= cadastraDeducao();
	    c = dependente();
		
		
		basedecalculo = (float) (a - (b + 189.59*c));
		System.out.println(imposto(basedecalculo));
		
	}
	
public static float imposto(float basedecalculo) {
	
	float valorfinalimposto = 0;
	imp = new Imposto();
	valorfinalimposto = imp.calculo(basedecalculo);
	
	return valorfinalimposto;
	
}

public static int dependente() {
	
	float basedecalculo;
	String recebenome;
	String recebevalor;
	double valor;
	int tamanho = 0;
	String recebe;
	
	String nome;
	String sexo;
	String numero;
	int numeroi;
	
	nome = JOptionPane.showInputDialog("Qual o nome do dependente?");
	sexo = JOptionPane.showInputDialog("Qual o sexo do dependente?");
	numero = JOptionPane.showInputDialog("Qual o numero de dependetes?");
	numeroi = Integer.parseInt(numero);
	
	return numeroi;
	
	
}
public static float cadastraRendimento() {
	
	float basedecalculo;
	String recebenome;
	String recebevalor;
	double valor;
	int tamanho = 0;
	String recebe;
		
		recebe = JOptionPane.showInputDialog("Quantos Rendimentos Gostaria de cadastrar?");
		
		tamanho = Integer.parseInt(recebe);
		
		float totalvalorrendimentos = 0;
		
	    
	    rends = new Rendimentos[tamanho];
	    
	
	for(int i = 0 ; i < tamanho ; i++) {
	rends[i] = new Rendimentos();
	}
	
	for(int i = 0 ; i < tamanho ; i++) {
		
		recebenome = JOptionPane.showInputDialog("Qual o nome do rendimento?");
		
		recebevalor = JOptionPane.showInputDialog("Informe o valor do Rendimento:");
		
		valor = Double.parseDouble (recebevalor);
		
		rends[i].setNomedescricao(recebenome);
		rends[i].setValor(valor);
	}

	
	for(int i = 0 ; i < tamanho; i++) {
	
	//System.out.print(rends[i].getNomedescricao());
	//System.out.print(" ");
	//System.out.println(rends[i].getValor());
	totalvalorrendimentos = (float) (rends[i].getValor() + totalvalorrendimentos);
	}
	System.out.println(totalvalorrendimentos);
	return totalvalorrendimentos;
	
	}	
	

		
	public static float cadastraDeducao() {
		
		float basedecalculo;
		String recebenome;
		String recebevalor;
		double valor;
		int tamanho = 0;
		String recebe;
		
		recebe = JOptionPane.showInputDialog("Quantas Deduções Gostaria de cadastrar?");
		
		tamanho = Integer.parseInt(recebe);
		
	    deds = new Deducoes[tamanho];
	    
	    float totalvalordeducoes = 0;
	
	for(int i = 0 ; i < tamanho ; i++) {
	deds[i] = new Deducoes();
	}
	
	for(int i = 0 ; i < tamanho ; i++) {
		
		recebenome = JOptionPane.showInputDialog("Qual o nome da deducao?");
		
		recebevalor = JOptionPane.showInputDialog("Informe o valor da deducao:");
		
		valor = Double.parseDouble (recebevalor);
		
		deds[i].setNomedescricao(recebenome);
		deds[i].setValor(valor);
	}

	
	for(int i = 0 ; i < tamanho; i++) {
	
//	System.out.print(deds[i].getNomedescricao());
	//System.out.print(" ");
	//System.out.println(deds[i].getValor());
	
	totalvalordeducoes = (float) (deds[i].getValor() + totalvalordeducoes);
	

	}
	
	System.out.println(totalvalordeducoes);
	
	return totalvalordeducoes;
	}	
	
}
