package br.senai.sp.jandira.forma_Exata;

import java.util.Scanner;

import br.senai.sp.jandira.forma_Exata.model.Quadrado;
import br.senai.sp.jandira.forma_Exata.model.Retângulo;
import br.senai.sp.jandira.forma_Exata.model.Triângulo;
import br.senai.sp.jandira.poligonos.ui.Menu;

	public class Calculos {
		
		public static void main(String[] args) {
			
			//Menu.criarMenu();
			//System.out.println("Programa Finalizado!");
			
			//Looping / Laços de repetição
			
			int contador = 0;
			while(contador < 10) {
				System.out.println("Senai Jandira!" + contador);
				contador = contador + 1;
			}
			
			String resposta = "s";
			while(resposta.equals("s")) {
				System.out.println("Estamos dando voltas");
				System.out.println("Gostaria de dar uma volta (s/n)? ");
				Scanner leitor = new Scanner(System.in);
				resposta = leitor.next();		
			}
			
			System.out.println("----- Tabuada do 9 -------");
			contador = 0;
			while(contador <= 10) {
				int resultado = 9 * contador;
				System.out.println("9 x " + contador + " = " + resultado);
				contador++;
			}
			
			
		}
	}
			
	   
	    	