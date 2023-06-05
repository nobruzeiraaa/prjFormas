package prjFormas;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int escolha=1;
		Forma forma = null;
		System.out.println("Este programa calcula a �rea de uma forma geom�trica utilizando conceitos de Polimorfismo.\n"
				+ "=====================================================================================================");
		
		escolha = (int)menuOpcao();
						
		while(escolha != 7) { //Sair
			switch(escolha) {
				case 1:
					forma = Quadrado.criaQuadrado();
					System.out.printf("A medida da �rea �: %.2fcm�\n",forma.calculaArea());
					System.out.printf("A medida do per�metro �: %.2fcm",forma.calculaPerimetro());
					break;
				case 2:
					forma = Triangulo.criaTriangulo();
					System.out.printf("A medida da �rea �: %.2fcm�\n",forma.calculaArea());
					System.out.printf("A medida do per�metro �: %.2fcm",forma.calculaPerimetro());
					break;
				case 3:
					forma = Retangulo.criaRetangulo();
					System.out.printf("A medida da �rea �: %.2fcm�\n",forma.calculaArea());
					System.out.printf("A medida do per�metro �: %.2fcm",forma.calculaPerimetro());
					break;
				case 4:
					forma = Trapezio.criaTrapezio();
					System.out.printf("A medida da �rea �: %.2fcm�\n",forma.calculaArea());
					System.out.printf("A medida do per�metro �: %.2fcm",forma.calculaPerimetro());
					break;
				case 5:
					forma = Losango.criaLosango();
					System.out.printf("A medida da �rea �: %.2fcm�\n",forma.calculaArea());
					System.out.printf("A medida do per�metro �: %.2fcm",forma.calculaPerimetro());
					break;
				case 6:
					forma = Hexagono.criaHexagono();
					System.out.printf("A medida da �rea �: %.2fcm�\n",forma.calculaArea());
					System.out.printf("A medida do per�metro �: %.2fcm",forma.calculaPerimetro());
					break;
				
				default:
					System.out.println("Op��o Incorreta. Escolha novamente.");
			}
			if ((escolha = (int)menuOpcao())==7) {
				System.out.println("\nFIM DO PROGRAMA");
			}
		}		
	}
	
	
	public static double menuOpcao() {
		System.out.println("\nDigite a op��o desejada:\n1 - Calcular �rea do Quadrado\n2 - Calcular �rea do Tri�ngulo\n3 - Calcular �rea do Ret�ngulo"
				+ "\n4 - Calcular a �rea do Trap�zio\n5 - Calcular �rea do Losango\n6 - Calcular �rea do Hex�gono\n7 - Sair");
		return Leitura.lerDouble();
	}
	
	
		
}
