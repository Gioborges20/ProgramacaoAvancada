/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobiblioteca;

/**
 *
 * @author giova
 */

public class Livro {
    private int id;
    private String titulo;
    private Categoria categoria;
    private Autor autor; // Renomeado para 'autor'
    private int dataPublicacao;
    
    // Construtor corrigido para receber todos os atributos exigidos
    public Livro(int id, String titulo, Categoria categoria, Autor autor, int dataPublicacao){
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao; // Corrigido para receber o parâmetro
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo; 
    }
    public Categoria getCategoria() { 
        return categoria; 
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria; 
    }
    public Autor getAutor() {
        return autor; 
    }
    public void setAutor(Autor autor) {
        this.autor = autor; 
    }
    public int getDataPublicacao(){
        return dataPublicacao; 
    }
    public void setDataPublicacao(int dataPublicacao){
        this.dataPublicacao = dataPublicacao; 
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo='" + titulo + '\'' + 
               ", categoria=" + categoria.getCategoria() + 
               ", autor=" + (autor != null ? autor.getNome() : "Autor não identificado") + 
               ", dataPublicacao=" + dataPublicacao + '}';
    }
}