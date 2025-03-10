package br.senai.sp.jandira.forma_Exata;

import br.senai.sp.jandira.forma_Exata.model.Quadrado;
import br.senai.sp.jandira.forma_Exata.model.Retângulo;
import br.senai.sp.jandira.forma_Exata.model.Triângulo;

	public class Calculos {
		
		public static void main(String[] args) {
			
			Quadrado quadrado1 = new Quadrado();
			quadrado1.setLado(2);
			quadrado1.exibirDados();
			
			Retângulo retangulo = new Retângulo();
			retangulo.setAltura(5);
			retangulo.exibirDados();
			
			Triângulo triangulo1 = new Triângulo();
			triangulo1.setBase(7);
			triangulo1.setAltura(9);
			triangulo1.exibirDados();
			
		}
	}
			
	   
	    	