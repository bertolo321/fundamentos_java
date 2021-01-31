package estruturas_de_repeticao;

public class WhileFor {

	public static void main(String[] args) {
		
		int x = 0;
		
		//while com break
		/**
		while(true) {
			System.out.println(x);
			if(x == 10) {
				break;
			}
			x++;
		}
		**/
		//while com continue
		/**
		while(x < 10) {
			x++;
			if(x == 5) {
				continue;
			}
			System.out.println(x);
		}
		**/
		
		//do while
		/**
		do {
			System.out.println(x);
			x++;
		}while(x <= 10);
		***/
		int i;
		int j;
		for( i = 0,j = 10; i <= 10;i++,j--) {
			System.out.println(i + " - " + j);
		}
		
		int b = 0;
		
		for(;;) {
			System.out.println(b);
			if(b == 10) {
				break;
			}
			b++;
		}
	}
	

}
