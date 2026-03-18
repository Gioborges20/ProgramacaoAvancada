/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobiblioteca;

/**
 *
 * @author giova
 */
public class Cliente extends Pessoa{
    private int livroLocado;

    public Cliente(String nome, int idade, int telefone, int cpf, int livroLocacao) {
        super(nome, idade, telefone, cpf);
        this.livroLocado = 1;
    }

    public int getLivroLocado() {
        return livroLocado;
    }

    public void setLivroLocado(int livroLocado) {
        this.livroLocado = livroLocado;
    } 
    
}
