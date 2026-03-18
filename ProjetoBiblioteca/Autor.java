/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobiblioteca;

/**
 *
 * @author giova
 */
public class Autor extends Pessoa{
    private int quantTitulos;
    private String editora;

    public Autor(String nome, int idade, int telefone, int cpf, int quantTitulo, String editora) {
        super(nome, idade, telefone, cpf);
        this.quantTitulos = 1;
        this.editora = editora;
    }

    public int getQuantTitulos() {
        return quantTitulos;
    }

    public void setQuantTitulos(int quantTitulos) {
        this.quantTitulos = quantTitulos;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Autor{" + " nome=" + getNome() + ", idade=" + getIdade() + ", telefone=" + getTelefone() + ", cpf=" + getCpf()+ ",quantTitulos=" + quantTitulos + ", editora=" + editora + '}';
    }
}
