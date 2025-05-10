package Audio;

public class Musicas extends Audio {
    String cantor;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Cantor: " +cantor);
    }

    @Override
    public void curtir(){
        System.out.println("Deseja curtir a música? (y/n)");
        scanner.nextLine();
        String curtida = scanner.nextLine();
        if (curtida.equalsIgnoreCase("y")){
            System.out.println("A música foi curtida por você");
            ++curtidas;
        } else {
            System.out.println("A música não foi curtida");
        }
    }

    @Override
    public void reproduzir() {
        System.out.println("Deseja começar a reprodução? (y/n)");
        String reproduzir = scanner.next();
        if (reproduzir.equalsIgnoreCase("y")) {
            System.out.println("Reproduzindo sua música");
            ++totalDeReproducoes;
            curtir();
        } else if (reproduzir.equalsIgnoreCase("n")) {
            System.out.println("ok");
        }
    }
}
