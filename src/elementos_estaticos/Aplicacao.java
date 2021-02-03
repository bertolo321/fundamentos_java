package elementos_estaticos;

public class Aplicacao {

	public static void main(String[] args) {
		//Matematica m = new Matematica();
		//int somar = m.somar(5, 5);
		//int subtrair = m.subtrair(10, 5);
		
		//Exemplo de chamar um metodo static
		/**
		int soma = Matematica.somar(10, 5);
		int subtrair = Matematica.subtrair(10, 5);
		System.out.println(soma);
		System.out.println(subtrair);
		**/
		System.out.println(Contador.getValor());
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		System.out.println(Contador.getValor());
		
		//chamando  a constante
		
		double media = Constantes.MEDIA_DA_PROVA;
		System.out.println(media);
		
	}
}
