package classes_e_objetos;

public class Pessoa {
	
	//atributos
	String nome;
	int numerosDeFigurinhas;
	
	//metodo
	
	void receberFigurinhas(int numerosDeFigurinhas) {
		this.numerosDeFigurinhas += numerosDeFigurinhas;
	}
	
	void darFigurinhas(int numerosDeFigurinhas, Pessoa p) {
		this.numerosDeFigurinhas -= numerosDeFigurinhas;
		//p.numerosDeFigurinhas += numerosDeFigurinhas;
		p.receberFigurinhas(numerosDeFigurinhas);
	}
}
