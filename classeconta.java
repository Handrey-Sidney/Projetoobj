package br.com.handrey.projetogit;

public class classeconta {
	
	int atributoNumeroConta; //0
	double atributoSaldoConta; //0.0
	
	classepessoa atributopessoa;
	
	void metodoDepositar(double parametroValor) {
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * 0.1);
		
		
	}
	
	
}
