
// Faça um Programa que calcule e mostre a área de um quadrado.

package Lista1;
import java.util.Scanner;

public class ExercicioSete 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado do quadrado");
		double lado = entrada.nextDouble();
		
		double area = (lado * lado); 
		
		System.out.println("A área do quadrado é:" + area);
		
		entrada.close();
		
	}
}
