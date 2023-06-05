package prjFormas;

import javax.swing.JOptionPane;

public class Quadrado extends Forma{

	private double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return lado*lado;
	}

	public double calculaPerimetro() {
		return 4*lado;
	}
	
	public static Quadrado criaQuadrado() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida do lado do quadrado?","QUADRADO", JOptionPane.QUESTION_MESSAGE));
		return new Quadrado(lado);
	}
}