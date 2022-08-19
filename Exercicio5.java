
// Faça um Programa que converta metros para centímetros.

package Lista1;
import java.util.Scanner;
public class ExercicioCinco 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);

		System.out.print("Metros? ");
		float metros = entrada.nextFloat();

		float centimetros = metros * 100;

		System.out.printf("%.1f cm",centimetros);
		
		entrada.close();
	}
}
