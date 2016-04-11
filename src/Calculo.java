import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculo {		
	
	
	public static void main(String[] args) {

		int n, i=0, nNumero;
		double soma=0;		
		Scanner s;
		s = new Scanner(System.in);

		System.out.println("Informe um N�mero inteiro entre 1 e 1000.");
		n = s.nextInt(); 			
		
		while( n<2 || n>999){
			System.out.println("Informe o n�mero corretamente!");
			n = s.nextInt(); 			
		}		
		
		System.out.println("Agora informe " +n+ " um N�mero(s) inteiro(s).");		
		
		while(i<n){				
			System.out.println("Informe o "+ (i+1) +" n�mero. ");
			nNumero = s.nextInt(); 			
			soma+=nNumero;				
			i++;
		}
		
		s.close();
		
		DecimalFormat df = new DecimalFormat("#.0");
				
		if( soma > 2147483647 || soma < -2147483648 )		
			System.out.println( "Soma fora do range");			
		else
			System.out.println("\nM�dia aritm�tica �: "+df.format(soma/n));

		System.out.println("Fim de programa!");		
		
	}

}
