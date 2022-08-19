package Lista1;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);

	    final double QUILOSESTABELECIDOS = 50;
	    final double VALORDAMULTA        = 4;

	    float peso     = 0;
	    double excesso = 0;
	    double multa   = 0;
	    String texto   = "";

	    System.out.println("\nJoão pescador e seu novo sistema...\n");
	    System.out.print("Informe peso total da pescaria: ");
	    peso = imput.nextFloat();

	    if (peso > QUILOSESTABELECIDOS) {
	      excesso = (peso - QUILOSESTABELECIDOS);
	      multa = excesso * VALORDAMULTA;
	      texto = "\nExiste";
	    } else
	      texto = "\nNão existe";

	    System.out.println(texto.concat(" multa à pagar."));
	    System.out.printf("Peso excesso: %.2f quilos;", excesso);
	    System.out.printf("\nMulta: R$ %.2f.", multa);
	}

}
