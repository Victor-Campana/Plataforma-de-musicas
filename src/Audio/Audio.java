package Audio;

import java.util.Scanner;

public class Audio {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private double duracao;
    protected int totalDeReproducoes;
    protected int curtidas;
    private int classificacao;

    public void curtir(){
    }
    public void reproduzir(){
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome: " +nome);
        System.out.println("Duração: " +duracao);
        System.out.println("classificação: " +classificacao);
        System.out.println("Curtidas: " +curtidas);
        System.out.println("Total de reproduções: " +totalDeReproducoes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
