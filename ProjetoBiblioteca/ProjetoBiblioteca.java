/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetobiblioteca;
import java.util.Scanner;

/**
 *
 * @author giova
 */

public class ProjetoBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        Autor autor1 = new Autor("Andressa Carvalho", 36, 59944885, 326598745, 10, "Editora A");
        Autor autor2 = new Autor("Machado de Assis", 69, 0, 0, 50, "Editora B");

        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("\n=== Menu da Biblioteca ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Verificar Total de Livros");
            System.out.println("4. Listar Autores Ordenados (Publicações)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do Livro: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();                     
                    System.out.print("Digite o Título do Livro: ");
                    String titulo = scanner.nextLine();
                    
                    System.out.print("Ano de Publicação: ");
                    int ano = scanner.nextInt();
                    
                    Livro novoLivro = new Livro(id, titulo, Categoria.AUTO_AJUDA, autor1, ano);
                    biblioteca.adicionarLivro(novoLivro);
                    break;
                case 2:
                    System.out.print("Digite o ID do livro a ser removido: ");
                    int idRemover = scanner.nextInt();
                    biblioteca.removerLivro(idRemover);
                    break;
                case 3:
                    System.out.println("Total de livros na biblioteca: " + biblioteca.verificarTotalLivros());
                    break;
                case 4:
                    biblioteca.listarAutoresOrdenados();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}