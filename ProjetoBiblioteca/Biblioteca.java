/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetobiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author giova
 */

public class Biblioteca {
    private String nome;
    private Livro[] livros; // Suporta até 100 livros

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new Livro[100];
    }
    
    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) { // Adiciona em uma posição nula
                livros[i] = livro;
                System.out.println("Livro '" + livro.getTitulo() + "' adicionado com sucesso!");
                return;
            }
        }
        System.out.println("A biblioteca está cheia!");
    }

    public void removerLivro(int id) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getId() == id) {
                System.out.println("Livro '" + livros[i].getTitulo() + "' removido.");
                livros[i] = null; // Remove setando a posição como nula
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    public int verificarTotalLivros() {
        int total = 0;
        for (Livro livro : livros) {
            if (livro != null) {
                total++;
            }
        }
        return total;
    }

    // exercício 1.2: Lista de autores ordenada por quantidade de publicações
    public void listarAutoresOrdenados() {
        Map<Autor, Integer> contagemPublicacoes = new HashMap<>();

        // Conta as publicações de cada autor presentes na biblioteca
        for (Livro livro : livros) {
            if (livro != null && livro.getAutor() != null) {
                Autor autor = livro.getAutor();
                contagemPublicacoes.put(autor, contagemPublicacoes.getOrDefault(autor, 0) + 1);
            }
        }
        List<Autor> listaAutores = new ArrayList<>(contagemPublicacoes.keySet());

        Collections.sort(listaAutores, new Comparator<Autor>() {
            @Override
            public int compare(Autor a1, Autor a2) {
                // Ordem decrescente (do que tem mais para o que tem menos)
                return contagemPublicacoes.get(a2).compareTo(contagemPublicacoes.get(a1));
            }
        });

        System.out.println("\n Autores por Quantidade de Publicações ");
        for (Autor autor : listaAutores) {
            System.out.println("Autor: " + autor.getNome() + " | Publicações: " + contagemPublicacoes.get(autor));
        }
    }
}