import apps.iphone.Iphone;
import apps.ligacao.LigacaoInterface;
import apps.musicplayer.MusicPlayerInterface;
import apps.navegador.BraveInterface;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        MusicPlayerInterface itunes = iphone;
        LigacaoInterface telefone = iphone;
        BraveInterface safari = iphone;

        System.out.println("YT Music");
        itunes.tocar();
        itunes.pause();
        itunes.selecionarMusica("I feel good");
        System.out.println();

        System.out.println("Telefone");
        telefone.ligar("99999999");
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
        System.out.println();

        System.out.println("Navegador Brave");
        safari.exibirPagina("www.youtube.com");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}