
// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package Lista1;
import java.util.Scanner;
public class ExercicioQuatro 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner( System.in ); 
		
		double media;
		
		 System.out.print( " Digite a primeira nota: ");  
		 double numero1 = entrada.nextDouble(); 
		 
		 System.out.print( " Digite a segunda nota: ");
		 double numero2 = entrada.nextDouble(); 
		 
		 System.out.print( " Digite a terceira nota: ");  
		 double numero3 = entrada.nextDouble(); 
		 
		 System.out.print( " Digite a quarta nota: ");
		 double numero4 = entrada.nextDouble(); 
		 
		 media = (numero1 + numero2 + numero3 + numero4) / 4;
		 
		 
		 System.out.println("A média é: " + media);
		 
		 entrada.close();
	}
}
