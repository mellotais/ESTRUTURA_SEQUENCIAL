
// Faça um Programa que peça dois números e imprima a soma.

package Lista1;
import java.util.Scanner;

public class ExercicioTres 
{
	public static void main(String[] args) 
	{
	 
				Scanner entrada = new Scanner( System.in ); 
				
				int numero1; 
				int numero2; 
				int soma;      
				
				 System.out.print( " Digite o primeiro número: ");  
				 numero1 = entrada.nextInt(); 
				 
				 System.out.print( " Digite o segundo número: ");
				 numero2 = entrada.nextInt(); 
				 
				 soma = numero1 + numero2;
				 
				 System.out.println("O resultado é: " + soma);
				 
				 entrada.close();
	} 
}
	

