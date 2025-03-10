package br.senai.sp.jandira.forma_Exata.model;

public class Retângulo {

private double largura;
private double altura;
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = largura * altura;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("DADOS DO RETÂNGULO");
		System.out.println("Largura: " + largura );
		System.out.println("Altura: " + altura);
		System.out.println("Área total: " + calcularArea());
	
	}
	

}

