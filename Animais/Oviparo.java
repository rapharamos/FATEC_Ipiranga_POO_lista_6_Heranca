package Animais;

public abstract class Oviparo extends Animal{
    int quantidadeOvos;
    String fecundacao;

    public Oviparo (String nome, int quantidadeOvos, String fecundacao) {
        super(nome);
        this.quantidadeOvos = quantidadeOvos;
        this.fecundacao = fecundacao;
        System.out.println("É um ovíparo, de fecundação " + fecundacao + " que coloca " + quantidadeOvos + " ovo(s)!"); 
    }
}
