package modificadores_de_acesso_private_e_public;

public class Aplicacao {

	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(5432235); 
		c.setAtiva(true);
		c.depositar(5000);
		c.sacar(2000);
		
	    double saldo = 	c.getSaldo();
		
	    System.out.println(saldo);
		
	}

}
