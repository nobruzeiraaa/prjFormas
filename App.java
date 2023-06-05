package prjFormas;
import javax.swing.JOptionPane;
public class App {

	public static void main(String[] args) {
		
		Forma forma = null;
		
		Object[] options = {"Quadrado", "Triangulo", "Retangulo", "Trapezio", "Losango", "Hexagono"};
		int escolha = JOptionPane.showOptionDialog(null,"Escolha a forma geom�trica", "C�lculo da �rea e Per�metro",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if (escolha == 0) {
			forma = Quadrado.criaQuadrado();
			JOptionPane.showMessageDialog(null, "A �rea do Quadrado � "+forma.calculaArea()+"cm�", "QUADRADO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O per�metro do Quadrado � "+forma.calculaPerimetro()+"cm", "QUADRADO", JOptionPane.INFORMATION_MESSAGE);
				
		}else if (escolha == 1) {
			forma = Triangulo.criaTriangulo();
			JOptionPane.showMessageDialog(null, "A �rea do Tri�ngulo � "+forma.calculaArea()+"cm�", "TRI�NGULO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O per�metro do Tri�ngulo � "+forma.calculaPerimetro()+"cm", "TRI�NGULO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha == 2) {
			forma = Retangulo.criaRetangulo();
			JOptionPane.showMessageDialog(null, "A �rea do Ret�ngulo � "+forma.calculaArea()+"cm�", "RET�NGULO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O per�metro do Ret�ngulo � "+forma.calculaPerimetro()+"cm", "RET�NGULO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha ==3) {
			forma = Trapezio.criaTrapezio();
			JOptionPane.showMessageDialog(null, "A �rea do Trap�zio � "+forma.calculaArea()+"cm�", "TRAP�ZIO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O per�metro do Trap�zio � "+forma.calculaPerimetro()+"cm", "TRAP�ZIO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha ==4) {
			forma = Losango.criaLosango();
			JOptionPane.showMessageDialog(null, "A �rea do Losango � "+forma.calculaArea()+"cm�", "LOSANGO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O per�metro do Losango � "+forma.calculaPerimetro()+"cm", "LOSANGO", JOptionPane.INFORMATION_MESSAGE);
		}else if (escolha ==4) {
			forma = Hexagono.criaHexagono();
			JOptionPane.showMessageDialog(null, "A �rea do Hex�gono � "+forma.calculaArea()+"cm�", "HEX�GONO", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O per�metro do Hex�gono � "+forma.calculaPerimetro()+"cm", "HEX�GONO", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}





