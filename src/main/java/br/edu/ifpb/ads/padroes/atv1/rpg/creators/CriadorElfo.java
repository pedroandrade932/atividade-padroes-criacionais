package br.edu.ifpb.ads.padroes.atv1.rpg.creators;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.ComponentesPersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.ElfoComponentesFactory;

public class CriadorElfo extends CriadorPersonagem {
    @Override
    protected ComponentesPersonagemFactory obterFactory() {
        return new ElfoComponentesFactory();
    }

    @Override
    protected String obterNomeRaca() {
        return "Elfo";
    }
}