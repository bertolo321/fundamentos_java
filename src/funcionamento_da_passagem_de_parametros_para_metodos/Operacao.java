package funcionamento_da_passagem_de_parametros_para_metodos;

public class Operacao {
	
	void trocar(int n) {
		n = 20;
	}
	
	void altrarValor(Valor valor) {
		valor = new Valor();
		valor.v = 20;
	}
}
