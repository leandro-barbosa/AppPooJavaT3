package negocio;

public class Politico {
	public String nome;
	public float salario; 
	public boolean indicativo;  
	public int qtdeMandatos;
	
	final int MESES = 12;
	final int VALOR_SENADOR = 4;
	final int VALOR_OUTROS = 8;
	
	public Politico() {
		nome = "não informado";
		salario = 999;
		qtdeMandatos = 1;
	}
	
	public Politico(String nome, float salario) {
		this();
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	public void show() {
		System.out.printf("%s arrecadou R$: %.2f em sua vida política",
				nome,
				calcularSalarioTotal());
	}
	
	
	private float calcularSalarioTotal() {
//		if(indicativo) {
//			
//			return ((VALOR_SENADOR * qtdeMandatos) * salario);
//		}
//		else {
//			
//			return ((VALOR_OUTROS * qtdeMandatos ) * salario);
//		}
		int meses  = MESES * (indicativo ? VALOR_SENADOR : VALOR_OUTROS);
		meses = qtdeMandatos * meses;
		return meses * salario;
	}
	
}
