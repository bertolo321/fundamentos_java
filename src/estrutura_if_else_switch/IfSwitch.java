package estrutura_if_else_switch;

public class IfSwitch {

	public static void main(String[] args) {
		int num = 10;
		//if e else
		if(num > 10) {
			System.out.println("O n�mero � maior que 10.");
		}else if(num < 10) {
			System.out.println("O n�mero � menor que 10.");
		}else {
			System.out.println("O n�mero � 10.");
		}
		
		//switch s� pode ser usado com int, String e enum
		
		int num2 = 15;
		
		switch (num2) {
		case 5: 
			System.out.println("O n�mero � 5.");
			break;
		case 10:
			System.out.println("O n�mero � 10.");
			break;
		case 15:
			System.out.println("O n�mero 15.");
			break;
		default:
			System.out.println("O n�mero � outro.");
			break;
		}
	}

}
