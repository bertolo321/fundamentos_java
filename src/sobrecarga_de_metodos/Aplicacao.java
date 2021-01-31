package sobrecarga_de_metodos;

public class Aplicacao {
	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		int soma = m.somar(10, 20,5);
		System.out.println(soma);
		
		double soma2 = m.somar(10.0, 20.0);
		System.out.println(soma2);
		
		int soma3 = m.somar(5, 5);
		
		System.out.println(soma3);
		
		double soma4  = m.somar(10.2, 8);
		
		System.out.println(soma4);
	}
}
