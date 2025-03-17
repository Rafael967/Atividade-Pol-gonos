package br.senai.sp.jandira.poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.dao.QuadradoDao;
import br.senai.sp.jandira.dao.RetânguloDao.RetanguloDao;

public class Menu {
	
	
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("----------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("--------------------");
		System.out.print("Escolha uma opção de (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
			// Chamar o RetanguloDao
		} else if (opcao == 3) {
			// Chamar o Triângulo
		} else if (opcao == 4) {
			// Chamar o trapézioDao
		} else if (opcao == 5) {
			//Chamar a circunferenciaDao
		} else {
			System.out.println("Opção invalida! Você deve escolher um número entre 1 e 5!");
		}
		
		
		
	}

}
