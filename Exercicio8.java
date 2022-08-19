
// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

package Lista1;
import java.util.Scanner;

public class ExercicioOito 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in); 
		
		double salario;
		
		System.out.println("Qual a sua renda por hora?");
		double ganho = entrada.nextDouble();
		
		System.out.println("Número de horas trabalhadas no mês?");
		double hora = entrada.nextDouble();
		
		salario = (ganho * hora);
		
		System.out.println("Seu sálario é: " + salario);
		
		entrada.close();
	}
}
