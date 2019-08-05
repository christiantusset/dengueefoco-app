package br.com.dengueefocoApp;

import br.com.dengueefocoApp.model.TipoUsuario;
import br.com.dengueefocoApp.model.Usuario;

public class Configuracao {

    private static Usuario usuarioLogado;

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        Configuracao.usuarioLogado = usuarioLogado;
    }

    public static Boolean isUsuarioLogadoAgente() {
        return Configuracao.getUsuarioLogado().getTipoUsuario().equals(TipoUsuario.AGENTE);
    }

}
