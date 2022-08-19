package Lista1;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);

	    final double IR   = 0.11f;
	    final double INSS = 0.08f;
	    final double SIND = 0.05f;

	    int hora            = 0;
	    double valor        = 0;
	    double valorBruto   = 0;
	    double valorLiquido = 0;
	    double descontos    = 0;
	    double ir           = 0;
	    double inss         = 0;
	    double sind         = 0;

	    System.out.println("\nCalculo do salário\n");
	    System.out.print("Informe o valor ganho por hora trabalhada (por mês): ");
	    valor = imput.nextDouble();

	    System.out.print("Informe a quantidade de horas trabalhadas: ");
	    hora = imput.nextInt();

	    valorBruto = valor * hora;

	    //Descontos
	    ir           = IR * valorBruto;
	    inss         = INSS * valorBruto;
	    sind         = SIND * valorBruto;
	    descontos    = ir + inss + sind;
	    valorLiquido = valorBruto - descontos;

	    //saidas
	    System.out.printf("\n+ Salário Bruto : R$ %.2f", valorBruto);
	    System.out.printf("\n- IR : R$ %.2f", ir);
	    System.out.printf("\n- INSS : R$ %.2f", inss);
	    System.out.printf("\n- SIND : R$ %.2f", sind);
	    System.out.printf("\n= Salário Líquido : R$ %.2f", valorLiquido);
	}

}
