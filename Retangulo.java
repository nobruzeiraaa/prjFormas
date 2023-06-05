package prjFormas;

import javax.swing.JOptionPane;

public class Retangulo extends Forma {
	
	private double base;
	private double altura;
	
	Retangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 2*(base+altura);
	}
	
	public static Retangulo criaRetangulo() {
		double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da base do ret�ngulo?","RET�NGULO", JOptionPane.QUESTION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da altura do ret�ngulo?","RET�NGULO", JOptionPane.QUESTION_MESSAGE));
		return new Retangulo(base, altura);
	}

}
