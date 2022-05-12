package Animais;

public abstract class Animal {
    String nome;
    int patas;
    public Animal (String nome) {
        System.out.println(nome + " criado!");  
    }
    public Animal (String nome, int patas) { 
        System.out.println(nome + " criado e ele tem " + patas + " patas!");  
    }
}
