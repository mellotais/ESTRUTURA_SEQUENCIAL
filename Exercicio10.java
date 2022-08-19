package Lista1;
import java.util.Scanner;
public class Exercicio10 {

		public static void main(String[] args) {
		    Scanner imput = new Scanner(System.in);

		    int num1 = 0;
		    int num2 = 0;
		    double real = 0;

		    System.out.print("Informe número inteiro: ");
		    num1 = imput.nextInt();

		    System.out.print("Informe número inteiro: ");
		    num2 = imput.nextInt();

		    System.out.print("Informe número real: ");
		    real = imput.nextDouble();

		    System.out.printf("O produto do dobro do primeiro com metade do segundo é: %.2f;\n", ((2 * num1) + ((float)num2 / 2)));
		    System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f;\n", (3 * num1 + real));
		    System.out.printf("O terceiro elevado ao cubo é: %.2f", Math.pow(real, 3));
		  }
		}
