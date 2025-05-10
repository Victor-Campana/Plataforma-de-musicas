import Audio.Musicas;
import Audio.Podcast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        Musicas daftpunk = new Musicas();
        daftpunk.setNome("Infinity Repeating");
        daftpunk.setDuracao(440);
        daftpunk.setClassificacao(13);
        daftpunk.setCantor("DaftPunk");

        Musicas maneva = new Musicas();
        maneva.setNome("Luz que me traz paz");
        maneva.setDuracao(503);
        maneva.setClassificacao(0);
        maneva.setCantor("Maneva");

        Podcast podpah = new Podcast();
        podpah.setNome("Podpah");
        podpah.setDuracao(1000);
        podpah.setClassificacao(18);
        podpah.setApresentador("Igor e Mitico");

        Podcast flow = new Podcast();
        flow.setNome("Flow");
        flow.setDuracao(1200);
        flow.setClassificacao(18);
        flow.setApresentador("Igor 3k");

        while (continuar) {
            System.out.println("O que você deseja ouvir hoje? (música/podcast/encerrar)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("podcast")) {
                System.out.println("Qual podcast você deseja ouvir hoje?");
                System.out.println("Flow ou Podpah");
                String podcast = scanner.nextLine();
                if (podcast.equalsIgnoreCase("Flow")) {
                    flow.exibirFichaTecnica();
                    flow.reproduzir();
                } else if (podcast.equalsIgnoreCase("Podpah")) {
                    podpah.exibirFichaTecnica();
                    podpah.reproduzir();
                }
            } else if (resposta.equalsIgnoreCase("musica")) {
                System.out.println("Qual música você deseja ouvir hoje?");
                System.out.println("Maneva ou DaftPunk");
                String musica = scanner.nextLine();
                if (musica.equalsIgnoreCase("Maneva")) {
                    maneva.exibirFichaTecnica();
                    maneva.reproduzir();
                } else if (musica.equalsIgnoreCase("DaftPunk")) {
                    daftpunk.exibirFichaTecnica();
                    daftpunk.reproduzir(); // Corrigido de 'maneva' para 'daftpunk'
                }
            } else if (resposta.equalsIgnoreCase("encerrar")) {
                System.out.println("Obrigado pela preferência, até mais!");
                continuar = false;
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
    }
}