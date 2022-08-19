
//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

package Lista1;
import java.util.Scanner;

public class ExercicioDois 
{
		public static void main(String[] args) 
	{
			Scanner entrada = new Scanner(System.in);
			
			int numero;

				System.out.print("Digite um número :");
				numero = entrada.nextInt();
				System.out.println("O número informado foi :" + numero);
				
				entrada.close();
	}
}
