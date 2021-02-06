package o_tipo_de_dado_record;

public record Quadrado(double lado) {
	
	public double calcularQuadrado() {
		return lado * lado;
	}
}
