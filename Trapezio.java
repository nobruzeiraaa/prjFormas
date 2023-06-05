package prjFormas;

import javax.swing.JOptionPane;

public class Trapezio extends Forma{
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double lado1;
	private double lado2;
	
	Trapezio (double baseMaior, double baseMenor, double altura, double lado1, double lado2){
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (baseMaior + baseMenor) * altura /2;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return baseMaior + baseMenor + lado1 + lado2;
	}
	
	public static Trapezio criaTrapezio() {
		double baseMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da base maior do trapézio?","TRAPÉZIO", JOptionPane.QUESTION_MESSAGE));
		double baseMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da base menor do trapézio?","TRAPÉZIO", JOptionPane.QUESTION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida da altura do trapézio?","TRAPÉZIO", JOptionPane.QUESTION_MESSAGE));
		double lado1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida do primeiro lado do trapézio?","TRAPÉZIO", JOptionPane.QUESTION_MESSAGE));
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a medida do segundo lado do trapézio?","TRAPÉZIO", JOptionPane.QUESTION_MESSAGE));
		return new Trapezio(baseMaior, baseMenor, altura, lado1, lado2);
	}





}
