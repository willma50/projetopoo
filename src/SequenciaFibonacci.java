import java.util.Scanner;


public class SequenciaFibonacci {
	
	private static Scanner s;

	static long fibonace(int n) { 
		if (n < 2) { 
			return n; 
		} else { 
			return fibonace(n - 1) + fibonace(n - 2); 
		}
		
	} 
	
	public static void main(String[] args) { 
		
		int numero;
		s = new Scanner(System.in);

		System.out.println("Informe um Número inteiro >= 1 e <=40.");
		numero = s.nextInt(); 
		System.out.println("\n");
		
		while( numero<1 || numero>40){
			System.out.println("Informe o número corretamente!");
			numero = s.nextInt(); 			
		}	
		
		for (int i = 0; i < numero; i++) { 
			System.out.print(SequenciaFibonacci.fibonace(i) + "\n"); 
		} 
	}		
		
}
