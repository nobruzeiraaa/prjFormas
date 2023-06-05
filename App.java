package prjFormas;
import javax.swing.JOptionPane;
public class App {

	public static void main(String[] args) {
		
		Forma forma = null;
		
		Object[] options = {"Quadrado", "Triangulo", "Retangulo", "Trapezio", "Losango", "Hexagono"};
		int escolha = JOptionPane.showOptionDialog(null,"Escolha a forma geométrica", "Cálculo da Área e Perímetro",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if (escolha == 0) {
			forma = Quadrado.criaQuadrado();
			JOptionPane.showMessageDialog(null, "A área do Quadrado é "+forma.calculaArea()+"cm²", "QUADRADO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O perímetro do Quadrado é "+forma.calculaPerimetro()+"cm", "QUADRADO", JOptionPane.INFORMATION_MESSAGE);
				
		}else if (escolha == 1) {
			forma = Triangulo.criaTriangulo();
			JOptionPane.showMessageDialog(null, "A área do Triângulo é "+forma.calculaArea()+"cm²", "TRIÂNGULO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O perímetro do Triângulo é "+forma.calculaPerimetro()+"cm", "TRIÂNGULO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha == 2) {
			forma = Retangulo.criaRetangulo();
			JOptionPane.showMessageDialog(null, "A área do Retângulo é "+forma.calculaArea()+"cm²", "RETÂNGULO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O perímetro do Retângulo é "+forma.calculaPerimetro()+"cm", "RETÂNGULO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha ==3) {
			forma = Trapezio.criaTrapezio();
			JOptionPane.showMessageDialog(null, "A área do Trapézio é "+forma.calculaArea()+"cm²", "TRAPÉZIO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O perímetro do Trapézio é "+forma.calculaPerimetro()+"cm", "TRAPÉZIO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha ==4) {
			forma = Losango.criaLosango();
			JOptionPane.showMessageDialog(null, "A área do Losango é "+forma.calculaArea()+"cm²", "LOSANGO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O perímetro do Losango é "+forma.calculaPerimetro()+"cm", "LOSANGO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha ==4) {
			forma = Hexagono.criaHexagono();
			JOptionPane.showMessageDialog(null, "A área do Hexágono é "+forma.calculaArea()+"cm²", "HEXÁGONO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O perímetro do Hexágono é "+forma.calculaPerimetro()+"cm", "HEXÁGONO", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}





