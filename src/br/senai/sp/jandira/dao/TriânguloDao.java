package br.senai.sp.jandira.dao;

import java.util.Scanner;
import br.senai.sp.jandira.forma_Exata.model.Triângulo;
import br.senai.sp.jandira.poligonos.ui.Menu;

public class TriânguloDao {

    public static void criar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Criando um Triângulo...");

        Triângulo triangulo = new Triângulo();

        System.out.print("Digite a altura do Triângulo: ");
        triangulo.setAltura(leitor.nextDouble());
        
        System.out.print("Digite a base do Triângulo: ");
        triangulo.setBase(leitor.nextDouble());
        
        leitor.nextLine(); // Limpar o buffer do teclado

        triangulo.exibirDados();

        // Perguntar ao usuario se ele deseja criar outra forma
        System.out.print("Pressione Enter para continuar...");
        leitor.nextLine();
        
        Menu.retornar();
		
        
        leitor.close();
    }
}