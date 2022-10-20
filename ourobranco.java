package br.com.handrey.projetogit;

public class ourobranco {

	public static void main(String[] args) {
		
		
		
		 classeconta objetoConta1 = new classeconta();
		// objetoConta1.atributoNumeroConta = 1234;
		 //objetoConta1.atributoSaldoConta = 450000.00 + (450000.00 * 0.1);
		 objetoConta1.metodoDepositar(450000.00);
		 objetoConta1.atributopessoa = new classepessoa();
		 objetoConta1.atributopessoa.atributoNomePessoa = "Handrey" ;
		 System.out.println(objetoConta1.atributoNumeroConta);
		 System.out.println(objetoConta1.atributoSaldoConta); 
		 System.out.println(objetoConta1.atributopessoa.atributoNomePessoa);
		 
		 classeconta objetoConta2 = new classeconta();
		 objetoConta2.atributopessoa = new classepessoa();
		 objetoConta2.atributoNumeroConta= 1235;
		 objetoConta2.atributoSaldoConta = 4500.00 + ( 4500.00 * 0.1);
		 objetoConta2.atributopessoa.atributoNomePessoa = "Handrey sIDNEY" ;

		 System.out.println( objetoConta2.atributopessoa.atributoNomePessoa);
		 System.out.println(objetoConta2.atributoNumeroConta);
		 System.out.println(objetoConta2.atributoSaldoConta);
		 
		 
		 
		 
		 
	}

}
