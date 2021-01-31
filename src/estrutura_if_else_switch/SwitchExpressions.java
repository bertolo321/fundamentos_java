package estrutura_if_else_switch;

public class SwitchExpressions {
	
	public enum DiaDaSemana{
		SEGUNDA,
		TERCA,
		QUARTA,
		QUINTA,
		SEXTA,
		SABADO,
		DOMINGO
	}
		
	public static void main(String[] args) {
		
		DiaDaSemana d = DiaDaSemana.SEGUNDA;
		// switch normal
		/**
		switch(d) {
		case SEGUNDA:System.out.println(1);
		break;
		case TERCA:System.out.println(2);
		break;
		case QUARTA:System.out.println(3);
		break;
		case QUINTA:System.out.println(4);
		break;
		case SEXTA:System.out.println(5);
		break;
		case SABADO:System.out.println(6);
		break;
		case DOMINGO:System.out.println(7);
		break;
		default:
			System.out.println("Não corresponde ao dia da semana.");
		break;
		}
	}
	**/
	//switch expressions
	
	switch(d) {
	case SEGUNDA -> {
		System.out.println(1);
		System.out.println("Segunda");
	}

	case TERCA -> {
		System.out.println(2);
	}

	case QUARTA -> {
		System.out.println(3);
	}

	case QUINTA -> {
		System.out.println(4);
	}

	case SEXTA ->{
		System.out.println(5);
	}

	case SABADO -> {
		System.out.println(6);
	}

	case DOMINGO -> {
		System.out.println(7);
	}

	default -> {
		System.out.println("Não corresponde ao dia da semana.");
	}
		
	}
	
	int i = switch(d) {
	case SEGUNDA -> (1);
	case TERCA -> (2);
	default -> (0);
	};
	System.out.println(i);
}
}
