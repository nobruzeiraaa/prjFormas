package prjFormas;

import javax.swing.JOptionPane;

public class Hexagono extends Forma{
	
	private double lado;
	
	Hexagono (double lado){
		this.setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 6*lado;
	}
	
	public static Hexagono criaHexagono() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida do lado do hexágono?","HEXÁGONO", JOptionPane.QUESTION_MESSAGE));
		return new Hexagono(lado);
	}

}
