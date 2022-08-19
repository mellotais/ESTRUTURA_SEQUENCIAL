
// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

package Lista1;
import java.util.Scanner;

public class ExercicioSeis 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in); 
		
		double area;
		final double PI = 3.1416;
		
		System.out.println(" Informe o raio do círculo: ");
		double raio = entrada.nextDouble();
		
        area  = PI* (raio*raio);

       System.out.print("O valor da area é " + area);
		
       entrada.close();
	}

}
