package Lista1;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner imput = new Scanner(System.in);

		    float altura = 0;

		    System.out.println("Peso ideal");
		    System.out.print("Informe sua altura em metros: ");
		    altura = imput.nextFloat();

		    System.out.println("\nSeu peso ideal é, ou deveria ser de:");
		    System.out.printf("Para Homens %.2f quilos", (72.7 * altura) - 58);
		    System.out.printf("\nPara Mulheres %.2f quilos", (62.1 * altura) - 44.7);
	}
}
