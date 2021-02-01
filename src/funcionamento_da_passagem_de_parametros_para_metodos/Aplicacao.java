package funcionamento_da_passagem_de_parametros_para_metodos;

public class Aplicacao {

	public static void main(String[] args) {
		
		Operacao o = new Operacao();
		
		int x = 10;
		o.trocar(x);
		System.out.println(x);
		System.out.println("-------------------------------------------------------");
		Valor valor = new Valor();
		valor.v = 10;
		o.altrarValor(valor);
		System.out.println(valor.v);
	}

}
