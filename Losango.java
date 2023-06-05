package prjFormas;

import javax.swing.JOptionPane;

public class Losango extends Forma{
	
	private double diagonalMaior;
	private double diagonalMenor;
	private double lado;
	
	Losango (double diagonalMaior, double diagonalMenor, double lado){
		this.setDiagonalMaior(diagonalMaior);
		this.setDiagonalMenor(diagonalMenor);
		this.setLado(lado);
	}

	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
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
		return diagonalMaior*diagonalMenor/2;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	
	public static Losango criaLosango() {
		double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da diagonal maior do losango?","LOSANGO", JOptionPane.QUESTION_MESSAGE));
		double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da diagonal menor do losango?","LOSANGO", JOptionPane.QUESTION_MESSAGE));
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida do lado do losango?","LOSANGO", JOptionPane.QUESTION_MESSAGE));
		return new Losango(diagonalMaior, diagonalMenor, lado);
	}

	



}
