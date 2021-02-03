package elementos_estaticos;

public class Contador {
	static {
		valor = 1;
	}
	private static int valor;
	
	public static void incrementar() {
		valor++;
	}
	
	public static int getValor() {
		return valor;
	}
	
	
}
