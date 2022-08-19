package Lista1;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner imput = new Scanner(System.in);

	    final double METROSPORLITRO = 3;
	    final double PRECOLATA      = 80;
	    final double LITROSPORLATA  = 18;

	    // Metros quadrados por lata
	    final double METROPORLATA = METROSPORLITRO * LITROSPORLATA;

	    float metrosQuadrados = 0;
	    double precoLata      = 0;
	    int quantidadeLatas   = 0;

	    System.out.println("\n Loja de Tintas\n");
	    System.out.print("Informe tamanho do comodo, em metros quadrados, da área a ser pintada: ");
	    metrosQuadrados = imput.nextFloat();

	    quantidadeLatas = (int)Math.ceil(metrosQuadrados / METROPORLATA);
	    precoLata = quantidadeLatas * PRECOLATA;

	    System.out.println("\nDados da compra");
	    System.out.printf("Número de latas: %d;", quantidadeLatas);
	    System.out.printf("\nPreço total: R$ %.2f", precoLata);
	}

}
