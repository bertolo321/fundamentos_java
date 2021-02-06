package construtores_de_classes;

public class Quadrado {
	
	private double lado;
	
	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}



	public double calcularQuadrado() {
		return lado * lado;
	}
}
