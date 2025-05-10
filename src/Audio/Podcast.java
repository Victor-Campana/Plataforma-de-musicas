package Audio;

public class Podcast extends Audio {
    String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Apresentador: " + apresentador);
    }

    @Override
    public void curtir() {
        System.out.println("Deseja curtir o podcast? (y/n)");
        scanner.nextLine();
        String curtida = scanner.nextLine();
        if (curtida.equalsIgnoreCase("y")){
            System.out.println("O podcast foi curtido por você");
            ++curtidas;
        } else {
            System.out.println("O podcast não foi curtido");
        }
    }

    @Override
    public void reproduzir() {
        System.out.println("deseja começar a reprodução? (y/n)" );
        String reproduzir = scanner.next();
        if (reproduzir.equalsIgnoreCase("y")) {
            System.out.println("Reproduzindo seu podcast");
            ++totalDeReproducoes;
            curtir();
        } else if (reproduzir.equalsIgnoreCase("n")) {
            System.out.println("ok");
        }
    }
}
