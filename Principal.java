package prjFormas;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int escolha=1;
		Forma forma = null;
		System.out.println("Este programa calcula a área de uma forma geométrica utilizando conceitos de Polimorfismo.\n"
				+ "=====================================================================================================");
		
		escolha = (int)menuOpcao();
						
		while(escolha != 7) { //Sair
			switch(escolha) {
				case 1:
					forma = Quadrado.criaQuadrado();
					System.out.printf("A medida da área é: %.2fcm²\n",forma.calculaArea());
					System.out.printf("A medida do perímetro é: %.2fcm",forma.calculaPerimetro());
					break;
				case 2:
					forma = Triangulo.criaTriangulo();
					System.out.printf("A medida da área é: %.2fcm²\n",forma.calculaArea());
					System.out.printf("A medida do perímetro é: %.2fcm",forma.calculaPerimetro());
					break;
				case 3:
					forma = Retangulo.criaRetangulo();
					System.out.printf("A medida da área é: %.2fcm²\n",forma.calculaArea());
					System.out.printf("A medida do perímetro é: %.2fcm",forma.calculaPerimetro());
					break;
				case 4:
					forma = Trapezio.criaTrapezio();
					System.out.printf("A medida da área é: %.2fcm²\n",forma.calculaArea());
					System.out.printf("A medida do perímetro é: %.2fcm",forma.calculaPerimetro());
					break;
				case 5:
					forma = Losango.criaLosango();
					System.out.printf("A medida da área é: %.2fcm²\n",forma.calculaArea());
					System.out.printf("A medida do perímetro é: %.2fcm",forma.calculaPerimetro());
					break;
				case 6:
					forma = Hexagono.criaHexagono();
					System.out.printf("A medida da área é: %.2fcm²\n",forma.calculaArea());
					System.out.printf("A medida do perímetro é: %.2fcm",forma.calculaPerimetro());
					break;
				
				default:
					System.out.println("Opção Incorreta. Escolha novamente.");
			}
			if ((escolha = (int)menuOpcao())==7) {
				System.out.println("\nFIM DO PROGRAMA");
			}
		}		
	}
	
	
	public static double menuOpcao() {
		System.out.println("\nDigite a opção desejada:\n1 - Calcular área do Quadrado\n2 - Calcular área do Triângulo\n3 - Calcular área do Retângulo"
				+ "\n4 - Calcular a área do Trapézio\n5 - Calcular área do Losango\n6 - Calcular área do Hexágono\n7 - Sair");
		return Leitura.lerDouble();
	}
	
	
		
}
