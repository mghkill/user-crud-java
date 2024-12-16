package com.example.user.controller;

// Classe que representa os dados que vêm no corpo da requisição
public class NovoUsuarioRequest {
    private String nome;
    private int idade;

    // Getters e Setters (necessários para o Spring conseguir converter o JSON)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}