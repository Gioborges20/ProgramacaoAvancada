/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobiblioteca;

/**
 *
 * @author giova
 */
public enum Categoria {
    DIDATICO("Ditático"),
    INFANTIL("Infantil"),
    FICCAO("Ficção"),
    AUTO_AJUDA("Auto-ajuda");
    
    private final String categoriaLivro;
    
    Categoria(String categoriaLivro){
        this.categoriaLivro = categoriaLivro;
    }
    
    public String getCategoria(){
        return categoriaLivro;
    }
    
}
