package construtores_de_classes;

public class Retangulo {
	private double largura;
	private double altura;
	
	//construtor já definido
	public Retangulo() {
		this(4,3);
		//System.out.println("Construtor ()");
		//largura = 4;
		//altura = 3;
	}
	
	//construtor para inserir dados
	public Retangulo(double largura,double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	public double calcularArea() {
		return largura * altura;
	}
}