package classes_e_objetos;

public class Aplicacao {

	public static void main(String[] args) {
		
		//criando objeto
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		//acessando atributos e metodos
		p2.nome = "Maria";
		p1.nome = "José";
		p1.receberFigurinhas(5);
		p1.receberFigurinhas(7);
		p1.darFigurinhas(2, p2);
		p2.darFigurinhas(1, p1);
		System.out.println(p1.nome + " => " + p1.numerosDeFigurinhas);
		System.out.println(p2.nome + " => " + p2.numerosDeFigurinhas);
	}

}
