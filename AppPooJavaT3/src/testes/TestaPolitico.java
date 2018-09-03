package testes;

import negocio.Politico;


public class TestaPolitico {
	
	public static void main(String[] args) {
		Politico p1 = new Politico();
		p1.nome = "joaozinho";
		p1.salario = 1000;
		p1.indicativo = true;
		p1.qtdeMandatos = 1;
		p1.show();
		
		Politico p2 = new Politico("joao", 1000);
		p2.qtdeMandatos = 2;
		p2.indicativo = true;
		p2.show();
	}
}
