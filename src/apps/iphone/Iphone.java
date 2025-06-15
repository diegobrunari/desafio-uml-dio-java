package apps.iphone;

import apps.ligacao.LigacaoInterface;
import apps.musicplayer.MusicPlayerInterface;
import apps.navegador.BraveInterface;

public class Iphone implements LigacaoInterface, MusicPlayerInterface, BraveInterface {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligação para o número: " + numero + " (iphone)");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação. (iphone)");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz... (iphone)");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música selecionada (iphone)");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada. (iphone)");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica + " (iphone)");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página: " + url + " (iphone)");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada (iphone)");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso! (iphone)");
    }
}
