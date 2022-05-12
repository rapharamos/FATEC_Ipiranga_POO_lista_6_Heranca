package Animais;

public abstract class Mamifero extends Animal{
    
    public Mamifero (String nome, int patas) {
        super(nome, patas);
        System.out.println("É um mamífero!");
    }

}
