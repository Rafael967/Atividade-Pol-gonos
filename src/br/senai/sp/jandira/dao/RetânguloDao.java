package br.senai.sp.jandira.dao;

import java.util.Scanner;

import br.senai.sp.jandira.forma_Exata.model.Retângulo;

public class RetânguloDao {
	
	public class RetanguloDao {
		
		public static void criar() {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Criando um retangulo...");
			
			Retângulo retangulo = new Retângulo();
			
			System.out.println("Digite a medida do lado do retângulo: ");
			
			retangulo.setLargura(leitor.nextDouble());
			retangulo.exibirDados();
			
		}

	}

}
