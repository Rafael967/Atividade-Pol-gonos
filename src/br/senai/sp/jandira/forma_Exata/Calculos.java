package br.senai.sp.jandira.forma_Exata;

import java.util.Scanner;

import br.senai.sp.jandira.forma_Exata.model.Quadrado;
import br.senai.sp.jandira.forma_Exata.model.Retângulo;
import br.senai.sp.jandira.forma_Exata.model.Triângulo;
import br.senai.sp.jandira.poligonos.ui.Menu;

	public class Calculos {
		
		public static void main(String[] args) {
			
			Menu.criarMenu();
			System.out.println("Programa Finalizado!");
			
//			Scanner leitor = new Scanner(System.in);
//			
//			System.out.print("Digite o valor do lado quadrado: ");
//			double lado = leitor.nextDouble();
//			leitor.nextLine();
//			
//			System.out.println("Qual é o seu nome?");
//			String nome = leitor.nextLine();
//			
//			System.out.println("Olá, " + nome);
//			
//			Quadrado quadrado1 = new Quadrado();
//			quadrado1.setLado(lado);
//			quadrado1.exibirDados();
//			
			Retângulo retangulo = new Retângulo();
			retangulo.setAltura(5);
			retangulo.exibirDados();
			
			Triângulo triangulo1 = new Triângulo();
			triangulo1.setBase(7);
			triangulo1.setAltura(9);
			triangulo1.exibirDados();
			
		}
	}
			
	   
	    	